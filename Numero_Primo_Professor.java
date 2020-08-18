/*Fazer um programa para ler um número inteiro e positivo, e 
informar se ele eh ou não eh primo. */

import java.util.Scanner;

class Numero_Primo {
    public static void main(String[] args) {
        int x, i, cont = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.print("\n Digite um valor inteiro e positivo : ");
        x = teclado.nextInt();
        for (i = 1; i <= x; i++)
            if (x % i == 0)
                cont++;
        if (cont == 2)
            System.out.print(x + " e um numero primo");
        else
            System.out.print(x + " nao e um numero primo");
    }
}