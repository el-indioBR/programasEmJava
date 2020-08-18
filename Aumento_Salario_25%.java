/** 
INICIO
//Programa para receber o salario e mostrar o novo salario com um aumento de 25%
//Declaração de variaveis
real salario, salario_novo;
//Leitura do salario
escreva(" Digite o seu salario ");
leia(salario);
salario_novo = salario + salario * 25 / 100;
//Impressao do resultado
escreva(" O novo slario é de : ", salario_novo);
FIM
*/
import java.util.Scanner;
class Aumento_Salario_25
//Programa para receber o salario e mostrar o novo salario com um aumento de 25%
{
   public static void main(String[] args)
   {
      //Declaração de variaveis
      float salario, salario_novo;
      Scanner teclado = new Scanner(System.in);
      //Leitura do salario
      System.out.print(" Digite o seu salario : ");
      salario = teclado.nextFloat();
      salario_novo = salario * 25 / 100;
      salario_novo = salario_novo + salario;
      //salario_novo = salario + salario * 25 / 100;
      System.out.println("\n Seu novo salario é de : " + salario_novo);
   }
}