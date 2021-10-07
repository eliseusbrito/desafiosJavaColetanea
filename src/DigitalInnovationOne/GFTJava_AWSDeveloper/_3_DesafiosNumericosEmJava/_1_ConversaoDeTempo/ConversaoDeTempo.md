## Conversão de Tempo
* Básico
* Princípios Básicos
### Desafio
Você terá o desafio de ler um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma loja, e informe-o expresso no formato horas:minutos:segundos.

### Entrada
O arquivo de entrada contém um valor inteiro N.

### Saída
Imprima o tempo lido no arquivo de entrada (segundos), convertido para horas:minutos:segundos, conforme exemplo fornecido.


#### Exemplo de Entrada	
~~~~
556
~~~~
#### Exemplo de Saída
~~~~
0:9:16
~~~~
#### Exemplo de Entrada
~~~~
1
~~~~
#### Exemplo de Saída 2
~~~~
0:0:1
~~~~

### Codigo inicial fornecido pela Dio
````java
import java.util.Scanner;

public class Main {
    //complete os espaços em branco com sua solução
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sec;
        sec = input.nextInt();
        int hour =     ;
        sec = sec-(         );

        int min =       ;
        sec = sec-(           );

        System.out.println(hour+":"+min+ ":"+sec);
    }
}
```
