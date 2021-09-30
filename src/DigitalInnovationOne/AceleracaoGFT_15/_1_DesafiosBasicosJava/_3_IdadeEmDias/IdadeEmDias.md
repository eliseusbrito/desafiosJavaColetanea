## Idade em Dias
* Básico
* Princípios Básicos

### Desafio
Você terá o desafio de ler um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, meses e dias

Obs.: apenas para facilitar o cálculo, considere todo ano com 365 dias e todo mês com 30 dias. Nos casos de teste nunca haverá uma situação que permite 12 meses e alguns dias, como 360, 363 ou 364.

### Entrada
O arquivo de entrada contém um valor inteiro.

### Saída
Imprima a saída conforme exemplo fornecido.


#### Exemplo de Entrada	#### Exemplo de Saída
~~~~
400
~~~~
#### Exemplo de Saída
~~~~
1 ano(s)
1 mes(es)
5 dia(s)
~~~~



````java
import java.io.IOException;
import java.util.Scanner;

public class Idade {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int idadeDias = leitor.nextInt();
        int anos = idadeDias / 365;
        idadeDias -=    * 365 //implemente no espaço em branco
        int meses = idadeDias / 30;
        idadeDias -=    * 30;  //implemente no espaço em branco
        int dias = idadeDias;
        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");
    }
	
}
