import java.util.Scanner;

class Le_Escreve_Vetor_De_Real {
    public static void main(String[] args) {
        int quantidade = 5;
        float[] vetor = new float[quantidade];
        // Cria o vetor usando gerador de numeros aleatorios
        for (int i = 0; i < quantidade; i++)
            vetor[i] = (float) Math.random();
        System.out.println("\nVetor criado usando o método random para gerar numeros aleatorios\n");
        for (int i = 0; i < quantidade; i++)
            System.out.print(vetor[i] + "\t");
        System.out.println();
    }
}