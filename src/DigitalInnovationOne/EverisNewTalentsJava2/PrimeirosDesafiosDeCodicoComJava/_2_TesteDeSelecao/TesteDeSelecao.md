## Teste de Seleção 1
* Básico
* Princípios Básicos
### Desafio
Leia 4 valores inteiros A, B, C e D. Com base nisso, se o valor de B for maior do que de C e se D for maior do que A, e a soma de C com D for maior que a soma de A e B e se tanto C quanto D forem positivos e, ainda, se a variável A for par, escreva a mensagem "Valores aceitos", senão escrever "Valores nao aceitos".

### Entrada
Quatro números inteiros A, B, C e D.

### Saída
Imprima a mensagem corretamente esperada pela validação dos valores.


#### Exemplo de Entrada	1
~~~~
5 6 7 8
~~~~
#### Exemplo de Saída 1 
~~~~
Valores nao aceitos
~~~~

#### Exemplo de Entrada	2
~~~~
2 3 2 6
~~~~
#### Exemplo de Saída 2
~~~~
Valores aceitos
~~~~

### Codigo inicial fornecido pela DIO

````Java
import java.util.Scanner;

public class Problem{

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();

		//implemente a condição abaixo para ter o resultado esperado
		if (                   ) {
			System.out.println("Valores aceitos");
		} else {
			System.out.println("Valores nao aceitos");
		}
	}
}
````