package DigitalInnovationOne.JavaDeveloper._5_SolucaoDeProblemasComJava._3_MelhorAmigoDoPablo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MelhorAmigoDoPablo {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String linha = br.readLine();
        List<String> listNao = new ArrayList<>();
        List<String> listSim = new ArrayList<>();
        while (!linha.equals("FIM")) {
            List<String> myList = new ArrayList<String>(Arrays.asList(linha.split(" ")));
            if (myList.get(1).equals("SIM")) {
                listSim.add(myList.get(0));
            }
            if (myList.get(1).equals("NAO")) {
                listNao.add(myList.get(0));
            }
            linha = br.readLine();
        }

        List<String> distinctListSim = listSim.stream().distinct().collect(Collectors.toList());
        List<String> distinctListNao = listNao.stream().distinct().collect(Collectors.toList());

        String vencedor = distinctListSim.get(0);
        for (int i = 0; i < distinctListSim.size() - 1; i++) {
            if (distinctListSim.get(i + 1).length() > vencedor.length()) {
                vencedor = distinctListSim.get(i + 1);
            }
        }

        List<String> sortedListSim = distinctListSim.stream().sorted().collect(Collectors.toList());
        sortedListSim.forEach(System.out::println);

        List<String> sortedListNao = distinctListNao.stream().sorted().collect(Collectors.toList());
        sortedListNao.forEach(System.out::println);
        System.out.println();

        System.out.println("Amigo do Pablo:");
        System.out.println(vencedor);

    }
}