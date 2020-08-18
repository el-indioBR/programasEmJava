
//Programa para gravar em arquivo texto os 100 primeiros termos da serie
//1 5 9 13 17 21 ...
import java.io.FileWriter;
import java.io.PrintWriter;

public class Grava_os_100_Primeiros_Termos_da_Serie_1_5_9_13_17_em_Arquivo_Texto {
    public static void main(String[] args) {
        PrintWriter arquivo = null;
        try {
            FileWriter out = new FileWriter("C:/temp/100primeirostermosdaserie1_5_9_13.txt");
            arquivo = new PrintWriter(out);
            int x = 1;
            for (int i = 1; i <= 100; i++) {
                arquivo.print(x + "\t");
                x = x + 4;
            }
            System.out.println("\nArquivo gravado\n");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            arquivo.close();
        }
    }
}