package DigitalInnovationOne.AceleracaoMicroservicosSpringCloudAvanadade._3_Blobs;

import java.util.Scanner;

public class Blobs {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int entry = reader.nextInt();
        String quantidadeInicialString = reader.next();
        double quantidadeInicial = Double.parseDouble(quantidadeInicialString);

        for (int i = 0; i < entry; i++) {
            double quantidadeRestante = quantidadeInicial / 2;
            int contador = 1;

            while (quantidadeRestante >= 1) {
                quantidadeRestante = quantidadeRestante / 2;
                contador = contador + 1;
            }
            System.out.println(contador + " dias");
            if(i<entry-1){
                quantidadeInicialString = reader.next();
                quantidadeInicial = Double.parseDouble(quantidadeInicialString);
            }
        }
        System.out.println("fim");
    }

}
