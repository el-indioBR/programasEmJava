import java.util.Scanner;

class Maior_e_Menor_de_Tres {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        int a, b, c, mav = 0, mev = 999;
        a = dados.nextInt();
        b = dados.nextInt();
        c = dados.nextInt();
        mav = a;
        mev = a;
        if (b > mav)
            mav = b;
        if (b < mev)
            mev = b;
        if (c > mav)
            mav = c;
        if (c < mev)
            mev = c;
        System.out.print("\n\nMAIOR = " + mav + "\n\nMENOR = " + mev);
    }
}
