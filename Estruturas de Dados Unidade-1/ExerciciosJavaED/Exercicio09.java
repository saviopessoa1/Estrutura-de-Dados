import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[10];
        long somaDosQuadrados = 0;

        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            a[i] = scanner.nextInt();
            somaDosQuadrados += (long) a[i] * a[i]; // (long) para evitar overflow
        }

        System.out.println("\nA soma dos quadrados dos elementos do vetor é: " + somaDosQuadrados);
        scanner.close();
    }
}