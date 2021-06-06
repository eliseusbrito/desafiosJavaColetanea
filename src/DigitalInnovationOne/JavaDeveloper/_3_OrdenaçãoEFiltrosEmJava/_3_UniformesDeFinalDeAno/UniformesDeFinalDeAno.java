package DigitalInnovationOne.JavaDeveloper._3_OrdenaçãoEFiltrosEmJava._3_UniformesDeFinalDeAno;

import java.util.*;

public class UniformesDeFinalDeAno {

    public static void main(String[] args) throws ClassCastException {
        Scanner leitor = new Scanner(System.in);
        int n = Integer.parseInt(leitor.nextLine());
        List<Estudante> listFinal = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String nome = leitor.nextLine();
            List<String> list = new ArrayList<>();
            list.add(nome);
            String line = leitor.nextLine();
            String[] listSplited = line.split(" ");
            list.add(listSplited[0]);
            list.add(listSplited[1]);
            listFinal.add(new Estudante(nome, listSplited[0], listSplited[1]));
        }
        Collections.sort(listFinal);
        for (int i = 0; i < listFinal.size(); i++) {
            System.out.print(listFinal.get(i).getCor() + " " + listFinal.get(i).getTamanho() + " " + listFinal.get(i).getNome());
            System.out.println();
        }
    }

    public static class Estudante implements Comparable<Estudante> {
        private final String nome;
        private final String cor;
        private final String tamanho;

        public Estudante(String nome, String cor, String tamanho) {
            this.nome = nome;
            this.cor = cor;
            this.tamanho = tamanho;
        }

        public String getNome() {
            return nome;
        }

        public String getCor() {
            return cor;
        }

        public String getTamanho() {
            return tamanho;
        }

        @Override
        public int compareTo(Estudante o) {
            List<String> order = Arrays.asList("P", "M", "G");
            return Comparator.comparing(Estudante::getCor)
                    .thenComparing(Estudante::getTamanho, Comparator.comparingInt(c -> order.indexOf(c)))
                    .thenComparing(Estudante::getNome)
                    .compare(this, o);
        }
    }
}
