public class App {
    public static void main(String[] args) throws Exception {
        GerenciadorAlunos g = new GerenciadorAlunos();
        g.adicionarAluno("Mario", 987654321L, 60);
        g.adicionarAluno("Ana", 123456789L, 80);
        g.adicionarAluno("Bianca", 987651234L, 30);
        g.exibirAlunosPorNome();
        g.exibirAlunosPorNota();
        g.removerAluno(123456789);
        g.exibirAlunosPorNome();
        g.exibirAlunosPorNota();
    }
}
