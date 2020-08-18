import java.util.Scanner;
class Negociacao_Zilda_Queiroz
{
//programa para fazer negociaçoes da Loja 02 Zilda Queiróz
   public static void main(String[] args)
   {
      Scanner dados = new Scanner(System.in);
      //Declaraçao de variaveis 
      int parcelas, parcelas_, vencimento, i, dia, mes;
      float entrada, total_conta, valor_restante, total, parcelas_final;
      //Leitura dos dados
      System.out.print(" Informe o valor total da conta : ");
      total_conta = dados.nextFloat();
      entrada = total_conta * 20 / 100;
      System.out.print("\n Valor de entrada : " + entrada);
      System.out.print("\n Informe o valor da entrada : ");
      entrada = dados.nextFloat();
      valor_restante = total_conta - entrada;
      System.out.print("\n Valor restante : " + valor_restante);
      System.out.print("\n Informe a quantidade de parcelas : ");
      parcelas = dados.nextInt();
      parcelas_ = parcelas * 3;
      total  = valor_restante + valor_restante * parcelas_ / 100;
      System.out.print("\n Valor total : " + total + " dividido em " + parcelas + " vezes = " + total / parcelas );
      parcelas_final = total / parcelas;
      System.out.print("\n Informe o dia do vencimento : ");
      dia = dados.nextInt();
      System.out.print(" Informe o mes do vencimento : ");
      mes = dados.nextInt();
      System.out.print("\n Data de vencimento da primeria parcela : " + dia + " / " + mes + " / 20 ");
      mes = mes + ( parcelas - 1 );
      System.out.print("\n Data de vencimento da ultima parcela : " + dia + " / " + mes + " / 20 "); 
   }
}       