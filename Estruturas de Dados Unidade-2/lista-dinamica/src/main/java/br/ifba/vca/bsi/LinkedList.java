package br.ifba.vca.bsi;


public class LinkedList<T> implements Listable<T> {

	/** Quantidade atual de elementos na lista */
	private int amount;
	
	private int size;
	
	private DoubleNode<T> topPointer;
	
	private DoubleNode<T> ponteiroFim;

	public LinkedList() {
		this(10);
	}

	
	public LinkedList(int size) {
		topPointer = null;
		ponteiroFim = null;
		amount = 0;
		this.size = size;
	}

	
	@Override
	public void append (T data) {
		if (isEmpty()) {
			throw new OverflowException("Lista Cheia!");
		}
		DoubleNode<T> TempNode = new DoubleNode<>();
		TempNode.setData(data);
		if (!isEmpty()) {
			ponteiroFim.setPrev(TempNode);
			TempNode.setPrev(ponteiroFim);
		} else {
			topPointer = TempNode;
		}
		ponteiroFim = TempNode;
		amount++;
	}

	@Override
	public void insert(int posicao, T data) {
		if (isEmpty()) {
			throw new OverflowException("Lista Cheia!");
		}
		if (!(posicao >= 0 && posicao <= quantidade)) {
			throw new IndexOutOfBoundsException("Indice Invalido!");
		}
		NoDuplo<T> noTemporario = new NoDuplo<>();
		noTemporario.setDado(dado);

		NoDuplo<T> ponteiroAnterior = null;
		NoDuplo<T> ponteiroProximo = ponteiroInicio;

		for (int i = 0; i < posicao; i++) {
			ponteiroAnterior = ponteiroProximo;
			ponteiroProximo = ponteiroProximo.getProximo();
		}

		if (ponteiroAnterior != null) {
			ponteiroAnterior.setProximo(noTemporario);
			// se o anterior é nulo é pq a insercao está sendo no inicio
		} else {
			ponteiroInicio = noTemporario;
		}

		if (ponteiroProximo != null) {
			ponteiroProximo.setAnterior(noTemporario);
			// se o proximo é nulo é pq a insercao está sendo no fim (append)
		} else {
			ponteiroFim = noTemporario;
		}

		noTemporario.setAnterior(ponteiroAnterior);
		noTemporario.setProximo(ponteiroProximo);

		amount++;
	}


	@Override
	public T select(int posicao) {
		if (estaVazia()) {
			throw new UnderflowException("Lista Vazia!");
		}
		if (!(posicao >= 0 && posicao < amount)) {
			throw new IndexOutOfBoundsException("Indice Invalido!");
		}

		DoubleNode<T> auxPointer = topPointer;
		for (int i = 0; i < posicao; i++) {
			auxPointer = auxPointer.getNext();
		}
		return auxPointer.getData();
	}

	@SuppressWarnings("unchecked")
	@Override
	public T[] selectAll() {
		if (estaVazia()) {
			throw new UnderflowException("Lista Vazia!");
		}
		T[] dadosTemporario = (T[]) new Object[quantidade];
		DoubleNode<T> ponteiroAuxiliar = topPointer;
		for (int i = 0; i < amount; i++) {
			dadosTemporario[i] = ponteiroAuxiliar.getData();
			ponteiroAuxiliar = ponteiroAuxiliar.getNext();
		}
		return dadosTemporario;
	}

	/**
	 * Atualiza o elemento em uma posição específica da lista.
	 *
	 * @param posicao a posição do elemento a ser atualizado
	 * @param novoDado o novo elemento
	 * @throws UnderflowException se a lista estiver vazia
	 * @throws IndexOutOfBoundsException se a posição for inválida
	 */
	@Override
	public void atualizar(int posicao, T novoDado) {
		if (estaVazia()) {
			throw new UnderflowException("Lista Vazia!");
		}
		if (!(posicao >= 0 && posicao < quantidade)) {
			throw new IndexOutOfBoundsException("Indice Invalido!");
		}

		NoDuplo<T> ponteiroAuxiliar = ponteiroInicio;
		for (int i = 0; i < posicao; i++) {
			ponteiroAuxiliar = ponteiroAuxiliar.getProximo();
		}
		ponteiroAuxiliar.setDado(novoDado);
	}

	/**
	 * Remove o elemento em uma posição específica da lista.
	 *
	 * @param posicao a posição do elemento a ser removido
	 * @return o elemento removido
	 * @throws UnderflowException se a lista estiver vazia
	 * @throws IndexOutOfBoundsException se a posição for inválida
	 */
	@Override
	public T apagar(int posicao) {
		if (estaVazia()) {
			throw new UnderflowException("Lista Vazia!");
		}
		if (!(posicao >= 0 && posicao < quantidade)) {
			throw new IndexOutOfBoundsException("Indice Invalido!");
		}

		NoDuplo<T> ponteiroAuxiliar = ponteiroInicio;
		for (int i = 0; i < posicao; i++) {
			ponteiroAuxiliar = ponteiroAuxiliar.getProximo();
		}

		NoDuplo<T> ponteiroAnterior = ponteiroAuxiliar.getAnterior();
		NoDuplo<T> ponteiroProximo = ponteiroAuxiliar.getProximo();

		if (ponteiroAnterior != null) {
			ponteiroAnterior.setProximo(ponteiroProximo);
			// remocao do inicio, joga o ponteiro de inicio para o proximo nodo.
		} else {
			ponteiroInicio = ponteiroInicio.getProximo();
		}
		if (ponteiroProximo != null) {
			ponteiroProximo.setAnterior(ponteiroAnterior);
			// remocao do fim, joga o ponteiro de fim para o nodo anterior.
		} else {
			ponteiroFim = ponteiroFim.getAnterior();
		}

		quantidade--;
		return ponteiroAuxiliar.getDado();
	}

	/**
	 * Verifica se a lista está cheia.
	 *
	 * @return true se a lista estiver cheia, false caso contrário
	 */
	@Override
	public boolean estaCheia() {
		return (quantidade == tamanho);
	}

	/**
	 * Verifica se a lista está vazia.
	 *
	 * @return true se a lista estiver vazia, false caso contrário
	 */
	@Override
	public boolean estaVazia() {
		return (quantidade == 0);
	}

	/**
	 * Retorna uma representação em string da lista.
	 * Os elementos são separados por vírgula e delimitados por colchetes.
	 *
	 * @return string representando a lista
	 */
	@Override
	public String print() {
		String resultado = "[";
		DoubleNode<T> ponteiroAuxiliar = topPointer;
		for (int i = 0; i < quantidade; i++) {
			resultado += ponteiroAuxiliar.getDado();
			if (i != quantidade - 1) {
				resultado += ",";
			}
			ponteiroAuxiliar = ponteiroAuxiliar.getProximo();
		}
		return resultado + "]";
	}
}