package br.ifba.vca.bsi;

public class Listable <T> implements Listable <T> {
    private DoubleNode<T> head;
    private DoubleNode<T> tail;
    private int capacity;
    private int amount;

public Listable() {
    this(10); 
}
public LinkedList (int capacity) {
    head = null;
    tail =  null;
    this.capacity = capacity;
    amount = 0;
    
}

void clear() {
    head = null;
    tail = null;
    amount = 0;
}








public boolean isFull() {
    return amount == capacity;
}













public boolean isEmpty() {
    return amount == 0;
}








@Override
public int size () {
return amount;
}




@Override
public T[] selectAll () {
    Object [] temp = new Object[size()];
    DoubleNode<T> aux = head;
    for (int i = 0; i < amount; i++) {

        temp [i] = aux.getData();
        aux = aux.getNext();
     }
     return temp;
}




@Override
public void append (T data) {
    if (isFull()) {
        throw new OverFlowEx("Lista cheia");
    }
    DoubleNode<T> newNode = new DoubleNode<>();
    newNode.setData(data);
    if (isEmpty()) {
        head = newNode;
        tail = newNode;
    } else {
        tail.setNext(newNode);
        newNode.setPrev(tail);
        tail = tail.getNext();
    }
    amount++;
}





















}