import java.util.Scanner;
class Aumento_Salario_Anual  {
  public static void main(String args[])
  {
     Scanner teclado =  new Scanner(System.in);
     int ano, ano_atual;
     float salario, novo_salario, percentual;
     System.out.print("Digite o valor do ano, para o qual quer saber o salario do empregado : ");
     ano_atual = teclado.nextInt();
     salario = (float)1000.00;
     percentual = (float)1.5/100;
     novo_salario = salario + salario * percentual;
     System.out.println("\nAno\tPercentual de aumento\tSalario\n");
     for ( ano = 2007; ano <= ano_atual; ano = ano + 1 )
     {
       percentual = percentual * 2;
       novo_salario = novo_salario + novo_salario * percentual;
       System.out.println(ano + "\t\t" + percentual + "\t\t" + novo_salario);
     }
  }     
}