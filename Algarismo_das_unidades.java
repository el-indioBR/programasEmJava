/*
INICIO
//Programa para mostrar o algarismo das unidades de um valor inteiro
//Declaração de variaveis
inteiro x, quo, uni;
//Leitura do valor de X
escreva("Digite o valor de X : ");
leia( x );
quo <- x;
uni <- quo % 10;
//Impressao dos resultados 
escreva("Algarismo das unidades de ", X, " = ", uni);
FIM
*/
import java.util.Scanner;
class Algarismo_das_unidades
{
   /**Programa para mostrar o algarismo das unidades de um valor inteiro*/
   public static void main(String[] args)
   {
      //Declaração de variaveis
      int x, quo, uni;
      Scanner teclado = new Scanner(System.in);
      //Leitura do valor de X
      System.out.print("Digite o valor de X : ");
      x = teclado.nextInt();
      quo = x;
      uni = quo % 10;
      //Impressao do resultado
      System.out.println("\nAlgarismo das unidades de " + x + " = " + uni);
   }
}