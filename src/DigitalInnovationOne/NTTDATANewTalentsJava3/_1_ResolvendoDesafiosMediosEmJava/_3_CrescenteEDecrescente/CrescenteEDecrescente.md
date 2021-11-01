## Crescente e Decrescente
* Básico
* Princípios Básicos


### Desafio
Leia uma quantidade indeterminada de duplas de valores inteiros X e Y. Para cada X e Y, escreva uma mensagem para indicar se tais valores foram digitados em ordem crescente ou decrescente.

### Entrada
A entrada é composta por vários casos de teste. Cada caso contém dois valores inteiros: X e Y. A leitura deve ser encerrada caso sejam fornecidos os mesmos valores para X e Y.

### Saída
Caso os valores tenham sido digitados na ordem crescente, imprima “Crescente”. No contrário, “Decrescente”.


### Exemplo de Entrada	
~~~~
5 4
7 2
3 8
2 2
~~~~
### Exemplo de Saída
~~~~
Decrescente
Decrescente
Crescente
~~~~


### Codigo Inicial fornecido pela plataforma DIO
````java
import java.io.IOException;
import java.util.Scanner;

public class Teste {

    public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	int X = leitor.nextInt();
    	int Y = leitor.nextInt();
    	while (X != Y) {
    		if (     ) System.out.println("        "); //implemente sua lógica aqui
    		else System.out.println("       ");     // implemente sua lógica aqui
        	X = leitor.nextInt();
        	Y = leitor.nextInt();
    	}
    }
	
}
````
 

