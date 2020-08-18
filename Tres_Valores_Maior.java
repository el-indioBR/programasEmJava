 import java.util.Scanner;
class Tres_Valores_Maior
{
    //Programa para receber 3 valores e mostrar qual e o maior
    public static void main(String[] args)
    {
        //Declaracao das variaveis
        float valor1, valor2, valor3;
        Scanner dados = new Scanner(System.in);
        //Leitura dos valores
        System.out.print("\n Informe o primeiro valor : ");
        valor1 = dados.nextFloat();
        System.out.print("\n Informe o segundo valor : ");
        valor2 = dados.nextFloat();
        System.out.print("\n Informe o terceiro valor : ");
        valor3 = dados.nextFloat();
        //Estrutura de condicao
        if(valor1 > valor2 && valor1 > valor3 )
            System.out.print("\n O primeiro valor e o maior : " + valor1);
        if(valor2 > valor1 && valor2 > valor3 )
            System.out.print("\n O segundo valor e o maior : " + valor2);
        if(valor3 > valor2 && valor3 > valor1 )
            System.out.print("\n O terceiro valor e o maior : " + valor3);
    }
    
}