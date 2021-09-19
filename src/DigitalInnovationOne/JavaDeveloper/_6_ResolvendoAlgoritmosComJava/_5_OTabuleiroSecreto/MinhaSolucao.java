package DigitalInnovationOne.JavaDeveloper._6_ResolvendoAlgoritmosComJava._5_OTabuleiroSecreto;

import java.util.Scanner;

public class MinhaSolucao {

    // Corrigir pois esta falhando nos testes fechados #3, #4 e #5
    // Testes de Abertos: 2 / 2 ok
    //Testes de Entrega: 0 / 3 falhando


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] primeiraLinha = sc.nextLine().split(" ");
        int tamTabuleiro = Integer.parseInt(primeiraLinha[0]);
        int[][] tabuleiro = new int[tamTabuleiro][tamTabuleiro];
        int quantOperacoes = Integer.parseInt(primeiraLinha[1]);
        int R = 0;


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

            }
            if (linhaSplited[0].equals("2")) {
                for (int j = 0; j < tamTabuleiro; j++) {
                    tabuleiro[j][X - 1] = R;
                }
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
