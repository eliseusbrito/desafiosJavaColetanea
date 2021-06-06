package DigitalInnovationOne.JavaDeveloper._5_SolucaoDeProblemasComJava._4_EntrevistaEmbaracosa;

import java.io.IOException;
import java.util.Scanner;

public class EntrevistaEmbaracosa {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String input = scanner.nextLine();
            Integer limit = (int) Math.floor(input.length() / 2);
            Integer end = input.length();
            Integer aux = 0;

            if (input.length() == 1) {
                System.out.println(input);
            } else if (limit >= 1) {
                for (int i = limit; i >= 1; i--) {
                    if (input.substring(end - i, end).equals(input.substring(end - (2 * i), end - i))) {
                        aux = i;
                        System.out.println(input.substring(0, (end - aux)));
                    } else if (limit == 1) {
                        System.out.println(input);
                    }
                }

                if (limit > 1 && aux == 0) System.out.println(input);
            }
        }
        scanner.close();
    }

}
