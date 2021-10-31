package DigitalInnovationOne.EverisNewTalentsJava2._2_IntroducaoProgramacaoJava._1_Tuitando;

import java.io.IOException;
import java.util.Scanner;

public class Tuitando {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        String T = leitor.nextLine();
        System.out.println(T.length() > 140 ? "MUTE" : "TWEET");
    }
}
