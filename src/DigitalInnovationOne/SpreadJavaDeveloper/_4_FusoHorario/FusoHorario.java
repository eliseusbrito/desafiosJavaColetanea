package DigitalInnovationOne.SpreadJavaDeveloper._4_FusoHorario;

import java.util.Scanner;

public class FusoHorario {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horasaida = sc.nextInt();
        int tempoviagem = sc.nextInt();
        int fuso = sc.nextInt();
        int ajuste = horasaida + tempoviagem + fuso;
        if (ajuste >= 24) ajuste = ajuste -24;
        System.out.println(ajuste);
        sc.close();
    }

}
