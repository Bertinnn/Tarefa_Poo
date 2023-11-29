public class Aluno {
    
    private String nomeDisciplina;
    private String nomeAluno;
    private double mediaFinal;
    private int idade;

    
    public Aluno(String nomeDisciplina, String nomeAluno, double mediaFinal, int idade) {
        this.nomeDisciplina = nomeDisciplina;
        this.nomeAluno = nomeAluno;
        this.mediaFinal = mediaFinal;
        this.idade = idade;
    }

    
    public void calcularMediaFinalAluno() {
        System.out.println("Média final do aluno na disciplina " + nomeDisciplina + ": " + mediaFinal);
    }

    
    public void informarSituacaoAluno() {
        if (mediaFinal >= 6 && mediaFinal <= 10) {
            System.out.println("Situação: Aprovado");
        } else if (mediaFinal >= 4 && mediaFinal < 6) {
            System.out.println("Situação: Recuperação");
        } else if (mediaFinal >= 0 && mediaFinal < 4) {
            System.out.println("Situação: Reprovado");
        } else {
            System.out.println("Média final inválida. Verifique os dados do aluno.");
        }
    }

    
    public void verificarMaioridadeAluno() {
        if (idade >= 18) {
            System.out.println("O aluno é maior de idade.");
        } else {
            System.out.println("O aluno é menor de idade.");
        }
    }

    public static void main(String[] args) {
        
        Aluno aluno = new Aluno("Matemática", "João", 7.5, 20);

       
        aluno.calcularMediaFinalAluno();
        aluno.informarSituacaoAluno();
        aluno.verificarMaioridadeAluno();
    }
}
