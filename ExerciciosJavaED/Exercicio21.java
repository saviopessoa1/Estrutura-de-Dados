import java.util.Arrays;

public class Exercicio21 {
    public static void main(String[] args) {
        char[] letras = {'a', 'b', 'e', 'x', 'i', 'o', 'u', 'z'};

        for(int i=0; i<letras.length; i++){
            if("aeiouAEIOU".indexOf(letras[i]) != -1){
                letras[i] = '*';
            }
        }

        System.out.println("Resultado: " + Arrays.toString(letras));
    }
}
