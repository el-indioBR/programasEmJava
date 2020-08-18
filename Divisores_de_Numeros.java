/*Fazer um programa para ler um número inteiro e positivo, e mostrar seus divisores.
Algoritmo 

INICIO

inteiro x, divisor;
escreva("Digite um valor inteiro e positivo : ")
leia(x)
para divisor <- 1 ate x faça passo 1
se x mod divisor = 0 então
escreva(divisor, "eh divisor de ", x)
fim se
fim repetir

FIM
*/

import java.util.Scanner;

class Divisores_de_Numeros {
    public static void main(String[] args) {
        int x, div;
        Scanner teclado = new Scanner(System.in);
        System.out.print( "\n Digite um valor inteiro e positivo : " );
        x = teclado.nextInt();
        for ( div = 1; div <= x; div++ )
        if( x % div == 0 )
        System.out.print( div + " e divisor de " + x + "\n" );
    }
}