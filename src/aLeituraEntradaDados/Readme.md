## Índice

- [Índice](#índice)
- [Tipos de Entrada de Dados](#tipos-de-entrada-de-dados)
  - [Classe Scanner](#classe-scanner)
  - [Classe BufferedReader e StringTokenizer](#classe-bufferedreader-e-stringtokenizer)
- [Scanner vs. BufferedReader](#scanner-vs-bufferedreader)
- [Exemplos de Necessidade e Utilização](#exemplos-de-necessidade-e-utilização)
  - [1) Dois números em linhas diferentes](#1-dois-números-em-linhas-diferentes)
    - [Exemplo de Entrada](#exemplo-de-entrada)
  - [2) Dois números na mesma linha](#2-dois-números-na-mesma-linha)
    - [Exemplo de Entrada](#exemplo-de-entrada-1)
    - [Links](#links)

## Tipos de Entrada de Dados

O Java utiliza principalmente as classes Scanner e BufferReader/StringTokenizer para fazer a leitura de dados. 


### Classe Scanner 

```Scanner sc = new Scanner(System.in);```

A simple text scanner which can parse primitive types and strings using regular expressions.
A Scanner breaks its input into tokens using a delimiter pattern, which by default matches whitespace. The resulting tokens may then be converted into values of different types using the various next methods.

Esta classe tem vários métodos que auxiliam neste trabalho, sendo os principais listados abaixo:

``` sc.nextInt()``` utilizado para entrada do próximo Inteiro;<br>
``` sc.nextDouble()``` utilizado para entrada do próximo Double;<br>
``` sc.next()``` utilizado para entrada do próximo String;<br>
```sc.nextLine()``` utilizado para ler a linha inteira como um String<br>
```sc.hasNextInt()``` retorna um boolean quando o proximo token é um inteiro <br> 
```sc.hasNextDouble()``` retorna um boolean quando o proximo token é um double<br>
```sc.hasNext()``` retorna um boolean quando existe um proximo token<br>
```sc.hasNextLine()``` retorna um boolean quando tem uma próxima linha de entrada do scanner<br>

Os valores de entrada podem estar em uma linha ou em várias linhas ou ambos

Exemplo de Entrada
```
15 36 4 a 5
4
Casa
5 Branca
90 5
Fim
```
Exemplo em src/aLeituraEntradaDados/xScanner.java

:book: [Índice](#índice)

### Classe BufferedReader e StringTokenizer
Outra forma de entrada é utilizando a classe **BufferedReader** e **StringTokenizer**;

````
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
StringTokenizer st = new StringTokenizer(br.readLine());
````
- The BufferedReader Reads text from a character-input stream, buffering characters so as to provide for the efficient reading of characters, arrays, and lines.<br>
- The StringTokenizer class allows an application to break a string into tokens.

A classe StringTokenizer usa basicamente o Token para ler a entrada na forma de String:
````st.nextToken()````
Para passar para primitivos é necessário fazer o parse:

```` int a = Integer.parseInt(st.nextToken());````

:book: [Índice](#índice)

## Scanner vs. BufferedReader

Scanner é usado para analisar os tokens do conteúdo do stream, enquanto o BufferedReader apenas lê o stream e não faz nenhuma análise especial.

Na verdade, você pode passar um BufferedReader para um scanner como a fonte de caracteres a analisar.

https://www.docow.com/2616/scanner-vs-bufferedreader.html
https://qastack.com.br/programming/2231369/scanner-vs-bufferedreader
https://www.guj.com.br/t/bufferedreader-vs-scanner/115375

:book: [Índice](#índice)

## Exemplos de Necessidade e Utilização

### 1) Dois números em linhas diferentes

#### Exemplo de Entrada
~~~~
3
9
~~~~

Exemplo de Solução com BufferedReader:
- src/DigitalInnovationOne/JavaDeveloper/_1_IntroducaoAProgramacaoComJava/_2_MultiplicacaoSimples/MultiplicacaoSimples.java<br>
[Multiplicação Simples no Git](https://github.com/eliseusbrito/desafiosJavaColetanea/blob/master/src/DigitalInnovationOne/JavaDeveloper/_1_IntroducaoAProgramacaoComJava/_2_MultiplicacaoSimples/MultiplicacaoSimples.java)

Exemplo de solução com Scanner:
- src/DigitalInnovationOne/JavaDeveloper/_1_IntroducaoAProgramacaoComJava/_2_MultiplicacaoSimples/MultiplicacaoSimplesScanner.java<br>
[Multiplicação Simples com Scanner no Git](https://github.com/eliseusbrito/desafiosJavaColetanea/blob/master/src/DigitalInnovationOne/JavaDeveloper/_1_IntroducaoAProgramacaoComJava/_2_MultiplicacaoSimples/MultiplicacaoSimplesScanner.java)

Observações:
- 1) Sugerido pela DIO utilizar BufferedReader; 
- 2) No entanto com Scanner fica mais simples(clean) o programa;
- 3) Com Scanner é o mesmo programa caso a entrada seja os dados na mesma linha;  

:book: [Índice](#índice)

### 2) Dois números na mesma linha

#### Exemplo de Entrada
~~~~
11 7
~~~~

Exemplo de Solução com BufferedReader:
- src/DigitalInnovationOne/JavaDeveloper/_1_IntroducaoAProgramacaoComJava/_1_VisitaNaFeira/VisitaNaFeira.java<br>
[Visita na Feira Git](https://github.com/eliseusbrito/desafiosJavaColetanea/blob/master/src/DigitalInnovationOne/JavaDeveloper/_1_IntroducaoAProgramacaoComJava/_1_VisitaNaFeira/VisitaNaFeira.java)

Exemplo de solução com Scanner:
- src/DigitalInnovationOne/JavaDeveloper/_1_IntroducaoAProgramacaoComJava/_1_VisitaNaFeira/VisitaNaFeiraScanner.java<br>
[Visita na Feira com Scanner no Git](https://github.com/eliseusbrito/desafiosJavaColetanea/blob/master/src/DigitalInnovationOne/JavaDeveloper/_1_IntroducaoAProgramacaoComJava/_1_VisitaNaFeira/VisitaNaFeiraScanner.java)

Observações:
- 1) Sugerido pela DIO utilizar BufferedReader;
- 2) No entanto com Scanner fica mais simples(clean) o programa;
- 3) Com Scanner é o mesmo programa caso a entrada seja os dados em duas linhas diferentes;

:book: [Índice](#índice)


## Links

Entrada e Saída de Arquivos (IO)

https://www.youtube.com/playlist?list=PLPFhNx6dMDJpLhlyMOTO8fIzmMaoHqvBl

:book: [Índice](#índice)