package DigitalInnovationOne.AceleracaoMicroservicosSpringCloudAvanadade._2_MultiplosDe13;

import java.util.Scanner;

public class MultiplosDe13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int soma = 0;
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        if (n2 < n1) {
            int t = n2;
            n2 = n1;
            n1 = t;
        }

        for (int i = n1; i <= n2; i++) {
            if (i % 13 != 0) {
                soma = soma + i;
            }
        }

        System.out.println(soma);
    }
}
