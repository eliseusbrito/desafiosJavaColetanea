package DigitalInnovationOne.GFTStart3._01_DesafiosIniciais._3_Xadrez;

import java.util.Scanner;

public class Xadrez {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();
        int C = sc.nextInt();
        if ((L % 2 == 1 && C % 2 == 1) || (L % 2 == 0 && C % 2 == 0)) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
        sc.close();

    }

}
