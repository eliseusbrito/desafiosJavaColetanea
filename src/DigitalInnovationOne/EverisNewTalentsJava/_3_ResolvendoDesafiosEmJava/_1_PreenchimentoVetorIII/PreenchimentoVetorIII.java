package DigitalInnovationOne.EverisNewTalentsJava._3_ResolvendoDesafiosEmJava._1_PreenchimentoVetorIII;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class PreenchimentoVetorIII {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);
        double X = leitor.nextDouble();
        System.out.println(X);
        double[] N = new double[100];
        N[0] = X;
        for (int i=0; i<100; i++) {
            N[i]=X;
            X = X/2;
        }
        for (int i=0; i<100; i++) {
            System.out.println(String.format("N[" + i + "] = %.4f", N[i]));
        }
    }

}
