import java.util.ArrayList;
import java.util.Scanner;

class GerenciadorFuncionarios {
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void adicionarFuncionario() {
        System.out.println("\nAdicionar Funcionário");
        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();
        System.out.print("Digite a matrícula do funcionário: ");
        int matricula = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Escolha o tipo de funcionário:");
        System.out.println("1- Gerente");
        System.out.println("2- Desenvolvedor");
        System.out.println("3- Estagiário");
        int tipo = scanner.nextInt();
        scanner.nextLine();

        switch (tipo) {
            case 1:
                System.out.print("Digite o bônus anual do gerente: ");
                double bonusAnual = scanner.nextDouble();
                scanner.nextLine();
                System.out.print("Digite a equipe do gerente: ");
                String equipe = scanner.nextLine();
                funcionarios.add(new Gerente(nome, matricula, bonusAnual, equipe));
                break;
            case 2:
                ArrayList<String> tecnologias = new ArrayList<>();
                System.out.print("Digite as linguagens que domina separadamente: ");
                String[] tecnologiasArray = scanner.nextLine();
                for (String tecnologia : tecnologiasArray) {
                    tecnologias.add(tecnologia.trim());
                }
                funcionarios.add(new Desenvolvedor(nome, matricula, tecnologias));
                break;
            case 3:
                System.out.print("Digite as horas de trabalho do estagiário: ");
                int horasTrabalhadas = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Digite o nome do supervisor do estagiário: ");
                String supervisor = scanner.nextLine();
                funcionarios.add(new Estagiario(nome, matricula, horasTrabalhadas, supervisor));
                break;
            default:
                System.out.println("Tipo de funcionário inválido!");
                break;
        }
    }

    public void removerFuncionario() {
        System.out.println("\nRemover Funcionário");
        System.out.print("Digite a matrícula do funcionário que deseja remover: ");
        int matricula = scanner.nextInt();
        scanner.nextLine();

        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getMatricula() == matricula) {
                funcionarios.remove(funcionario);
                System.out.println("Funcionário removido com sucesso!");
                return;
            }
        }
        System.out.println("Funcionário não encontrado!");
    }

    public void listarFuncionarios() {
        System.out.println("\nListar Funcionários");
        if (funcionarios.isEmpty()) {
            System.out.println("Não há funcionários cadastrados·");
            return;
        }
        for (Funcionario funcionario : funcionarios) {
            System.out.println("Nome: " + funcionario.getNome() + " | Matrícula: " + funcionario.getMatricula() + " | Salário: R$" + funcionario.calcularSalario());
        }
    }

    public void buscarFuncionario() {
        System.out.println("\nBuscar Funcionário");
        System.out.println("1- Buscar por nome");
        System.out.println("2- Buscar por matrícula");
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao) {
            case 1:
                System.out.print("Digite o nome do funcionário: ");
                String nome = scanner.nextLine();
                for (Funcionario funcionario : funcionarios) {
                    if (funcionario.getNome().equalsIgnoreCase(nome)) {
                        System.out.println("Funcionário encontrado:");
                        System.out.println("Nome: " + funcionario.getNome() + " | Matrícula: " + funcionario.getMatricula() + " | Salário: R$" + funcionario.calcularSalario());
                        return;
                    }
                }
                System.out.println("Funcionário não encontrado.");
                break;
            case 2:
                System.out.print("Digite a matrícula do funcionário: ");
                int matricula = scanner.nextInt();
                for (Funcionario funcionario : funcionarios) {
                    if (funcionario.getMatricula() == matricula) {
                        System.out.println("Funcionário encontrado:");
                        System.out.println("Nome: " + funcionario.getNome() + " | Matrícula: " + funcionario.getMatricula() + " | Salário: R$" + funcionario.calcularSalario());
                        return;
                    }
                }
                System.out.println("Funcionário não encontrado.");
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }
}
