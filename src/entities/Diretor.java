package entities;

public class Diretor extends FuncionarioBase implements BeneficiosDiretor {
    private double bonusPercentual;
    private double auxilioMoradia;

    // Construtor Padrao
    public Diretor() {
    }

    // Construtor
    public Diretor(String nome, String cargo, double salarioBase, double bonusPercentual, double auxilioMoradia) {
        super(nome, cargo, salarioBase);
        this.bonusPercentual = bonusPercentual;
        this.auxilioMoradia = auxilioMoradia;
    }

    @Override
    public double calcularAuxilioMoradia(double valorFixado) {
        return valorFixado;
    }

    @Override
    public double calcularBonus(double percentual) {
        double bonus = getSalarioBase() * percentual / 100;
        return bonus;
    }


    // Calculo de salário com bônus e auxílio-moradia
    @Override
    public double calcularSalario() {
        double salarioSemDesconto = getSalarioBase() + calcularBonus(bonusPercentual) + calcularAuxilioMoradia(auxilioMoradia);
        return salarioSemDesconto;
    }

    public double getAuxilioMoradia() {
        return this.auxilioMoradia;
    }

    public double getBonusPercentual() {
        return this.bonusPercentual;
    }

    // Sobrescrita do toString para incluir o bônus e o auxílio-moradia
    @Override
    public String toString() {
        return "Nome: " + getNome() + ", Cargo: " + getCargo() +
                ", Salário Base: " + getSalarioBase() + ", Bônus: " + getBonusPercentual() + "%" +
                ", Auxílio-Moradia: " + getAuxilioMoradia() +
                ", Salário Total: " + calcularSalario();
    }


}



