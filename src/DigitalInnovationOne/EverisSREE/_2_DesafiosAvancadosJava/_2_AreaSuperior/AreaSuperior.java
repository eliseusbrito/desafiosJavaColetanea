package DigitalInnovationOne.EverisSREE._2_DesafiosAvancadosJava._2_AreaSuperior;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class AreaSuperior {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        Locale.setDefault(Locale.ENGLISH);
        double soma = 0;
        double media = 0;
        char O = leitor.next().toUpperCase().charAt(0);
        double[][] M = new double[12][12];
        for (int i = 0; i<12; i++) {
            for (int j = 0; j<12; j++) {
                M[i][j] = leitor.nextDouble();
            }
        }
        for (int i = 0; i<=4; i++) {
            for (int j = i+1; j<=10-i; j++) {
                soma += M[i][j];
            }
        }
        if (O == 'M'){
            media = soma / 30;
            System.out.printf("%.1f", media);
        } else{
            System.out.printf("%.1f", soma);
        }
    }

}