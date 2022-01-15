package DigitalInnovationOne.GFTStart3._01_DesafiosIniciais._2_Resto2;

import java.util.Scanner;

public class Resto2 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        for (int i = 1; i < 10000; i++) {
            if (i % N == 2 ) System.out.println(i);
        }

    }

}
