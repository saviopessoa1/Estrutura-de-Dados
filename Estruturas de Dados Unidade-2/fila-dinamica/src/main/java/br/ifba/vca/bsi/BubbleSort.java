package br.ifba.vca.bsi;

/**
 * Implementação do algoritmo de ordenação Bubble Sort (Ordenação por Bolha).
 *
 * @author Sávio Neri Pessoa (e Gemini)
 * @version 1.1
 */
public class BubbleSort {

    /**
     * Ordena um array de inteiros usando o Bubble Sort.
     * A lógica é "flutuar" (como uma bolha) o maior elemento para o final
     * do array a cada iteração principal.
     *
     * Complexidade de Tempo:
     * - Pior Caso: O(n^2) - (Array em ordem inversa)
     * - Caso Médio: O(n^2)
     * - Melhor Caso: O(n) - (Com a otimização 'trocou', se o array já estiver ordenado)
     *
     * Complexidade de Espaço: O(1) - (Ordena no local, sem usar memória extra)
     *
     * @param array O array a ser ordenado.
     */
    public static void sort(int[] array) {
        // n é o tamanho do array
        int n = array.length;

        // 'trocou' é uma otimização importante.
        // Se em uma passada completa pelo array nenhuma troca for feita,
        // isso significa que o array já está ordenado e podemos parar.
        boolean trocou;

        // Loop externo: controla quantas passadas faremos pelo array.
        // Vai de i = 0 até n-2. A cada passada, o (i)-ésimo maior elemento
        // é colocado na sua posição correta no final do array.
        for (int i = 0; i < n - 1; i++) {
            trocou = false; // Reseta a flag de troca para esta nova passada

            // Loop interno: compara os elementos adjacentes (vizinhos).
            // Vai de j = 0 até n-1-i.
            // O "-i" é uma otimização, pois os 'i' últimos elementos
            // já estão em suas posições corretas (ordenados) e não precisam ser verificados.
            for (int j = 0; j < n - 1 - i; j++) {

                // Compara o elemento atual (j) com o próximo (j+1)
                if (array[j] > array[j + 1]) {
                    // Se o atual for maior que o próximo, eles devem ser trocados.
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    // Marca que uma troca ocorreu nesta passada.
                    trocou = true;
                }
            }

            // OTIMIZAÇÃO: Se este loop interno terminou e 'trocou' ainda é 'false',
            // significa que nenhum elemento foi trocado. O array está ordenado.
            if (!trocou) {
                break; // Interrompe o loop externo
            }
        }
    }
}