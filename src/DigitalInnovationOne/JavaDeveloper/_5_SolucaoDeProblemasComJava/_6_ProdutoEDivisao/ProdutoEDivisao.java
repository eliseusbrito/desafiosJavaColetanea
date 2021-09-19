package DigitalInnovationOne.JavaDeveloper._5_SolucaoDeProblemasComJava._6_ProdutoEDivisao;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Scanner;

public class ProdutoEDivisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigDecimal currentNum, resultNum;
        String operator;
        String[] lineArgs;
        int N;
        N = Integer.parseInt(scanner.nextLine());
        resultNum = new BigDecimal("1.0");

        for (int i = 0; i < N; ++i) {
            lineArgs = scanner.nextLine().trim().split(" ");

            currentNum = new BigDecimal(lineArgs[0]);
            operator = lineArgs[1];

            if (operator.equals("*")) {
                resultNum = resultNum.multiply(currentNum);
            } else if (operator.equals("/")) {
                resultNum = resultNum.divide(currentNum, MathContext.DECIMAL128);
            }
        }

        System.out.println(resultNum.setScale(0, RoundingMode.DOWN));
        scanner.close();
    }
}
