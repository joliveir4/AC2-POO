package entities;

public class Gerente extends FuncionarioBase implements BeneficiosGerente{
    private double bonusPercentual;

    // Construtor Padrao
    public Gerente(){}

    // Construtor
    public Gerente(String nome, String cargo, double salarioBase, double bonusPercentual) {
        super(nome,cargo,salarioBase);
        this.bonusPercentual = bonusPercentual;
    }

    @Override
    public double calcularBonus(double percentual) {
        double bonus = getSalarioBase() * percentual / 100;
        return bonus;
    }

    // Implementação do cálculo de salário com bônus
    @Override
    public double calcularSalario() {
        double salarioFinal = getSalarioBase() + calcularBonus(bonusPercentual);
        return salarioFinal;
    }

    public double getBonusPercentual() {
        return this.bonusPercentual;
    }

    // Sobrescrita do toString para incluir o bônus
    @Override
    public String toString() {
        return "Nome: " + getNome() + ", Cargo: " + getCargo() +
                ", Salário Base: " + getSalarioBase() + ", Bônus: " + getBonusPercentual() + "%"+
                ", Salário Total: " + calcularSalario();
    }

}

