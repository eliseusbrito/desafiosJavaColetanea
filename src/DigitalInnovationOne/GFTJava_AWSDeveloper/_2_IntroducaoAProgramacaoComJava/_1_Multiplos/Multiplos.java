package DigitalInnovationOne.GFTJava_AWSDeveloper._2_IntroducaoAProgramacaoComJava._1_Multiplos;

import java.io.IOException;
import java.util.Scanner;

public class Multiplos {

    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);

        int a = leitor.nextInt();

        int b = leitor.nextInt();

        if (a % b == 0 || b % a == 0) {

            System.out.println("Sao Multiplos");

        } else {

            System.out.println("Nao sao Multiplos");

        }


    }
}