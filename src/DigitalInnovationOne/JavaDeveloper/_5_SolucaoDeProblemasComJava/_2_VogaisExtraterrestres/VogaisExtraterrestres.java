package DigitalInnovationOne.JavaDeveloper._5_SolucaoDeProblemasComJava._2_VogaisExtraterrestres;

import java.util.Scanner;

public class VogaisExtraterrestres {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        while (leitor.hasNextLine()){
            int contador = 0;
            String vogais = leitor.nextLine();
            String frase = leitor.nextLine();
            for (int i = 0; i < frase.length(); i++) {
                for (int x = 0; x < vogais.length(); x++) {
                    if (vogais.charAt(x) == frase.charAt(i)) {
                        contador = contador + 1;
                    }
                }
            }
            System.out.println(contador);
        }
    }
}
