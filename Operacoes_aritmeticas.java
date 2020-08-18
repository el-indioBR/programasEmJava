/*
INICIO
   //Algoritmo para efetuar operacoes aritmeticas basicas c/inteiros
      inteiro x, y, soma, subtracao, multiplicacao, divisao, resto;
   //Leitura do valor de X
      escreva("Digite o valor de X : ");
      leia(x);
   //Realizando as operacoes
      soma <- x + y;
      subtracao <- x - y;
      multiplicacao <- x * y;
      divisao <- x / y;
      resto x % y;
   //Impressao dos resultados 
      escreva("Resultado da soma : " + soma);
      escreva("Resultado da subtracao : " + subtracao); 
      escreva("Resultado da multiplicacao : " + multiplicacao);      
      escreva("Resultado da divisao : " + multiplicacao);
      escreva("Resultado da resto : " + resto);

FIM
*/

import java.util.Scanner;
class Operacoes_aritmeticas
{
   /**Programa para efetuar operações aritmeticas basicas c/ inteiros */
   public static void main(String[] args)
   {
      //Declaração de variaveis
      int x, y, soma, sub, mult, div, resto;
      Scanner teclado = new Scanner(System.in);
      //Leitura do valor de x
      System.out.print("Digite o valor de x : ");
      x = teclado.nextInt();
      //Leitura do valor de y
      System.out.print("Digite o valor de y : ");
      y = teclado.nextInt();
      soma = x + y ;
      sub = x - y;
      mult = x * y;
      div = x / y;
      resto = x % y;
      // impressao dos resultados
      System.out.println("\nResultado da soma = " + soma);
      System.out.println("\nResultado da subtracao = " + soma);
      System.out.println("\nResultado do produto = " + soma);
      System.out.println("\nResultado da divisao = " + soma);
      System.out.println("\nResultado do resto = " + soma);
   }
}