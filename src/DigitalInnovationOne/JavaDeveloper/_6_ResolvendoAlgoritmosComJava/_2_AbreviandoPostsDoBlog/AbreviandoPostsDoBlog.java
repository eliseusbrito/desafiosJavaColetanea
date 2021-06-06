package DigitalInnovationOne.JavaDeveloper._6_ResolvendoAlgoritmosComJava._2_AbreviandoPostsDoBlog;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class AbreviandoPostsDoBlog {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String linha = st.nextToken();
        Map<String, String> abreviacoes = new HashMap<>();
        while (linha != ".") {
            String[] linhaSplited = linha.split(" ");
            for (int i = 0; i <= linhaSplited.length; i++) {
                String primeiraLetra = linhaSplited[i].substring(0, 1);
                String restantePalavra = linhaSplited[i].substring(1);
                abreviacoes.put(primeiraLetra, restantePalavra);
            }
            linha = st.nextToken();
        }
        for (Map.Entry<String, String> entry : abreviacoes.entrySet()) {
            System.out.println(entry.getKey() + "--" + entry.getValue());
        }

    }
}

