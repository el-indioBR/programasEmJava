import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Cadastro_com_Idade {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        try (PrintWriter arquivo = new PrintWriter(new FileWriter("Cadastro.txt", true))) {
            arquivo.println();
            System.out.print("Primeiro nome: ");

            arquivo.print(teclado.next() + " ");
            System.out.print("Último nome: ");
            arquivo.print(teclado.next() + " ");
            System.out.print("Idade: ");
            arquivo.print(teclado.nextInt());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}