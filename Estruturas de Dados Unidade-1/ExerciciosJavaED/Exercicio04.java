import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] letras = new char[10];
        int contador = 0;

        System.out.println("Digite 10 caracteres:");
        for (int i = 0; i < letras.length; i++) {
            letras[i] = scan.next().charAt(0);
        }

        System.out.println("Consoantes:");
        for (char c : letras) {
            if (Character.isLetter(c) && !"aeiouAEIOU".contains("" + c)) {
                System.out.print(c + " ");
                contador++;
            }
        }

        System.out.println("\nTotal de consoantes: " + contador);

        scan.close();
    }
}
