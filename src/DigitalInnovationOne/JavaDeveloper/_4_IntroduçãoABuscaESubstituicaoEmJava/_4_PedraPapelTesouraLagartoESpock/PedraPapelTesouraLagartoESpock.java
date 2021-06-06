package DigitalInnovationOne.JavaDeveloper._4_IntroduçãoABuscaESubstituicaoEmJava._4_PedraPapelTesouraLagartoESpock;

import java.util.Scanner;

public class PedraPapelTesouraLagartoESpock {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String tesoura = "tesoura";
        String papel = "papel";
        String pedra = "pedra";
        String lagarto = "lagarto";
        String spock = "spock";

        int n = Integer.parseInt(leitor.nextLine());

        for (int i = 0; i < n; i++) {
            String line = leitor.nextLine();
            String[] resposta = line.split(" ");

            if (resposta[0].equals(tesoura) && resposta[1].equals(papel)) {
                System.out.println("Fernanda");
            }
            if (resposta[0].equals(papel) && resposta[1].equals(tesoura)) {
                System.out.println("Marcia");
            }

            if (resposta[0].equals(papel) && resposta[1].equals(pedra)) {
                System.out.println("Fernanda");
            }
            if (resposta[0].equals(pedra) && resposta[1].equals(papel)) {
                System.out.println("Marcia");
            }

            if (resposta[0].equals(pedra) && resposta[1].equals(lagarto)) {
                System.out.println("Fernanda");
            }
            if (resposta[0].equals(lagarto) && resposta[1].equals(pedra)) {
                System.out.println("Marcia");
            }

            if (resposta[0].equals(lagarto) && resposta[1].equals(spock)) {
                System.out.println("Fernanda");
            }
            if (resposta[0].equals(spock) && resposta[1].equals(lagarto)) {
                System.out.println("Marcia");
            }

            if (resposta[0].equals(spock) && resposta[1].equals(tesoura)) {
                System.out.println("Fernanda");
            }
            if (resposta[0].equals(tesoura) && resposta[1].equals(spock)) {
                System.out.println("Marcia");
            }

            if (resposta[0].equals(tesoura) && resposta[1].equals(lagarto)) {
                System.out.println("Fernanda");
            }
            if (resposta[0].equals(lagarto) && resposta[1].equals(tesoura)) {
                System.out.println("Marcia");
            }

            if (resposta[0].equals(lagarto) && resposta[1].equals(papel)) {
                System.out.println("Fernanda");
            }
            if (resposta[0].equals(papel) && resposta[1].equals(lagarto)) {
                System.out.println("Marcia");
            }

            if (resposta[0].equals(papel) && resposta[1].equals(spock)) {
                System.out.println("Fernanda");
            }
            if (resposta[0].equals(spock) && resposta[1].equals(papel)) {
                System.out.println("Marcia");
            }

            if (resposta[0].equals(spock) && resposta[1].equals(pedra)) {
                System.out.println("Fernanda");
            }
            if (resposta[0].equals(pedra) && resposta[1].equals(spock)) {
                System.out.println("Marcia");
            }

            if (resposta[0].equals(pedra) && resposta[1].equals(tesoura)) {
                System.out.println("Fernanda");
            }
            if (resposta[0].equals(tesoura) && resposta[1].equals(pedra)) {
                System.out.println("Marcia");
            }

            if (resposta[0].equals(resposta[1]) || resposta[1].equals(resposta[0])) {
                System.out.println("empate");
            }
        }
    }
}
