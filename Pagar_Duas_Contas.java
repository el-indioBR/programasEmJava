/* 
INICIO


FIM
*/

import java.util.Scanner;
class Pagar_Duas_Contas
/*Programa para receber o salario pague duas contas, sabendo que cada conta tem 2% de multa calcule e mostre
quanto restara do seu salario */
{
   public static void main(String[] args)
   {
      //Declaraçao de variaveis
      float salario, conta_1, conta_2, salario_final;
      Scanner teclado = new Scanner(System.in);
      //Leitura dos valores
      System.out.print(" Digite o valor do seu salario : ");
      salario = teclado.nextFloat();
      System.out.print(" Digite o valor da primeira conta : ");
      conta_1 = teclado.nextFloat();
      System.out.print(" Digite o valor da segunda conta : ");
      conta_2 = teclado.nextFloat();
      //Calculo das multas
      conta_1 = conta_1 + conta_1 * 2 / 100;
      conta_2 = conta_2 + conta_2 * 2/ 100;
      salario_final = (salario - conta_1) - conta_2;
      //Impressao do resultado
      System.out.println("\n O seu novo salario e de :R$ " + salario_final);
   }
}