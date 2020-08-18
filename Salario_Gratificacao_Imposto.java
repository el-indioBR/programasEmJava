/** 
INICIO
//Declaraçao de variaveis
real salario, novo_salario, imposto, gratificacao;
//Leitura dos valores
escreva("Informe o valor do seu salario");
leia(salario);
gratificacao = salario * 5/100;
imposto = salario * 7/100;
novo_salario = salario + gratificacao - imposto;
//Impressao dos resultados
escreva(" O seu novo salario e de : ", novo_salario);
FIM
*/
import java.util.Scanner;
class Salario_Gratificaca_Imposto
//Programa para receber o salario base e mostrar o novo salario sabendo que ele recebe uma gratificaçao de 5% e paga um imposto de 7%
{
   public static void main(String[] args)
   {
      //Declaraçao de variaveis
      float salario, novo_salario, gratificacao, imposto;
      Scanner teclado = new Scanner(System.in);
      //Leitura dos valores
      System.out.print(" Informe o valor do seu salario : ");
      salario = teclado.nextFloat();
      //Calculo do salario
      gratificacao = salario * 5 / 100;
      imposto = salario * 7 / 100;
      novo_salario = salario + gratificacao - imposto;
      //Impressao do resultado
      System.out.println("\n Seu novo salario e de : " + novo_salario);
   }
}