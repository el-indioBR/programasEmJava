import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Contar_vogais_e_consoantes {

    // Ler uma frase qualquer do teclado e gravar em um arquivo do tipo texto
    // quantas vogais e quantas consoantes tem a frase lida.

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        PrintWriter arquivo = null;
        try {
            FileWriter out = new FileWriter("frasevogal.txt");
            arquivo = new PrintWriter(out);
            Scanner sc = new Scanner(System.in);
            int contavogal = 0;
            int contacansoante = 0;
            int tamanho;
            String frase;
            System.out.println("Digite uma frase: ");
            frase = sc.nextLine();
            System.out.println("A frase digitada foi: " + frase);
            tamanho = frase.length();
            for (int i = 0; i < tamanho; i++) {
                frase = frase.toLowerCase();
                char ch = frase.charAt(i);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    contavogal++;
                } else if (ch >= 'a' && ch <= 'z') {
                    contacansoante++;
                }
            }
            System.out.println("A frase digitada tem " + contavogal + " vogais" + "\t");
            System.out.println("A frase digitada tem " + contacansoante + " cansoantes" + "\t");
            arquivo.print(frase + "\t");
            arquivo.print("A frase digitada tem " + contavogal + " vogais" + "\t");
            arquivo.print("A frase digitada tem " + contacansoante + " cansoantes" + "\t");
            System.out.println("\nArquivo gravado\n");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            arquivo.close();
        }
    }
}