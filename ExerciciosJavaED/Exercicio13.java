import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] temperaturas = new double[12];
        double soma = 0.0;

        for (int i = 0; i < 12; i++) {
            System.out.print("Digite a temperatura media do mes " + (i + 1) + ": ");
            temperaturas[i] = scan.nextDouble();
            soma = soma + temperaturas[i];
        }

        double media = soma / 12;
        System.out.println("\nA media anual de temperatura foi: " + media);

        System.out.println("\nMeses com temperatura acima da media:");
        for (int i = 0; i < 12; i++) {
            if (temperaturas[i] > media) {
                if (i == 0) {
                    System.out.println("1 - Janeiro: " + temperaturas[i]);
                } else if (i == 1) {
                    System.out.println("2 - Fevereiro: " + temperaturas[i]);
                } else if (i == 2) {
                    System.out.println("3 - Marco: " + temperaturas[i]);
                } else if (i == 3) {
                    System.out.println("4 - Abril: " + temperaturas[i]);
                } else if (i == 4) {
                    System.out.println("5 - Maio: " + temperaturas[i]);
                } else if (i == 5) {
                    System.out.println("6 - Junho: " + temperaturas[i]);
                } else if (i == 6) {
                    System.out.println("7 - Julho: " + temperaturas[i]);
                } else if (i == 7) {
                    System.out.println("8 - Agosto: " + temperaturas[i]);
                } else if (i == 8) {
                    System.out.println("9 - Setembro: " + temperaturas[i]);
                } else if (i == 9) {
                    System.out.println("10 - Outubro: " + temperaturas[i]);
                } else if (i == 10) {
                    System.out.println("11 - Novembro: " + temperaturas[i]);
                } else if (i == 11) {
                    System.out.println("12 - Dezembro: " + temperaturas[i]);
                }
            }
        }
        scan.close();
    }
}