public class Recursiva {
    
    public static int somatorio(int inicio, int fim) {

        if (inicio > fim) {
            return -1;
        }
        if (inicio == fim) {
            return inicio;
        }


        return inicio + somatorio(inicio + 1, fim);
    }

    public static void main(String[] args) {
        int M = 0;
        int N = 200;
       

        System.out.println(somatorio(M, N));
    }
}
