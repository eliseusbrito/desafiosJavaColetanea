package DigitalInnovationOne.CognizantJavaDeveloper._2_DesafioJavaCognizantDeveloper._3_AnaliseDeNumeros;

import java.util.Scanner;

public class AnaliseDeNumeros {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int par = 0;
        int impar = 0;
        int positivo = 0;
        int negativo = 0;
        for (int i = 0; i < 5; i++) {
            int v = leitor.nextInt();
            if (v % 2 == 0) {
                par++;
            }
            if (v % 2 != 0) {
                impar++;
            }
            if (v > 0) {
                positivo++;
            }
            if (v < 0) {
                negativo++;
            }
        }
        System.out.println(par + " par(es)");
        System.out.println(impar + " impar(es)");
        System.out.println(positivo + " positivo(s)");
        System.out.println(negativo + " negativo(s)");
    }
}