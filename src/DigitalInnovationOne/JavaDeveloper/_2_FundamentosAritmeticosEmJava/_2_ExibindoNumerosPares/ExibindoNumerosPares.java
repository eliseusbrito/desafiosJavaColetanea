package DigitalInnovationOne.JavaDeveloper._2_FundamentosAritmeticosEmJava._2_ExibindoNumerosPares;

import java.util.Scanner;

public class ExibindoNumerosPares {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 2; i <= num; i++){
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}