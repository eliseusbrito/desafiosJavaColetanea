package DigitalInnovationOne.EverisNewTalentsJava._3_ResolvendoDesafiosEmJava._1_PreenchimentoVetorIII;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class PreenchimentoVetorIIIBigDecimal {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);
        BigDecimal X = leitor.nextBigDecimal();
        System.out.println(X);
        BigDecimal[] N = new BigDecimal[100];
        N[0] = X;
        BigDecimal d = BigDecimal.valueOf(2);
        for (int i=0; i<100; i++) {
            N[i]=X;
            X = X.divide(d);
        }
        for (int i=0; i<100; i++) {
            System.out.println(String.format("N[" + i + "] = %.4f", N[i]));
        }
    }

}
