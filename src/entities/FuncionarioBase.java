package entities;

public abstract class FuncionarioBase {
    protected String nome;
    protected String cargo;
    protected double salarioBase;

    // Construtor Padrao
    public FuncionarioBase() {}

    // Construtor
    public FuncionarioBase(String nome,String cargo, double salarioBase) {
        this.nome = nome;
        this.cargo = cargo;
        this.salarioBase = salarioBase;
    }

    // Metodo abstrato para calcular o salário
    public abstract double calcularSalario();

    // Sobrecarga do metodo calcularSalario para aceitar um desconto
    public double calcularSalario(double desconto) {
        return calcularSalario() - desconto;
    }



    // Mdtodo para obter detalhes do salário e adicionais (implementado nas subclasses)
    public String toString() {
        return "Nome: " + nome + ", Cargo: " + getCargo() + ", Salário Base: " + salarioBase + ", Salário Total: " + calcularSalario();
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public String getCargo() {
        return this.cargo;
    }
}

