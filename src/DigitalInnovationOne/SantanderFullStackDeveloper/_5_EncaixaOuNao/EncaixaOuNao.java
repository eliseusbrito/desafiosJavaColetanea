package DigitalInnovationOne.SantanderFullStackDeveloper._5_EncaixaOuNao;


import java.io.IOException;
import java.util.Scanner;

public class EncaixaOuNao {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        int n = leitor.nextInt();

        for (int i = 0; i < n; i++) {
            String a = leitor.next();
            String b = leitor.next();
            int lb = b.length();
            String newa = a;
            if (a.length() >= b.length()) {
                newa = a.substring(a.length() - lb);
            }

            if (newa.equals(b)) {
                System.out.println("encaixa");
            } else {
                System.out.println("nao encaixa");
            }

        }
    }

}
