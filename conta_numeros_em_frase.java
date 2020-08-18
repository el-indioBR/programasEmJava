import java.util.Scanner;

class conta_numeros_em_frase {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        String frase = new String();
        int contanumero = 0;
        int tamanho;
        System.out.println("Digite uma frase qualquer: ");
        frase = teclado.nextLine();
        System.out.println("A frase digitada foi : " + frase);
        tamanho = frase.length();
        for (int i = 0; i < tamanho; i++) {
            char ch = frase.charAt(i); // O metodo charAt faz parte da classe String
            if (ch >= '0' && ch <= '9')
                contanumero++;
        }
        System.out.println("Quantidade de digitos na frase lida : " + contanumero);
    }
}