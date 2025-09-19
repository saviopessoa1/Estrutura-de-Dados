import java.util.Scanner;
import java.util.Arrays;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        long soma = 0;
        long multiplicacao = 1;

        System.out.println("Digite 5 números inteiros:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            soma += numeros[i];
            multiplicacao *= numeros[i];
        }

        System.out.println("\nNúmeros digitados: " + Arrays.toString(numeros));
        System.out.println("Soma dos números: " + soma);
        System.out.println("Multiplicação dos números: " + multiplicacao);
        scanner.close();
    }
}