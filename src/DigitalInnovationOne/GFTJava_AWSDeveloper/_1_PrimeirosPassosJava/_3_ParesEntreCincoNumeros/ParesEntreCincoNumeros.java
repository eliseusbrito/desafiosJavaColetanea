package DigitalInnovationOne.GFTJava_AWSDeveloper._1_PrimeirosPassosJava._3_ParesEntreCincoNumeros;

import java.util.Scanner;

public class ParesEntreCincoNumeros {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int count = 0;

        for(int i = 0; i < 5; i++) {
            int n = scan.nextInt();
            if (n%2==0 ){
                count++;
            }
        }
        System.out.printf("%d valores pares\n", count);
    }

}
