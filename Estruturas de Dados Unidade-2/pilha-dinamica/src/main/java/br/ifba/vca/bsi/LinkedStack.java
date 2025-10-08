package br.ifba.vca.bsi;

import java.util.NoSuchElementException;

/** Implementação de uma pilha dinamica generica T
 * 
 * @param T, tipo de dado que será armazenado na pilha
 * @author Sávio Neri Pessoa
 * @version 1.0
 * @since 06/10/2025
 */

public class LinkedStack<T> implements Stackable <T>{
   /** apontar para o topo da pilha*/ 

    private DoubleNode<T> topPointer;
    private int numberElements;
    private int maximoElementos;

    public LinkedStack(int maximoElementos){
        topPointer = null;
        numberElements = 0;
        this.maximoElementos = maximoElementos;
    }

   /**
	 * Retorna o elemento do topo da pilha sem removê-lo.
	 *
	 * @return o elemento do topo
	 * @throws NoSuchElementException se a pilha estiver vazia
	 */
    
    @Override
    public T pop() {
    if (isEmpty()) {
        throw new NoSuchElementException("Pilha está vazia!");
    }
    T auxData = topPointer.getData();
    topPointer = topPointer.getPrev(); // O topPointer pode virar NULL aqui

    if (topPointer != null) {
        topPointer.setNext(null);
    }

    numberElements--;
    return auxData;
    }
    /**
	 * Adiciona um elemento ao topo da pilha.
	 *
	 * @param dado o elemento a ser adicionado
	 * @throws NoSuchElementException se a pilha estiver cheia
	 */


   // CÓDIGO CORRIGIDO PARA O PUSH
   @Override
   public T push(T data) {
    if (isFull()) {
        throw new IllegalStateException("Stack is full!");
    }
    DoubleNode<T> newNode = new DoubleNode<>();
    newNode.setData(data);

    if (isEmpty()) { // CHECAMOS SE ESTÁ VAZIA PRIMEIRO!
        topPointer = newNode; // Se estiver vazia, o novo nó simplesmente vira o topo.
    } else { // SE JÁ TEM ALGUM ELEMENTO, AÍ SIM CONECTAMOS.
        topPointer.setNext(newNode);
        newNode.setPrev(topPointer);
        topPointer = newNode;
    }
    numberElements++;
    return data;
    }
    
    /**
	 * Atualiza o topo da pilha.
	 *
	 * @return array com todos os elementos da pilha
	 * @throws NoSuchElementException se a pilha estiver vazia
	 */

     @Override
    public void update(T newData){
        pop();
        push(newData);
    }
    


    @Override
    public T peek(){
        if (isEmpty()){
            throw new NoSuchElementException("Pilha está cheivazia!");
        }
         if (topPointer != null) {
        topPointer.setNext(null);
    }
        return topPointer.getData();
        
    }
    
    /**
	 * Verifica se a pilha está vazia.
	 *
	 * @return true se a pilha estiver vazia, false caso contrário
	 */

    @Override
    public boolean isEmpty(){
        return numberElements == 0;
    }

	/**
	 * Verifica se a pilha está cheia.
	 *
	 * @return true se a pilha estiver cheia, false caso contrário
	 */
	
    @Override
    public boolean isFull(){
        return maximoElementos == numberElements;
    }
    
    public String print() {
		String resultado = "[";
		DoubleNode<T> auxPointer = topPointer;
		for (int i = 0; i < numberElements; i++) {
			resultado += auxPointer.getData();
			if (i != numberElements - 1) {
				resultado += ",";
			}
			auxPointer = auxPointer.getPrev();
		}
		return resultado + "]";
	}
}
