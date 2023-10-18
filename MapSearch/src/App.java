public class App {
    public static void main(String[] args) throws Exception {
        ContagemPalavras c = new ContagemPalavras();
        c.adicionarPalavra("Game", 34);
        c.adicionarPalavra("RPG", 12);
        c.adicionarPalavra("FPS", 28);
        c.adicionarPalavra("Moba", 3);
        c.exibirContagemPalavras();
        c.encontrarPalavraMaisFrequente();
        c.removerPalavra("Moba");
        c.exibirContagemPalavras();
    }
}
