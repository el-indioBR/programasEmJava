/* Programa para criar uma matriz quadrada de tamanho 5x5, contendo valores inteiros e calcular e imprimir
a quantidade de elementos menores que zero acima da diagonal secundária da matriz. Imprimir a matriz. */

import java.util.Scanner;

class Conta_os_elementos_negativos_acima_da_diagonal_secundaria_de_matriz_versao_2 {
    public static void main(String[] args) {
        int quant = 0; // quantidade de elementos negativos acima da diagonal secundaria
        int tam = 5;
        int[][] matriz = new int[tam][tam];
        for (int i = 0; i < tam; i++)
            for (int j = 0; j < tam; j++)
                if (j % 2 == 1)
                    matriz[i][j] = (int) (Math.random() * 100);
                else
                    matriz[i][j] = -(int) (Math.random() * 100);
        for (int i = 0; i < tam; i++)
            for (int j = 0; j < tam; j++)
                if (((i + j) < (tam - 1)) && (matriz[i][j] < 0)) {
                    quant = quant + 1;
                }
        System.out.println("\nMatriz lida\n");
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++)
                System.out.print(matriz[i][j] + "\t");
            System.out.println();
        }
        System.out.println("\nQuantidade de valores negativos acima da diagonal secundaria da matriz " + quant);
    }
}