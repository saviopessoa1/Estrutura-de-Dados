import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetor = new int[5];

        System.out.println("Digite 5 números inteiros:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = scan.nextInt();
        }

        System.out.println("Números digitados:");
        for (int n : vetor) {
            System.out.print(n + " ");
        }
        System.out.println();

        scan.close();
    }
}
