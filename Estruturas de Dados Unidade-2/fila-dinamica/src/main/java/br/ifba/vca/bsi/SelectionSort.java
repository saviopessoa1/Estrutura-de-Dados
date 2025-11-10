package br.ifba.vca.bsi;

/**
 * Implementação do algoritmo de ordenação Selection Sort (Ordenação por Seleção).
 *
 * @author Sávio Neri Pessoa
 * @version 1.0
 */
public class SelectionSort {

    /**
     * Ordena um array de inteiros usando o Selection Sort.
     * A lógica é, a cada iteração, encontrar o menor elemento
     * no restante do array (a parte não ordenada) e trocá-lo
     * com o elemento da posição atual.
     *
     * Complexidade de Tempo:
     * - Pior Caso: O(n^2)
     * - Caso Médio: O(n^2)
     * - Melhor Caso: O(n^2) - (Sempre faz as comparações, mesmo se já estiver ordenado)
     *
     * Complexidade de Espaço: O(1) - (Ordena no local)
     *
     * @param array O array a ser ordenado.
     */
    public static void sort(int[] array) {
        // n é o tamanho do array
        // Loop externo: itera por todas as posições do array.
        // 'i' é a posição atual que estamos tentando preencher com o
        // elemento correto (o i-ésimo menor elemento).
        // Vai até n-2, pois quando 'i' for o penúltimo, o último (n-1)
        // já estará correto por consequência.
        for (int i = 0; i < array.length - 1; i++) {

            // Assume que o menor elemento é o que está na posição 'i' (início da parte não ordenada)
            int indiceDoMenor = i;

            // Loop interno: procura pelo índice do menor elemento no restante do array
            // (da posição i+1 até o final).
            for (int j = i + 1; j < array.length; j++) {
                // Se encontrar um elemento (na posição j) que é menor
                // que o menor elemento atual (na posição indiceDoMenor)...
                if (array[j] < array[indiceDoMenor]) {
                    // ...atualiza o 'indiceDoMenor' para ser 'j'.
                    indiceDoMenor = j;
                }
            }

            // Após o loop interno, 'indiceDoMenor' guarda o índice do menor elemento
            // encontrado na parte não ordenada do array.

            // Troca o menor elemento encontrado (array[indiceDoMenor]) com o elemento
            // da posição atual 'i'.
            // (Uma otimização seria verificar se i != indiceDoMenor antes de trocar)
            int temp = array[indiceDoMenor];
            array[indiceDoMenor] = array[i];
            array[i] = temp;

            // Agora, o i-ésimo menor elemento está garantidamente na posição 'i',
            // e a parte ordenada do array cresceu (de 0 até i).
        }
    }
}