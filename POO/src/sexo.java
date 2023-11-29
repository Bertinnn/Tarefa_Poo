public class sexo {
    public static void main(String[] args) {
    // Instanciando um objeto do tipo PesoIdeal
    PesoIdeal pessoa = new PesoIdeal("Herbert", 1.79, "F");
    
    // Chamando o método exibirDados
    pessoa.exibirDados();
    }
    
    static class PesoIdeal {
    // Atributos
    private String nomeUsuario;
    private double alturaUsuario;
    private String sexoUsuario;
    private double pesoIdeal;
    
    // Construtor
    public PesoIdeal(String nomeUsuario, double alturaUsuario, String sexoUsuario) {
    this.nomeUsuario = nomeUsuario;
    this.alturaUsuario = alturaUsuario;
    this.sexoUsuario = sexoUsuario;
    
    // Calculando o peso ideal no momento da criação do objeto
    calcularPesoIdeal();
    }
    
    // Método para calcular o peso ideal
    private void calcularPesoIdeal() {
    if ("M".equalsIgnoreCase(sexoUsuario)) {
    pesoIdeal = (72.7 * alturaUsuario) - 58;
    } else if ("F".equalsIgnoreCase(sexoUsuario)) {
    pesoIdeal = (62.1 * alturaUsuario) - 44.7;
    } else {
    System.out.println("Sexo inválido. Informe 'M' para masculino ou 'F' para feminino.");
    }
    }
    
    // Método para exibir dados
    public void exibirDados() {
    System.out.println("Nome: " + nomeUsuario);
    if (pesoIdeal != 0) {
    System.out.println("Peso Ideal: " + pesoIdeal);
    }
    }
    }
    }