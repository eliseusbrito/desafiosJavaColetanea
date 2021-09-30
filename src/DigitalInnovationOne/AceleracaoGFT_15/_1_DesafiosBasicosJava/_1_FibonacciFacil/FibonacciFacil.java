package DigitalInnovationOne.AceleracaoGFT_15._1_DesafiosBasicosJava._1_FibonacciFacil;

import java.io.IOException;
import java.util.Scanner;

public class FibonacciFacil {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        int proximo;
        int anterior = 0;
        int atual = 1;
        for (int i = 1; i <= N; i++) {
            if (i == N) System.out.println(anterior);
            else System.out.print(anterior + " ");
            proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }
    }
}
