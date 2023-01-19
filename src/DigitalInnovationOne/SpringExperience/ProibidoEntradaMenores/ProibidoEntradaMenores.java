package DigitalInnovationOne.SpringExperience.ProibidoEntradaMenores;

import java.util.Scanner;

public class ProibidoEntradaMenores {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] idades = new int[N];
        for(int i=0; i < N; i++){
            idades[i] = sc.nextInt();
        }
        System.out.println("Nao poderao entrar as idades: ");
        for (int i = 0;i < N; i++) {
            if (idades[i] < 18) {
                System.out.println(idades[i]);
            }

        }
    }
}
