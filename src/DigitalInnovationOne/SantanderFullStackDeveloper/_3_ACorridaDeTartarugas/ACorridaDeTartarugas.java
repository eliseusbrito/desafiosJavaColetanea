package DigitalInnovationOne.SantanderFullStackDeveloper._3_ACorridaDeTartarugas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ACorridaDeTartarugas {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n;
        do {
            n = Integer.parseInt(br.readLine());
            String str = br.readLine();
            String s[] = str.split(" ");
            int maior = Integer.MIN_VALUE;

            int[] valorInteiros = new int[s.length];

            for (int i = 0; i < s.length; i++) {
                valorInteiros[i] = Integer
                        .parseInt(String.valueOf(s[i]));
            }

            for (int i = 0; i < valorInteiros.length; i++) {
                if (valorInteiros[i] > maior) {
                    maior = valorInteiros[i];
                }
            }

            if (maior < 10) {
                System.out.println("1");
            } else if (maior >= 10 && maior < 20) {
                System.out.println("2");
            } else {
                System.out.println("3");
            }

        } while (br.ready());
    }
}

