import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int respostasPositivas = 0;
        String resposta;

        System.out.println("--- Interrogatorio ---");
        System.out.println("Responda apenas com 'sim' ou 'nao'.");

        System.out.print("Telefonou para a vitima? ");
        resposta = scan.next();
        if (resposta.equals("sim")) {
            respostasPositivas = respostasPositivas + 1;
        }

        System.out.print("Esteve no local do crime? ");
        resposta = scan.next();
        if (resposta.equals("sim")) {
            respostasPositivas = respostasPositivas + 1;
        }

        System.out.print("Mora perto da vitima? ");
        resposta = scan.next();
        if (resposta.equals("sim")) {
            respostasPositivas = respostasPositivas + 1;
        }

        System.out.print("Devia para a vitima? ");
        resposta = scan.next();
        if (resposta.equals("sim")) {
            respostasPositivas = respostasPositivas + 1;
        }

        System.out.print("Ja trabalhou com a vitima? ");
        resposta = scan.next();
        if (resposta.equals("sim")) {
            respostasPositivas = respostasPositivas + 1;
        }

        System.out.println("\n--- Veredito ---");
        if (respostasPositivas == 5) {
            System.out.println("Voce foi classificado como: Assassino");
        } else if (respostasPositivas >= 3) {
            System.out.println("Voce foi classificado como: Cumplice");
        } else if (respostasPositivas == 2) {
            System.out.println("Voce foi classificado como: Suspeita");
        } else {
            System.out.println("Voce foi classificado como: Inocente");
        }

        scan.close();
    }
}