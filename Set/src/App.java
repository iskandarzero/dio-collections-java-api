public class App {
    public static void main(String[] args) throws Exception {
        ConjuntoPalavrasUnicas c = new ConjuntoPalavrasUnicas();
        c.adicionarPalavra("Banana");
        c.adicionarPalavra("Uva");
        c.adicionarPalavra("Maçã");
        c.verificarPalavra("Banana");
        c.removerPalavra("Banana");
        c.verificarPalavra("Banana");
        c.exibirPalavrasUnicas();
    }
}
