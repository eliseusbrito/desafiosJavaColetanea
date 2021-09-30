package DigitalInnovationOne.EverisNewTalentsJava._1_PrimeirosPassosEmJava._3_DivisoresI;

import java.util.Scanner;

public class DivisoresI {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        n = input.nextInt();

        for (int i = 1; i<=n; i++) {
            if (n % i == 0) {
                System.out.println( i );
            }
        }
    }

}
