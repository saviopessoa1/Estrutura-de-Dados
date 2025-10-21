package br.ifba.vca.bsi;

public interface Queueable<T> {

    
    public boolean isFull();

    public boolean isEmpty();

   
    public void beginEnqueue(); 

   
    public T endDequeue();

   
    public T beginDequeue();

    public T endEnqueue();
    
    public T front();

  
    public T tail();

    
    public String printFrontTorear();

    public String printRearTorear();
}