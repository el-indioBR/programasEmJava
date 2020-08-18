import java.util.Scanner;
class Algarismo_das_dezenas
{
   /**Programa para mostrar o algarismo das dezenas de um valor inteiro*/
   public static void main(String[] args)
   {
      //Declaração de variaveis
      int x, quo, dez;
      Scanner teclado = new Scanner(System.in);
      //Leitura de x
      System.out.print("digite valor de x : ");
      x = teclado.nextInt();
      quo = x;
      quo = quo / 10;
      dez = quo % 10;
      //Declaraçao do resultado
      System.out.print("Algarismo das dezenas de " + x + " = " + dez);
   }
}