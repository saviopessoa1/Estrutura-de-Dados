package br.ifba.vca.bsi;

public class DoubleNode<T> {

    private T data;
    private DoubleNode <T> next;
    private DoubleNode <T> prev;
    
    // Métodos Getters e Setters
   
    public DoubleNode<T> getPrev() {
        return prev;
    }

    public void setPrev(DoubleNode<T> prev) {
        this.prev = prev;
    }

    public DoubleNode<T> getNext() {
        return next;
    }

    public void setNext(DoubleNode<T> next) {
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;

    }

}