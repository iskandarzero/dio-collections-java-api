import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> setTarefas;

    public ListaTarefas() {
        this.setTarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        setTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        Tarefa tarefaRemover = null;

        for(Tarefa t : setTarefas) {
            if(t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaRemover = t;
                break;
            };
        }

        setTarefas.remove(tarefaRemover);
    }

    public void exibirTarefas() {
        System.out.println(setTarefas);
    }

    public void contarTarefas() {
        System.out.println(setTarefas.size());
    }

    public void obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();

        for(Tarefa t : setTarefas) {
            if(t.getStatus()) {
                tarefasConcluidas.add(t);
            };
        }

        System.out.println(tarefasConcluidas);
    }

    public void obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();

        for(Tarefa t : setTarefas) {
            if(!t.getStatus()) {
                tarefasPendentes.add(t);
            };
        }

        System.out.println(tarefasPendentes);
    }

    public void marcarTarefaConcluida(String descricao) {
        for(Tarefa t : setTarefas) {
            if(t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setStatus(true);
            };
        }
    }

    public void marcarTarefaPendente(String descricao) {
        for(Tarefa t : setTarefas) {
            if(t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setStatus(false);
            };
        }
    }

    public void limparListaTarefas() {
        setTarefas.clear();
    }
}
