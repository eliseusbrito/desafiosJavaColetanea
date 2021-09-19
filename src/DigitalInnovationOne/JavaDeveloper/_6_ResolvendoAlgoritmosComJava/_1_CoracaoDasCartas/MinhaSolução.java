package DigitalInnovationOne.JavaDeveloper._6_ResolvendoAlgoritmosComJava._1_CoracaoDasCartas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class MinhaSolução {

    //Falta corrigir para poder passar nos testes fechados
    //Testes Abertos passaram 1/1
    //Testes fechados não passaram 3/3

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> list = new ArrayList<>();
        int controle = 0;
        int n = Integer.parseInt(st.nextToken());
        while (n != 0) {
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                for (int x = 0; x < 3; x++) {
                    int a = Integer.parseInt(st.nextToken());
                    list.add(a);
                }
                if (list.get(0) != 0 && list.get(0) % 3 == 0) {
                    controle = 1;
                } else if (list.get(1) != 0 && ((list.get(0) + list.get(1)) % 3) == 0) {
                    controle = 1;
                } else if (list.get(2) != 0 && (list.get(0) + list.get(1) + list.get(2)) % 3 == 0) {
                    controle = 1;
                } else if (list.get(1) != 0 && list.get(1) % 3 == 0) {
                    controle = 1;
                } else if (list.get(2) != 0 && list.get(2) % 3 == 0) {
                    controle = 1;
                } else if (list.get(2) != 0 && (list.get(1) + list.get(2)) % 3 == 0) {
                    controle = 1;
                } else if (list.get(2) != 0 && (list.get(0) + list.get(2)) % 3 == 0) {
                    controle = 1;
                }
                list.clear();
            }
            System.out.println(controle);
            controle = 0;
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
        }
    }
}
