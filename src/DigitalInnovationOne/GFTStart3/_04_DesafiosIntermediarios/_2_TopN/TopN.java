package DigitalInnovationOne.GFTStart3._04_DesafiosIntermediarios._2_TopN;

import java.util.Scanner;

public class TopN {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] TOPS = {1, 3, 5, 10, 25, 50, 100};

        int k = scan.nextInt();

        if (k == TOPS[0]) {
            System.out.println("Top " + TOPS[0]);
        } else if (k <= TOPS[1]) {
            System.out.println("Top " + TOPS[1]);
        } else if (k <= TOPS[2]) {
            System.out.println("Top " + TOPS[2]);
        } else if (k <= TOPS[3]) {
            System.out.println("Top " + TOPS[3]);
        } else if (k <= TOPS[4]) {
            System.out.println("Top " + TOPS[4]);
        } else if (k <= TOPS[5]) {
            System.out.println("Top " + TOPS[5]);
        } else {
            System.out.println("Top " + TOPS[6]);
        }
    }
}
