public class FigurasGeometricas {
    // Atributo
    private String figura;

    // Construtor
    public FigurasGeometricas(String figura) {
        this.figura = figura;
    }

    // Método para calcular a área
    public double calcularArea(double lado1, double lado2) {
        switch (figura.toLowerCase()) {
            case "triangulo":
                return 0.5 * lado1 * lado2; // Fórmula da área do triângulo: (base * altura) / 2
            case "quadrado":
                return lado1 * lado2; // Fórmula da área do quadrado: lado * lado
            case "retangulo":
                return lado1 * lado2; // Fórmula da área do retângulo: base * altura
            default:
                System.out.println("Figura não reconhecida.");
                return 0;
        }
    }

    public static void main(String[] args) {
        // Instanciando um objeto do tipo FigurasGeometricas
        FigurasGeometricas figura = new FigurasGeometricas("retangulo");

        // Atribuindo valores aos atributos
        double base = 4.0;
        double altura = 3.0;

        // Chamando o método para calcular a área
        double area = figura.calcularArea(base, altura);

        // Exibindo o resultado
        if (area > 0) {
            System.out.println("Área do " + figura.figura + ": " + area);
        }
    }
}
