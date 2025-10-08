import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] idades = new int[30];
        double[] alturas = new double[30];
        double somaAlturas = 0.0;

        for (int i = 0; i < 30; i++) {
            System.out.println("\n--- Aluno " + (i + 1) + " ---");
            System.out.print("Idade: ");
            idades[i] = scan.nextInt();

            System.out.print("Altura (use virgula, ex: 1,75): ");
            alturas[i] = scan.nextDouble();

            somaAlturas = somaAlturas + alturas[i];
        }

        double mediaAltura = somaAlturas / 30;
        System.out.println("\nA media de altura da turma foi: " + mediaAltura);

        int contadorDeAlunos = 0;
        for (int i = 0; i < 30; i++) {
            if (idades[i] > 13 && alturas[i] < mediaAltura) {
                contadorDeAlunos = contadorDeAlunos + 1;
            }
        }

        System.out.println("Alunos com mais de 13 anos e altura menor que a media: " + contadorDeAlunos);

        scan.close();
    }
}