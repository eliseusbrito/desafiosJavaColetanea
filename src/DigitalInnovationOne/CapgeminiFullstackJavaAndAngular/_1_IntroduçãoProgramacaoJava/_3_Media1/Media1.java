package DigitalInnovationOne.CapgeminiFullstackJavaAndAngular._1_IntroduçãoProgramacaoJava._3_Media1;

import java.util.Locale;
import java.util.Scanner;

public class Media1 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double A, B, media;
        A = sc.nextDouble();
        B = sc.nextDouble();
        media = (  A * 3.5 +  B    *7.5)/11; //complete os espaços em branco com as respectivas variáveis.
        System.out.printf("MEDIA = %.5f%n",  media  ); // complete com a variável que representa o resultado da média.
        sc.close();
    }


}
