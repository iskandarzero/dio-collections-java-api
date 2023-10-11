import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> listaNumeros;

    public SomaNumeros() {
        this.listaNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        listaNumeros.add(numero);
    }

    public void calcularSoma() {
        int resultado = 0;

        for(Integer i : listaNumeros) {
            resultado += i;
        }

        System.out.println(resultado);
    }

    public int encontrarMaiorNumero() {
        int atual = listaNumeros.get(0);

        for(Integer i : listaNumeros) {
            if(atual < i) {
                atual = i;
            }
        }

        return atual;
    }

    public int encontrarMenorNumero() {
        int atual = listaNumeros.get(0);

        for(Integer i : listaNumeros) {
            if(atual > i) {
                atual = i;
            }
        }

        return atual;
    }

    public void exibirNumeros() {
        System.out.println(listaNumeros);
    }
}
