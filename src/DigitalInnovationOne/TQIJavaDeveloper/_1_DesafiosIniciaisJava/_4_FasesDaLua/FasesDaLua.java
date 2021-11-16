package DigitalInnovationOne.TQIJavaDeveloper._1_DesafiosIniciaisJava._4_FasesDaLua;

import java.util.Scanner;

public class FasesDaLua {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int inicio = leitor.nextInt();
        int fim = leitor.nextInt();

        if (inicio >= 0 && fim <= 2) {
            System.out.println("nova");
        } else if (fim > inicio && fim <= 96) {
            System.out.println("crescente");
        } else if (inicio >= fim && fim <= 96) {
            System.out.println("minguante");
        } else {
            System.out.println("cheia");
        }
    }

}
