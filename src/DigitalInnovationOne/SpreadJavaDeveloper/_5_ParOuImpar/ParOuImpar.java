package DigitalInnovationOne.SpreadJavaDeveloper._5_ParOuImpar;

import java.io.IOException;
import java.util.Scanner;

public class ParOuImpar {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        for (int i = 0; i < N; i++) {
            int v = leitor.nextInt();
            if (v % 2 == 1 && v > 0) {
                System.out.println("ODD POSITIVE");
            } else if (v % 2 == -1 && v < 0) {
                System.out.println("ODD NEGATIVE");
            } else if (v == 0) {
                System.out.println("NULL");
            } else if (v % 2 == 0 && v > 0) {
                System.out.println("EVEN POSITIVE");
            } else if (v % 2 == 0 && v < 0) {
                System.out.println("EVEN NEGATIVE");
            }
        }
    }

}
