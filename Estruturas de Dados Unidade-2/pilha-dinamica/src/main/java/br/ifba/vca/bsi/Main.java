package br.ifba.vca.bsi;
import java.util.NoSuchElementException;

public class Main {

    public static void main(String[] args) {
        System.out.println("--- Iniciando teste da Pilha Dinâmica ---");

        // 1. Criando uma pilha de Inteiros com capacidade máxima de 5 elementos
        Stackable<Integer> minhaPilha = new LinkedStack<>(5);
        System.out.println("Pilha criada. Estado inicial: " + minhaPilha.print());
        System.out.println("A pilha está vazia? " + minhaPilha.isEmpty());
        System.out.println();

        // 2. Adicionando (push) elementos na pilha
        System.out.println("--- Adicionando elementos (10, 20, 30) ---");
        minhaPilha.push(10);
        minhaPilha.push(20);
        minhaPilha.push(30);
        System.out.println("Estado da pilha: " + minhaPilha.print());
        System.out.println("A pilha está vazia? " + minhaPilha.isEmpty());
        System.out.println();

        // 3. Verificando o topo (peek)
        System.out.println("--- Verificando o topo ---");
        System.out.println("Elemento no topo (peek): " + minhaPilha.peek());
        System.out.println("Estado da pilha (não deve mudar): " + minhaPilha.print());
        System.out.println();

        // 4. Removendo (pop) um elemento
        System.out.println("--- Removendo um elemento ---");
        Integer elementoRemovido = minhaPilha.pop();
        System.out.println("Elemento removido (pop): " + elementoRemovido);
        System.out.println("Estado da pilha agora: " + minhaPilha.print());
        System.out.println("Novo elemento no topo: " + minhaPilha.peek());
        System.out.println();
        
        // 5. Atualizando (update) o elemento do topo
        System.out.println("--- Atualizando o topo para 99 ---");
        minhaPilha.update(99);
        System.out.println("Estado da pilha agora: " + minhaPilha.print());
        System.out.println("Novo elemento no topo: " + minhaPilha.peek());
        System.out.println();

        // 6. Testando o limite da pilha (isFull)
        System.out.println("--- Enchendo a pilha até a capacidade máxima ---");
        minhaPilha.push(40);
        minhaPilha.push(50);
        minhaPilha.push(60);
        System.out.println("Estado da pilha: " + minhaPilha.print());
        System.out.println("A pilha está cheia? " + minhaPilha.isFull());
        System.out.println();

        // 7. Tentando adicionar em uma pilha cheia (deve lançar exceção)
        System.out.println("--- Tentando adicionar em pilha cheia ---");
        try {
            minhaPilha.push(70);
        } catch (IllegalStateException e) {
            System.out.println("SUCESSO: Exceção capturada! Mensagem: " + e.getMessage());
        }
        System.out.println();

        // 8. Esvaziando a pilha
        System.out.println("--- Esvaziando a pilha ---");
        while (!minhaPilha.isEmpty()) {
            System.out.println("Removido: " + minhaPilha.pop() + ". Estado: " + minhaPilha.print());
        }
        System.out.println("A pilha está vazia? " + minhaPilha.isEmpty());
        System.out.println();

        // 9. Tentando remover de uma pilha vazia (deve lançar exceção)
        System.out.println("--- Tentando remover de pilha vazia ---");
        try {
            minhaPilha.pop();
        } catch (NoSuchElementException e) {
            System.out.println("SUCESSO: Exceção capturada! Mensagem: " + e.getMessage());
        }
        System.out.println("\n--- Teste finalizado ---");
    }
}