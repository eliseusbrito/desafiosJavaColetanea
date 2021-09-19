package DigitalInnovationOne.StartGFT._2_SolucionandoDesafiosEmJava._3_ContagemRepetidaDeNumeros;

import java.util.*;

public class ContagemRepetidaDeNumeros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        Locale.setDefault(new Locale("en", "US"));

        ArrayList<Integer> lista = new ArrayList<Integer>();

        int n = sc.nextInt();
        while (n > 0) {
            n = n - 1;
            lista.add(sc.nextInt());
        }
        SortedMap<Integer, Integer> contaQuant = new TreeMap<>();
        lista.forEach(id -> contaQuant.compute(id, (k, v) -> (v == null ? 1 : v + 1)));
        contaQuant.entrySet().forEach(entry -> {
            System.out.printf("%d aparece %d vez(es)\n", entry.getKey(), entry.getValue());
        });

        sc.close();
    }
}