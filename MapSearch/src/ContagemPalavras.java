import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> mapPalavras;

    public ContagemPalavras() {
        this.mapPalavras = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem) {
        mapPalavras.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        mapPalavras.remove(palavra);
    }

    public void exibirContagemPalavras() {
        System.out.println(mapPalavras);
    }

    public void encontrarPalavraMaisFrequente() {
        String palavraFrequente = null;
        Integer maiorRepeticao = Integer.MIN_VALUE;

        for(Map.Entry<String, Integer> p : mapPalavras.entrySet()) {
            if(p.getValue() > maiorRepeticao) {
                maiorRepeticao = p.getValue();
                palavraFrequente = p.getKey();
            }
        }

        System.out.println(palavraFrequente);
    }
}