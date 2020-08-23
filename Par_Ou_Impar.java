import java.util.Scanner;

class Par_Ou_Impar {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        int num;
        num = dados.nextInt();
        if (num % 2 == 0) {
            System.out.printf("Par e ");
            if (num == 0)
                System.out.print("NEUTRO");
            else if (num < 0)
                System.out.print("NEGATIVO");
            else
                System.out.print("POSITIVO");
        } else {
            System.out.print("IMPAR e ");
            if (num < 0)
                System.out.print("NEGATIVO");
            else
                System.out.print("POSITIVO");
        }
    }
}
