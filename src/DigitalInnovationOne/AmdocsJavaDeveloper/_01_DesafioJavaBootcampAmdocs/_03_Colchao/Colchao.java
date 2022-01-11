package DigitalInnovationOne.AmdocsJavaDeveloper._01_DesafioJavaBootcampAmdocs._03_Colchao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Colchao {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int A = leitor.nextInt();
        int B = leitor.nextInt();
        int C = leitor.nextInt();
        int H = leitor.nextInt();
        int L = leitor.nextInt();

        List<Integer> colchao = new ArrayList<>();
        colchao.add(A);
        colchao.add(B);
        colchao.add(C);
        Collections.sort(colchao);

        if (L>H){
            int t = L;
            L = H;
            H = t;
        }
        Boolean espessura = false;
        Boolean largura = false;
        if (colchao.get(0) < L) {
            espessura = true;
        } ;
        if (colchao.get(1) < H) {
            largura = true;
        } ;

        if (espessura == true && largura == true) {
            System.out.println("S");
        } else {
            System.out.println("N");
        }

    }

}
