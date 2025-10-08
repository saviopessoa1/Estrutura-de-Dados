public class Exercicio17 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {1, 2, 3, 4};
        int[] c = {1, 2, 4, 3};

        System.out.println("a e b iguais? " + arraysIguais(a, b));
        System.out.println("a e c iguais? " + arraysIguais(a, c));
    }

    static boolean arraysIguais(int[] v1, int[] v2) {
        if (v1.length != v2.length) {
            return false;
        }

        for (int i = 0; i < v1.length; i++) {
            if (v1[i] != v2[i]) {
                return false;
            }
        }

        return true;
    }
}
