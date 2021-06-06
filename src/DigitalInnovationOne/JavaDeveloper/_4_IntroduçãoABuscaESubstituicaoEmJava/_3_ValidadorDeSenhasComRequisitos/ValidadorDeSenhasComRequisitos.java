package DigitalInnovationOne.JavaDeveloper._4_IntroduçãoABuscaESubstituicaoEmJava._3_ValidadorDeSenhasComRequisitos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ValidadorDeSenhasComRequisitos {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String senha;
        while ((senha = br.readLine()) != null) {
            boolean isCorrectLength = senha.length() >= 6 && senha.length() <= 32;
            boolean containsNumber = false;
            boolean containsUpperCase = false;
            boolean containsLowerCase = false;
            boolean containsSpace = senha.contains(" ");
            String pattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{6,32}";
            String pattern2 = "(?=.*\\p{Punct}).{1,}";
            for (int i = 0; i < senha.length(); i++) {
                if (Character.isDigit(senha.charAt(i))) {
                    containsNumber = true;
                } else if (Character.isUpperCase(senha.charAt(i))) {
                    containsUpperCase = true;
                } else if (Character.isLowerCase(senha.charAt(i))) {
                    containsLowerCase = true;
                }
            }
            if (isCorrectLength && !containsSpace && containsNumber && containsUpperCase && containsLowerCase) {
                if (senha.matches(pattern) == true && senha.matches(pattern2) == false) {
                    System.out.println(" Senha valida. ");
                } else {
                    System.out.println(" Senha invalida.");
                }
            } else {
                System.out.println(" Senha invalida.");
            }
        }
    }
}
