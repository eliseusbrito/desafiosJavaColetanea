## FibonacciEmVetor

* Intermediário
* Princípios Básicos

### Desafio
Nesse desafio você terá que desenvolver um programa que leia um valor e apresente o número de Fibonacci correspondente a este valor lido. Lembre que os 2 primeiros elementos da série de Fibonacci são 0 e 1 e cada próximo termo é a soma dos 2 anteriores a ele. Todos os valores de Fibonacci calculados neste problema devem caber em um inteiro de 64 bits sem sinal.

### Entrada
A primeira linha da entrada contém um inteiro T, indicando o número de casos de teste. Cada caso de teste contém um único inteiro N (0 ≤ N ≤ 60), correspondente ao enésimo termo da série de Fibonacci.

### Saída
Para cada caso de teste da entrada, imprima a mensagem "Fib(N) = X", onde X é o N-ésimo termo da série de Fibonacci.


#### Exemplo de Entrada
~~~~
3
0
4
2
~~~~
#### 	Exemplo de Saída
~~~~
Fib(0) = 0
Fib(4) = 3
Fib(2) = 1
~~~~

### Codigo Inicial Disponibilizado

~~~java
import java.io.IOException;
import java.util.Scanner;

public class{
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int T = leitor.nextInt();
        for (                ) {
        	int N = leitor.nextInt();
            long anterior = 0, atual = 1, proximo;
	        for (                 ) {
	        	
	        }
	        System.out.println("Fib("+ N +") = " + anterior);
        }
    }
	
}
~~~~

### Teste 1

##### Dado de entrada:
~~~~
3
30
41
52
~~~~
##### Saída esperada:
~~~~
Fib(30) = 832040
Fib(41) = 165580141
Fib(52) = 32951280099
~~~~

### Teste 2

##### Dado de entrada:
~~~~
10
1
2
3
4
5
6
7
8
9
20
~~~~
##### Saída esperada:
~~~~
Fib(1) = 1
Fib(2) = 1
Fib(3) = 2
Fib(4) = 3
Fib(5) = 5
Fib(6) = 8
Fib(7) = 13
Fib(8) = 21
Fib(9) = 34
Fib(20) = 6765
~~~~
