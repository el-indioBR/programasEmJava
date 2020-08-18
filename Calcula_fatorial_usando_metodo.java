// Programa para cálculo de fatorial de um número inteiro positivo 

import java.util.Scanner;

class Calcula_fatorial_usando_metodo {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int x;
        System.out.print("Digite um valor inteiro e positivo : ");
        x = teclado.nextInt();
        System.out.println("Fatorial de " + x + " = " + fatorial(x));
    }

    public static double fatorial(int x) {
        int a;
        double fat;
        fat = 1;
        for (a = 1; a <= x; a = a + 1)
            fat = fat * a;
        return fat;
    }
}