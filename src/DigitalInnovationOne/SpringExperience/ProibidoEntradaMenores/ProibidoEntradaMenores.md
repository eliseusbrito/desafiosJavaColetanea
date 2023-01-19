* Básico
* Princípios Básicos

## Desafio
O objetivo deste desafio é resolvê-lo utilizando o seu conhecimento sobre Arrays, uma estrutura de dados que armazena uma coleção de dados em um bloco de memória.

Você está desenvolvendo um sistema para um local de eventos, neste local, é necessário que a entrada seja permitida apenas para pessoas acima de 18 anos. Faça um programa para ler um número N, a idade de N pessoas. Depois disso, coloque a idade mínima permitida  para se entrar no local, conforme exemplo.
Retorne às idades de quem não puder entrar.

### Entrada
A entrada será composta na primeira linha pelo tamanho da array e nas linhas subsequentes pelas idades que preenchem essa array

### Saída
A saída deverá retornar as idades que não são permitidas a entrada, conforme exemplo abaixo.

#### Entrada 1
~~~~
4
18
22
15
50
~~~~

#### Saída 1
~~~~
Nao poderao entrar as idades:
15
~~~~


#### Entrada 2
~~~~
3
50
10
65
Nao poderao entrar as idades:
~~~~
#### Saída 2
~~~~
10
~~~~

### Codigo inicial sugerido pela plataforma

````java
// Abaixo segue um exemplo de código que você pode ou não utilizar
import java.util.*;
 
    public class DIO{

	// TODO: complete os espaços em branco com sua solução para o problema
 
        public static void main(String[] args) {
           
	    //a classe Scanner auxilia na leitura dos dados de entrada
            Scanner scan = new Scanner(System.in);
 
            int N= scan.nextInt();
            String string = scan.nextLine();
	    
	    
	    //quebra string em várias substrings a partir de um caractere
            String[] s = string.split(" ");
 
            double[] idade = new double[N];
 
            for (int i = 0; i < N; i++)
            {
                idade[i] =          ;
            }
 
 
            System.out.println("Nao poderao entrar as idades: ");
            for (int i = 0; i < N; i++)
            {
                if (           )
                {
                    System.out.println(         );
                }
 
            }
                   
        }
    }
````