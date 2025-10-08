package br.ifba.vca.bsi;

public interface Stackable <T> {
    T pop();
    T push (T data);
    void update(T newData);
    T peek ();

    boolean isEmpty ();
    boolean isFull ();
    String print();
}
