/*Um determinado material radioativo perde metade de sua massa a cada 50 segundos.
Dada a massa inicial, em gramas, fazer um algoritmo/programa que determine o tempo necessário
para que essa massa se torne menor do que 0,5 grama. Escreva a massa inicial, a massa final e
o tempo, calculado em segundos.*/

import java.util.Scanner;

class Decaimento_radioativo {
    public static void main(String[] args) {

        float massa;
        int tempo;
        tempo = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a massa, em gramas : ");
        massa = teclado.nextFloat();
        while (massa >= 0.5) {
            massa = massa / 2;
            tempo = tempo + 50;
        }
        System.out.println("Tempo = " + tempo);
    }
}