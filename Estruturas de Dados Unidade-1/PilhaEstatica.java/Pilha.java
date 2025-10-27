import java.util.ArrayDeque;

public class Pilha {
    public static String decTobin (String data ) {
      int num = Integer.parseInt(data);
      ArrayDeque<Integer> pilha = new ArrayDeque<>();
      while(num > 0){
        pilha.push(num % 2);
        num = num / 2;
      }
      
    } 

}