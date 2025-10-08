import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] notas = new double[4];
        double soma = 0;

        System.out.println("Digite 4 notas:");
        for (int i = 0; i < notas.length; i++) {
            notas[i] = scan.nextDouble();
            soma += notas[i];
        }

        double media = soma / notas.length;

        System.out.println("Notas:");
        for (double n : notas) {
            System.out.print(n + " ");
        }
        System.out.println("\nMédia = " + media);

        scan.close();
    }
}
