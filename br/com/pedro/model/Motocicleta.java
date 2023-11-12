/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.pedro.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author pedru
 */
public class Motocicleta {

    private String marca;
    private String modelo;
    private CorMoto cor;
    private int cilindrada;
    private long quilometragem;
    private double preco;
    private static List<Motocicleta> motos = new ArrayList();

    public Motocicleta(String marca, String modelo, CorMoto cor, int cilindrada, long quilometragem, double preco) {

        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.cilindrada = cilindrada;
        this.quilometragem = quilometragem;
        this.preco = preco;
        System.out.println("Moto Cadastrada: n-" + BancoDeDados.getMotos().size());

    }

    public static void listaMoto() {
        for (Motocicleta m : motos) {
            System.out.println(m);
        }

    }

    public static void motoDoScanner(Scanner sc) throws Exception {

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
        motoCad.getMotos().add(motoCad);
        System.out.println("Moto Cadastrada" +BancoDeDados.getMotos().size());

    }

    public List<Motocicleta> getMotos() {
        return motos;
    }

    public void setMotos(List<Motocicleta> motos) {
        Motocicleta.motos = motos;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public CorMoto getCor() {
        return cor;
    }

    public void setCor(CorMoto cor) {
        this.cor = cor;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public long getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(long quilometragem) {
        this.quilometragem = quilometragem;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Motocicleta: "+ BancoDeDados.getMotos().indexOf(this)+ " \nMarca = " + marca + "- Modelo = " + modelo + "\n cor = " + cor + " cilindrada = " + cilindrada
                + "\n quilometragem = " + quilometragem + " preco = " + preco+"\n";
    }

}
