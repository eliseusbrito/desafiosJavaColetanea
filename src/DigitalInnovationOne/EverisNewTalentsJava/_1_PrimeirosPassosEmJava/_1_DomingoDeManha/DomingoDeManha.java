package DigitalInnovationOne.EverisNewTalentsJava._1_PrimeirosPassosEmJava._1_DomingoDeManha;

import java.io.IOException;
import java.util.Scanner;

public class DomingoDeManha {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        while (leitor.hasNext()) {
            String[] relogio = leitor.nextLine().split(":");
            int hora = Integer.parseInt(relogio[0]);
            int min = Integer.parseInt(relogio[1]);
            if (hora >= 7 && hora < 8) {
                System.out.println("Atraso maximo: " + min);
            } else if (hora >= 8 && hora < 9) {
                min = 60 + min;
                System.out.println("Atraso maximo: " + min);
            } else if (hora >= 9) {
                min = 120 + min;
                System.out.println("Atraso maximo: " + min);
            } else {
                System.out.println("Atraso maximo: 0");
            }
        }
    }
}
