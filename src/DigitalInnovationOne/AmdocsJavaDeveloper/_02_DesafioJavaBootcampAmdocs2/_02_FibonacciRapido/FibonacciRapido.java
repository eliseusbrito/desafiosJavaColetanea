package DigitalInnovationOne.AmdocsJavaDeveloper._02_DesafioJavaBootcampAmdocs2._02_FibonacciRapido;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FibonacciRapido {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Double input = sc.nextDouble();
        Double output = (Math.pow((1+Math.sqrt(5))/2,input)-Math.pow((1-Math.sqrt(5))/2,input))/Math.sqrt(5);
        DecimalFormat df = new DecimalFormat("0.0");
        System.out.println(df.format(output));
    }

}
