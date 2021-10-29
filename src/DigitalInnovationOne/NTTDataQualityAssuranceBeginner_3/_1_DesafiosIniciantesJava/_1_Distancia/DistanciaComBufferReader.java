package DigitalInnovationOne.NTTDataQualityAssuranceBeginner_3._1_DesafiosIniciantesJava._1_Distancia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DistanciaComBufferReader {

    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        int quilometros = Integer.parseInt(console.readLine());
        int minutos = quilometros * 2 ;
        System.out.println( minutos + " minutos " );
    }

}
