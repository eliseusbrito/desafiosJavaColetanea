## Intervalo
* Intermediário
* Princípios Básicos

### Desafio
Faça um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Caso o valor não esteja em nenhum destes intervalos, deverá ser impressa a mensagem: “Fora de intervalo”.

O símbolo ( representa "maior que". Por exemplo:
[0,25]  indica valores entre 0 e 25.0000, inclusive eles.
(25,50] indica valores maiores que 25 Ex: 25.00001 até o valor 50.0000000

### Entrada
O arquivo de entrada contém um número com ponto flutuante qualquer.

### Saída
A saída deve ser uma mensagem conforme exemplo abaixo.


#### Exemplo de Entrada 1	
~~~~
25.01
~~~~
#### Exemplo de Saída 1
~~~~
Intervalo (25,50]
~~~~
#### Exemplo de Entrada 2
~~~~
25.00
~~~~
#### Exemplo de Saída 2
~~~~
Intervalo [0,25]
~~~~
#### Exemplo de Entrada 3	
~~~~
100.00
~~~~
#### Exemplo de Saída 3
~~~~
Intervalo (75,100]
~~~~
#### Exemplo de Entrada 4
~~~~
-25.02
~~~~
#### Exemplo de Saída 4
~~~~
Fora de intervalo
~~~~

### Sugestão inicial de programa
````Java
import java.io.IOException;
import java.util.Scanner;

public class Teste {
    
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double valor = leitor.nextDouble();
        if (valor >= 0 && valor <= 25) {
            System.out.println("Intervalo [0,25]");
        } else if (valor > 25 && valor <= 50) {
            System.out.println("Intervalo      "); //digite sua lógica aqui
        } else if (valor > 50 && valor <= 75) {
            System.out.println("    ");  //digite sua lógica aqui
        } else if (valor > 75 && valor <= 100) {
            System.out.println("   "); //digite sua lógica aqui
        } else {
            System.out.println("Fora de intervalo");
    }
    } 
}
````
