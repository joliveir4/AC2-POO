package entities;

public class Diretor extends FuncionarioBase {
    private double bonusPercentual;
    private double auxilioMoradia;

    // Construtor Padrao
    public Diretor(){}

    // Construtor
    public Diretor(String nome, String cargo, double salarioBase, double bonusPercentual, double auxilioMoradia) {
        super(nome,cargo,salarioBase);
        this.bonusPercentual = bonusPercentual;
        this.auxilioMoradia = auxilioMoradia;
    }

    // Implementação do cálculo de salário com bônus e auxílio-moradia
    @Override
    public double calcularSalario() {
        return salarioBase + (salarioBase * this.bonusPercentual / 100) + this.auxilioMoradia;
    }

    // Sobrescrita do toString para incluir o bônus e o auxílio-moradia
    @Override
    public String toString() {
        return "Nome: " + nome + ", Cargo: " + getCargo() +
                ", Salário Base: " + salarioBase + ", Bônus: " + bonusPercentual + "%" +
                ", Auxílio-Moradia: " + auxilioMoradia +
                ", Salário Total: " + calcularSalario();
    }
}

