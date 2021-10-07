package DigitalInnovationOne.EverisQualityAssuranceBeginner_3._1_DesafiosIniciantesJava;

import java.util.Scanner;

public class DistanciaComScanner {

    public static void main(String[] args) {
        int minutos;
        Scanner input = new Scanner(System.in);
        minutos = input.nextInt();
        System.out.printf("%d minutos\n", 2 * minutos);
    }
}
