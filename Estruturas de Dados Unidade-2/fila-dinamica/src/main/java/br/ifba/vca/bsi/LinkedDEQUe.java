package br.ifba.vca.bsi;

import java.util.NoSuchElementException;
/** Implementação de uma fila dinamica generica T
 * 
 * @param T, tipo de dado que será armazenado na fila
 * @author Sávio Neri Pessoa
 * @version 1.0
 * @since 20/10/2025
 */

public class LinkedDEQUe<T> implements Queueable<T> {
    private int amount;
    private int capacity;
    private DoubleNode<T> head;
    private DoubleNode<T> tail;

    public LinkedDEQUe() {
        this(10);
    }

    public LinkedDEQUe(int capacity) {
        amount = 0;
        this.capacity = capacity;
        head = null;
        tail = null;
    }

    public boolean isFull() {
        return amount == capacity;
    }

    /*
     * Verifica se a fila está vazia
     * 
     * @return true se a fila está vazia,
     * e false caso contrário
     */
    public boolean isEmpty() {
        return amount == 0;
    }

    // Cria um novo nó
    // Seto o dado neste novo nó

    // Ajustar quantro ponteiros

    public void endEnqueue(T data) {
        if (isFull()) {
            throw new NoSuchElementException("Fila cheia");
        }
        DoubleNode<T> newNode = new DoubleNode<>();
        newNode.setData(data);
        if (isEmpty()) {
            tail = newNode;
            head = newNode;
        } else {
            newNode.setPrev(tail);
            tail.setNext(newNode);
            tail = tail.getNext();
        }
        amount++;
    }

    public void beginEnqueue(T data) {
        if (isFull()) {
            throw new NoSuchElementException("Fila cheia");
        }
        DoubleNode<T> newNode = new DoubleNode<>();
        newNode.setData(data);
        if (isEmpty()) {
            tail = newNode;
            head = newNode;
        } else {
            newNode.setNext(head);
            head.setPrev(newNode);
            head = head.getPrev();
        }
        amount++;
    }

    public T endDequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Fila vazia");
        }
        amount--;
        T auxData = tail.getData();
        tail = tail.getPrev();

        if (!!isEmpty()) {
            tail.setNext(null);

        } else {
            head = null;
        }
        return auxData;
    }

    // Arrumar os ponteiros para que esses dados seja desvinculados da estrutura de
    // dados
    // head vai para o próximo
    // setar o anterior de head com null;
    public T beginDequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Fila vazia");
        }

        amount--;

        T auxData = head.getData();
        head = head.getNext();

        if (!!isEmpty()) {
            head.setPrev(null);

        } else {
            tail = null;
        }
        return auxData;
    }

    public T front() {
        if (isEmpty()) {
            throw new NoSuchElementException("Fila vazia");
        }
        return head.getData();
    }

    public T tail() {
        if (isEmpty()) {
            throw new NoSuchElementException("Fila vazia");
        }
        return tail.getData();
    }

    public String printFrontTorear() {
        if (isEmpty()) {
            return "[]";
        }
        
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        
        DoubleNode<T> current = head;
        while (current != null) {
            sb.append(current.getData());
            if (current.getNext() != null) {
                sb.append(", ");
            }
            current = current.getNext();
        }
        
        sb.append("]");
        return sb.toString();
        
    }

    public String printRearTorear() {
        if (isEmpty()) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("[");

        DoubleNode<T> current = tail; 
        while (current != null) {
            sb.append(current.getData());
            if (current.getPrev() != null) {
                sb.append(", ");
            }
            current = current.getPrev();
        }

        sb.append("]");
        return sb.toString();
    }

        }
      