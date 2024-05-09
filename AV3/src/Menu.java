class Menu {
    private GerenciadorFuncionarios gerenciador;
    private Scanner scanner = new Scanner(System.in);

    public Menu(GerenciadorFuncionarios gerenciador) {
        this.gerenciador = gerenciador;
    }

    public void exibirMenu() {
        System.out.println("\nMenu");
        System.out.println("1- Adicionar Funcionário");
        System.out.println("2- Remover Funcionário");
        System.out.println("3- Listar Funcionários");
        System.out.println("4- Buscar Funcionário");
        System.out.println("0- Sair");
        System.out.print("Escolha uma opção: ");
    }

    public void executar() {
        int opcao;
        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    gerenciador.adicionarFuncionario();
                    break;
                case 2:
                    gerenciador.removerFuncionario();
                    break;
                case 3:
                    gerenciador.listarFuncionarios();
                    break;
                case 4:
                    gerenciador.buscarFuncionario();
                    break;
                case 0:
                    System.out.println("Saindo do sistema···");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 0);
    }
}
