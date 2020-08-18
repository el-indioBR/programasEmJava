/* Programa para criar o triabgulo de Pascal */

import java.util.Scanner;

class Cria_Triangulo_de_Pascal {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int n, p;
        double C;
        for (n = 0; n <= 10; n++) {
            for (p = 0; p <= n; p++) {
                C = fatorial(n) / (fatorial(p) * fatorial(n - p));
                System.out.print(C + "\t");
            }
            System.out.println();
        }
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