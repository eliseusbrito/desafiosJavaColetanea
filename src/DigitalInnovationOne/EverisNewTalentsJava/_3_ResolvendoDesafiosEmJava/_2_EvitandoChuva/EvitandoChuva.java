package DigitalInnovationOne.EverisNewTalentsJava._3_ResolvendoDesafiosEmJava._2_EvitandoChuva;

import java.io.IOException;
import java.util.Scanner;

public class EvitandoChuva {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        int casaComprado = 0;
        int casaSobrando = 0;
        int trabComprado = 0;
        int trabSobrando = 0;
        int[][] prev = new int[N][2];
        int pC = 0;
        int sC = 0;
        for (int i = 0; i < N; i++) {
            String primCond = leitor.next();
            if (primCond.equals("chuva")) {
                pC = 1;
            } else {
                pC = 0;
            }
            String segCond = leitor.next();
            if (segCond.equals("chuva")) {
                sC = 1;
            } else {
                sC = 0;
            }
            prev[i][0] = pC;
            prev[i][1] = sC;
        }
        // Imprime a matriz
//        for (int i = 0; i < prev.length; i++) {
//            for (int j = 0; j < prev[i].length; j++) {
//                System.out.print(prev[i][j]+" ");
//            }
//            System.out.println();
//        }
        for (int i = 0; i < prev.length; i++) {
            if (prev[i][0] == 1 && casaSobrando == 0) {
                casaComprado = casaComprado + 1;
                trabSobrando = trabSobrando + 1;
            }
            if (prev[i][0] == 1 && casaSobrando > 0) {
                casaSobrando = casaSobrando - 1;
                trabSobrando = trabSobrando + 1;
            }

            if (prev[i][1] == 1 && trabSobrando == 0) {
                trabComprado = trabComprado + 1;
                casaSobrando = casaSobrando + 1;
            }
            if (prev[i][1] == 1 && trabSobrando > 0) {
                trabSobrando = trabSobrando - 1;
                casaSobrando = casaSobrando + 1;
            }
        }
        System.out.println(casaComprado + " " + trabComprado);
    }
}



