package DigitalInnovationOne.EverisNewTalentsJava2.PrimeirosDesafiosDeCodicoComJava._3_ValidacaoNota;

import java.util.Locale;
import java.util.Scanner;

public class ValidacaoNotaAprender {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        sc.useLocale(Locale.US);
        boolean validA = true;
        boolean validB = true;
        while (sc.hasNext()) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            if (a < 0 || a > 10) {
                validA = false;
            }
            if (b < 0 || b > 10) {
                validB = false;
            }
            if (!validA && !validB) {
                System.exit(0);
            }
            if (!validA || !validB) {
                System.out.println("nota invalida");
            } else {
                double media = (a + b) / 2;
                System.out.printf("media = %.2f%n", media);
            }
        }
    }
}
