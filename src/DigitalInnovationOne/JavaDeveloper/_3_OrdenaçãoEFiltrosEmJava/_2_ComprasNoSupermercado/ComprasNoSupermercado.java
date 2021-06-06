package DigitalInnovationOne.JavaDeveloper._3_OrdenaçãoEFiltrosEmJava._2_ComprasNoSupermercado;

import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.List;
        import java.util.Scanner;
        import java.util.stream.Collectors;
        import java.util.stream.Stream;

public class ComprasNoSupermercado {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int n = Integer.parseInt(leitor.nextLine());
        List<String> list = new ArrayList<>();
        List<List<String>> listFinal = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String line = leitor.nextLine();
            Stream<String> st = Stream.of(line);
            String[] listSplited = line.split(" ");
            list = Arrays.stream(listSplited).distinct().sorted().collect(Collectors.toList());
            listFinal.add(list);
        }
        for (int i = 0; i < listFinal.size(); i++) {
            for (int x = 0; x < listFinal.get(i).size(); x++){
                System.out.print(listFinal.get(i).get(x) +" ");
            }
            System.out.println();
        }
    }
}
