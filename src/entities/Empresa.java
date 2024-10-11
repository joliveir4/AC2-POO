package entities;

import java.util.ArrayList;

public class Empresa{
    public String nome;
    private ArrayList<FuncionarioBase> funcionarios;

    // Construtor
    public Empresa(String nome) {
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

    // Metodo para calcular a receita total (soma de salários)
    public double calcularSalarioTotal() {
        double total = 0; // Inicializa a variável total como 0
        for (FuncionarioBase funcionario : funcionarios) {
            total += funcionario.calcularSalario();
        }
        return total;
    }

    // Metodo para imprimir os salários e detalhes de todos os funcionários (polimorfismo)
    public void imprimirSalariosFuncionarios() {
        for (FuncionarioBase funcionario : funcionarios) {
            System.out.println(funcionario.toString());
        }
    }

}

