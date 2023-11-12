/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.pedro.model;

import java.time.LocalDate;
import java.util.Scanner;

public class Cliente extends Pessoa {

    static LocalDate dia = LocalDate.now();
    Scanner sc = new Scanner(System.in);
    private String cidade;
    private int idade;
    private static LocalDate dn;
    private Motocicleta moto;

    public Cliente(String cidade, String nome, String cpf, int ano, int mes, int dia) throws Exception {
        super(nome, cpf);
        this.cidade = cidade;
        this.idade = validaIdade(ano, mes, dia);

    }

    public Cliente(String cidade, String nome, String cpf, int ano, int mes, int dia, Motocicleta moto) throws Exception {
        super(nome, cpf);
        this.moto = moto;
        this.cidade = cidade;
        this.idade = validaIdade(ano, mes, dia);

    }

    public int validaIdade(int ano, int mes, int diadomes) throws Exception {
        LocalDate diahoje = LocalDate.now();

        int idade = diahoje.getYear() - ano;
        if (mes < diahoje.getMonthValue()) {
            idade--;
        } else {
            if (diadomes < diahoje.getDayOfMonth()) {
                idade--;
            }
        }
        if (idade < 18) {
            throw new Exception("Cliente Menor de 18 anos!");

        } else {
            this.dn = dn;
            System.out.println("Cliente cadastrado n-" + BancoDeDados.getClientes().size());

        }

        return idade;
    }

    public Scanner getScanner() {
        return sc;
    }

    public void setScanner(Scanner scanner) {
        this.sc = scanner;
    }

    public LocalDate getDia() {
        return dia;
    }

    public void setDia(LocalDate dia) {
        this.dia = dia;
    }

    public LocalDate getDn() {

        return dn;
    }

    public void setDn(LocalDate dn) {
        this.dn = dn;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Motocicleta getMoto() {
        return moto;
    }

    public void setMoto(Motocicleta moto) {
        this.moto = moto;
    }

    @Override
    public String toString() {
        return "\nNome = " + nome
                + "\nCPF = " + cpf
                + "\nCidade = " + cidade
                + "\nIdade = " + idade
                + "\nMoto:  = " + moto;

    }
}
