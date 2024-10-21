package entities;

public class FuncionarioComum extends FuncionarioBase implements Descontos{

    // Construtor Padrao
    public FuncionarioComum(){}

    // Construtor
    public FuncionarioComum(String nome, String cargo, double salarioBase) {
        super(nome,cargo,salarioBase);
    }

    // Implementação do cálculo de salário sem nenhum ajuste adicional
    @Override
    public double calcularSalario() {
        double salarioFinal = salarioBase;
        return salarioFinal;
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
                ", Salário Base/Total: " + salarioBase +
                ", Salário com Desconto: " + calcularDesconto(10);
    }
}

