package DigitalInnovationOne.AmdocsJavaDeveloper._02_DesafioJavaBootcampAmdocs2._03_SomaImparesConsecutivosI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SomaImparesConsecutivosI {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int total = 0;
        int tamanho = 0;
        List<Integer> list = new ArrayList<>();
        list.add(x);
        list.add(y);
        Collections.sort(list);
        tamanho = (list.get(1) - list.get(0));
        int value = list.get(0) + 1;
        for (int i = 1; i < tamanho; i++) {
            if (value % 2 == 1 || value % 2 == -1) {
                total = total + value;
            }
            value = value + 1;
        }
        System.out.println(total);
    }
}
