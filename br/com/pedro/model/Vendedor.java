/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.pedro.model;

/**
 *
 * @author pedru
 */
public class Vendedor extends Pessoa {

    private int matricula;
    private double salario;
    private static double comissao = 0.10;

    public Vendedor(String nome, String cpf) throws Exception {
        super(nome, cpf);
    }

    public Vendedor(int matricula, double salario, String nome, String cpf) throws Exception {
        super(nome, cpf);
        this.matricula = matricula;
        this.salario = salario;

    }

    public double calculaSalario(double preco) {
        salario += comissao * preco;

        return salario;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public static double getComissao() {
        return comissao;
    }

    public static void setComissao(double comissao) {
        Vendedor.comissao = comissao;
    }

    

    @Override
    public String toString() {
        return "Vendedor{" + "matricula=" + matricula + ", salario=" + salario + '}';
    }

}
