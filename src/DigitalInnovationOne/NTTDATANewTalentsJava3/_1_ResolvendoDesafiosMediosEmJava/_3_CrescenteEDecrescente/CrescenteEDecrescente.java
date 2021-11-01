package DigitalInnovationOne.NTTDATANewTalentsJava3._1_ResolvendoDesafiosMediosEmJava._3_CrescenteEDecrescente;

import java.io.IOException;
import java.util.Scanner;

public class CrescenteEDecrescente {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int X = leitor.nextInt();
        int Y = leitor.nextInt();
        while (X != Y) {
            if (X < Y) System.out.println("Crescente");
            else System.out.println("Decrescente");
            X = leitor.nextInt();
            Y = leitor.nextInt();
        }
    }

}
