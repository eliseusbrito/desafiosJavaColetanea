package DigitalInnovationOne.GFTJava_AWSDeveloper._2_IntroducaoAProgramacaoComJava._2_TempoDeJogo;

import java.util.Scanner;

public class TempoDeJogo {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int inicio, fim, horas;
        inicio = scan.nextInt();
        fim = scan.nextInt();
        horas = fim - inicio;

        if(horas == 0){
            System.out.print("O JOGO DUROU 24 HORA(S)\n");
        }else if(horas < 0){
            int duracao = 24-inicio + fim;
            System.out.print("O JOGO DUROU " + duracao + " HORA(S)\n");
        }else if(horas > 24){
            System.out.print("O JOGO DUROU " + horas + " HORA(S)\n");
        }else{
            int duracao = fim - inicio;
            System.out.print("O JOGO DUROU " +  duracao  + " HORA(S)\n");
        }
    }

}
