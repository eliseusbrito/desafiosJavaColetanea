package DigitalInnovationOne.JavaDeveloper._6_ResolvendoAlgoritmosComJava._5_OTabuleiroSecreto;

import java.util.*;
import java.util.stream.IntStream;

public class MaisFrequenteJavaOito {
    public static void main(String[] args) {
//        int[] notas = {10, 9, 10, 9, 8, 7, 8, 8};

        int[] notas = {5,7,7,2,5,2,1,3};


//        List<Integer> notas = Arrays.asList(10, 9, 10, 9, 8, 7, 8, 8);
        Map<Integer, Integer> ocorrencias = new HashMap<>();
        for (int nota : notas) {
            ocorrencias.put(nota, ocorrencias.getOrDefault(nota, 0) + 1);
        }
        Map.Entry<Integer, Integer> notaMaisFrequente = ocorrencias.entrySet()
                .stream()
                .max(Comparator.comparing(Map.Entry::getValue))
                .get();
        System.out.println("Nota mais frequente: " + notaMaisFrequente.getKey());
        System.out.println("Quantidade de aparições: " + notaMaisFrequente.getValue());

        IntSummaryStatistics stats = IntStream.of(notas).summaryStatistics();
        System.out.println("Media: " + stats.getAverage());
        System.out.println("getMax = " + stats.getMax());
        System.out.println("getCount = " + stats.getCount());

    }


}
