package DigitalInnovationOne.AceleracaoGFT_15._2_DesafiosJava._1_CalculoSimples;

import java.io.IOException;
import java.util.Scanner;

public class CalculoSimples {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        int cod1 = leitor.nextInt();
        int n1 = leitor.nextInt();
        double valor1 = leitor.nextDouble();

        int cod2 = leitor.nextInt();
        int n2 = leitor.nextInt();
        double valor2 = leitor.nextDouble();

        double total = n1*valor1+n2*valor2;

        System.out.println(String.format("VALOR A PAGAR: R$ %.2f", total));
    }

}
