package DigitalInnovationOne.NTTDATANewTalentsJava3._2_ResolvendoDesafiosIntermediariosEmJava._3_SenhaFixa;

import java.io.IOException;
import java.util.Scanner;

public class SenhaFixa {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        while (leitor.hasNext()){
            int senha = leitor.nextInt();
            if (senha != 2002) {
                System.out.println("Senha Invalida");
            } else {
                System.out.println("Acesso Permitido");
                System.exit(0);
            }
        }
    }
}
