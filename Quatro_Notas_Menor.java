import java.util.Scanner;
class Quatro_Notas_Menor
{
    //Programa para receber 4 notas e mostrar qual e a menor
    public static void main(String[] args)
    {
        //Declaracao de variaveis
        float nota1, nota2, nota3, nota4;
        Scanner dados = new Scanner(System.in);
        //Leitura dos valores
        System.out.print("\n Informe a primeira nota : ");
        nota1 = dados.nextFloat();
        System.out.print("\n Informe a segunda nota : ");
        nota2 = dados.nextFloat();
        System.out.print("\n Informe a terceira nota : ");
        nota3 = dados.nextFloat();
        System.out.print("\n Informe a quarta nota : ");
        nota4 = dados.nextFloat();
        //Estrutura de condicao
        if( nota1 == nota2 && nota1 == nota3 && nota1 == nota4 )
            System.out.print("\n Os valores sao iguais");
        else
        {
            if( nota1 >= nota2 && nota1 >= nota3 && nota1 >= nota4 )
                System.out.print("\n A primeira nota e a maior : " + nota1 );
            else
                if( nota2 >= nota3 && nota2 >= nota4 )
                    System.out.print("\n A segunda nota e a maior : " + nota2 );
            else
                    if( nota3 >= nota4 )
                    System.out.print("\n A terceira nota e a maior : " + nota3 );
            else
                        System.out.print("\n A quarta nota e a maior : " + nota4 );
        }
    }
}