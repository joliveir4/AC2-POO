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

    public String toString() {
        return "Nome: " + getNome() + ", Cargo: " + getCargo() + ", Salário Base: " + getSalarioBase() + ", Salário Total: " + calcularSalario();
    }

}

