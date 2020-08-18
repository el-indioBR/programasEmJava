import java.util.Scanner;

class Converte_texto_para_numero_real_do_tipo_float {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        String palavra = new String();
        float numero;
        palavra = "3.141593";
        numero = Float.parseFloat(palavra);
        System.out.println(palavra + " convertida para numero real do tipo float " + numero);
    }
}