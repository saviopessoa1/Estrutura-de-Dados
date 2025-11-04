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
		if (!(posicao >= 0 && posicao <= amount)) {
			throw new IndexOutOfBoundsException("Indice Invalido!");
		}
		DoubleNode<T> newNode = new DoubleNode<>();
		newNode.setData(data);

		DoubleNode<T> ponteiroAnterior = null;
		DoubleNode<T> ponteiroProximo = topPointer;

		for (int i = 0; i < posicao; i++) {
			ponteiroAnterior = ponteiroProximo;
			ponteiroProximo = ponteiroProximo.getNext();
		}

		if (ponteiroAnterior != null) {
			ponteiroAnterior.setNext(newNode);
		} else {
			topPointer = newNode;
		}

		if (ponteiroProximo != null) {
			ponteiroProximo.setPrev(newNode);
			// se o proximo é nulo é pq a insercao está sendo no fim (append)
		} else {
			ponteiroFim = newNode;
		}

		newNode.setPrev(ponteiroAnterior);
		newNode.setNext(ponteiroProximo);

		amount++;
	}


	@Override
	public T select(int posicao) {
		if (isEmpty()) {
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
		if (isEmpty()) {
			throw new UnderflowException("Lista Vazia!");
		}
		T[] dadosTemporario = (T[]) new Object[amount];
		DoubleNode<T> ponteiroAuxiliar = topPointer;
		for (int i = 0; i < amount; i++) {
			dadosTemporario[i] = ponteiroAuxiliar.getData();
			ponteiroAuxiliar = ponteiroAuxiliar.getNext();
		}
		return dadosTemporario;
	}

	@Override
	public void update(int posicao, T newData) {
		if (isEmpty()) {
			throw new UnderflowException("Lista Vazia!");
		}
		if (!(posicao >= 0 && posicao < amount)) {
			throw new IndexOutOfBoundsException("Indice Invalido!");
		}

		DoubleNode<T> auxPointer = topPointer;
		for (int i = 0; i < posicao; i++) {
			auxPointer = auxPointer.getNext();
		}
		auxPointer.setData(newData);
	}

	@Override
	public T delete(int posicao) {
		if (isEmpty()) {
			throw new UnderflowException("Lista Vazia!");
		}
		if (!(posicao >= 0 && posicao < amount)) {
			throw new IndexOutOfBoundsException("Indice Invalido!");
		}

		DoubleNode<T> auxPointer = topPointer;
		for (int i = 0; i < posicao; i++) {
			auxPointer = auxPointer.getNext();
		}

		DoubleNode<T> ponteiroAnterior = auxPointer.getPrev();
		DoubleNode<T> ponteiroProximo = auxPointer.getNext();

		if (ponteiroAnterior != null) {
			ponteiroAnterior.setNext(ponteiroProximo);
		} else {
			topPointer = topPointer.getNext();
		}
		if (ponteiroProximo != null) {
			ponteiroProximo.setPrev(ponteiroAnterior);
		} else {
			ponteiroFim = ponteiroFim.getPrev();
		}

		amount--;
		return auxPointer.getData();
	}

	@Override
	public boolean isFull() {
		return (amount == size);
	}

	@Override
	public boolean isEmpty() {
		return (amount == 0);
	}

	@Override
	public String print() {
		String resultado = "[";
		DoubleNode<T> ponteiroAuxiliar = topPointer;
		for (int i = 0; i < amount; i++) {
			resultado += ponteiroAuxiliar.getData();
			if (i != amount - 1) {
				resultado += ",";
			}
			ponteiroAuxiliar = ponteiroAuxiliar.getNext();
		}
		return resultado + "]";
	}
}