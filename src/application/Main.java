package application;

import entities.Diretor;
import entities.Departamento;
import entities.FuncionarioComum;
import entities.Gerente;

public class Main {
    public static void main(String[] args) {
        Departamento empresa = new Departamento("Facens");
        String nomeEmpresa = empresa.nome;

        // Criando os funcionários
        FuncionarioComum funcionario = new FuncionarioComum("João", "Funcionario Comum",3000);
        FuncionarioComum funcionarioComBonus = new FuncionarioComum("Kaue", "Funcionario Comum",3000,300);
        Gerente gerente = new Gerente("Maria","Gerente", 5000 , 20);
        Diretor diretor = new Diretor("Carlos","Diretor", 10000,30 , 2000);

        // Adicionando funcionários à empresa
        empresa.adicionarFuncionario(funcionario);
        empresa.adicionarFuncionario(funcionarioComBonus);
        empresa.adicionarFuncionario(gerente);
        empresa.adicionarFuncionario(diretor);


        // Imprimindo os salários e detalhes dos funcionários
        System.out.println("Novos colaboradores da " +nomeEmpresa+ ":");
        empresa.imprimirSalariosFuncionarios();

        // Calculando a soma dos salários
        double salarioTotal = empresa.calcularTotalAPagar();
        System.out.println("Total a pagar aos funcionarios do departamento de Tecnologia: " + salarioTotal);
        System.out.println();

        empresa.removerFuncionario(funcionario);
        empresa.removerFuncionario(gerente);

        // Imprimindo os salários e detalhes dos funcionários
        System.out.println("Lista atualizada de colaboradores da " +nomeEmpresa+ ":");
        empresa.imprimirSalariosFuncionarios();

        // Calculando a soma dos salários
        salarioTotal = empresa.calcularTotalAPagar();
        System.out.println("Total a pagar aos funcionarios do departamento de Tecnologia: " + salarioTotal);
    }
}


