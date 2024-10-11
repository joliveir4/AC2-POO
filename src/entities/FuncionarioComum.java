package entities;

public class FuncionarioComum extends FuncionarioBase {

    // Construtor Padrao
    public FuncionarioComum(){}

    // Construtor
    public FuncionarioComum(String nome, String cargo, double salarioBase) {
        super(nome,cargo,salarioBase);
    }

    // Implementação do cálculo de salário sem nenhum ajuste adicional
    @Override
    public double calcularSalario() {
        return salarioBase;
    }
}

