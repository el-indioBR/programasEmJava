import java.util.Scanner;

class Converte_frase_de_maiuscula_para_minuscula {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        String frase = new String();
        System.out.println("Digite uma frase qualquer: ");
        frase = teclado.nextLine();
        System.out.println("A frase digitada foi : " + frase);
        System.out.println("A frase convertida para minusculas : " + frase.toLowerCase());
    }
}