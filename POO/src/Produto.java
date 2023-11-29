public class Produto {
    // Atributos
    private String nomeProduto;
    private int estoque;

    // Construtor
    public Produto(String nomeProduto, int estoque) {
        this.nomeProduto = nomeProduto;
        this.estoque = estoque;
    }

    // Método para verificar reposição de estoque
    public void verificarReposicaoEstoque() {
        if (estoque < 10) {
            System.out.println("Reposição do produto no estoque.");
        } else {
            System.out.println("Estoque em conformidade!");
        }
    }

    // Método para calcular o valor de reposição de estoque
    public double valorReposicaoEstoque(int quantidadeAdquiridaProduto, double precoUnitario) {
        return quantidadeAdquiridaProduto * precoUnitario;
    }

    public static void main(String[] args) {
        // Instanciando um objeto do tipo Produto
        Produto produto = new Produto("Produto A", 8);

        // Atribuindo valores aos atributos
        int quantidadeAdquiridaProduto = 5;
        double precoUnitario = 50.0;

        // Chamando os métodos do objeto
        produto.verificarReposicaoEstoque();

        double valorReposicao = produto.valorReposicaoEstoque(quantidadeAdquiridaProduto, precoUnitario);
        System.out.println("Valor para repor o estoque: R$" + valorReposicao);
    }
}
