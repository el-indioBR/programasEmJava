/* Programa para criar uma matriz quadrada de tamanho 5x5, contendo valores inteiros e
copia-la para um vetor de tamanho adequado. Imprimir a matriz e o vetor. */

import java.util.Scanner;

class Copia_matriz_para_vetor {
    public static void main(String[] args) {
        int tamvet = 25; // tamanho do vetor para armazenar a matriz
        int tamat = 5;
        int k = 0;
        int[][] matriz = new int[tamat][tamat];
        int[] vetor = new int[tamvet];
        for (int i = 0; i < tamat; i++)
            for (int j = 0; j < tamat; j++) {
                matriz[i][j] = (int) (Math.random() * 100);
            }
        for (int i = 0; i < tamat; i++)
            for (int j = 0; j < tamat; j++) {
                vetor[k] = matriz[i][j];
                k = k + 1; // indice do vetor varia de 0 a 24
            }
        System.out.println("\nMatriz lida\n");
        for (int i = 0; i < tamat; i++) {
            for (int j = 0; j < tamat; j++)
                System.out.print(matriz[i][j] + "\t");
            System.out.println();
        }
        System.out.println("\nVetor contendo a matriz\n");
        for (k = 0; k < tamvet; k++)
            System.out.print(vetor[k] + "\t");
    }
}