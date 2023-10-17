import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> mapPalavra;

    public Dicionario() {
        this.mapPalavra = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        mapPalavra.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        mapPalavra.remove(palavra);
    }

    public void exibirPalavras() {
        System.out.println(mapPalavra);
    }

    public void pesquisarPorPalavra(String palavra) {
        System.out.println(mapPalavra.get(palavra));
    }
}