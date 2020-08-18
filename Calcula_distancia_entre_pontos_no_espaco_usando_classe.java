
/*
Programa que leia as coordenadas de dois pontos no espaço. Use classe para definir o ponto
Ao final, o programa deve imprimir a distância entre os pontos lidos.
*/
import java.util.Scanner;

class Calcula_distancia_entre_pontos_no_espaco_usando_classe {
    public static void main(String args[]) {
        class Ponto_3_D {
            double x;
            double y;
            double z;
        }
        Ponto_3_D P1 = new Ponto_3_D();
        Ponto_3_D P2 = new Ponto_3_D();
        double dist_base, distancia;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o valor da coordenada x do ponto : ");
        P1.x = teclado.nextDouble();
        System.out.print("Digite o valor da coordenada y do ponto : ");
        P1.y = teclado.nextDouble();
        System.out.print("Digite o valor da coordenada z do ponto : ");
        P1.z = teclado.nextDouble();
        System.out.print("Digite o valor da coordenada x do ponto : ");
        P2.x = teclado.nextDouble();
        System.out.print("Digite o valor da coordenada y do ponto : ");
        P2.y = teclado.nextDouble();
        System.out.print("Digite o valor da coordenada z do ponto : ");
        P2.z = teclado.nextDouble();
        // Calculo da distancia entre os dois pontos
        dist_base = Math.sqrt(Math.pow((P2.x - P1.x), 2) + Math.pow((P2.y - P1.y), 2));
        distancia = Math.sqrt(Math.pow(dist_base, 2) + Math.pow((P2.z - P1.z), 2));
        System.out.printf("Distancia entre os pontos = %f\n", distancia);
    }
}