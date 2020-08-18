import java.util.Scanner;
class Valor_Maior
{
    //Programa para receber 2 valores e mostrar o maior
    public static void main(String[] args)
    {
        //Declaracao de variaveis
        float valor1, valor2;
        Scanner dados = new Scanner(System.in);
        //Leitura dos valores
        System.out.print("\n Informe o primeiro valor : ");
        valor1 = dados.nextFloat();
        System.out.print("\n Informe o segundo valor : ");
        valor2 = dados.nextFloat();
        //Estrutura de condicao
        if(valor1 ==  valor2)
            System.out.print("\n Os valores sao iguais ");
        else
        {
            if(valor1 > valor2)
                System.out.print("\n O primeiro valor e o maior :  " + valor1);
            else
                System.out.print("\n O segundo valor e o maior :  " + valor2);
        }
    }
}