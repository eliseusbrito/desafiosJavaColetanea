## Leitura utilizando o BufferedReader

Faz-se uma configuração inicial:
````Java
BufferedReader in;
StringBuilder out = new StringBuilder();
File file = new File("in");
if (file.exists())
  in = new BufferedReader(new FileReader(file));
else
  in = new BufferedReader(new InputStreamReader(System.in));
````
Dentro das rotinas do programa inclui-se a leitura das linhas:
````Java
//Se contiver inteiro na linha
 int n = parseInt(in.readLine());
//Se contiver Double na linha 
 Double gasto = parseDouble(in.readLine());
````
Abaixo exemplo de utilização:
````Java
public class BufferReader {

    public static void main(String[] args) throws IOException {
        BufferedReader in;
        StringBuilder out = new StringBuilder();
        File file = new File("in");
        if (file.exists())
            in = new BufferedReader(new FileReader(file));
        else
            in = new BufferedReader(new InputStreamReader(System.in));
        Double totalKg = 0.00;
        Double totalGasto = 0.00;
        int n = parseInt(in.readLine());
        for (int i = 1; i <= n; i++) {
            Double gasto = parseDouble(in.readLine());
            int numProduto = in.readLine().split(" ").length;
            System.out.println("day " + i + ": " + numProduto + " kg");
            totalKg = numProduto + totalKg;
            totalGasto += gasto;
        }
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println(df.format(totalKg / n) + " kg by day");
        System.out.println("R$ " + df.format(totalGasto / n) + " by day");
    }
}
````
Exemplo de Entrada:
~~~~
3
9.58
Mamao Maca Melao
2.65
Melancia
9.54
Pera Uva Goiaba
~~~~
Saída:
~~~~
day 1: 3 kg
day 2: 1 kg
day 3: 3 kg
2.33 kg by day
R$ 7.26 by day
~~~~
