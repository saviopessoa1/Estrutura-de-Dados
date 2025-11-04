package br.ifba.vca.bsi;


public class LinkedList<T> implements Listable<T> {

	private int amount;
	
	private int size;
	
	private DoubleNode<T> topPointer;
	
	private DoubleNode<T> endPointer;

	public LinkedList() {
		this(10);
	}

	
	public LinkedList(int size) {
		topPointer = null;
		endPointer = null;
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
			endPointer.setPrev(TempNode);
			TempNode.setPrev(endPointer);
		} else {
			topPointer = TempNode;
		}
		endPointer = TempNode;
		amount++;
	}

	@Override
	public void insert(int position, T data) {
		if (isEmpty()) {
			throw new OverflowException("Lista Cheia!");
		}
		if (!(position >= 0 && position <= amount)) {
			throw new IndexOutOfBoundsException("Indice Invalido!");
		}
		DoubleNode<T> newNode = new DoubleNode<>();
		newNode.setData(data);

		DoubleNode<T> prevPointer = null;
		DoubleNode<T> nextPointer = topPointer;

		for (int i = 0; i < position; i++) {
			prevPointer = nextPointer;
			nextPointer = nextPointer.getNext();
		}

		if (prevPointer != null) {
			prevPointer.setNext(newNode);
		} else {
			topPointer = newNode;
		}

		if (nextPointer != null) {
			nextPointer.setPrev(newNode);
		} else {
			endPointer = newNode;
		}

		newNode.setPrev(prevPointer);
		newNode.setNext(nextPointer);

		amount++;
	}


	@Override
	public T select(int position) {
		if (isEmpty()) {
			throw new UnderflowException("Lista Vazia!");
		}
		if (!(position >= 0 && position < amount)) {
			throw new IndexOutOfBoundsException("Indice Invalido!");
		}

		DoubleNode<T> auxPointer = topPointer;
		for (int i = 0; i < position; i++) {
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
		T[] tempData = (T[]) new Object[amount];
		DoubleNode<T> auxPointer = topPointer;
		for (int i = 0; i < amount; i++) {
			tempData[i] = auxPointer.getData();
			auxPointer = auxPointer.getNext();
		}
		return tempData;
	}

	@Override
	public void update(int position, T newData) {
		if (isEmpty()) {
			throw new UnderflowException("Lista Vazia!");
		}
		if (!(position >= 0 && position < amount)) {
			throw new IndexOutOfBoundsException("Indice Invalido!");
		}

		DoubleNode<T> auxPointer = topPointer;
		for (int i = 0; i < position; i++) {
			auxPointer = auxPointer.getNext();
		}
		auxPointer.setData(newData);
	}

	@Override
	public T delete(int position) {
		if (isEmpty()) {
			throw new UnderflowException("Lista Vazia!");
		}
		if (!(position >= 0 && position < amount)) {
			throw new IndexOutOfBoundsException("Indice Invalido!");
		}

		DoubleNode<T> auxPointer = topPointer;
		for (int i = 0; i < position; i++) {
			auxPointer = auxPointer.getNext();
		}

		DoubleNode<T> nextPointer = auxPointer.getPrev();
		DoubleNode<T> prevPointer = auxPointer.getNext();

		if (nextPointer != null) {
			nextPointer.setNext(prevPointer);
		} else {
			topPointer = topPointer.getNext();
		}
		if (prevPointer != null) {
			prevPointer.setPrev(nextPointer);
		} else {
			endPointer = endPointer.getPrev();
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
		String result = "[";
		DoubleNode<T> auxPointer = topPointer;
		for (int i = 0; i < amount; i++) {
			result += auxPointer.getData();
			if (i != amount - 1) {
				result += ",";
			}
			auxPointer = auxPointer.getNext();
		}
		return result + "]";
	}
}