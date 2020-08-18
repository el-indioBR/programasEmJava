import java.util.Scanner;

class Le_Escreve_Vetor_De_Caracteres_e_Inteiros {
    public static void main(String[] args) {
        int quantidade = 5;
        int x, y;
        char[] vetor = new char[quantidade];
        // Cria o vetor usando gerador de caracteres aleatorios
        for (int i = 0; i < quantidade; i++) {
            if (i % 2 == 0) {
                x = 65 + (int) (Math.random() * 10);
                vetor[i] = (char) x;
            } else {
                y = 48 + (int) (Math.random() * 10);
                vetor[i] = (char) y;

            }
        }
        System.out.println("\nVetor criado usando o método random para gerar caracteres aleatorios\n");
        for (int i = 0; i < quantidade; i++)
            System.out.print(vetor[i] + "\t");
        System.out.println();
    }
}