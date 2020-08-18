import java.util.Scanner;
class Nota_Aprovacao
{
    //Programa para receber quatro notas calcular a media aritmetica e retornar a situacao do aluno
    public static void main(String[] args)
    {
        //Declaracao de variaveis
        float nota1, nota2, nota3, nota4, media;
        Scanner dados = new Scanner(System.in);
        //Leitura das notas
        System.out.print("\n Informe a primeira nota : ");
        nota1 = dados.nextFloat();
        System.out.print("\n Informe a segunda nota : ");
        nota2 = dados.nextFloat();
        System.out.print("\n Informe a terceira nota : ");
        nota3 = dados.nextFloat();
        System.out.print("\n Informe a quarta nota : ");
        nota4 = dados.nextFloat();
        //Calculando a media 
        media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.print("\n O valor da media e : " + media);
        //Estrutura de condicao
        if(media >= 7)
            System,.out.print("\n APROVADO!");
        else
            System,.out.print("\n REPROVADO!");
    }
}