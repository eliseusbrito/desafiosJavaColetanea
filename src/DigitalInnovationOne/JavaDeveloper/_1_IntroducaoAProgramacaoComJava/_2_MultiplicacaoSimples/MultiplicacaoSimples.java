package DigitalInnovationOne.JavaDeveloper._1_IntroducaoAProgramacaoComJava._2_MultiplicacaoSimples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MultiplicacaoSimples {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine()); //Necessário esta linha porque a entrada é um duas linhas(se os numeros estivessem na mesma linha não era necessário)
        int b = Integer.parseInt(st.nextToken());
        int total = a * b; // Altere o valor da variável com o cálculo esperado
        System.out.println("PROD = " + total);
    }

}
