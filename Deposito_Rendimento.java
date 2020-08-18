/**
INICIO
//Declaraçao de variaveis
real deposito, juros, rendimento 


FIM
*/

import java.util.Scanner;
class Deposito_Rendimento
/*Programa para receber o valor de um deposito e o valor da taxa de juros, calcular e mostrar o valor do rendimento e o
valor total depois do rendimento*/
{
   public static void main(String[] args)
   {
      //Declaraçao de variaveis
      float deposito, juros, rendimento, total_dinheiro;
      Scanner teclado = new Scanner(System.in);
      //Leitura dos valores 
      System.out.print(" Digite o valor do deposito : ");
      deposito = teclado.nextFloat();
      System.out.print(" Digite o valor dos juros : ");
      juros = teclado.nextFloat();
      // Calculo do rendimento
      rendimento = deposito * juros / 100;
      total_dinheiro = deposito + rendimento;
      //Impressao dos resultados
      System.out.println(" \n O rendimento foi de : " + rendimento + " e o valor final e de : " + total_dinheiro);
   }
}