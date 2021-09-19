package DigitalInnovationOne.StartGFT._1_DesafiosMatematicos._1_VisitaNaFeira;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class VisitaNaFeira {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int total = a + b; // Altere o valor da variável com o cálculo esperado
        System.out.println("X = " + total);
    }

}
