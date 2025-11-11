package br.ifba.vca.bsi;
/** Implementação do algoritmo de ordenação Selection Sort (Ordenação por Seleção).
 * 
 * @author Sávio Neri Pessoa
 * @version 1.0
 * @since 25/06/2024
 */
public class Sort {
    public static void sort(int[] array) {

        for (int j = 0; j < array.length - 1; j++) {

            int minorIndex = 0;

            for (int i = i + 1; i < array.length; i++) {
                if (array[i] < array[minorIndex]) {
                    minorIndex = i;
                }
            }
            int temp = array[minorIndex];
            array[minorIndex] = array[j];
            array[j] = temp;
        }
    }
    

         public class BubbleSort {

    
    public static void sort(int[] array) {
        int n = array.length;

       
        boolean trocou;

       
        for (int i = 0; i < n - 1; i++) {
            trocou = false;

           
            for (int j = 0; j < n - 1 - i; j++) {

                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    trocou = true;
                }
            }
            if (!trocou) {
                break; 
            }
        }
    }
}
}