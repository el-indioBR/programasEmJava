/**
1- Pegar 3 notas e fazer a média
INICIO
// declarar as variaveis 
inteiro n1, n2, n3, p1, p2, p3, soma, media;
escreva("Informe a primeira nota");
leia(n1);
escreva("Informe o primeiro peso");
leia(p1);
escreva("Informe a segunda nota");
leia(n2);
escreva("Informe o segundo peso");
leia(p2);
escreva("Informe a terceira nota");
leia(n3);
escreva("Informe o terceiro peso");
leia(p3);
soma = (p1 + p2 + p3);
media = ((n1 * p1) + (n2 * p2) + (n3 * p3))/soma
//Impressao dos resultados
escreva("A média é : ", media);
FIM
*/

import java.util.Scanner;
class Media_Ponderada_3_notas
{
   public static void main(String[] args)
   {
      //Declaração de variaveis 
      int n1, p1, n2, p2, n3, p3, soma, media;
      Scanner teclado = new Scanner(System.in);
      //Leitura das notas
      System.out.print("Digite a primeira nota : ");
      n1 = teclado.nextInt();
      System.out.print("Digite o primeiro peso : ");
      p1 = teclado.nextInt();
      System.out.print("Digite a segunda nota : ");
      n2 = teclado.nextInt();
      System.out.print("Digite o segundo peso : ");
      p2 = teclado.nextInt();
      System.out.print("Digite a terceira nota : ");
      n3 = teclado.nextInt();
      System.out.print("Digite o terceiro peso : ");
      p3 = teclado.nextInt();
      soma = (p1 + p2 + p3);
      media = ((n1 * p1) + (n2 * p2) + (n3 * p3)) / soma;
      //Impressao do resultado
      System.out.println("\nA média é : " + media);
   }
}