package DigitalInnovationOne.JavaDeveloper._1_IntroducaoAProgramacaoComJava._2_MultiplicacaoSimples;

import java.util.Scanner;

public class MultiplicacaoSimplesScanner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int total = a * b; // Altere o valor da variável com o cálculo esperado
        System.out.println("PROD = " + total);
    }

}
