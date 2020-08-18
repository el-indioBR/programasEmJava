/**
1- Pegar 3 notas e fazer a média
INICIO
// declarar as variaveis 
inteiro n1, n2, n3, m;
escreva("Informe a primeira nota");
leia(n1);
escreva("Informe a segunda nota");
leia(n2);)
escreva("Informe a terceira nota");
leia(n3);
m = ((n1 + n2 + n3)/3);
//Mostrar o resultado
escreva("A média é : ", m);
FIM
*/
import java.util.Scanner;
class Media_3_Notas
{
   //Programa para pegar 3 notas e calcular a media
   public static void main(String[] args)
   {
      //Declaração de variaveis
      int n1, n2, n3, media;
      Scanner teclado = new Scanner(System.in);
      //Leitura das Notas
      System.out.print("Digite a primeira nota:");
      n1 = teclado.nextInt();
      System.out.print("Digite a segunda nota:");
      n2 = teclado.nextInt();
      System.out.print("Digite a terceira nota:");
      n3 = teclado.nextInt();
      media = ((n1 + n2 + n3)/3);
      //Impressao de Resultados 
      System.out.println("\nA média das notas é : " + media);
   }
}