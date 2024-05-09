class Estagiario extends Funcionario {
    private int horasTrabalhadas;
    private String supervisor;

    public Estagiario(String nome, int matricula, int horasTrabalhadas, String supervisor) {
        super(nome, matricula);
        this.horasTrabalhadas = horasTrabalhadas;
        this.supervisor = supervisor;
    }

    @Override
    public double calcularSalario() {
        return horasTrabalhadas * 10;
    }

    @Override
    public void trabalhar() {
        System.out.println(getNome() + " está trabalhando com o supervisor " + supervisor);
    }

    @Override
    public void relatarProgresso() {
        System.out.println(getNome() + " está relatando seu progresso ao supervisor " + supervisor);
    }
}
