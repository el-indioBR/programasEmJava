import java.util.Scanner;

class Compara_palavras_verificando_se_sao_maiusculas_ou_minusculas {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        String palavra1 = new String();
        String palavra2 = new String();
        palavra1 = "PUCMINAS";
        palavra2 = "pucminas";
        if (palavra1.equals(palavra2))
            System.out.println("As palavras sao iguais");
        else
            System.out.println("As palavras sao diferentes");

    }
}