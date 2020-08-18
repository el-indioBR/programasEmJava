import java.util.Scanner;
class Mostar_Valores_Ordem_Lidos
{
    public static void main(String[] args)
    {
        //Programa que leia 5 valores e mostra na ordem que foram lidos
        Scanner teclado = new Scanner(System.in);
        int i, a, b, c, d;
        for( i = 1; i <= 5; i= i + 1)
        {
            System.out.print("\n Digite o valor de A : ");
            a = teclado.nextInt();
            System.out.print("\n Digite o valor de B : ");
            b = teclado.nextInt();
            System.out.print("\n Digite o valor de C : ");
            c = teclado.nextInt();
            System.out.print("\n Digite o valor de D : ");
            d = teclado.nextInt();
            System.out.print("\n Conjunto " + i + " de valores lidos :" );
            System.out.print( a + "," + b + "," + c + "," + d );
        }
    }
}