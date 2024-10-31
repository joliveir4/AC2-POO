package entities;

import java.util.ArrayList;

public class Departamento {
    public String nome;
    private ArrayList<FuncionarioBase> funcionarios;

    // Construtor Padrao
    public Departamento(){}

    // Construtor
    public Departamento(String nome) {
        this.nome = nome;
        this.funcionarios = new ArrayList<>();
    }

    // Metodo para adicionar um funcionário
    public void adicionarFuncionario(FuncionarioBase funcionario) {
        funcionarios.add(funcionario);
    }

    // Metodo para remover um funcionário
    public void removerFuncionario(FuncionarioBase funcionario) {
        funcionarios.remove(funcionario);
    }

    // Polimorfismo - Chamo o metodo calcularSalario que está declarado na classe dos funcionarios.
    public double calcularTotalAPagar() {
        double totalAPagar = 0;
        for (FuncionarioBase funcionario : funcionarios) {
            totalAPagar += funcionario.calcularSalario();
        }
        return totalAPagar;
    }

    // Polimorfismo - Chamo o metodo toString que está declarado na classe dos funcionarios.
    public void imprimirSalariosFuncionarios() {
        for (FuncionarioBase funcionario : funcionarios) {
            System.out.println(funcionario.toString());
        }
    }

}

