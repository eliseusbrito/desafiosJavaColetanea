package DigitalInnovationOne.SantanderFullStackDeveloper._2_Media3;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class SolucaoCleitonMenezes {

    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.0");
        double N1 = leitor.nextDouble();
        double N2 = leitor.nextDouble();
        double N3 = leitor.nextDouble();
        double N4 = leitor.nextDouble();
        double MEDIA = ((N1 * 2.0) + (N2 * 3.0) + (N3 * 4.0) + (N4 * 1.0)) / 10.0;

        System.out.println("Media: " + df.format(MEDIA));

        if (MEDIA >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (MEDIA < 5.0) {
            System.out.println("Aluno reprovado.");
        } else if (MEDIA >= 5.0 && MEDIA <= 6.9) {
            System.out.println("Aluno em exame.");
            double NExame = leitor.nextDouble();
            System.out.println("Nota do exame: " + df.format(NExame));
            MEDIA = (MEDIA + NExame) / 2.0;
            if (MEDIA >= 5.0) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado");
            }
            System.out.println("Media final: " + df.format(MEDIA));
        }
        leitor.close();
    }
}
