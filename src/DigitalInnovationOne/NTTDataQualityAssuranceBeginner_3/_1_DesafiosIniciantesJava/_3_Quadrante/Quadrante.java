package DigitalInnovationOne.NTTDataQualityAssuranceBeginner_3._1_DesafiosIniciantesJava._3_Quadrante;

import java.util.Scanner;

public class Quadrante {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int X = leitor.nextInt();
        int Y = leitor.nextInt();

        while (X != 0 && Y != 0) {
            if (X == 0 || Y == 0) break;
            else if (Y > 0 && X > 0) System.out.println("primeiro");
            else if (Y > 0 && X < 0) System.out.println("segundo");
            else if (Y < 0 && X < 0) System.out.println("terceiro");
            else if (Y < 0 && X > 0) System.out.println("quarto");
            X = leitor.nextInt();
            Y = leitor.nextInt();
        }
    }
}