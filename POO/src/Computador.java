public class Computador {
    private String modelo;
    private String marca;
    private double preco;
    private int quantidadeEmEstoque;
    private String especificacoes;

    public Computador(String modelo, String marca, double preco, int quantidadeEmEstoque, String especificacoes) {
        this.modelo = modelo;
        this.marca = marca;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
        this.especificacoes = especificacoes;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public String getEspecificacoes() {
        return especificacoes;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public void setEspecificacoes(String especificacoes) {
        this.especificacoes = especificacoes;
    }

    public static void main(String[] args) {
        Computador computador = new Computador("Positivo", "Cu", 1500.00, 10, "Especificações XYZ");

        System.out.println("Modelo: " + computador.getModelo());
        System.out.println("Marca: " + computador.getMarca());
        System.out.println("Preço: R$" + computador.getPreco());
        System.out.println("Quantidade em Estoque: " + computador.getQuantidadeEmEstoque());
        System.out.println("Especificações: " + computador.getEspecificacoes());

        computador.setPreco(1699.99);
        computador.setQuantidadeEmEstoque(8);

        System.out.println("\nInformações atualizadas:");
        System.out.println("Preço: R$" + computador.getPreco());
        System.out.println("Quantidade em Estoque: " + computador.getQuantidadeEmEstoque());
    }
}
