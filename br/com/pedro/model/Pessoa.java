/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.pedro.model;

/**
 *
 * @author pedru
 */
public abstract class Pessoa {

 protected  String nome;
 protected  String cpf;

    public Pessoa(String nome, String cpf) throws Exception {
        if (nome.length() < 3) {
            throw new Exception("Insira ao menos 3 caracteres no nome!");
        }
        this.nome = nome;
        boolean cpfvalido = cpf.matches("^\\d{11}+$"); // verifica se tem letras na string e se tem 11 caracteres
        if (!cpfvalido) {
            throw new Exception("Insira um CPF válido!");
        }
        
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
