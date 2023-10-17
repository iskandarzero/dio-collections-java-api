public class App {
    public static void main(String[] args) throws Exception {
        OrdenacaoNumeros o = new OrdenacaoNumeros();
        o.adicionarNumero(1);
        o.adicionarNumero(12);
        o.adicionarNumero(3);
        o.adicionarNumero(5);
        o.adicionarNumero(2);
        o.adicionarNumero(7);
        System.out.println(o.ordenarAscendente());
        System.out.println(o.ordenarDescendente());
    }
}
