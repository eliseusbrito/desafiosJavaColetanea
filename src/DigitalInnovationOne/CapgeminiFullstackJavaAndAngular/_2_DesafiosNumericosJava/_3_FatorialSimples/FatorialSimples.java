package DigitalInnovationOne.CapgeminiFullstackJavaAndAngular._2_DesafiosNumericosJava._3_FatorialSimples;

import java.util.Scanner;

public class FatorialSimples {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int f = 1;
        int n = Integer.parseInt(leitor.next());
        for (int i = n; i > 1; i--) {
            f = f * i;
        }
        System.out.println(f);
    }

}
