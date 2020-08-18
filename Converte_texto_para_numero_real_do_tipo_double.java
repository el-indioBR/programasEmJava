import java.util.Scanner;

class Converte_texto_para_numero_real_do_tipo_double {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        String palavra = new String();
        double numero;
        palavra = "3.1415926536";
        numero = Double.parseDouble(palavra);
        System.out.println(palavra + " convertida para numero real do tipo double " + numero);
    }
}