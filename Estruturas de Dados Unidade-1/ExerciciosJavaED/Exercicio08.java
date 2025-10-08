import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] idades = new int[5];
        double[] alturas = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite a idade da pessoa " + (i + 1) + ":");
            idades[i] = scanner.nextInt();
            System.out.println("Digite a altura (em metros) da pessoa " + (i + 1) + ":");
            alturas[i] = scanner.nextDouble();
        }

        System.out.println("\nIdade e altura na ordem inversa:");
        for (int i = 4; i >= 0; i--) {
            System.out.println("Pessoa " + (i + 1) + ": Idade = " + idades[i] + ", Altura = " + alturas[i]);
        }
        scanner.close();
    }
}