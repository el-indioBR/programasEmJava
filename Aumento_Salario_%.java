/* 
INICIO
//Programa para receber o salario e o percentual de aumento, calcular e mostrar o valor do aumento e do novo salario
//Declaraçao de variaveis
inteiro sal, per, novo_salario
//Leitura dos valores
escreva(" Informe o seu salario ")
leia(salario)
escreva(" Digite o percentual de aumento ")
leia(per);
novo_salario = salario + salario * per/100
/Impressao do resultado
escreva(" Voce teve um aumento de : " , per, " % no seu lario, resultando em um novo salario de : ", novo_salario)
FIM
*/

import java.util.Scanner;
class Aumento_Salario_
//Programa para receber o salario e o percentual de aumento, calcular e mostrar o valor do aumento e do novo salario
{
   public static void main(String[] args)
   {
      //Declaraçao de variaveis
      float salario, percentual, novo_salario;
      Scanner teclado = new Scanner(System.in);
      //Leitura dos valores
      System.out.print(" Digite o seu salario : ");
      salario = teclado.nextFloat();
      System.out.print(" Digite o percentual de aumento : ");
      percentual = teclado.nextFloat();
      novo_salario = salario + salario * percentual/100;
      //Impressoa do resultado
      System.out.println("\n O seu percentual de aumento e de : " + percentual + "% , e seu novo salario e de : " + novo_salario);
   }
}
