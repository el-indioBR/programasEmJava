/* Programa para ler uma matriz de inteiros e exibir o seu conteudo

INICIO



FIM

*/

import java.util.Scanner;

class Escreve_matriz_de_inteiros {
    public static void main(String[] args) {
        int tam = 3;
        int[][] matriz = new int[tam][tam];
        // Cria a matriz usando metodo gerador de numeros aleatorios
        for (int i = 0; i < tam; i++)
            for (int j = 0; j < tam; j++)
                matriz[i][j] = 100 + (int) (Math.random() * 100);
        System.out.println("\nMatriz criada usando o metodo random para gerar numeros aleatorios\n");
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++)
                System.out.print(matriz[i][j] + "\t");
            System.out.println();
        }
    }
}