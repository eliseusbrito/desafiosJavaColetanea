package DigitalInnovationOne.SpreadJavaDeveloper._2_TrigoNoTabuleiro;

import java.math.BigInteger;
import java.util.Scanner;

public class TrigoNoTabuleiro {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger g = BigInteger.valueOf(1);
        BigInteger dois = BigInteger.valueOf(2);
        BigInteger conv = BigInteger.valueOf(12000);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            for (int j = 1; j <= x; j++) {
                g = g.multiply(dois);
            }
            BigInteger calc = g.divide(conv);
            System.out.println(calc + " kg");
            g = BigInteger.valueOf(1);
        }
    }
}

