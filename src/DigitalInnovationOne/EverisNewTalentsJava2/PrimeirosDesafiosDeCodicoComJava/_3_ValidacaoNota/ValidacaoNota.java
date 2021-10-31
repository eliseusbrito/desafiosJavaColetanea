package DigitalInnovationOne.EverisNewTalentsJava2.PrimeirosDesafiosDeCodicoComJava._3_ValidacaoNota;

import java.util.Locale;
import java.util.Scanner;

public class ValidacaoNota {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        sc.useLocale(Locale.US);
        double[] notas = {0, 0};
        int controle = 0;

        while (controle < 2) {
            double i = sc.nextDouble();
            if (i >= 0 && i <= 10) {
                notas[controle] = i;
                controle = controle + 1;
            } else {
                System.out.println("nota invalida");
            }
        }
        double media = (notas[0] + notas[1]) / 2;
        System.out.printf("media = %.2f%n", media);
    }
}
