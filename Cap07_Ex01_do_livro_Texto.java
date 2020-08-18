/*
Programa que leia o nome e quatro notas de um aluno.
Ao final, o progra ma deve imprimir a media do aluno.
Para realizar essa tarefa, o programa deve usar uma
classe que contenha o nome e as notas como campos e
o calculo da media usando metodo associado a classe.
*/

import java.util.Scanner;

class Cap07_Ex01_do_livro_Texto {
   public static void main(String args[]) {
      class Caluno {
         String NOME;
         float NOTA[] = new float[4];
         float MEDIA;
      
         public float CalcMedia() {
            float SOMA = 0, MEDIA;
            for (byte I = 0; I <= 3; I++) {
               SOMA = SOMA + NOTA[I];
            }
            MEDIA = SOMA / 4;
            return (MEDIA);
         }
      }
      Caluno ALUNO = new Caluno();
      Scanner teclado = new Scanner(System.in);
      System.out.println();
      System.out.print("Entre nome ....: ");
      ALUNO.NOME = teclado.nextLine();
      System.out.println();
      System.out.println("Entre as notas: ");
   
      System.out.println();
      for (byte I = 0; I <= 3; I++) {
         System.out.printf("Nota %d : ", I + 1);
         ALUNO.NOTA[I] = teclado.nextFloat(); // ATENCAO: use , (vírgula) para a parte fracionaria da nota
      }
      ALUNO.MEDIA = ALUNO.CalcMedia();
      System.out.println();
      System.out.println("Nome ........: " + ALUNO.NOME);
      System.out.println("Media .......: " + ALUNO.MEDIA);
      System.out.println();
   }
}