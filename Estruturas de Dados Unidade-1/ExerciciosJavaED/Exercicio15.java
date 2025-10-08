import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] notas = new double[100];
        int totalDeNotas = 0;

        System.out.println("Digite as notas (ou -1 para parar):");

        while (totalDeNotas < 100) {
            System.out.print("Nota: ");
            double notaDigitada = scan.nextDouble();

            if (notaDigitada == -1) {
                break;
            }

            notas[totalDeNotas] = notaDigitada;
            totalDeNotas++;
        }

        System.out.println("\n--- Analise das Notas ---");

        System.out.println("Quantidade de notas lidas: " + totalDeNotas);

        System.out.print("Notas na ordem informada: ");
        for (int i = 0; i < totalDeNotas; i++) {
            System.out.print(notas[i] + " ");
        }
        System.out.println();

        System.out.println("Notas na ordem inversa:");
        for (int i = totalDeNotas - 1; i >= 0; i--) {
            System.out.println(notas[i]);
        }

        double soma = 0;
        for (int i = 0; i < totalDeNotas; i++) {
            soma = soma + notas[i];
        }
        System.out.println("Soma dos valores: " + soma);

        double media = soma / totalDeNotas;
        System.out.println("Media dos valores: " + media);

        int acimaDaMedia = 0;
        for (int i = 0; i < totalDeNotas; i++) {
            if (notas[i] > media) {
                acimaDaMedia++;
            }
        }
        System.out.println("Quantidade de valores acima da media: " + acimaDaMedia);

        int abaixoDeSete = 0;
        for (int i = 0; i < totalDeNotas; i++) {
            if (notas[i] < 7) {
                abaixoDeSete++;
            }
        }
        System.out.println("Quantidade de valores abaixo de sete: " + abaixoDeSete);

        scan.close();
    }
}