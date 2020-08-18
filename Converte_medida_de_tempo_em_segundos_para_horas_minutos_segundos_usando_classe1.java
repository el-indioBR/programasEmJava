
/*
Programa que leia uma medida de tempo em segundos, faça a conversão para
horas, minutos e segundos e armazene esta informação em uma classe.
Ao final, o programa deve imprimir o contúdo da classe.
*/
import java.util.Scanner;

class Converte_medida_de_tempo_em_segundos_para_horas_minutos_segundos_usando_classe {
    public static void main(String args[]) {
        class Tempo {
            int horas;
            int minutos;
            int segundos;
        }
        Tempo T = new Tempo();
        int seg, quociente;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite uma medida de tempo em segundos: ");
        seg = teclado.nextInt();
        quociente = seg;
        T.segundos = quociente % 60;
        quociente = quociente / 60;
        T.minutos = quociente % 60;
        quociente = quociente / 60;
        T.horas = quociente % 60;
        System.out.println("\n" + seg + " segundos = ");
        System.out.println("\n" + T.horas + " horas ");
        System.out.println("\n" + T.minutos + " minutos");
        System.out.println("\n" + T.segundos + " segundos");
    }
}