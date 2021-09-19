package DigitalInnovationOne.EverisSREE._2_DesafiosAvancadosJava._1_FibonacciEmVetor;

import java.io.IOException;
import java.util.Scanner;

public class FibonacciEmVetor {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int T = leitor.nextInt();
        for (int i = 0; i < T; i++) {
            int N = leitor.nextInt();
            long anterior = 0;
            long atual = 1;
            long proximo = 0;
            for (int j = 0; j <= N; j++) {
                if(j==0){
                    anterior = 0;
                } else if (j==1) {
                    anterior = 1;
                } else {
                    proximo = anterior + atual;
                    anterior = atual;
                    atual = proximo;
                }

            }
            System.out.println("Fib(" + N + ") = " + anterior);
        }
    }

}
