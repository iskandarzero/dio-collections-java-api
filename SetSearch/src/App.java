public class App {
    public static void main(String[] args) throws Exception {
        ListaTarefas l = new ListaTarefas();
        l.adicionarTarefa("Duolingo");
        l.adicionarTarefa("Dio");
        l.adicionarTarefa("Busca de Emprego");
        l.exibirTarefas();
        l.contarTarefas();
        l.removerTarefa("busca de emprego");
        l.exibirTarefas();
        l.contarTarefas();
        l.marcarTarefaConcluida("duOLINGO");
        l.obterTarefasConcluidas();
        l.obterTarefasPendentes();
        l.limparListaTarefas();
        l.exibirTarefas();
        l.contarTarefas();
    }
}
