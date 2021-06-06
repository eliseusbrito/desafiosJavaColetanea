package DigitalInnovationOne.JavaDeveloper._5_SolucaoDeProblemasComJava._5_ConjuntosBonsOuRuins;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ConjuntosBonsOuRuins {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int n = Integer.parseInt(leitor.nextLine());
        while (n != 0) {
            String tipoConjunto = "";
            List<String> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                String line = leitor.nextLine();
                list.add(line);
            }
            list = list.stream().sorted().collect(Collectors.toList());
            for (int i = 0; i < n - 1; i++) {
                if (list.get(i + 1).startsWith(list.get(i))) {
                    tipoConjunto = "Conjunto Ruim";
                }
            }
            if (tipoConjunto == "Conjunto Ruim") {
                System.out.println("Conjunto Ruim");
            } else {
                System.out.println("Conjunto Bom");
            }
            n = Integer.parseInt(leitor.nextLine());
        }
    }
}
