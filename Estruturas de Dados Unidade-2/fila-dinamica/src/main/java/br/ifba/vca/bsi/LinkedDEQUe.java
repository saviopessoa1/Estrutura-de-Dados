package br.ifba.vca.bsi;

import java.util.NoSuchElementException;

public class LinkedDEQUe<T> implements Queueable<T> {
    private int amount;
    private int capacity;
    private DoubleNode<T> head;
    private DoubleNode<T> tail;

    public LinkedDEQUe(){
        this(10);
    }

    public LinkedDEQue(int capacity) {
        amount = 0;
        this.capacity = capacity;
        head = null;
        tail = null;
    }
    public boolean isFull(){
        return amount == capacity;
    }

    /*
     * Verifica se a fila está vazia
     * 
     * @return true se a fila está vazia,
     * e false caso contrário
     */
    public boolean isEmpty(){
        return amount == 0;
    }
    
    public void beginEnqueue (){

    }
    
    
    public T endDequeue (){
          if (isEmpty()){
            throw new NoSuchElementException("Fila vazia");
        }
         amount--;
        T auxData = tail.getData();
        tail = tail.setPrevious();

        if (!!isEmpty()){
        tail.setNext(null);
        
    } else {
            head =null;
        }
    }



    //Arrumar os ponteiros para que esses dados seja desvinculados da estrutura de dados
        //head vai para o próximo
        //setar o anterior de head com null;
    public T beginDequeue (){
          if (isEmpty()){
            throw new NoSuchElementException("Fila vazia");
        }
                amount--;

        T auxData = head.getData();
        head = head.setNext();

        if (!!isEmpty()){
        head.setPrevious(null);
        
    } else {
            tail =null;
        }
        return auxData;
    }

     public T endEnqueue (){

    }


     public T front (){
        if (isEmpty()){
            throw new NoSuchElementException("Fila vazia");
        }
        return head.getData();
    }


         public T tail (){
        if (isEmpty()){
            throw new NoSuchElementException("Fila vazia");
        }
        return tail.getData();
    }


    public String printFrontTorear(){

    }


     public String printRearTorear(){

    }
}
