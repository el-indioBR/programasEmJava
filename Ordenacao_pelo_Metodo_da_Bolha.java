class Ordenacao_pelo_Metodo_da_Bolha
{
   public static void main(String[] args) 
   {
      int quantidade = 10;
      int[] vetor = new int[quantidade];
      Cria_Vetor(vetor,quantidade);
      System.out.println("Vetor não ordenado criado usando o gerador de números aleatórios");
      Imprime_Vetor(vetor,quantidade);   
      System.out.println("\n\nInicio do processo de ordenacao\n");
      Ordenacao_pelo_metodo_da_bolha(vetor,quantidade);
      System.out.println("\n\nVetor ordenado usando o metodo da bolha\n");

      Imprime_Vetor(vetor,quantidade);
   }
   public static void Cria_Vetor(int[] vetor, int tam)
   {
      for (int i = 0; i < tam; i++)
         vetor[i] = (int) (Math.random()*100);
   }
   public static void Imprime_Vetor(int[] vetor,int tam)
    {
       System.out.println();
       for (int i = 0; i < tam; i++)
         System.out.print(vetor[i] + " ");
       System.out.println();
    } 
    private static void Ordenacao_pelo_metodo_da_bolha(int vetor[],int tam)
    {
       boolean troca = true;
       int aux;
       while (troca)
       {
          troca = false;
          for (int i = 0; i < tam - 1; i++)
          {
             if (vetor[i] > vetor[i + 1]) 
             {
                aux = vetor[i];
                vetor[i] = vetor[i + 1];
                vetor[i + 1] = aux;
                troca = true;
                Imprime_Vetor(vetor,tam);
             }
          }
          //Imprime_Vetor(vetor,tam);
       }
    }
}