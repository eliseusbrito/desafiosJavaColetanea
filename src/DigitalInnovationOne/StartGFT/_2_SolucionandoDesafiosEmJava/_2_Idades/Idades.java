package DigitalInnovationOne.StartGFT._2_SolucionandoDesafiosEmJava._2_Idades;

import java.util.Scanner;

public class Idades {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int cont = 0;
        int n = 0;
        double soma = 0;
         do {
            n = leitor.nextInt();
            if (n > 0) {
                soma = soma + n;
                cont = cont+1;
            }
        } while (n > 0);
        double media = soma / cont;
        System.out.println(String.format("%.2f", media));

        leitor.close();
    }

}
