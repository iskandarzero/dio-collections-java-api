import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> setPalavras;

    public ConjuntoPalavrasUnicas() {
        this.setPalavras = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        setPalavras.add(palavra);
    }

    public void removerPalavra(String palavra) {
        setPalavras.remove(palavra);
    }

    public void verificarPalavra(String palavra) {
        if(setPalavras.contains(palavra)) {
            System.out.println("O conjunto contém a palavra " + palavra);
        } else {
            System.out.println("O conjunto não contém a palavra " + palavra);
        };
    }
    
    public void exibirPalavrasUnicas() {
        System.out.println(setPalavras);
    }
}
