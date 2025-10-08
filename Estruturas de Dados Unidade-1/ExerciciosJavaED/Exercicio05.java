import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numeros = new int[20];
        int[] pares = new int[20];
        int[] impares = new int[20];
        int qtdPares = 0, qtdImpares = 0;

        System.out.println("Digite 20 números inteiros:");
        for (int i = 0; i < 20; i++) {
            numeros[i] = scan.nextInt();

            // se o número é par
            if (numeros[i] % 2 == 0) {
                pares[qtdPares] = numeros[i];
                qtdPares++;
            } else { // se é ímpar
                impares[qtdImpares] = numeros[i];
                qtdImpares++;
            }
        }

        System.out.println("Números digitados:");
        for (int i = 0; i < 20; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println("\nNúmeros pares:");
        for (int i = 0; i < qtdPares; i++) {
            System.out.print(pares[i] + " ");
        }

        System.out.println("\nNúmeros ímpares:");
        for (int i = 0; i < qtdImpares; i++) {
            System.out.print(impares[i] + " ");
        }
        scan.close();
    }
}
