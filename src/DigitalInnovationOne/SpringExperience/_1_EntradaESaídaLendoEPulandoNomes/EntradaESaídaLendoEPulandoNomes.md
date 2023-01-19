* Básico
* Princípios Básicos

## Desafio

Faça um programa com as características abaixo:

Leia 10 nomes, sem espaço em branco;
Imprima o terceiro nome da lista;
Imprima o sétimo nome da lista;
Imprima o nono nome da lista.

## Entrada
A entrada consiste vários arquivos de teste, cada um com dez linhas e em cada linha tem um nome de no até 30 caracteres e sem espaço em branco. Conforme mostrado no exemplo de entrada a seguir.

## Saída
Para cada arquivo da entrada, terá um arquivo de saída. E como mencionado no Desafio, gere três linhas conforme os procedimentos 2, 3 e 4. Use o exemplo abaixo para clarear o que está sendo pedido.


### Exemplos de Entrada 1
~~~~
USP
UFPE
UFCG
UFRN
UFRJ
IME
ITA
UNIOESTE
URI
UFG
~~~~
###	Exemplos de Saída 1
~~~~
UFCG

ITA

URI
~~~~

### Exemplos de Entrada 2
~~~~
UnB

UFMG

UNIFEI

UECE

UNICAMP

INATEL

UFRGS

UNIFESO

UFU

PUC
~~~~
###	Exemplos de Saída 2
~~~~
UNIFEI

UFRGS

UFU
~~~~
 

### Sugestão codigo inicial

````Java
// Abaixo segue um exemplo de código que você pode ou não utilizar
import java.util.Scanner;

public class Problem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
// TODO: complete os espaços em branco com sua solução para o problema
		String[] nomes = new String[     ];
		
		for(int i=0 ; i<10 ; i++)
			nomes[    ] = sc.nextLine();

	}
}

````