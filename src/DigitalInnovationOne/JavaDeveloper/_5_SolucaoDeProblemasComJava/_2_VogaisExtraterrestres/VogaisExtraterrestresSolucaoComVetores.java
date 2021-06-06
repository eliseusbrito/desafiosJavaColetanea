package DigitalInnovationOne.JavaDeveloper._5_SolucaoDeProblemasComJava._2_VogaisExtraterrestres;

import java.util.Scanner;

public class VogaisExtraterrestresSolucaoComVetores {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        while (leitor.hasNextLine()) {
            int contador = 0;
            String vogais = leitor.nextLine();
            String[] vogaisVetor = vogais.split("");
            String frase = leitor.nextLine();
            String[] fraseVetor = frase.split("");
            for (int i = 0; i < fraseVetor.length; i++) {
                for (int x = 0; x < vogaisVetor.length; x++) {
                    if (vogaisVetor[x].equals(fraseVetor[i])) {
                        contador = contador + 1;
                    }
                }
            }
            System.out.println(contador);
        }
    }
}
