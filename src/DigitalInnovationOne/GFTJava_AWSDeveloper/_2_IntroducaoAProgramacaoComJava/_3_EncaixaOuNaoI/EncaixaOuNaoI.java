package DigitalInnovationOne.GFTJava_AWSDeveloper._2_IntroducaoAProgramacaoComJava._3_EncaixaOuNaoI;

import java.util.Scanner;

public class EncaixaOuNaoI {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int count = scan.nextInt();

        for (int i = 0; i < count; i++) {
            String a = scan.next();
            String b = scan.next();
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
