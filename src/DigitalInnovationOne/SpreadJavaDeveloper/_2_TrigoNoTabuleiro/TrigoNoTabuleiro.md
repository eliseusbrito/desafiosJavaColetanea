## Trigo no Tabuleiro
* Básico
* Matemática

Uma rainha requisitou os serviços de um monge e disse-lhe que pagaria qualquer preço. O monge, necessitando de alimentos, perguntou a rainha se o pagamento poderia ser feito em grãos de trigo dispostos em um tabuleiro de damas, de forma que o primeiro quadrado tivesse apenas um grão, e os quadrados subseqüentes, o dobro do quadrado anterior. A rainha considerou o pagamento barato e pediu que o serviço fosse executado, porém, um dos cavaleiros que estava presente e entendia um pouco de matemática alertou-a que seria impossível executar o pagamento, pois a quantidade de grão seria muito alta. Curiosa, a rainha solicitou então a este cavaleiro que era bom em cálculo, que fizesse um programa que recebesse como entrada o número de quadrados a serem usados em um tabuleiro de damas e apresentasse a quantidade de kg de trigo correspondente, sabendo que cada 12 grãos do cereal correspondem a uma grama. Finalmente, o cálculo da quantidade deverá caber em um valor inteiro de 64 bits sem sinal.

### Entrada
A primeira linha de entrada contem um único inteiro N (1 ≤ N ≤ 100), indicando o número de casos de teste. Cada caso de teste contém um único inteiro X (1 ≤ X ≤ 64), indicando o número de casas do tabuleiro que serão utilizadas.

##Saída
Para cada caso de teste, imprima a quantidade de kgs de trigo que o monge esperava receber.

#### Exemplo de Entrada	
~~~~
3
7
19
14
~~~~
#### Exemplo de Saída
~~~~
0 kg
43 kg
1 kg
~~~~

#### Teste #1
~~~~
Dado de entrada:
9
0
8
16
24
32
40
48
56
64
Saída esperada:
0 kg
0 kg
5 kg
1398 kg
357913 kg
91625968 kg
23456248059 kg
6004799503160 kg
1537228672809129 kg
~~~~
#### Teste #2
~~~~
Dado de entrada:
9
12
13
14
15
16
17
18
19
20
Saída esperada:
0 kg
0 kg
1 kg
2 kg
5 kg
10 kg
21 kg
43 kg
87 kg
~~~~

### Código inicial dado na plataforma
````Java
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for(int i=0 ; i<n ; i++) {
			int x = sc.nextInt();
			System.out.printf(                     );   //Complete o código aqui.
		}
		sc.close();
	}
}
````

