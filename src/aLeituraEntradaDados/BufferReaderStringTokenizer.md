## Utilizando BufferReader + StringTokenizer

Faz-se uma configuração inicial:
````Java
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
StringTokenizer st = new StringTokenizer(br.readLine());
````
Dentro das rotinas do programa inclui-se a leitura das linhas:
````Java
//Se contiver inteiro na linha
  int b = Integer.parseInt(st.nextToken());
//Se contiver Double na linha 
 
````

Abaixo exemplo de utilização:
````Java
import java.io.BufferedReader; 
import java.io.InputStreamReader; 
import java.io.IOException; 
import java.util.StringTokenizer; 

public class MinhaPrimeiraClasse { 

public static void main(String[] args) throws IOException { 
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    StringTokenizer st = new StringTokenizer(br.readLine()); 
    int a = Integer.parseInt(st.nextToken()); 
    int b = Integer.parseInt(st.nextToken()); 
    int total = a + b; 
    System.out.println("X = " + total); 
  } 

} 
````

* Exemplo de Entrada
~~~~
11 7
~~~~

Saída:
~~~~
X = 27
~~~~