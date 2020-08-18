import java.util.Scanner;
class Algarismo_das_centenas
{
   /**Programa para mostrar o algarismo das centenas de um valor inteiro*/
   public static void main(String[] args)
   {
      //Declaração de variaveis
      int x, quo, cen;
      Scanner teclado = new Scanner(System.in);
      //Leitura do valor X
      System.out.print("Digite o valor de X : ");
      x = teclado.nextInt();
      quo = x;
      quo = quo / 100;
      quo = quo / 10;
      cen = quo % 10;
      //Impressao de Resultado 
      System.out.println("\n Algarismo das centenas de " + cen);
   }
}