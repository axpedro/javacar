/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.pedro.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Venda {

    Scanner sc = new Scanner(System.in);
    private String codVenda;
    private Date data = new Date();
    private Cliente cliente;
    private Vendedor vendedor;
    private Motocicleta moto;

    private TipoPagamento pag;

    
    public Venda(String codVenda, Date data, Cliente cliente, Vendedor vendedor, Motocicleta moto, TipoPagamento pag) throws Exception {
        this.codVenda = codVenda;
        this.data = data;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.moto = moto;
        this.pag = pag;

    }

    public String getCodVenda() {
        return codVenda;
    }

    public void setCodVenda(String codVenda) {
        this.codVenda = codVenda;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Motocicleta getMoto() {
        return moto;
    }

    public void setMoto(Motocicleta moto) {
        this.moto = moto;
    }

    public TipoPagamento getPag() {
        return pag;
    }

    public void setPag(TipoPagamento pag) {
        this.pag = pag;
    }

    @Override
    public String toString() {
        return "---Código venda: " + this.codVenda + "---"
                + "\n Nome Cliente: "
                + this.cliente.getNome()
                + "\n Moto: "
                + this.moto.getModelo()
                + "\n Data da venda: "
                + this.data
                + "\n Tipo de pagamento: "
                + this.pag;
    }

}
