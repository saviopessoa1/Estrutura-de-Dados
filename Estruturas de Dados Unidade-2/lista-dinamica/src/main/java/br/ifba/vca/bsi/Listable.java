package br.ifba.vca.bsi;

public interface Listable<T> {

	void anexar(T dado);
	void inserir(int posicao, T dado);
	T select(int posicao);
	T[] selectAll();
	void update(int posicao, T novoDado);
	T delete(int posicao);
	boolean isFull();
	boolean isEmpty();
	String print();
}