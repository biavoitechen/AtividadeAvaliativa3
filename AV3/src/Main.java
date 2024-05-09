public class Main {
    public static void main(String[] args) {
        GerenciadorFuncionarios gerenciador = new GerenciadorFuncionarios();
        Menu menu = new Menu(gerenciador);
        menu.executar();
    }
}
