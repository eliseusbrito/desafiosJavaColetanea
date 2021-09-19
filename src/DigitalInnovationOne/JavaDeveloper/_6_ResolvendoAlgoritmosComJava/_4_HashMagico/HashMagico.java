package DigitalInnovationOne.JavaDeveloper._6_ResolvendoAlgoritmosComJava._4_HashMagico;

import java.util.Scanner;

public class HashMagico {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantCasos = Integer.parseInt(sc.nextLine());
        int soma = 0;
        String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int l = 0; l < quantCasos; l++) {
            int quantLinhas = Integer.parseInt(sc.nextLine());
            for (int i = 0; i < quantLinhas; i++) {
                String linha = sc.nextLine();
                for (int j = 0; j < linha.length(); j++) {
                    char letrAlfabeto = linha.charAt(j);
                    int posAlfabeto = alfabeto.indexOf(letrAlfabeto);
                    int posEntrada = i;
                    int posElemento = j;
                    soma = soma + posAlfabeto + posEntrada + posElemento;
                }
            }
            System.out.println(soma);
            soma = 0;
        }
    }
}
