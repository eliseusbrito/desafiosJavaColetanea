package DigitalInnovationOne.EverisNewTalentsJava._3_ResolvendoDesafiosEmJava._1_PreenchimentoVetorIII;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Scanner;

public class PreenchimentoVetorIIIBigDecimalGustavoMachadoCoelho {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double X = leitor.nextDouble();
        BigDecimal[] N = new BigDecimal[100];
        N[0] = new BigDecimal(X);

        for (int i = 1; i < 100; i++) {
            N[i] = N[i-1].divide(new BigDecimal("2.0"));
        }

        for (int i = 0; i < 100; i++) {
            System.out.println(String.format("N[%d] = %.4f", i, N[i].setScale(4, BigDecimal.ROUND_HALF_EVEN)));
        }
    }

}
