package DigitalInnovationOne.Aceleracao13Capgemini._2_Idades;

import java.io.IOException;
import java.util.Scanner;

public class Idades {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int cont = 0;
        int idade;
        double soma = 0;
        idade = Integer.parseInt(leitor.next());
        while (idade >= 0) {
            soma = soma + idade;
            cont = cont + 1;
            idade = leitor.nextInt();
        }
        double media = soma / cont;
        System.out.println(String.format("%.2f", media));
    }

}
