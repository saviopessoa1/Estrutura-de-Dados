import java.util.Scanner;
import java.util.Arrays;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] vetor3 = new int[20];

        System.out.println("Digite os 10 elementos do primeiro vetor:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor1[i] = scanner.nextInt();
        }

        System.out.println("\nDigite os 10 elementos do segundo vetor:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor2[i] = scanner.nextInt();
        }

        // Intercalando os vetores
        for (int i = 0; i < 10; i++) {
            vetor3[2 * i] = vetor1[i];
            vetor3[2 * i + 1] = vetor2[i];
        }

        System.out.println("\nTerceiro vetor com elementos intercalados:");
        System.out.println(Arrays.toString(vetor3));
        scanner.close();
    }
}