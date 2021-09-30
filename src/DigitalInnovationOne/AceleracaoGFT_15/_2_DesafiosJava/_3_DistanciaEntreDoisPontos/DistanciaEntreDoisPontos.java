package DigitalInnovationOne.AceleracaoGFT_15._2_DesafiosJava._3_DistanciaEntreDoisPontos;

import java.util.Locale;
import java.util.Scanner;

public class DistanciaEntreDoisPontos {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        double x1 = leitor.nextDouble();
        double y1 = leitor.nextDouble();
        double x2 = leitor.nextDouble();
        double y2 = leitor.nextDouble();
        double deltaX;
        double deltaY;

        if(x2>x1){
            deltaX = x2-x1;
        } else {
            deltaX = x1-x2;
        }

        if(y2>y1){
            deltaY = y2-y1;
        } else {
            deltaY = y1-y2;
        }

        double a = Math.pow(deltaX,2) ;
        double b = Math.pow(deltaY,2);
        double distancia = Math.sqrt(a+b);

        System.out.println(String.format("%.4f", distancia));

    }

}
