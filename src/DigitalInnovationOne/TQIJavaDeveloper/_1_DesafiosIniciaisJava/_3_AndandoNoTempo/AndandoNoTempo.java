package DigitalInnovationOne.TQIJavaDeveloper._1_DesafiosIniciaisJava._3_AndandoNoTempo;

import java.io.IOException;
import java.util.Scanner;

public class AndandoNoTempo {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int a = leitor.nextInt();
        int b = leitor.nextInt();
        int c = leitor.nextInt();
        if (a + b == c || a + c == b || a == b + c  || a == b || b == c || a == c) {
            System.out.println("S");
        } else {
            System.out.println("N");
        }
    }

}

