import java.util.Scanner;

class Concatena_palavras {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        String palavra1 = new String();
        String palavra2 = new String();
        String palavra3 = new String();
        palavra1 = "PUC";
        palavra2 = "MINAS";
        palavra3 = palavra1.concat(palavra2);
        System.out.println(palavra1);
        System.out.println(palavra2);
        System.out.println(palavra3);
    }
}