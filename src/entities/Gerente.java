package entities;

public class Gerente extends FuncionarioBase implements Descontos{
    private double bonusPercentual;

    // Construtor Padrao
    public Gerente(){}

    // Construtor
    public Gerente(String nome, String cargo, double salarioBase, double bonusPercentual) {
        super(nome,cargo,salarioBase);
        this.bonusPercentual = bonusPercentual;
    }

    // Implementação do cálculo de salário com bônus
    @Override
    public double calcularSalario() {
        double salarioSemDesconto = salarioBase + (salarioBase * this.bonusPercentual / 100);
        return salarioSemDesconto;
    }

    @Override
    public double calcularDesconto(double porcentagem) {
        double salarioSemDesconto = calcularSalario();
        return salarioSemDesconto - (salarioSemDesconto * porcentagem / 100);
    }

    // Sobrescrita do toString para incluir o bônus
    @Override
    public String toString() {
        return "Nome: " + nome + ", Cargo: " + getCargo() +
                ", Salário Base: " + salarioBase + ", Bônus: " + bonusPercentual + "%"+
                ", Salário Total: " + calcularSalario() +
                ", Salario com Descontos: " + calcularDesconto(10);
    }


}

