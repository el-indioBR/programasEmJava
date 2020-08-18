
/*
Programa que leia as coordenadas de dois pontos no plano. Use classe para definir o ponto
Ao final, o programa deve imprimir a distância entre os pontos lidos.
*/
import java.util.Scanner;

class Calcula_distancia_entre_pontos_no_plano_usando_classe {
    public static void main(String args[]) {
        class Ponto_2_D {
            double x;
            double y;
        }
        Ponto_2_D P1 = new Ponto_2_D();
        Ponto_2_D P2 = new Ponto_2_D();
        double distancia;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o valor da coordenada x do ponto : ");
        P1.x = teclado.nextDouble();
        System.out.print("Digite o valor da coordenada y do ponto : ");
        P1.y = teclado.nextDouble();
        System.out.print("Digite o valor da coordenada x do ponto : ");
        P2.x = teclado.nextDouble();
        System.out.print("Digite o valor da coordenada y do ponto : ");
        P2.y = teclado.nextDouble();
        // Calculo da distancia entre os dois pontos
        distancia = Math.sqrt(Math.pow((P2.x - P1.x), 2) + Math.pow((P2.y - P1.y), 2));
        System.out.printf("Distancia entre os pontos = %g\n", distancia);
    }
}