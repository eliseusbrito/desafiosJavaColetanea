## Abreviando posts do blog
* Intermediário
* Strings

### Desafio
Leonardo é um nômade digital e viaja pelo mundo programando em diferentes cafés das cidades por onde passa. Recentemente, resolveu criar um blog, para compartilhar suas experiências e aprendizados com seus amigos.

Para criação do blog, ele optou por utilizar uma ferramenta pronta, que há um limite de caracteres que se pode escrever por dia, e Leonardo está preocupado que essa limitação, afinal, irá impedir de contar suas melhores experiências. Para contornar esse problema, decidiu usar um sistema de abreviação de palavras em seus posts.

O sistema de abreviações é simples e funciona da seguinte forma: para cada letra, é possível escolher uma palavra que inicia com tal letra e que aparece no post. Uma vez escolhida a palavra, sempre que ela aparecer no post, ela será substituída por sua letra inicial e um ponto, diminuindo assim o número de caracteres impressos na tela.

Por exemplo, na frase: “hoje eu programei em Python”, podemos escolher a palavra “programei” para representar a letra ‘p', e a frase ficará assim: “hoje eu p. em Python”, economizando assim sete caracteres. Uma mesma palavra pode aparecer mais de uma vez no texto, e será abreviada todas as vezes. Note que, se após uma abreviação o número de caracteres não diminuir, ela não deve ser usada, tal como no caso da palavra “eu” acima.

Leonardo precisa que seu post tenha o menor número de caracteres possíveis, e por isso pediu a sua ajuda. Para cada letra, escolha uma palavra, de modo que ao serem aplicadas todas as abreviações, o texto contenha o menor número de caracteres possíveis.

### Entrada
Haverá diversos casos de teste. Cada caso de teste é composto de uma linha, contendo uma frase de até 10⁴ caracteres. A frase é composta de palavras e espaços em branco, e cada palavra é composta de letras minúsculas ('a'-'z'), e contém entre 1 e 30 caracteres cada.

O último caso de teste é indicado quando a linha dada conter apenas um “.”, o qual não deverá ser processado.

### Saída
Para cada caso de teste, imprima uma linha contendo a frase já com as abreviações escolhidas e aplicadas.

Em seguida, imprima um inteiro N, indicando o número de palavras em que foram escolhidas uma letra para a abreviação no texto. Nas próximas N linhas, imprima o seguinte padrão “C. = P”, onde C é a letra inicial e P é a palavra escolhida para tal letra. As linhas devem ser impressas em ordem crescente da letra inicial.


#### Exemplo de Entrada	
~~~~
abcdef abc abc abc
.
~~~~
#### Exemplo de Saída
~~~~
a. abc abc abc
1
a. = abcdef
~~~~

### Informações Adicionais ao enunciado do desafio encontrado em outras fontes

**Mais de uma palavra com a mesma letra inicial:** Deve ser considerada a que der maior economia de caracteres

**Palavras Repetidas:** Deve ser mostrada somente uma vez na lista, mas na contagem de caracteres economizados deve ser considerado.

**Letra Inicial --> Palavras Repetidas x Palavra unica longa:** O programa deve considerar aquela que gere uma maior economia de caracteres

**Quando numero de caracteres economizados entre palavra atual 


### Links auxiliares
https://web.digitalinnovation.one/topics/desafio-abreviando-posts-do-blog-1?page=1&order=newest

### Desafio equivalente na URI
https://www.urionlinejudge.com.br/judge/en/problems/view/1519

https://www.urionlinejudge.com.br/judge/en/questions/view/1519/449

https://www.udebug.com/URI/1519

#### Exemplo de Entrada 2 
~~~~
hoje eu visitei meus pais
tive que lavar meu cachorro pois ele estava fedendo
.
~~~~
#### Exemplo de Saída 2
~~~~
h. eu v. m. p.
4
h. = hoje
m. = meus
p. = pais
v. = visitei
t. q. l. m. c. p. ele e. f.
8
c. = cachorro
e. = estava
f. = fedendo
l. = lavar
m. = meu
p. = pois
q. = que
t. = tive
~~~~

#### Exemplo de Entrada 3
~~~~
abcdef abc abc abcdefgh abcdef abc bdge
.
~~~~
#### Exemplo de Saída 3
~~~~
a. abc abc abcdefgh a. abc b.
2
a. = abcdef
b. = bdge
~~~~

#### Exemplo de Entrada 4
~~~~
aaaa aaaa a aaaaa
.
~~~~
#### Exemplo de Saída 4
~~~~
a. a. a aaaaa
1
a. = aaaa
~~~~

#### Exemplo de Entrada 5
~~~~
dwh t cohor dkvwcsg sqoqms b a
.
~~~~
#### Exemplo de Saída 5
~~~~
dwh t c. d. s. b a
3
c. = cohor
d. = dkvwcsg
s. = sqoqms
~~~~
#### Exemplo de Entrada 6
~~~~
abcd abc abc abc
.
~~~~
#### Exemplo de Saída 6
~~~~
abcd a. a. a.
1
a. = abc
~~~~~

#### Exemplo de Entrada 7
~~~~
hoje eu programei em python
.
~~~~
#### Exemplo de Saída 7
~~~~
h. eu p. em python
2
h. = hoje
p. = programei
~~~~

#### Exemplo de Entrada 8
~~~~
mara mara mara cada cada, caso
.
~~~~
#### Exemplo de Saída 8
~~~~
m. m. m. cada c. caso
2
c. = cada,
m. = mara
~~~~

#### Exemplo de Entrada 9
~~~~
abc abc abc abc abc abc abc abc abc abc abcd
abcdef abc abc abc
dwh t cohor dkvwcsg sqoqms b a
para para para cada cada, caso de teste imprima uma linha contendo a frase ja com as abreviacoesabreviacoesabreviac escolhidas e aplicadaspara
.
~~~~
#### Exemplo de Saída 9
~~~~
a. a. a. a. a. a. a. a. a. a. abcd
1
a. = abc
a. abc abc abc
1
a. = abcdef
dwh t c. d. s. b a
3
c. = cohor
d. = dkvwcsg
s. = sqoqms
p. p. p. cada cada, caso de t. i. u. l. c. a f. ja com as a. e. e aplicadaspara
9
a. = abreviacoesabreviacoesabreviac
c. = contendo
e. = escolhidas
f. = frase
i. = imprima
l. = linha
p. = para
t. = teste
u. = uma
~~~~