/* Programa para ler uma matriz de inteiros e mostrar a 
soma dos elementos da diagonal principal */

import java.util.Scanner;

class imprime_soma_dos_elementos_da_diagonal_principal_de_matriz_de_inteiros_versao_1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int lin = 3;
        int col = 3;
        int[][] matriz = new int[lin][col];
        int soma;
        // Faz a leitura da matriz
        for (int i = 0; i < lin; i++)
            for (int j = 0; j < col; j++) {
                System.out.print("matriz[" + i + "][" + j + "] = ");
                matriz[i][j] = teclado.nextInt();
            }
        System.out.println("\n\nMatriz lida\n\n");
        for (int i = 0; i < lin; i++) {
            for (int j = 0; j < col; j++)
                System.out.print(matriz[i][j] + "\t");
            System.out.println();
        }
        soma = 0;
        for (int i = 0; i < lin; i++)
            for (int j = 0; j < col; j++)
                if (i == j)
                    soma = soma + matriz[i][j];
        System.out.println("\n\nSoma dos elementos da diagonal principal da matriz : " + soma);

    }
}