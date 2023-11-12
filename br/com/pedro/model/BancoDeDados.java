/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.pedro.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Pedro meu amor
 */
public class BancoDeDados {

    private static Date data = new Date();
    static LocalDate dia = LocalDate.now();
    private static List<Cliente> clientes = new ArrayList();
    private static List<Motocicleta> motos = new ArrayList();
    private static List<Venda> vendas = new ArrayList();
    private static TipoPagamento pag;

    public static void adicionaBdCliente(Scanner sc) throws Exception {

        System.out.println("Nome (Ao menos 3 caracteres):");
        String nome = sc.next();
        if (nome.length() < 3) {
            throw new Exception("Insira ao menos 3 caracteres");
        }
        System.out.println("CPF (11 dígitos):");
        String cpf = sc.next();
        System.out.println("Cidade:");
        String cidade = sc.next();

        System.out.println("Ano nasc:");
        int ano = sc.nextInt();
        if (ano > dia.getYear() || ano < 1900) {
            throw new Exception("Insira um ano válido");
        }
        System.out.println("Mes nasc:");
        int mes = sc.nextInt();
        if (mes < 1 || mes > 12) {
            throw new Exception("Insira um mÊs válido");
        }
        System.out.println("dia nasc:");
        int dia = sc.nextInt();
        if (dia < 1 || dia > 31) {
            throw new Exception("Insira um dia válido");
        }

        Cliente clienteCad = new Cliente(cidade, nome, cpf, ano, mes, dia);

        BancoDeDados.getClientes().add(clienteCad);

    }

    public static void adicionaBdMoto(Scanner sc) {
        System.out.println("Marca:");
        String marca = sc.next();
        System.out.println("Modelo:");
        String modelo = sc.next();
        System.out.println("Cor: [0]Branco - [1]Vermelho - [2]Preto - [3]Azul - [4]Verde");
        CorMoto cores = null;
        try {
            cores = CorMoto.values()[sc.nextInt()];
        } catch (Exception e) {
            System.out.println("Numero de cor não encontrado");
        }

        System.out.println("Cilindrada");
        int cilindrada = sc.nextInt();
        System.out.println("Quilometragem");
        long quilometragem = sc.nextLong();
        System.out.println("Preço");
        String preco = (sc.next());
        double preco2 = Double.parseDouble(preco);

        Motocicleta motoCad = new Motocicleta(marca, modelo, cores, cilindrada, quilometragem, preco2);

        System.out.println("Moto Cadastrada");

        BancoDeDados.getMotos().add(motoCad);

    }

    public static void adicionaBdVenda(Scanner sc) throws Exception {
        Vendedor v1 = new Vendedor(01, 2000, "claudio", "12345678911");
        System.out.println("Cod venda:");
        String cod = sc.next();
        System.out.println("Qual cliente:");
        int clientesc = sc.nextInt();
        Cliente c1 = BancoDeDados.getClientes().get(clientesc);
        System.out.println("Qual moto:");
        int motosc = sc.nextInt();
        Motocicleta m1 = BancoDeDados.getMotos().get(motosc);
        Venda vendaLast = new Venda(cod, data, c1, v1, m1, pag.A_VISTA);
        System.out.println("Salario do vendedor: " + v1.calculaSalario(BancoDeDados.getMotos().get(motosc).getPreco()));
        c1.setMoto(m1); //setando a moto pro cliente
        BancoDeDados.getMotos().remove(motosc);
        BancoDeDados.getVendas().add(vendaLast);
        System.out.println("Venda Realizada");
    }

    public static void listaMotos() {
        for (Motocicleta m : motos) {
            System.out.println(m);
        }
    }

    public static void listaClientes() {
        for (Cliente c : clientes) {
            System.out.println(c);
        }
    }

    public static void listaVendas() {
        for (Venda v : vendas) {
            System.out.println(v);
        }
    }

    public static LocalDate getDia() {
        return dia;
    }

    public static void setDia(LocalDate dia) {
        BancoDeDados.dia = dia;
    }

    public static List<Cliente> getClientes() {
        return clientes;
    }

    public static void setClientes(List<Cliente> clientes) {
        BancoDeDados.clientes = clientes;
    }

    public static List<Motocicleta> getMotos() {
        return motos;
    }

    public static void setMotos(List<Motocicleta> motos) {
        BancoDeDados.motos = motos;
    }

    public static Date getData() {
        return data;
    }

    public static void setData(Date data) {
        BancoDeDados.data = data;
    }

    public static List<Venda> getVendas() {
        return vendas;
    }

    public static void setVendas(List<Venda> vendas) {
        BancoDeDados.vendas = vendas;
    }

    public static TipoPagamento getPag() {
        return pag;
    }

    public static void setPag(TipoPagamento pag) {
        BancoDeDados.pag = pag;
    }

}
