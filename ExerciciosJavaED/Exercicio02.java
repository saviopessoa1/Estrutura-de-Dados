import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] vetor = new double[10];

        System.out.println("Digite 10 números reais:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = scan.nextDouble();
        }

        System.out.println("Ordem inversa:");
        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
        
        scan.close();
    }
}
