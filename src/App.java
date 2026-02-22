import java.util.Random;

public class App {
    static java.util.Scanner LER = new java.util.Scanner(System.in);

    public static double LernumDouble() {
        double num = 0;

        num = LER.nextDouble();

        return num;
    }

    public static int LerNumInt() {
        int num = 0;

        do {
            num = LER.nextInt();
        } while (num <= 0 || num > 10);

        return num;
    }

    public static int LerNumEscolha() {
        int num = 0;

        do {
            num = LER.nextInt();
        } while (num <= -1 || num > 15);

        return num;
    }

    public static void main(String[] args) throws Exception {
        int escolha = 0;

        do {

            System.out.println("escolha entre 0 a 15");
            System.out.println("1. Calcular a soma dos elementos de uma matriz A(5,5).");
            System.out.println("2. Calcular a soma dos elementos da diagonal principal de uma matriz A(6,6).");
            System.out.println("3. Calcular a soma dos elementos da diagonal secundária de uma matriz A(6,6).");
            System.out.println("4. Calcular a soma dos elementos da linha 5 e da coluna 3 de uma matriz A(7,6).");
            System.out.println("5. Encontrar o menor elemento da diagonal secundária de uma matriz A(6,6).");
            System.out.println(
                    "6. Encontrar o maior elemento da diagonal principal de uma matriz A(8,8) e dividir todos os elementos de A por ele, armazenando em uma matriz B(8,8).");
            System.out.println(
                    "7. Calcular o produto matricial de duas matrizes A(4,6) e B(6,4) e armazenar em uma matriz C(4,4).");
            System.out.println(
                    "8. Multiplicar cada elemento de uma matriz M(6,6) por um valor A e armazenar em um vetor V(36).");
            System.out.println("9. Realizar trocas em uma matriz A(10,10) e apresentar a matriz atualizada.");
            System.out.println("10. Somar os elementos das linhas pares de uma matriz B(9,9) de inteiros.");
            System.out.println(
                    "11. Multiplicar cada linha de uma matriz A(6,6) pelo elemento da diagonal principal daquela linha e retornar a matriz alterada.");
            System.out.println(
                    "12. Calcular a média aritmética dos elementos abaixo da diagonal principal de uma matriz A(12,12).");
            System.out.println("13. Calcular a soma dos elementos acima da diagonal principal de uma matriz A(10,10).");
            System.out.println("14. Determinar a matriz A = [aij]n x m tal que aij = 2i + j^2.");
            System.out.println(
                    "15. Determinar a matriz A = [aij]n x m tal que se i + j for par é -i^2 e se for impar é 2 * i * j.");
            System.out.println("0. Sair");
            System.out.print("escolha: ");

            escolha = LerNumEscolha();

            if (escolha == 0) {
                break;
            }

            switch (escolha) {
                case 1:
                    CalcularASoma();
                    break;

                case 2:
                    CalcularAsomadadiagonalprincipal();
                    break;

                case 3:
                    CalcularAsomaDaDiagonalSecundaria();
                    break;

                case 4:
                    CalcularAsomaDaLinhaeColuna();
                    break;

                case 5:
                    EncontrarOMenorNumeroEmUmaMatriz();
                    break;

                case 6:
                    EncontrarMaiorValorEDividiir();
                    break;

                case 7:
                    CalcularProdutoMatricial();
                    break;

                case 8:
                    MultiplicarUmaMatriz();
                    break;

                case 9:
                    TrocarLinhasEColunasDaMatriz();
                    break;

                case 10:
                    SomarNumerosPares();
                    break;

                case 11:
                    MultiplicarPelaDiagonalPrincipal();
                    break;

                case 12:
                    CalcularAMediaDeUmaMatriz();
                    break;

                case 13:
                    SomaDaDiagonalPrincipalAcima();
                    break;

                case 14:
                    CriarMatrizECalcular();
                    break;

                case 15:
                    ClassificarImparEPar();
                    break;

                default:
                    break;
            }

        } while (true);

    }

    /*
     * 1. Escreva um programa que receba uma matriz A(5,5) e retorne a soma dos seus
     * elementos.
     */
    public static void CalcularASoma() {
        double[][] matrizde5 = new double[5][5];
        double soma = 0;
        double cont = 0;

        for (int i = 0; i < matrizde5.length; i++) {
            for (int j = 0; j < matrizde5[i].length; j++) {
                matrizde5[i][j] = LernumDouble();
            }
        }

        for (int i = 0; i < matrizde5.length; i++) {
            for (int j = 0; j < matrizde5[i].length; j++) {
                soma += matrizde5[i][j];
            }
        }

        System.out.println("Soma: " + soma);
    }

    /*
     * 2. Escreva um programa que receba uma matriz A(6,6) e retorne a soma dos
     * elementos da sua diagonal principal.
     */
    public static void CalcularAsomadadiagonalprincipal() {
        double[][] matrizde6 = new double[6][6];
        double soma = 0;

        for (int i = 0; i < matrizde6.length; i++) {
            for (int j = 0; j < matrizde6[i].length; j++) {
                matrizde6[i][j] = LernumDouble();
            }
        }

        for (int i = 0; i < matrizde6.length; i++) {
            for (int j = 0; j < matrizde6[i].length; j++) {
                if (i == j) {
                    soma += matrizde6[i][j];
                }
            }
        }

        System.out.println("soma da diagonal principal: " + soma);
    }

    /*
     * 3. Escreva um programa que receba uma matriz A(6,6) e retorne a soma dos
     * elementos da sua diagonal secundária.
     */
    public static void CalcularAsomaDaDiagonalSecundaria() {
        double[][] matrizde6 = new double[6][6];
        double soma = 0;

        for (int i = 0; i < matrizde6.length; i++) {
            for (int j = 0; j < matrizde6[i].length; j++) {
                matrizde6[i][j] = LernumDouble();
            }
        }

        for (int i = 0; i < matrizde6.length; i++) {
            for (int j = 0; j < matrizde6[i].length; j++) {
                if (i + j == 6 - 1) {
                    soma += matrizde6[i][j];
                }
            }
        }

        System.out.println("soma da diagonal secundaria: " + soma);
    }

    /*
     * 4. Escreva um programa que receba uma matriz A(7,6) e retorne a soma dos
     * elementos da linha 5 e da coluna 3.
     */
    public static void CalcularAsomaDaLinhaeColuna() {
        double[][] matrizde76 = new double[7][6];
        double somacoluna = 0;
        double somatotal = 0;
        double somalinha = 0;

        for (int i = 0; i < matrizde76.length; i++) {
            for (int j = 0; j < matrizde76[i].length; j++) {
                matrizde76[i][j] = LernumDouble();
            }
        }

        for (int i = 0; i < matrizde76.length; i++) {
            for (int j = 0; j < matrizde76[i].length; j++) {
                somacoluna += matrizde76[i][2];
            }
        }

        for (int i = 0; i < matrizde76.length; i++) {
            for (int j = 0; j < matrizde76[i].length; j++) {
                somalinha += matrizde76[4][j];
            }
        }

        somatotal = somalinha + somacoluna;

        System.out.println("soma de todos elementos da linha 5: " + somalinha);
        System.out.println("soma de todos elementos da coluna 3: " + somacoluna);
        System.out.println("soma da linha 5 e coluna 3: " + somatotal);
    }

    /*
     * 5. Escreva um programa que receba uma matriz A(6,6) e retorne o menor
     * elemento
     * da sua diagonal secundária.
     */
    public static void EncontrarOMenorNumeroEmUmaMatriz() {
        double[][] matrizde6 = new double[6][6];
        double menor = 99999999;

        for (int i = 0; i < matrizde6.length; i++) {
            for (int j = 0; j < matrizde6[i].length; j++) {
                matrizde6[i][j] = LernumDouble();
            }
        }

        for (int i = 0; i < matrizde6.length; i++) {
            for (int j = 0; j < matrizde6[i].length; j++) {
                if (matrizde6[i][j] < menor) {

                    menor = matrizde6[i][j];
                }
            }
        }

        System.out.println("menor numero: " + menor);
    }

    /*
     * 6. Escreva um programa que receba uma matriz A(8,8) e calcule o maior
     * elemento da sua
     * diagonal principal. A seguir, o algoritmo deve dividir todos os elementos de
     * A pelo maior
     * encontrado e armazenando em uma matriz B(8,8).
     */
    public static void EncontrarMaiorValorEDividiir() {
        double[][] matrizde8A = new double[8][8];
        double[][] matrizde8B = new double[8][8];
        double maior = 0;

        for (int i = 0; i < matrizde8A.length; i++) {
            for (int j = 0; j < matrizde8A[i].length; j++) {
                matrizde8A[i][j] = LernumDouble();
            }
        }

        for (int i = 0; i < matrizde8A.length; i++) {
            for (int j = 0; j < matrizde8A[i].length; j++) {
                if (matrizde8A[i][j] > maior) {
                    maior = matrizde8A[i][j];
                }
            }
        }

        for (int i = 0; i < matrizde8B.length; i++) {
            for (int j = 0; j < matrizde8B[i].length; j++) {
                matrizde8B[i][j] = matrizde8A[i][j] / maior;
            }
        }

        for (int i = 0; i < matrizde8B.length; i++) {
            System.out.printf("[%d] ", i);
        }
        System.out.println();

        for (int i = 0; i < matrizde8B.length; i++) {
            System.out.printf("[%d] ", i);
            for (int j = 0; j < matrizde8B[i].length; j++) {
                System.out.printf("%.2f ", matrizde8B[i][j]);
            }
            System.out.println();
        }
    }

    /*
     * 7. Escreva um programa que receba duas matrizes A(4,6) e B(6,4) e retorne uma
     * matriz C, que
     * seja o produto matricial de M por N
     */
    public static void CalcularProdutoMatricial() {
        double[][] matrizA = new double[4][6];
        double[][] matrizB = new double[6][4];
        double[][] matrizC = new double[4][4];
        double contadorA = 0;
        double contadorB = 0;

        System.out.println("matriz A");

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                matrizA[i][j] = contadorA++;
            }
        }

        System.out.println("matriz B");

        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB[i].length; j++) {
                matrizB[i][j] = contadorB++;
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                for (int j2 = 0; j2 < 6; j2++) {
                    matrizC[i][j] += matrizA[i][j2] * matrizB[j2][j];
                }
            }
        }

        for (int i = 0; i < matrizC.length; i++) {
            System.out.printf("[%d] ", i);
        }
        System.out.println();

        for (int i = 0; i < matrizC.length; i++) {
            System.out.printf("[%d] ", i);
            for (int j = 0; j < matrizC[i].length; j++) {
                System.out.printf("%.2f ", matrizC[i][j]);
            }
            System.out.println();
        }
    }

    /*
     * 8. Escreva um programa que receba uma matriz M(6,6) e um valor A . O
     * procedimento deve
     * multiplicar cada elemento de M por A e armazenar em um vetor V(36).
     */
    public static void MultiplicarUmaMatriz() {
        double[][] matrizde6 = new double[6][6];
        double valor = 0;
        double[] vetorde36 = new double[36];
        Random sorteio = new Random();
        int k = 0;

        valor = LernumDouble();

        for (int i = 0; i < matrizde6.length; i++) {
            for (int j = 0; j < matrizde6[i].length; j++) {
                matrizde6[i][j] = sorteio.nextDouble();
            }
        }

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                vetorde36[k] = matrizde6[i][j] * valor;
                k++;
            }
        }

        for (int i = 0; i < vetorde36.length; i++) {
            System.out.println("numero " + i + " multiplicado: " + vetorde36[i]);
        }
    }

    /*
     * 9. Escreva um programa que receba uma matriz A(10,10), e realize as seguintes
     * trocas:
     * a) a linha 2 com a linha 8;
     * b) a coluna 4 com a coluna 10;
     * c) a diagonal principal com a secundária;
     * d) a linha 5 com a coluna 10;
     * Ao final, apresente a Matriz A atualizada
     */
    public static void TrocarLinhasEColunasDaMatriz() {
        double[][] matrizde10 = new double[10][10];
        double cont = 0;
        double troc = 0;

        for (int i = 0; i < matrizde10.length; i++) {
            for (int j = 0; j < matrizde10[i].length; j++) {
                matrizde10[i][j] = cont++;
            }
        }

        for (int i = 0; i < matrizde10.length; i++) {
            for (int j = 0; j < matrizde10[i].length; j++) {
                troc = matrizde10[1][j];
                matrizde10[1][j] = matrizde10[i][7];
                matrizde10[i][7] = troc;
            }
        }

        for (int i = 0; i < matrizde10.length; i++) {
            for (int j = 0; j < matrizde10[i].length; j++) {
                troc = matrizde10[i][3];
                matrizde10[i][3] = matrizde10[i][9];
                matrizde10[i][9] = troc;
            }
        }

        for (int i = 0; i < matrizde10.length; i++) {
            for (int j = 0; j < matrizde10[i].length; j++) {
                troc = matrizde10[i][i];
                matrizde10[i][i] = matrizde10[i][9 - i];
                matrizde10[i][9 - i] = troc;
            }
        }

        for (int i = 0; i < matrizde10.length; i++) {
            for (int j = 0; j < matrizde10[i].length; j++) {
                troc = matrizde10[4][j];
                matrizde10[4][j] = matrizde10[i][9];
                matrizde10[i][9] = troc;
            }
        }

        for (int i = 0; i < matrizde10.length; i++) {
            System.out.printf("[%d] ", i);
        }
        System.out.println();

        for (int i = 0; i < matrizde10.length; i++) {
            System.out.printf("[%d] ", i);
            for (int j = 0; j < matrizde10[i].length; j++) {
                System.out.printf("%.2f ", matrizde10[i][j]);
            }
            System.out.println();
        }
    }

    /*
     * 10. Escreva um programa que receba uma matriz B(9,9) de inteiros e retorne a
     * soma
     * dos
     * elementos das linhas pares de B.
     */
    public static void SomarNumerosPares() {
        int[][] matrizde9 = new int[9][9];
        int soma = 0;
        int cont = 0;

        for (int i = 0; i < matrizde9.length; i++) {
            for (int j = 0; j < matrizde9[i].length; j++) {
                matrizde9[i][j] = cont++;
            }
        }

        for (int i = 0; i < matrizde9.length; i++) {
            for (int j = 0; j < matrizde9.length; j++) {
                if (matrizde9[i][j] % 2 == 0) {
                    soma += matrizde9[i][j];
                }
            }
        }

        System.out.println("soma dos pares: " + soma);
    }

    /*
     * 11. Escreva um programa que receba uma matriz A(6,6) e multiplique cada linha
     * pelo elemento
     * da diagonal principal daquela linha. O procedimento deve retornar a matriz
     * alterada.
     */
    public static void MultiplicarPelaDiagonalPrincipal() {
        int[][] matrizde6 = new int[6][6];
        int multiplicador = 0;
        int cont = 1;

        for (int i = 0; i < matrizde6.length; i++) {
            for (int j = 0; j < matrizde6[i].length; j++) {
                matrizde6[i][j] = cont++;
            }
        }

        for (int i = 0; i < matrizde6.length; i++) {
            multiplicador = matrizde6[i][i];
            for (int j = 0; j < matrizde6[i].length; j++) {
                matrizde6[i][j] = matrizde6[i][j] * multiplicador;
            }
        }

        for (int i = 0; i < matrizde6.length; i++) {
            System.out.printf("[%d] ", i);
        }
        System.out.println();

        for (int i = 0; i < matrizde6.length; i++) {
            System.out.printf("[%d] ", i);
            for (int j = 0; j < matrizde6[i].length; j++) {
                System.out.printf("%4d ", matrizde6[i][j]);
            }
            System.out.println();
        }
    }

    /*
     * 12. Escreva um programa que receba uma matriz A(12,12) e retorne a média
     * aritmética dos
     * elementos abaixo da diagonal principal.
     */
    public static void CalcularAMediaDeUmaMatriz() {
        double[][] matrizde12 = new double[12][12];
        double cont = 1;
        double soma = 0;
        double divisor = 0;
        double media = 0;

        for (int i = 0; i < matrizde12.length; i++) {
            for (int j = 0; j < matrizde12[i].length; j++) {
                matrizde12[i][j] = cont++;
            }
        }

        for (int i = 0; i < matrizde12.length; i++) {
            for (int j = 0; j < matrizde12.length; j++) {
                if (j < i) {
                    divisor++;
                    soma += matrizde12[i][j];
                }
            }
        }

        media = soma / divisor;

        System.out.println("media aritmetica é: " + media);

    }

    /*
     * 13. Escreva um programa que receba uma matriz A(10,10) e retorne a soma dos
     * elementos acima
     * da diagonal principal.
     */
    public static void SomaDaDiagonalPrincipalAcima() {
        double[][] matrizde10 = new double[10][10];
        double cont = 1;
        double soma = 0;

        for (int i = 0; i < matrizde10.length; i++) {
            for (int j = 0; j < matrizde10[i].length; j++) {
                matrizde10[i][j] = cont++;
            }
        }

        for (int i = 0; i < matrizde10.length; i++) {
            for (int j = 0; j < matrizde10[i].length; j++) {
                if (j > i) {
                    soma += matrizde10[i][j];
                }
            }
        }

        System.out.println("soma da parte de cima da diagonal principal: " + soma);
    }

    /*
     * 14. Elaborar um programa em java usando métodos para determinar a matriz
     * A = [aij]n x m tal que aij = 2i + j2
     */
    public static void CriarMatrizECalcular() {
        int l = 0;
        int n = 0;

        l = LerNumInt();

        n = LerNumInt();

        int[][] matriz = new int[l][n];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                int idaconta = i + 1;
                int jdaconta = j + 1;
                matriz[i][j] = (int) ((2 * idaconta) + Math.pow(jdaconta, 2));
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            System.out.printf("[%d] ", i);
        }
        System.out.println();

        for (int i = 0; i < matriz.length; i++) {
            System.out.printf("[%d] ", i);
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%4d ", matriz[i][j]);
            }
            System.out.println();
        }
    }

    /*
     * 15. Elaborar um programa em java usando métodos para determinar a matriz
     * A = [aij]n x m tal que se i + j for par é -i^2 e se for impar é 2 * i * j
     */
    public static void ClassificarImparEPar() {
        int l = 0;
        int n = 0;

        l = LerNumInt();

        n = LerNumInt();

        int[][] matriz = new int[l][n];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                int idaconta = i + 1;
                int jdaconta = j + 1;
                if ((idaconta + jdaconta) % 2 == 0) {
                    matriz[i][j] = -(idaconta * idaconta);
                } else {
                    matriz[i][j] = 2 * idaconta * jdaconta;
                }

            }
        }

        for (int i = 0; i < matriz.length; i++) {
            System.out.printf("[%d] ", i);
        }
        System.out.println();

        for (int i = 0; i < matriz.length; i++) {
            System.out.printf("[%d] ", i);
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%4d ", matriz[i][j]);
            }
            System.out.println();
        }
    }
}
