## Entrada de dados via Leitura de um arquivo txt 


Utiliza-se um arquivo txt como forma de entrada de dados.

Funciona quando se utiliza uma IDE(IntelliJ, etc). No entanto, quando utiliza-se em plataformas tipo a URIJudge e DIO elas não funcionam porque a própria plataforma faz a leitura simulando este arquivo txt.

Defini-se uma variável com o nome do arquivo:
````Java
String nome = "C:/temp/livros.txt";
````
Utiliza-se o comando System.setIn para fazer a leitura do arquivo:
````Java
System.setIn(new FileInputStream(new File(nome)));
````
Abaixo exemplo de utilização(Programa lê arquivo txt e classifica em ordem crescente
(valido somente codigos na forma xxxx e números com um digito siginifica outra coleção
reiniciando a classificação):


````Java
public class ArquivoTexto {

    public static void main(String[] args) throws IOException {
        /*Estas linhas são necessárias quando utilizado com IDEs(IntelliJ, etc)
        String nome = "c:/temp/livros.txt";
        try {
            System.setIn(new FileInputStream(new File(nome)));
        } catch (
                FileNotFoundException e) {
            System.out.println("Arquivo não encontrado");
        }
        */ Quando utilizado em plataformas tipo a URI e DIO elas devem ser retiradas pois não são necessárias
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        List<String> sortedList;
        while (sc.hasNext()) {
            int numeroLivros = sc.nextInt();
            for (int i = 0; i < numeroLivros; i++) {
                String codigos = sc.next();
                list.add(codigos);
            }
            sortedList = list.stream().sorted().collect(Collectors.toList());
            for (int i = 0; i < sortedList.size(); i++) {
                System.out.println(sortedList.get(i));
            }
            list.clear();
        }

    }
}

````

Referencia --> C:\Users\eliseu.brito\OneDrive\_Programacao\Java\Cursos\Realizados\MaisPraTiJava\ProgramsIntelliJ\Modulo1\Desafios\2137_ABibliotecaDoSenhorSeverino) .

* Conteudo do arquivo livros.txt
~~~~
3
1233
0015
0100
7
0752
1110
0001
6322
8000
6321
0000
~~~~

* Saída
  ~~~~
  0015
  0100
  1233
  0000
  0001
  0752
  1110
  6321
  6322
  8000
  ~~~~