//package DigitalInnovationOne.JavaDeveloper._6_ResolvendoAlgoritmosComJava._5_OTabuleiroSecreto;
//
//import java.util.IntSummaryStatistics;
//import java.util.stream.IntStream;
//
//public class teste {
//
//    public static void main(String[] args) {
////        int[] notas = {5, 7, 7, 2, 5, 2, 1, 3, 1};
//        int[] notas = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 3, 5};
//        int max = findMostFrequentValue(notas);
//        System.out.println(max);
//    }
//
//
//    public static int findMostFrequentValue(int[] array) {
//        int i;
//        int[] numberCount = new int[100];
//        for (i = 0; i < array.length; i++) {
//            ++numberCount[array[i]];
//        }
//        int max = 0;
//        for (int j = 0; j < numberCount.length - 1; j++) {Contagem repetida de números
//            if (numberCount[j + 1] > numberCount[j]) {
//                max = j + 1;
//            }
//        }
//        return max;
//    }
//}
