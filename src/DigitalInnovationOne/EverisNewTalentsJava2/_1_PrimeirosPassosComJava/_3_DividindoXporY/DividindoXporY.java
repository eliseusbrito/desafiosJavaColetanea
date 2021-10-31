package DigitalInnovationOne.EverisNewTalentsJava2._1_PrimeirosPassosComJava._3_DividindoXporY;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class DividindoXporY {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        Locale.setDefault(Locale.ENGLISH);
        int N = leitor.nextInt();
        int X, Y;
        DecimalFormat df = new DecimalFormat(("0.0"));
        for (int i = 0; i < N; i++) {
            X = leitor.nextInt();
            Y = leitor.nextInt();
            if (Y == 0) System.out.println("divisao impossivel");
            else {
                double result = (double)X /(double) Y;
                System.out.println(df.format(result));
            }
        }
    }

}
