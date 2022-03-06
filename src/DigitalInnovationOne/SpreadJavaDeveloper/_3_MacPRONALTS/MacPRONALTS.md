## MacPRONALTS

* Básico
* Princípios Básicos

O MacPRONALTS está com uma super promoção, exclusivo para os competidores da primeira Seletiva do MaratonaTEC. Só que teve um problema, todos os maratonistas foram tentar comprar ao mesmo tempo, com isso gerou uma fila muito grande. O pior é que a moça do caixa estava sem calculadora ou um programa para ajudá-la a calcular com maior agilidade, eis que surge você para fazer um programa para ajudar a coitada e aumentar a renda do MacPRONALTS. Segue o cardápio do dia contendo o número do produto e seu respectivo valor.

1001 | R$ 1.50

1002 | R$ 2.50

1003 | R$ 3.50

1004 | R$ 4.50

1005 | R$ 5.50

### Entrada
A primeira entrada informada é a quantidade de produtos comprados (1 <= p <= 5). Para cada produto segue a quantidade (1 <= q <= 500) que o consumidor comprou.

Obs.: não poderão ser informados números de produtos repetidos.

### Saída
Você deve imprimir o valor da compra com duas casas decimais.


#### Input Sample 1	
~~~~
2

1001 2

1005 3
~~~~
#### Output Sample 1
~~~~
19.50
~~~~

#### Input Sample 2
~~~~
1

1003 500
~~~~
#### Output Sample 2
~~~~
1750.00
~~~~
#### Input Sample 3
~~~~
5

1001 500

1005 300

1003 23

1002 52

1004 44
~~~~
#### Output Sample 3
~~~~
2808.50
~~~~

I Seletiva MaratonaTEC - Maratona de Programação PRONATEC - UNIME


#### Código inicial dado na plataforma
````Java
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int produtos=0, quantidade=0;
		double res=0, valor=0;
		int N = Integer.parseInt(sc.nextLine());
		
		for (int x=0 ; x<N ; x++){
			produtos = sc.nextInt();
			quantidade  = sc.nextInt();
			
			if (produtos == 1001)
				valor = 1.50;
			else if (        )
				valor =     ;
			else if (produtos ==      )
				valor =       ;
			else if (produtos ==      )                  //complete o código nos espaços em branco
				valor =    ;
			else if (produtos ==      )
				valor =        ;
			
			res += valor * quantidade;
		}
		System.out.printf("%.2f\n",res);
		sc.close();
	}
}
````