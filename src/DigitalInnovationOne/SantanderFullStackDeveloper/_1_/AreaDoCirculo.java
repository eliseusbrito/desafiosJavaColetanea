package DigitalInnovationOne.SantanderFullStackDeveloper._1_;

import java.util.Scanner;

public class AreaDoCirculo {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        Double raio = scan.nextDouble();

        Double area = 3.14159 * (Math.pow(raio,2));

        System.out.printf("A=%.4f\n", area);

    }

}
