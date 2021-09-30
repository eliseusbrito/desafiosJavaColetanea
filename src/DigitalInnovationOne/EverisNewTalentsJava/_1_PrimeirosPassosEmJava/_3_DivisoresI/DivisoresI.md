## Divisores I

* Básico
* Princípios Básicos

### Desafio

Ler um número inteiro N e calcular todos os seus divisores.

### Entrada
O arquivo de entrada contém um valor inteiro.

### Saída
Escreva todos os divisores positivos de N, um valor por linha.


#### Exemplo de Entrada	
~~~~
6
~~~~

#### Exemplo de Saída
~~~~
1
2
3
6
~~~~
Agradecimentos a Cassio F.

##### Codigo inicial dado pela DIO

~~~~Java
import java.util.Scanner;

public class Problem {
//complete os espaços em branco com sua solução
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        n = input.nextInt();

        for (int i = 1;          ; i++) {
            if (n % i == 0) {
                System.out.println(       );
            }
        }
        System.out.println(        );
    }
}
~~~~