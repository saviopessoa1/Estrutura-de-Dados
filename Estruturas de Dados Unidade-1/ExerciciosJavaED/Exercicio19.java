import java.util.Arrays;

public class Exercicio19 {
    public static void main(String[] args) {
        String[] nomes = {"Ana", "Bruno", "Carlos", "Duda"};
        System.out.println("Antes: " + Arrays.toString(nomes));

        for(int i=0; i<nomes.length/2; i++){
            String temp = nomes[i];
            nomes[i] = nomes[nomes.length-1-i];
            nomes[nomes.length-1-i] = temp;
        }

        System.out.println("Depois: " + Arrays.toString(nomes));
    }
}
