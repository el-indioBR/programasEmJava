
//Programa para ler o arquivo texto contendo os 100 primeiros termos da serie
//1 5 9 13 17 ...
import java.io.FileReader;
import java.util.Scanner;

public class Le_os_100_Primeiros_Termos_da_Serie1_5_9_13_de_Arquivo_e_Exibe_na_Tela {
    public static void main(String[] args) {
        Scanner arquivo = null;
        try {
            FileReader in = new FileReader("C:/temp/100primeirostermosdaserie1_5_9_13.txt");
            arquivo = new Scanner(in);
            int dado;
            System.out.println("Conteúdo do arquivo\n");
            for (int i = 0; i < 100; i++) {
                dado = arquivo.nextInt();
                System.out.print("\t" + dado);
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            arquivo.close();
        }
    }
}