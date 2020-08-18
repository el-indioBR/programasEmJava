/**
INICIO 
//Declaração de variaveis
inteiro v1, v2, v3, v4, soma;
//Leitura dos valores
escreva("Informe o primeiro valor");
leia(v1);
escreva("Informe o segundo valor");
leia(v2);
escreva("Informe o terceiro valor");
leia(v3);
escreva("Informe o quarto valor");
leia(v4);
soma = (v1 + v2 + v3 + v4);
//Impressao do resultado
escreva("A soma é : ", soma);
FINAL
*/
import java.util.Scanner;
class Soma_4_Valores
{
//Programa que soma 4 valores 
   public static void main(String[] args)
   {
      //Declaração de variaveis
      int v1, v2, v3, v4, soma;
      Scanner teclado = new Scanner(System.in);
      //Leitura dos valores
      System.out.print(" Digite o primeiro valor : ");
      v1 = teclado.nextInt();
      System.out.print(" Digite o segundo valor : ");
      v2 = teclado.nextInt();
      System.out.print(" Digite o terceiro valor : ");
      v3 = teclado.nextInt();
      System.out.print(" Digite o quarto valor : ");
      v4 = teclado.nextInt();
      soma = (v1 + v2 +v3 +v4);
      //Impressao dos resultados
      System.out.println("\n O resultado é : " + soma);
   }
}