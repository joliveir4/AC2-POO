package entities;

public class Diretor extends FuncionarioBase implements Descontos{
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

    // Calculo de salário com bônus e auxílio-moradia
    @Override
    public double calcularSalario() {
        double salarioSemDesconto =  salarioBase + (salarioBase * this.bonusPercentual / 100) + this.auxilioMoradia;
        return salarioSemDesconto;
    }

    @Override
    public double calcularDesconto(double porcentagem) {
        double salarioSemDesconto = calcularSalario();
        return salarioSemDesconto - (salarioSemDesconto * porcentagem / 100);
    }

    // Sobrescrita do toString para incluir o bônus e o auxílio-moradia
    @Override
    public String toString() {
        return "Nome: " + nome + ", Cargo: " + getCargo() +
                ", Salário Base: " + salarioBase + ", Bônus: " + bonusPercentual + "%" +
                ", Auxílio-Moradia: " + auxilioMoradia +
                ", Salário Total: " + calcularSalario() +
                ", Salario com Descontos: " + calcularDesconto(10);
    }

}

