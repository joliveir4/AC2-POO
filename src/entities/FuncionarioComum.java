package entities;

public class FuncionarioComum extends FuncionarioBase{
    private double bonusAdicional;

    // Construtor Padrao
    public FuncionarioComum(){}

    // Construtor com nome,cargo,salarioBase
    public FuncionarioComum(String nome, String cargo, double salarioBase) {
        super(nome,cargo,salarioBase);
    }

    // Construtor com nome,cargo,salarioBase e bonusAdicional
    public FuncionarioComum(String nome, String cargo, double salarioBase, double bonusAdicional) {
        super(nome,cargo,salarioBase);
        this.bonusAdicional = bonusAdicional;
    }

    // Implementação do cálculo de salário sem nenhum ajuste adicional
    @Override
    public double calcularSalario() {
        double salarioFinal = getSalarioBase();
        return salarioFinal;
    }

    //Sobrecarga do metodo calcularSalario adicionando o parametro bonusAdicional
    public double calcularSalario(double bonusAdicional) {
        double salarioFinal = getSalarioBase() + bonusAdicional;
        return salarioFinal;
    }

    public double getBonusAdicional() {
        return this.bonusAdicional;
    }

    // Sobrescrita do toString para incluir o bônus
    @Override
    public String toString() {
        return "Nome: " + getNome() + ", Cargo: " + getCargo() +
                ", Salário Base/Total: " + getSalarioBase();
    }

    public String toStringComBonus(){
        return "Nome: " + getNome() + ", Cargo: " + getCargo() +
                ", Salário Base: " + getSalarioBase() +
                "Bonus de: R$ " + calcularSalario(getBonusAdicional());
    }
}

