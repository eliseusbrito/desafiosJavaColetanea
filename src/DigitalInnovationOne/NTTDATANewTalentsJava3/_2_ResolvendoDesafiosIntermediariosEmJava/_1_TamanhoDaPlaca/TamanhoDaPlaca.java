package DigitalInnovationOne.NTTDATANewTalentsJava3._2_ResolvendoDesafiosIntermediariosEmJava._1_TamanhoDaPlaca;

import java.io.IOException;
import java.util.Scanner;

public class TamanhoDaPlaca {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        while (leitor.hasNext()) {
            int X = leitor.nextInt();
            int Y = leitor.nextInt();
            int M = leitor.nextInt();
            for (int i = 0; i < M; i++) {
                int Xi = leitor.nextInt();
                int Yi = leitor.nextInt();
                if ((Xi<=X) && (Yi<=Y) || (Yi<=X) && (Xi<=Y)) {
                    System.out.println("Sim");
                } else {
                    System.out.println("Nao");
                }
            }
        }
    }
}
