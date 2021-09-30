package DigitalInnovationOne.EverisNewTalentsJava._1_PrimeirosPassosEmJava._2_RespostaTheon;

import java.io.IOException;
import java.util.Scanner;

public class RespostaTheon {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        int T, posMenor = 1;
        int menor = leitor.nextInt();

        for (int i = 2; i <= N; i++) {
            T = leitor.nextInt();
            if (T < menor) {
                menor = T;
                posMenor = i;
            }
        }
        System.out.println(posMenor);
    }

}
