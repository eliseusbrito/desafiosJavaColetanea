package aLeituraEntradaDados;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class yBufferReader {

    public static void main(String[] args) throws IOException {
//        entradaMesmaEmLinha();
        entradaDuasLinhas();

    }

    public static void entradaMesmaEmLinha() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int primeiro = Integer.parseInt(st.nextToken());
        String segundo = st.nextToken();
    }

    public static void entradaDuasLinhas() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int primeiro = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        String segundo = st.nextToken();
    }

//    if (file.exists())
//    in = new BufferedReader(new FileReader(file));
//        else
//    in = new BufferedReader(new InputStreamReader(System.in));



}
