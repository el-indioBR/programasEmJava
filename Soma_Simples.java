import java.util.Scanner;

class Soma_Simples {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        int A, B, SOMA;
        A = dados.nextInt();
        B = dados.nextInt();
        SOMA = (A) + (B);
        System.out.println("\nSOMA = " + SOMA);
    }
}
