package DigitalInnovationOne.JavaDeveloper._2_FundamentosAritmeticosEmJava._1_QuantidadeNumerosPositivos;

import java.util.Scanner;

public class QuantidadeNumerosPositivos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 0;
        for (int i = 0; i < 6; i++) {
            double num = sc.nextDouble();
            if (num > 0) {
                t = t + 1;
            }
        }
        System.out.println(t + " valores positivos");
    }
}