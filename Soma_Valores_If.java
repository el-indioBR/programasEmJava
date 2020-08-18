import java.util.Scanner;
class Soma_Valores_If
//Programa para receber dois valores e realizar operaçoes aritmeticas
{
   public static void main(String[] args)
   {
      //Declaraçao de variaveis
      float valor_1,valor_2,resultado;
      int op;
      Scanner teclado = new Scanner(System.in);
      //Leitura dos valores
      System.out.print(" Digite o primeiro valor : ");
      valor_1 = teclado.nextFloat();
      System.out.print(" Digite o segundo valor : ");
      valor_2 = teclado.nextFloat();
      //Escolha das operaçoes
      System.out.println(" Informe qual operacao voce deseja : \n + = 1 \n - = 2 \n x = 3 \n / = 4 ");
      op = teclado.nextInt();
      //Estrutura condicional
      if(op == 1)
      {
        resultado = valor_1 + valor_2;
        System.out.println(" Soma :\n O resultado e = " + resultado);
      }
      if(op == 2)
      {
        resultado = valor_1 - valor_2;
        System.out.println(" Subtracao :\n O resultado e = " + resultado);
      }
      if(op == 3)
      {
        resultado = valor_1 * valor_2;
        System.out.println(" Multiplicacao :\n O resultado e = " + resultado);
      }
      if(op == 4)
      {
        resultado = valor_1 / valor_2;
        System.out.println(" Divisao :\n O resultado e = " + resultado);
      }



   }
} 