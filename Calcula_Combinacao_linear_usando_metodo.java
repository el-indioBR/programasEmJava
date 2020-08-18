/* Programa para calcular combinação linear, dada pela fórmula : C(n,p) = n! /(p! * (n - p)!) */

import java.util.Scanner;

class Calcula_Combinacao_linear_usando_metodo {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int n, p, n_p;
        double C;
        System.out.print("Digite o valor de n : ");
        n = teclado.nextInt();
        System.out.print("Digite o valor de p : ");
        p = teclado.nextInt();
        n_p = n - p;
        // Calcula a combinacao linear
        C = fatorial(n) / (fatorial(p) * fatorial(n_p));
        System.out.println("Combinação linear = " + C);
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