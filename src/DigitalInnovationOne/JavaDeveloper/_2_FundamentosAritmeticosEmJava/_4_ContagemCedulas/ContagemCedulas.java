package DigitalInnovationOne.JavaDeveloper._2_FundamentosAritmeticosEmJava._4_ContagemCedulas;

import java.util.Scanner;

public class ContagemCedulas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int cem = (int) (num / 100);
        int sobra = num % 100;

        int cinquenta = (int) (sobra / 50);
        sobra = sobra % 50;

        int vinte = (int) (sobra / 20);
        sobra = sobra % 20;

        int dez = (int) (sobra / 10);
        sobra = sobra % 10;

        int cinco = (int) (sobra / 5);
        sobra = sobra % 5;

        int dois = (int) (sobra / 2);
        sobra = sobra % 2;

        System.out.println(num);
        System.out.println(cem + " nota(s) de R$ 100,00");
        System.out.println(cinquenta + " nota(s) de R$ 50,00");
        System.out.println(vinte + " nota(s) de R$ 20,00");
        System.out.println(dez + " nota(s) de R$ 10,00");
        System.out.println(cinco + " nota(s) de R$ 5,00");
        System.out.println(dois + " nota(s) de R$ 2,00");
        System.out.println(sobra + " nota(s) de R$ 1,00");

    }

}
