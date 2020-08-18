import java.util.Scanner;
class Area_das_Figuras
//programa para receber medidas e informar a area da figura
{
   public static void main(String[] args)
   {
      Scanner dados = new Scanner(System.in);
      //Declaraçao de variaveis 
      float area, base, base_maior, base_menor, altura, raio, op;
      System.out.println("\n Informe qual figura deseja saber a area : \n Triangulo = 1 \n Quadrado = 2 \n Retangulo = 3 \n Trapezio = 4 \n Circulo = 5 ");
      //Leitura dos valores
      op = dados.nextFloat();
      if(op == 1)
      {
         System.out.print(" Informe o valor da base : ");
         base = dados.nextFloat();
         System.out.print(" Informe o valor da altura : ");
         altura = dados.nextFloat();
         area = ( base * altura ) / 2;
         System.out.println("\n A area do Triangulo e : " + area);
      }
      if(op == 2)
      {
         System.out.print(" Informe o valor da base : ");
         base = dados.nextFloat();
         area = base * base ;
         System.out.println("\n A area do Quadrado e : " + area);
      }
      if(op == 3)
      {
         System.out.print(" Informe o valor da base : ");
         base = dados.nextFloat();
         System.out.print(" Informe o valor da altura : ");
         altura = dados.nextFloat();
         area = base * altura;
         System.out.println("\n A area do Retangulo e : " + area);
      }
      if(op == 4)
      {
         System.out.print(" Informe o valor da base maior : ");
         base_maior = dados.nextFloat();
         System.out.print(" Informe o valor da base menor : ");
         base_menor = dados.nextFloat();
         System.out.print(" Informe o valor da altura : ");
         altura = dados.nextFloat();
         area = ( base_maior + base_menor) * altura / 2;
         System.out.println("\n A area do Trapezio e : " + area);
      }
      if(op == 5)
      {
         System.out.print(" Informe o valor do raio : ");
         raio = dados.nextFloat();
         area = (float)3.14159 * ( raio * raio );
         System.out.println("\n A area do Circulo e : " + area);
      }
   }
}