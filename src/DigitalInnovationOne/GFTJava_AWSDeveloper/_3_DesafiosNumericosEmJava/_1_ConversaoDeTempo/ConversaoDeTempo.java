package DigitalInnovationOne.GFTJava_AWSDeveloper._3_DesafiosNumericosEmJava._1_ConversaoDeTempo;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ConversaoDeTempo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 20;
        System.out.println("int a= " + a);
        int b = a / 3;
        System.out.println("int b=a/3 -> " + b);
        double c = 20;
        System.out.println("double c= " + c);
        double d = c / 3;
        System.out.println("double d=c/3 " + d);
//        System.out.printf("double d=c/3= %.4d%", d);
//        System.out.printf("double d=c/3 %.3d%", d);
//        System.out.printf("double d=c/3 %.2d%", d);
//        System.out.printf("double d=c/3 %.1d%", d);
//        System.out.printf("double d=c/3 %.0d%", d);
        float e = 20;
        System.out.println("float e= " + e);
        float f = e / 3;
        System.out.println("float f=e/3= " + f);
        System.out.printf("float f=e/3= %.15f%n", f);
        System.out.printf("float f=e/3= %.4f%n", f);
        System.out.printf("float f=e/3 %.3f%n", f);
        System.out.printf("float f=e/3 %.2f%n", f);
        System.out.printf("float f=e/3 %.1f%n", f);
        System.out.printf("float f=e/3 %.0f%n", f);
        DecimalFormat df = new DecimalFormat("0");//tem que declarar nos parametros da classe


        double sec = input.nextInt();
        System.out.println(sec);
        double min = sec / 60;
        System.out.println(min);
        min = (int) sec / 60;
        System.out.println(min);
        sec = (((sec / 60) - min) * 60);
       // System.out.println(sec);
        //sec = (int) (((sec / 60) - min) * 60);
        System.out.println("secFinal: " + sec);

        double hour = min / 60;
        System.out.println(hour);
        hour = (int) min / 60;
        System.out.println(hour);
        min = ((min / 60 - hour) * 60);
        System.out.println(min);
       // min = (int) ((min / 60 - hour) * 60);
        //System.out.println(min);

        System.out.println(df.format(hour) + ":" + df.format(min) + ":" + df.format(sec));
    }

}
