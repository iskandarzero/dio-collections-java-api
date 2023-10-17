import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> listaAlunos;

    public GerenciadorAlunos() {
        this.listaAlunos = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media) {
        listaAlunos.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula) {
        Aluno alunoRemover = null;

        for(Aluno a : listaAlunos) {
            if(a.getMatricula().equals(matricula)) {
                alunoRemover = a;
                break;
            }
        }

        listaAlunos.remove(alunoRemover);
    }

    public void exibirAlunosPorNome() {
        Set<Aluno> alunosPorNome = new TreeSet<>(listaAlunos);
        System.out.println(alunosPorNome);
    }

    public void exibirAlunosPorNota() {
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
        alunosPorNota.addAll(listaAlunos);

        System.out.println(alunosPorNota);
    }

    public void exibirAlunos() {
        System.out.println(listaAlunos);
    }
}
