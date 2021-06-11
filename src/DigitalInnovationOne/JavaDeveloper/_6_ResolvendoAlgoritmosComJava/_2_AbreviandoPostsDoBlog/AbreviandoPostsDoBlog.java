package DigitalInnovationOne.JavaDeveloper._6_ResolvendoAlgoritmosComJava._2_AbreviandoPostsDoBlog;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AbreviandoPostsDoBlog {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        List<Controle> abreviacoes = new ArrayList<>();
        List<Controle> historico = new ArrayList<>();
        int posicaoAtualListaAbreviacoes = 0;
        int posicaoAtualListaHistorico = 0;
        while (!sc.hasNext(".")) {
            String linha = sc.nextLine();
            String[] linhaSplited = linha.split(" ");
            //Laço para popular a Lista Abreviações com as letras que foram abreviadas e quantidade de caracteres economizados
            for (int i = 0; i < linhaSplited.length; i++) {
                int finalI = i;
                Boolean contemNaListaAbreviacao = abreviacoes.stream().anyMatch((elemento) -> elemento.getPrimeiraLetra().contains(linhaSplited[finalI].substring(0, 1)));
                Boolean contemNaListaHistorico = historico.stream().anyMatch((elemento) -> elemento.getPrimeiraLetra().contains(linhaSplited[finalI].substring(0, 1)));
                String a = linhaSplited[finalI];
                for (int x = 0; x < abreviacoes.size(); x++) {
                    if (abreviacoes.get(x).getPrimeiraLetra().equals(linhaSplited[finalI].substring(0, 1))) {
                        posicaoAtualListaAbreviacoes = x;
                    }
                }
                for (int y = 0; y < historico.size(); y++) {
                    if (historico.get(y).getPalavra().equals(linhaSplited[finalI])) {
                        posicaoAtualListaHistorico = y;
                    }
                }
                if (linhaSplited[finalI].length() > 2 && contemNaListaAbreviacao) {//1 S
                    if (linhaSplited[finalI].length() - 2 > abreviacoes.get(posicaoAtualListaAbreviacoes).getEconomiaCaracteres()) {//3 S
                        //4
                        abreviacoes.add(new Controle(linhaSplited[i], linhaSplited[i].substring(0, 1), linhaSplited[i].substring(2), linhaSplited[i].substring(2).length()));
                        historico.add(new Controle(abreviacoes.get(posicaoAtualListaAbreviacoes).getPalavra(), abreviacoes.get(posicaoAtualListaAbreviacoes).getPrimeiraLetra(), abreviacoes.get(posicaoAtualListaAbreviacoes).getRestantePalavra(), abreviacoes.get(posicaoAtualListaAbreviacoes).getEconomiaCaracteres()));
                        abreviacoes.remove(abreviacoes.get(posicaoAtualListaAbreviacoes));
                    } else { //3 N
                        if (contemNaListaHistorico) {//5 S
                            historico.get(posicaoAtualListaHistorico).setEconomiaCaracteres(historico.get(posicaoAtualListaHistorico).getEconomiaCaracteres() + linhaSplited[finalI].length() - 2);// 7
                            if (historico.get(posicaoAtualListaHistorico).getEconomiaCaracteres() > abreviacoes.get(posicaoAtualListaAbreviacoes).getEconomiaCaracteres()) { //8 S
                                //9
                                abreviacoes.add(new Controle(historico.get(posicaoAtualListaHistorico).getPalavra(), historico.get(posicaoAtualListaHistorico).getPrimeiraLetra(), historico.get(posicaoAtualListaHistorico).getRestantePalavra(), historico.get(posicaoAtualListaHistorico).getEconomiaCaracteres()));
                                historico.add(new Controle(abreviacoes.get(posicaoAtualListaAbreviacoes).getPalavra(), abreviacoes.get(posicaoAtualListaAbreviacoes).getPrimeiraLetra(), abreviacoes.get(posicaoAtualListaAbreviacoes).getRestantePalavra(), abreviacoes.get(posicaoAtualListaAbreviacoes).getEconomiaCaracteres()));
                                historico.remove(historico.get(posicaoAtualListaHistorico));
                                abreviacoes.remove(abreviacoes.get(posicaoAtualListaAbreviacoes));
                            }
                        } else { //5 N
                            historico.add(new Controle(linhaSplited[i], linhaSplited[i].substring(0, 1), linhaSplited[i].substring(1), linhaSplited[i].substring(2).length()));//6
                        }
                    }
                } else { //1 N
                    if (linhaSplited[finalI].length() > 2) {
                        abreviacoes.add(new Controle(linhaSplited[i], linhaSplited[i].substring(0, 1), linhaSplited[i].substring(1), linhaSplited[i].substring(2).length()));//2
                    }
                }
            }
            // Laço para imprimir a frase final
            System.out.println();
            List<String> list = new ArrayList<>();
            for (int i = 0; i < abreviacoes.size(); i++) {
                list.add(abreviacoes.get(i).getPalavra());
            }
            Collections.sort(list);
            int count = 0;
            for (int i = 0; i < linhaSplited.length; i++) {
                int finalI = i;
                for (int x = 0; x < abreviacoes.size(); x++) {
                    if (linhaSplited[i].equals(abreviacoes.get(x).getPalavra())) {
                        count = count + 1;
                        System.out.print(linhaSplited[finalI].substring(0, 1) + ".");
                    }
                }
                if (count == 0) {
                    System.out.print(linhaSplited[finalI]);
                }
                if (i < linhaSplited.length - 1) {
                    System.out.print(" ");
                }
                count = 0;
            }
            System.out.println();
            System.out.println(abreviacoes.size());
            abreviacoes.stream().sorted();

            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i).substring(0, 1) + ". = " + list.get(i));
                if (i < list.size() - 1) {
                    System.out.println();
                }
            }

            abreviacoes.clear();
            historico.clear();
        }
        System.out.println("");
    }

    public static class Controle {

        String palavra;
        String primeiraLetra;
        String restantePalavra;
        int economiaCaracteres;

        public Controle(String palavra, String primeiraLetra, String restantePalavra, int economiaCaracteres) {
            this.palavra = palavra;
            this.primeiraLetra = primeiraLetra;
            this.restantePalavra = restantePalavra;
            this.economiaCaracteres = economiaCaracteres;
        }

        public String getPalavra() {
            return palavra;
        }

        public void setPalavra(String palavra) {
            this.palavra = palavra;
        }

        public String getPrimeiraLetra() {
            return primeiraLetra;
        }

        public void setPrimeiraLetra(String primeiraLetra) {
            this.primeiraLetra = primeiraLetra;
        }

        public String getRestantePalavra() {
            return restantePalavra;
        }

        public void setRestantePalavra(String restantePalavra) {
            this.restantePalavra = restantePalavra;
        }

        public int getEconomiaCaracteres() {
            return economiaCaracteres;
        }

        public void setEconomiaCaracteres(int economiaCaracteres) {
            this.economiaCaracteres = economiaCaracteres;
        }

    }

}



