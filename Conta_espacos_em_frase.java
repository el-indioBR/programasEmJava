import java.util.Scanner;

class Conta_espacos_em_frase {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        String frase = new String();
        int conta_espacos = 0;
        int tamanho = 0;
        System.out.println("Digite uma frase qualquer: ");
        frase = teclado.nextLine();
        System.out.println("A frase digitada foi : " + frase);
        tamanho = frase.length();
        for (int i = 0; i < tamanho; i++) {
            char ch = frase.charAt(i); // O metodo charAt faz parte da classe String
            if (ch == ' ')
                conta_espacos++;
        }
        System.out.println("Quantidade de espacos na frase lida : " + conta_espacos);
    }
}