package aLeituraEntradaDados;

import java.util.Scanner;

public class xScanner {

    public static void main(String[] args) {
//        exemploMixed();
        proximaLine();
//        exemploHasNext();
    }

    public static void exemploMixed() {
        Scanner sc = new Scanner(System.in);
        int primeiro = sc.nextInt();
        int segundo = sc.nextInt();
        int terceiro = sc.nextInt();
        String quarto = sc.next();
        String quinto = sc.next();
        int sexto = sc.nextInt();
        String setimo = sc.next();
        int oitavo = sc.nextInt();
        String decimo = sc.next();
        int decimoprimeiro = sc.nextInt();
        int decimosegundo = sc.nextInt();
        String decimoterceiro = sc.next();
        System.out.println("The end!!");
    }

    public static void proximaLine(){
        Scanner sc = new Scanner(System.in);
        String primeiro = sc.nextLine();
        String segundo = sc.nextLine();
        String terceiro = sc.nextLine();
        String quarto = sc.nextLine();
        String quinto = sc.nextLine();
        String sexto = sc.nextLine();
        System.out.println("The end!!");
    }

    public static void exemploHasNext(){
        Scanner sc = new Scanner(System.in);
        boolean primeiro = sc.hasNextInt();
        boolean segundo = sc.hasNext();
        boolean terceiro = sc.hasNextLine();
        System.out.println("The end!!");
    }

}
