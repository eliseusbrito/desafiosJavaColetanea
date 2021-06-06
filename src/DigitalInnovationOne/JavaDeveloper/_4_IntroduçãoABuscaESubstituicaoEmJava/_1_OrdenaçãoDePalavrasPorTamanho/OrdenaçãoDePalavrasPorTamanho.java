package DigitalInnovationOne.JavaDeveloper._4_IntroduçãoABuscaESubstituicaoEmJava._1_OrdenaçãoDePalavrasPorTamanho;

import java.util.*;

public class OrdenaçãoDePalavrasPorTamanho {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int cont = 0;
        int n = Integer.parseInt(leitor.nextLine());
        List<String[]> listFinal = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String palavras = leitor.nextLine();
            String[] list = palavras.split(" ");
            Arrays.sort(list);
            do {
                cont = 0;
                for (int x = 0; x < list.length - 1; x++) {
                    if (list[x + 1].length() > list[x].length()) {
                        Collections.swap(Arrays.asList(list), x, x + 1);
                        cont = cont + 1;
                    }
                }
            } while (cont > 0);

            for (String y : list) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}
