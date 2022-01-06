package DigitalInnovationOne.AmdocsJavaDeveloper._01_DesafioJavaBootcampAmdocs._02_AMudancaContinua;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class AMudancaContinua {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        while (leitor.hasNext()) {
            double graus = leitor.nextDouble();
            if (graus <= 360) {
                if (graus < 90 || graus == 360) System.out.println("Bom Dia!!");
                else if (graus >= 90 && graus < 180) System.out.println("Boa Tarde!!");
                else if (graus >= 180 && graus < 270) System.out.println("Boa Noite!!");
                else if (graus >= 270 && graus < 360) System.out.println("De Madrugada!!");
                else System.out.println("Bom Dia!!");
                double calculo;
                if (graus <=270) {
                    calculo = ((graus + 90) * 24) / 360;
                } else {
                    calculo = (((graus + 90) * 24) / 360)-24;
                };
                int horas= (int)calculo;
                double minutos = Math.round((calculo)%1*60);
                double segundos = minutos%1;
                DecimalFormat df = new DecimalFormat("00");
                System.out.println(df.format(horas)+":"+df.format(minutos)+":"+df.format(segundos));
            }
        }
    }
}
