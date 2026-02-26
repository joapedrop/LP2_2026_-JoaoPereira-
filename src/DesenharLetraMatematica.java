public class DesenharLetraMatematica {
    static java.util.Scanner LER = new java.util.Scanner(System.in);

    public static int LerNumInt() {
        int num = 0;

        num = LER.nextInt();

        return num;
    }

    public static void main(String[] args) {
        

    }

    public static void CriarA() {
        int altura = 40; 
        int largura = 2 * altura - 1;

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < largura; j++) {
                

                
                if (j == altura - i - 1 || // Lado esquerdo
                    j == altura + i - 1 || // Lado direito
                    (i == altura / 2 && j > altura - i - 1 && j < altura + i - 1) // Meio
                ) {
                    System.out.print("▉");
                } else {
                    System.out.print("░");
                }
            }
            System.out.println(); // Pula linha
        }
    }
}
