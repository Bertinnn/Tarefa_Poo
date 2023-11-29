public class VerificarNumeros {
    // Atributos
    private int n1;
    private int n2;

    // Construtor
    public VerificarNumeros(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    // Método para verificar o maior número
    public int verificarMaiorNumero() {
        return Math.max(n1, n2);
    }

    // Método para verificar o menor número
    public int verificarMenorNumero() {
        return Math.min(n1, n2);
    }

    // Método para verificar igualdade
    public boolean verificarIgualdade() {
        return n1 == n2;
    }

    public static void main(String[] args) {

        VerificarNumeros numeros = new VerificarNumeros(10, 5);

 
        System.out.println("Maior número: " + numeros.verificarMaiorNumero());
        System.out.println("Menor número: " + numeros.verificarMenorNumero());
        
        if (numeros.verificarIgualdade()) {
            System.out.println("Os números são iguais.");
        } else {
            System.out.println("Os números são diferentes.");
        }
    }
}
