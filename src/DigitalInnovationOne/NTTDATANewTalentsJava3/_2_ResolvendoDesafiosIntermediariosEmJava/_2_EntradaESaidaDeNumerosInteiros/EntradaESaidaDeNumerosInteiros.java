package DigitalInnovationOne.NTTDATANewTalentsJava3._2_ResolvendoDesafiosIntermediariosEmJava._2_EntradaESaidaDeNumerosInteiros;

import java.io.IOException;
import java.util.Scanner;

public class EntradaESaidaDeNumerosInteiros {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int A = leitor.nextInt();
        int B = leitor.nextInt();
        int C = leitor.nextInt();

        System.out.printf("A = %d, B = %d, C = %d\n", A , B, C);
        System.out.printf("A = % 10d, B = % 10d, C = % 10d\n", A , B, C);
        System.out.printf("A = %010d, B = %010d, C = %010d\n", A , B, C);
        System.out.printf("A = %-10d, B = %-10d, C = %-10d\n", A , B, C);

    }
}
