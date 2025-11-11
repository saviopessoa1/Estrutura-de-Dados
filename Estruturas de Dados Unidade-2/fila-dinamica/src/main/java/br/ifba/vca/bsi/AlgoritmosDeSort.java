package br.ifba.vca.bsi;


public class AlgoritmosDeSort {

    
    public static void bubbleSort(int[] array) {
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

  
    public static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int indiceDoMenor = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[indiceDoMenor]) {
                    indiceDoMenor = j;
                }
            }
            int temp = array[indiceDoMenor];
            array[indiceDoMenor] = array[i];
            array[i] = temp;
        }
    }

   
    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int chave = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > chave) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = chave;
        }
    }
}