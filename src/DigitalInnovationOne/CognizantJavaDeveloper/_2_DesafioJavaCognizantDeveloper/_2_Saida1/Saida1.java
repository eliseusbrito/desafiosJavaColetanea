package DigitalInnovationOne.CognizantJavaDeveloper._2_DesafioJavaCognizantDeveloper._2_Saida1;

public class Saida1 {

    public static void main(String[] args) {
        int i = 0;
        while (i < 39) {
            System.out.print("-");
            i = i + 1;
        }
        System.out.println("");
        i = 0;
        int x = 0;
        while (x < 5) {
            System.out.print("|");
            while (i < 37) {
                System.out.print(" ");
                i = i + 1;
            }
            System.out.print("|");
            System.out.println("");
            x = x + 1;
            i = 0;
        }
        i = 0;
        while (i < 39) {
            System.out.print("-");
            i = i + 1;
        }
    }
}
