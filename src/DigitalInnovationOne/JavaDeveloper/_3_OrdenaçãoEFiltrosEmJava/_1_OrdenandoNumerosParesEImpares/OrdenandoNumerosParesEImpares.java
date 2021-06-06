package DigitalInnovationOne.JavaDeveloper._3_OrdenaçãoEFiltrosEmJava._1_OrdenandoNumerosParesEImpares;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class OrdenandoNumerosParesEImpares {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        int n = leitor.nextInt();
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int l = leitor.nextInt();
            if (l % 2 == 0) {
                pares.add(l);
            }
            if (l % 2 != 0) {
                impares.add(l);
            }
        }

        List<Integer> sortedListPar = pares.stream().sorted().collect(Collectors.toList());
        sortedListPar.forEach(System.out::println);
        List<Integer> sortedListImpar = impares.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        sortedListImpar.forEach(System.out::println);

    }
}