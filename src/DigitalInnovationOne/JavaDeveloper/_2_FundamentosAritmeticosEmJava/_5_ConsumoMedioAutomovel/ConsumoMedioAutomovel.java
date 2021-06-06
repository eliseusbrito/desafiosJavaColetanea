package DigitalInnovationOne.JavaDeveloper._2_FundamentosAritmeticosEmJava._5_ConsumoMedioAutomovel;

import java.io.IOException;
import java.util.Scanner;

public class ConsumoMedioAutomovel {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int distancia = leitor.nextInt();
        double consumo = leitor.nextDouble();
        double media = distancia / consumo;
        System.out.println(String.format("%.3f km/l", media));
    }
}
