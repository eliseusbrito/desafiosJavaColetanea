package DigitalInnovationOne.AceleracaoGFT_15._2_DesafiosJava._2_Esfera;

import java.io.IOException;
import java.util.Scanner;

public class Esfera {

    public static void main(String[] args) throws IOException {
        final double pi = 3.14159;

        Scanner leitor = new Scanner(System.in);

        double r = leitor.nextDouble();

        double volume = (4 / 3.0) * pi * (r * r * r);

        System.out.println(String.format("VOLUME = %.3f", volume));

    }

}
