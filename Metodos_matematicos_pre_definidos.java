/* Programa para ilustrar o uso de métodos pré-definidos em Java
Exemplo de uso de métodos matemáticos */

import java.util.Scanner;

class Metodos_matematicos_pre_definidos {
    public static void main(String[] args) {

        System.out.println("Raiz quadrada de 2 = " + Math.sqrt(2));
        System.out.println("Valor absoluto ou modulo de -2 = " + Math.abs(2));
        System.out.println("Maior inteiro contido em 2.000001 = " + Math.ceil(2.000001));
        System.out.println("Menor inteiro contido em 2.999999 = " + Math.floor(2.999999));
        System.out.println("Exponencial de 1 = " + Math.exp(1));
        System.out.println("Logaritmo natural ou Neperiano de 1 = " + Math.log(1));
        System.out.println("Logaritmo decimal ou de Brigs de 1 = " + Math.log10(1));
        System.out.println("Logaritmo decimal ou de Brigs de 1 = " + Math.log10(1));
        System.out.println("Seno de 30 graus (pi/6 radianos) = " + Math.sin(Math.PI / 6));
        System.out.println("Cosseno de 30 graus (pi/6 radianos) = " + Math.cos(Math.PI / 6));
        System.out.println("Tangente de 45graus (pi/4 radianos) = " + Math.tan(Math.PI / 4));

    }
}