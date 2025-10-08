import java.util.Arrays;

public class Exercicio18 {
    public static void main(String[] args) {
        int[] x = {2, 4, 6};
        int[] y = {1, 3, 5};
        int[] resultado = new int[x.length];

        for(int i=0; i<x.length; i++){
            resultado[i] = x[i] * y[i];
        }

        System.out.println("Array resultado: " + Arrays.toString(resultado));
    }
}
