package entities;

import java.util.ArrayList;

public class Empresa{
    public String nome;
    private ArrayList<FuncionarioBase> funcionarios;


    // Construtor Padrao
    public Empresa(){}

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

    // Metodo para calcular a soma de salários
    public double calcularSalarioTotal() {
        double salarioTotal = 0; // Inicializa a variável total como 0
        for (FuncionarioBase funcionario : funcionarios) {
            salarioTotal += funcionario.calcularSalario();
        }
        return salarioTotal;
    }

    // Metodo para imprimir os salários e detalhes de todos os funcionários.
    public void imprimirInfoFuncionarios() {
        for (FuncionarioBase funcionario : funcionarios) {
            System.out.println(funcionario.toString());
        }
    }

}

