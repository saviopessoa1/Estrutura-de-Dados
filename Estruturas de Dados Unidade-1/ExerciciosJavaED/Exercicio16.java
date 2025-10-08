import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetor = {3, 7, 8, 7, 2, 10};
        System.out.print("Digite um número para procurar: ");
        int procurado = scan.nextInt();

        int indice = -1;
        for(int i=0; i<vetor.length; i++){
            if(vetor[i] == procurado){
                indice = i;
                break;
            }
        }

        System.out.println("Índice: " + indice);
        scan.close();
    }
}
