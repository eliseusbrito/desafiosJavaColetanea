## Tamanho da Placa
* Intermediário
* Princípios Básicos
### Desafio
Após uma famosa indústria produtora de equipamentos musicais inovar no mercado constantemente, eles chegaram ao ponto de iniciar a criação de pedais de efeitos para guitarra a partir do desenvolvimento de um protótipo 3D e interativo criado por um usuário, com direito às mais diversas ferramentas costumizadoras, inclusive com sons, simulando o pedal real. E após o cliente gerar seu modelo virtual, ele o enviava à indústria para ser fabricada.

Acontece que para ser fabricado, o circuito do pedal é impresso em uma PCI(placa de circuito impresso) de tamanho limitado e como a criatividade dos clientes é ilimitada, e um tanto extravagante, as placas estão tomando dimensões inimagináveis, impossibilitando a fabricação. E sobrou para você, exímio programador e talvez amante de música, a desenvolver um programa que informe ao cliente se o que ele está imaginando está ou não disponível na placa usada pela indústria.

### Entrada
A primeira linha de cada caso de teste consiste de três inteiros X, Y, M (M≤105) representando respectivamente as dimensões da placa da empresa e a quantidade de pedidos. Para cada uma das próximas M linhas será fornecido dois inteiros Xi e Yi representando as dimensões da PCI do cliente.

As dimensões sempre serão valores inteiros maiores que 0 e menor ou igual a 64.

### Saída
Para cada circuito determine se é possível utilizar a PCI da empresa ou não.


### Exemplo de Entrada	
~~~~
10 10 3
5 5
10 10
5 25
2 3 1
3 2
~~~~
### Exemplo de Saída
~~~~
Sim
Sim
Nao
Sim
~~~~

### Codigo Inicial fornecido pela plataforma DIO
````java
import java.io.IOException;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		while (leitor.hasNext()) {
			int X = leitor.nextInt();
			int Y = leitor.nextInt();
			int M = leitor.nextInt();
			for (int i = 0; i < M; i++) {
				int Xi = leitor.nextInt();
				int Yi = leitor.nextInt();
				if ((            ) || (              ) || (                     ))   //implemente sua lógica nos espaços em branco
					System.out.println("       ");
				else
					System.out.println("    ");
			}
		}
	}
	
}
````

### Testes

#### Teste #1
~~~~
Dado de entrada:
16 49 348
54 53
5 8
51 36
54 47
22 31
34 8
63 54
61 7
30 30
40 38
61 3
21 26
1 32
43 6
44 12
44 47
39 23
21 49
63 21
5 48
45 58
34 17
26 39
56 41
34 4
36 53
24 15
49 12
11 52
64 19
8 29
45 48
32 11
47 1
44 38
64 13
14 17
63 58
57 2
18 1
51 17
15 32
25 14
29 15
36 24
22 52
44 43
48 26
42 58
29 32
2 62
47 46
1 13
64 45
35 46
17 56
24 44
49 13
7 41
33 9
20 53
53 19
30 31
61 23
12 11
37 54
10 5
26 59
14 21
46 18
32 20
62 52
25 62
18 38
43 8
4 35
33 51
37 23
40 33
28 13
15 39
16 43
11 37
8 29
62 18
17 15
57 27
33 31
63 46
57 18
11 17
16 5
21 57
45 39
18 24
21 38
58 54
38 39
13 3
3 58
24 44
49 13
53 44
1 32
17 37
48 56
49 47
11 24
55 48
22 45
34 45
47 9
21 31
47 18
25 10
17 60
36 10
22 52
28 46
39 30
23 10
61 2
37 8
62 2
16 63
41 16
34 7
51 29
40 11
50 21
54 31
59 9
43 20
7 45
54 10
28 3
25 6
41 23
45 5
49 45
39 15
43 56
25 15
41 12
60 33
57 22
44 45
9 11
52 52
14 30
12 40
38 54
32 1
59 31
19 13
43 63
4 7
39 13
16 44
25 61
24 10
10 62
4 26
2 40
8 15
49 48
37 47
13 31
51 34
61 2
31 9
54 34
48 16
36 54
14 7
11 24
4 45
46 54
5 14
48 10
45 16
57 12
10 8
27 38
27 18
53 40
23 32
24 61
49 18
41 30
27 7
7 5
9 51
45 37
55 50
25 24
45 28
46 24
2 26
22 51
31 56
45 57
5 59
26 56
18 52
63 42
63 21
20 44
46 4
14 50
35 46
6 58
16 30
23 62
21 14
8 46
7 61
43 29
48 1
4 59
24 31
46 3
3 25
59 53
59 7
27 7
16 41
63 23
28 60
61 37
11 11
55 63
27 8
56 60
33 27
30 45
13 58
62 17
46 58
4 8
57 37
26 11
6 12
11 25
27 30
41 53
45 58
44 14
36 2
27 63
31 49
48 56
56 46
55 60
9 33
55 14
47 5
20 37
13 62
52 39
20 45
33 21
2 2
46 3
41 18
30 12
50 42
1 3
33 34
32 45
27 53
27 45
37 16
17 63
46 40
64 41
16 17
45 47
19 13
7 7
50 33
7 12
34 46
26 55
17 63
2 10
44 31
58 14
35 45
25 64
48 50
56 8
22 49
23 42
38 64
61 64
8 23
31 40
56 39
3 58
15 45
37 61
4 6
26 26
50 5
51 16
28 3
36 42
46 54
38 46
5 5
25 24
50 27
46 6
59 59
4 53
35 19
17 44
44 19
4 55
25 63
40 23
56 3
12 56
32 7
33 35
56 4
35 53
56 22
60 16
52 18
37 16
22 25
14 1
43 45
64 15
33 4
1 61
14 27
55 26
53 13
17 50
5 36
35 1
35 47
16 45
41 21
45 52
Saída esperada:
Nao
Sim
Nao
Nao
Nao
Sim
Nao
Nao
Nao
Nao
Nao
Nao
Sim
Sim
Sim
Nao
Nao
Nao
Nao
Sim
Nao
Nao
Nao
Nao
Sim
Nao
Sim
Sim
Nao
Nao
Sim
Nao
Sim
Sim
Nao
Nao
Sim
Nao
Nao
Sim
Nao
Sim
Sim
Sim
Nao
Nao
Nao
Nao
Nao
Nao
Nao
Nao
Sim
Nao
Nao
Nao
Nao
Sim
Sim
Sim
Nao
Nao
Nao
Nao
Sim
Nao
Sim
Nao
Sim
Nao
Nao
Nao
Nao
Nao
Sim
Sim
Nao
Nao
Nao
Sim
Sim
Sim
Sim
Sim
Nao
Sim
Nao
Nao
Nao
Nao
Sim
Sim
Nao
Nao
Nao
Nao
Nao
Nao
Sim
Nao
Nao
Sim
Nao
Sim
Nao
Nao
Nao
Sim
Nao
Nao
Nao
Sim
Nao
Nao
Sim
Nao
Sim
Nao
Nao
Nao
Sim
Nao
Sim
Nao
Nao
Sim
Sim
Nao
Sim
Nao
Nao
Nao
Nao
Sim
Nao
Sim
Sim
Nao
Sim
Nao
Sim
Nao
Sim
Sim
Nao
Nao
Nao
Sim
Nao
Sim
Sim
Nao
Sim
Nao
Sim
Nao
Sim
Sim
Sim
Nao
Sim
Nao
Sim
Sim
Sim
Nao
Nao
Sim
Nao
Nao
Sim
Nao
Sim
Nao
Sim
Sim
Sim
Nao
Sim
Sim
Sim
Nao
Sim
Nao
Nao
Nao
Nao
Nao
Nao
Nao
Sim
Sim
Nao
Nao
Nao
Nao
Nao
Nao
Sim
Nao
Nao
Nao
Nao
Nao
Nao
Nao
Nao
Nao
Sim
Nao
Nao
Nao
Sim
Nao
Sim
Sim
Nao
Nao
Sim
Nao
Nao
Sim
Sim
Nao
Nao
Sim
Sim
Nao
Nao
Nao
Sim
Nao
Sim
Nao
Nao
Nao
Nao
Nao
Nao
Sim
Nao
Sim
Sim
Sim
Nao
Nao
Nao
Sim
Sim
Nao
Nao
Nao
Nao
Nao
Sim
Nao
Sim
Nao
Nao
Nao
Nao
Nao
Sim
Sim
Nao
Sim
Nao
Sim
Nao
Nao
Nao
Nao
Sim
Nao
Nao
Nao
Sim
Nao
Sim
Sim
Nao
Sim
Nao
Nao
Nao
Sim
Nao
Nao
Nao
Nao
Nao
Nao
Nao
Nao
Nao
Nao
Sim
Nao
Nao
Nao
Sim
Nao
Sim
Nao
Nao
Nao
Sim
Nao
Nao
Nao
Sim
Nao
Nao
Sim
Nao
Nao
Nao
Nao
Nao
Nao
Nao
Nao
Nao
Nao
Sim
Nao
Nao
Nao
Nao
Nao
Nao
Sim
Nao
Sim
Nao
Nao
Sim
Nao
Sim
Nao
Nao
Nao
Sim
Sim
Nao
Sim
Nao
Nao
~~~~
#### Teste #2
~~~~
Dado de entrada:
10 10 5
11 10
10 11
9 10
10 9
10 10
Saída esperada:
Nao
Nao
Sim
Sim
Sim
~~~~ 

