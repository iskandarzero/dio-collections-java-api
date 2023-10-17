public class App {
    public static void main(String[] args) throws Exception {
        Dicionario d = new Dicionario();
        d.adicionarPalavra("Galeão", "navio a vela com quatro mastros, de alto bordo, armado em guerra, us. no transporte de cargas de alto valor na navegação oceânica entre os sXVI e XVIII.");
        d.adicionarPalavra("Fragata", "navio de guerra de emprego geral ou apenas antissubmarino, maior do que a corveta e menor do que o cruzador.");
        d.exibirPalavras();
        d.pesquisarPorPalavra("Galeão");
        d.removerPalavra("Galeão");
        d.exibirPalavras();
    }
}
