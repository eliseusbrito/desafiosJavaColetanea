package DigitalInnovationOne.JavaDeveloper._6_ResolvendoAlgoritmosComJava._3_CombinacaoDeStrings;

import java.util.Scanner;

public class CombinacaoDeStrings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        String resultado = "";
        for (int i = 0; i < N; i++) {
            String[] linhaSplited = sc.nextLine().split(" ");
            int tamanhoPrimeiroString = linhaSplited[0].length();
            int tamanhoSegundaString = linhaSplited[1].length();
            int tamanho = 0;
            if (tamanhoPrimeiroString < tamanhoSegundaString) {
                tamanho = tamanhoPrimeiroString;
            } else {
                tamanho = tamanhoSegundaString;
            }
            for (int j = 0; j < tamanho; j++) {
                resultado = resultado + linhaSplited[0].charAt(j) + linhaSplited[1].charAt(j);
            }
            if (tamanhoPrimeiroString > tamanhoSegundaString) {
                resultado = resultado + linhaSplited[0].substring(tamanhoSegundaString,tamanhoPrimeiroString);
            } else {
                resultado = resultado + linhaSplited[1].substring(tamanhoPrimeiroString,tamanhoSegundaString);
            }

            System.out.println(resultado);
            resultado = "";
        }
    }

}
