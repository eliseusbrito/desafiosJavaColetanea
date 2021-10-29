## Quadrante
* Básico
* Princípios Básicos
### Desafio
Desenvolva um programa para ler as coordenadas (M,N) de uma quantidade indeterminada de pontos no sistema cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).

### Entrada
A entrada contém vários casos de teste. Cada caso de teste contém 2 valores inteiros.

### Saída
Para cada caso de teste mostre em qual quadrante do sistema cartesiano se encontra a coordenada lida, conforme o exemplo.

 
### Exemplo de Entrada	
~~~~
2 2
3 -2
-8 -1
-7 1
0 2
~~~~

Exemplo de Saída
~~~~
primeiro
quarto
terceiro
segundo
~~~~


### Sugestão dada pela plataforma
```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner leitor = new Scanner(System.in);
        int X = leitor.nextInt();
        int Y = leitor.nextInt();

        while (X != 0 && Y != 0) {
            if (X == 0 || Y == 0) break;
            else if (Y > 0 && X > 0) System.out.println("primeiro");
            else if (Y > 0 && X < 0) System.out.println("               ");   //insira o código nos espaços em branco
            else if (    <   &&     <    )System.out.println("               ");
			else if () System.out.println("            ");
            X = leitor.nextInt();
            Y = leitor.nextInt();
        }
    }
}		
```
 