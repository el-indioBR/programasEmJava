import java.util.Scanner;

class Converte_texto_para_numero_inteiro {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        String palavra = new String();
        int numero;
        palavra = "123";
        numero = Integer.parseInt(palavra);
        System.out.println(palavra + " convertida para numero " + numero);
    }
}