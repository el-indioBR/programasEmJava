/* Programa para ler uma matriz de inteiros e exibir o seu conteudo

INICIO



FIM

*/

import java.util.Scanner;

class Le_escreve_matriz_de_inteiros {
    public static void main(String[] args) {
        int tam = 3;
        int[][] matriz = new int[tam][tam];
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < tam; i++)
            for (int j = 0; j < tam; j++) {
                System.out.print("matriz[" + i + "][" + j + "] = ");
                matriz[i][j] = teclado.nextInt();
            }
        System.out.println("\n\nMatriz lida\n\n");
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++)
                System.out.print(matriz[i][j] + "\t");
            System.out.println();
        }
    }
}