public class App {
    public static void main(String[] args) throws Exception {
        CarrinhoDeCompras c = new CarrinhoDeCompras();
        c.adicionarItem("teste", 3.12, 4);
        c.calcularValorTotal();
    }
}
