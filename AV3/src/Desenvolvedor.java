class Desenvolvedor extends Funcionario {
    private ArrayList<String> tecnologias;

    public Desenvolvedor(String nome, int matricula, ArrayList<String> tecnologias) {
        super(nome, matricula);
        this.tecnologias = tecnologias;
    }

    @Override
    public double calcularSalario() {
        return 3000;
    }

    @Override
    public void trabalhar() {
        System.out.println(getNome() + " está desenvolvendo·");
    }

    @Override
    public void relatarProgresso() {
        System.out.println(getNome() + " está relatando o progresso·");
    }
}
