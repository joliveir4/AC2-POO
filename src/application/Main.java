package application;

import entities.Diretor;
import entities.Empresa;
import entities.FuncionarioComum;
import entities.Gerente;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Facens");
        String nomeEmpresa = empresa.nome;

        // Criando os funcionários
        FuncionarioComum funcionario = new FuncionarioComum("João", "Funcionario Comum",3000);
        Gerente gerente = new Gerente("Kaue","Gerente", 15000, 20);
        Diretor diretor = new Diretor("Gabriel","Diretor", 20000, 10, 2000);

        // Adicionando funcionários à empresa
        empresa.adicionarFuncionario(funcionario);
        empresa.adicionarFuncionario(gerente);
        empresa.adicionarFuncionario(diretor);


        // Imprimindo os salários e detalhes dos funcionários
        System.out.println("Novos colaboradores da " +nomeEmpresa+ ":");
        empresa.imprimirSalariosFuncionarios();

        // Calculando a soma dos salários
        double salarioTotal = empresa.calcularSalarioTotal();
        System.out.println("Soma do salário dos colaboradores: " + salarioTotal);
        System.out.println();

        empresa.removerFuncionario(funcionario);
        empresa.removerFuncionario(gerente);

        // Imprimindo os salários e detalhes dos funcionários
        System.out.println("Lista atualizada de colaboradores da " +nomeEmpresa+ ":");
        empresa.imprimirSalariosFuncionarios();

        // Calculando a soma dos salários
        salarioTotal = empresa.calcularSalarioTotal();
        System.out.println("Soma do salário dos colaboradores: " + salarioTotal);
    }
}


