package DigitalInnovationOne.JavaDeveloper._6_ResolvendoAlgoritmosComJava._5_OTabuleiroSecreto;

import java.util.Scanner;

public class MelhorandoMinhaSolucao {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] primeiraLinha = sc.nextLine().split(" ");
        int tamTabuleiro = Integer.parseInt(primeiraLinha[0]);
        int[][] tabuleiro = new int[tamTabuleiro][tamTabuleiro];
        int quantOperacoes = Integer.parseInt(primeiraLinha[1]);
        int R = 0;

        //X = linha ou coluna  R =valor a ser atribuido
        //linha: Operacao(1 ou 2) + X + R
        //linha: Operacao(3 ou 4) + X
        //1 X R: Atribuir o valor R a todos os números da linha X;
        //2 X R: Atribuir o valor R a todos os números da coluna X;
        //3 X: Imprimir o valor mais frequente na linha X;
        //4 X: Imprimir o valor mais frequente da coluna X.
        // n=i vai ser linha e m=j a coluna

        for (int i = 0; i < quantOperacoes; i++) {
            String linha = sc.nextLine();
            String[] linhaSplited = linha.split(" ");
            int X = Integer.parseInt(linhaSplited[1]);
            if (linhaSplited.length > 2) {
                R = Integer.parseInt(linhaSplited[2]);
            }
            if (linhaSplited[0].equals("1")) {
                for (int j = 0; j < tamTabuleiro; j++) {
                    tabuleiro[X - 1][j] = R;
                }

//                for (int x = 0; x < tabuleiro.length; x++) {
//                    for (int y = 0; y < tabuleiro.length; y++) {
//                        System.out.print(tabuleiro[x][y] + " ");
//                    }
//                    System.out.println();
//                }

            }
            if (linhaSplited[0].equals("2")) {
                for (int j = 0; j < tamTabuleiro; j++) {
                    tabuleiro[j][X - 1] = R;
                }

//                for (int x = 0; x < tabuleiro.length; x++) {
//                    for (int y = 0; y < tabuleiro[i].length; y++) {
//                        System.out.print(tabuleiro[x][y] + " ");
//                    }
//                    System.out.println();
//                }

            }
            if (linhaSplited[0].equals("3")) {
                int[] linhaX = new int[tamTabuleiro];
                for (int t = 0; t < tamTabuleiro; t++) {
                    linhaX[t] = tabuleiro[X - 1][t];
                }

                int v;
                int[] numberCount = new int[100];
                for (v = 0; v < linhaX.length; v++) {
                    ++numberCount[linhaX[v]];
                }
                int max = 0;
                int controle = 0;
                for (int j = 0; j < numberCount.length - 1; j++) {
                    if (numberCount[j + 1] >= numberCount[j] && numberCount[j + 1] >= controle) {
                        max = j + 1;
                        controle = numberCount[j + 1];
                    }
                }
                System.out.println(max);

            }
            if (linhaSplited[0].equals("4")) {

                int[] colunaX = new int[tamTabuleiro];
                for (int t = 0; t < tamTabuleiro; t++) {
                    colunaX[t] = tabuleiro[t][X - 1];
                }

                int v;
                int[] numberCount = new int[100];
                for (v = 0; v < colunaX.length; v++) {
                    ++numberCount[colunaX[v]];
                }
                int max = 0;
                int controle = 0;
                for (int j = 0; j < numberCount.length - 1; j++) {
                    if (numberCount[j + 1] >= numberCount[j] && numberCount[j + 1] >= controle) {
                        max = j + 1;
                        controle = numberCount[j + 1];
                    }
                }
                System.out.println(max);
            }

        }
    }

}
