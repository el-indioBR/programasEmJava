import java.util.Scanner;

class Calculadora_Simples {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        int A, B, SOMA, SUB, MULT, DIV;
        A = dados.nextInt();
        B = dados.nextInt();
        SOMA = (A + B);
        SUB = (A - B);
        MULT = (A * B);
        DIV = (A / B);
        System.out.println("\n\nSOMA = " + SOMA);
        System.out.println("\n\nSUBTRACAO  = " + SUB);
        System.out.println("\n\nMULTIPLICACAO  = " + MULT);
        System.out.println("\n\nDIVISAO  = " + DIV);
    }
}
