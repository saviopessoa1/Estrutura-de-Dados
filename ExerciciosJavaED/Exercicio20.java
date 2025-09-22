import java.util.ArrayList;
import java.util.Arrays;

public class Exercicio20 {
    public static void main(String[] args) {
        String[] palavras = {"uva", "maçã", "pera", "uva", "laranja", "uva"};
        String remover = "uva";

        ArrayList<String> novaLista = new ArrayList<>();
        for(String p : palavras){
            if(!p.equals(remover)){
                novaLista.add(p);
            }
        }

        String[] resultado = novaLista.toArray(new String[0]);
        System.out.println("Antes: " + Arrays.toString(palavras));
        System.out.println("Depois: " + Arrays.toString(resultado));
    }
}
