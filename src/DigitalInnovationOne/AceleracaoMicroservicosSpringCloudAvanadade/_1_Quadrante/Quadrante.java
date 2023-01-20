package DigitalInnovationOne.AceleracaoMicroservicosSpringCloudAvanadade._1_Quadrante;

import java.util.Scanner;

public class Quadrante {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int x = leitor.nextInt();
        int y = leitor.nextInt();

        while (x != 0 && y != 0) {
            if (x == 0 || y == 0) break;
            else if (y > 0 && x > 0) System.out.println("primeiro");
            else if (y > 0 && x < 0) System.out.println("segundo");
            else if (y < 0 && x < 0) System.out.println("terceiro");
            else if (y < 0 && x > 0) System.out.println("quarto");
            x = leitor.nextInt();
            y = leitor.nextInt();
        }
    }
}