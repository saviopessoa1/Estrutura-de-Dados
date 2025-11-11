package br.ifba.vca.bsi;

public interface Queueable<T> {
        public boolean isFull();
        public boolean isEmpty();
        public void beginEnqueue(T data);
        public T endDequeue();
        public T beginDequeue();
        public void endEnqueue(T data);
        public T front();
        public T tail();
        public String printFrontTorear();
        public String printRearTorear();
}