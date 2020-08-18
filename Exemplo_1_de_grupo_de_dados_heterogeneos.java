//Exemplo de uso de registros
public class Exemplo_1_de_grupo_de_dados_heterogeneos {
    public static class produto_linha_branca {
        public int num;
        public String nome;
        public float valor;
    }

    public static void main(String args[]) {
        produto_linha_branca p;
        // Alocacao do objeto da classe criada no programa
        p = new produto_linha_branca();
        // Atribuição de valores aos campos do objeto
        p.num = 1;
        p.nome = "geladeira";
        p.valor = 1200.00f;
        // Impressão dos campos da classe
        System.out.println("Codigo: " + p.num);
        System.out.println("Descrição: " + p.nome);
        System.out.println("Preço: " + p.valor);
    }
}