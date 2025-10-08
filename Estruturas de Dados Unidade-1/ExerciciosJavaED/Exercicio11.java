import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] vetor3 = new int[10];
        int[] resultado = new int[30];

        System.out.println("--- Vetor 1 ---");
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um numero: ");
            vetor1[i] = scan.nextInt();
        }

        System.out.println("--- Vetor 2 ---");
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um numero: ");
            vetor2[i] = scan.nextInt();
        }

        System.out.println("--- Vetor 3 ---");
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um numero: ");
            vetor3[i] = scan.nextInt();
        }

        int posicaoResultado = 0;
        for (int i = 0; i < 10; i++) {
            resultado[posicaoResultado] = vetor1[i];
            posicaoResultado++; // Vai para a proxima posicao
            resultado[posicaoResultado] = vetor2[i];
            posicaoResultado++; // Vai para a proxima posicao
            resultado[posicaoResultado] = vetor3[i];
            posicaoResultado++; // Vai para a proxima posicao
        }

        System.out.println("\n--- Vetor com valores misturados ---");
        for (int i = 0; i < 30; i++) {
            System.out.print(resultado[i] + " ");
        }
        System.out.println(); // Só para pular a linha no final

        scan.close();
    }
}