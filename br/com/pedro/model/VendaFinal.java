package br.com.pedro.model;

import static br.com.pedro.model.BancoDeDados.adicionaBdVenda;
import static br.com.pedro.model.Motocicleta.listaMoto;
import static br.com.pedro.model.Motocicleta.motoDoScanner;
import static br.com.pedro.model.TipoPagamento.A_VISTA;

import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;
import br.com.pedro.view.Menu;
import java.util.List;

/**
 *
 * @author pedru
 */
public class VendaFinal {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        try {
            Motocicleta moto1 = new Motocicleta("Honda", "cb-100", CorMoto.PRETO, 100, 0, 15000.00);
            BancoDeDados.getMotos().add(moto1);
            Motocicleta moto2 = new Motocicleta("Honda", "cb-250", CorMoto.BRANCO, 250, 0, 25000.00);
            BancoDeDados.getMotos().add(moto2);
            Motocicleta moto3 = new Motocicleta("Yamaha", "y-350", CorMoto.AZUL, 350, 0, 45000.00);
            BancoDeDados.getMotos().add(moto3);

            Cliente joey = new Cliente("Chapeco", "Joey", "07678213567", 2000, 11, 24);
            BancoDeDados.getClientes().add(joey);
            Cliente felipe = new Cliente("Curitiba", "Felipe", "11672213568", 1999, 11, 21, new Motocicleta("Honda", "cb-200", CorMoto.VERMELHO, 100, 0, 99000.00));
            BancoDeDados.getClientes().add(felipe);
            Cliente leandro = new Cliente("Chapeco", "Leandro", "22672218669", 1988, 9, 24);
            BancoDeDados.getClientes().add(leandro);

        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }

        int opcao = 999;
        do {
            Menu.menu();
            try {
                switch (opcao = sc.nextInt()) {
                    case 1:
                        BancoDeDados.adicionaBdCliente(sc);
                        break;
                    case 2:
                        BancoDeDados.listaMotos();
                        break;
                    case 3:
                        BancoDeDados.adicionaBdMoto(sc);
                        break;
                    case 4:
                        BancoDeDados.listaClientes();
                        break;
                    case 5:
                        adicionaBdVenda(sc);
                        break;
                    case 6:
                        if (BancoDeDados.getVendas().isEmpty()) {
                            System.out.println("!! Sem vendas registradas !!");
                        }
                        BancoDeDados.listaVendas();
                        break;
                    case 7:
                        System.out.println("Saindo!");
                        break;
                    default:
                        System.out.println("Digite uma opção válida");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Digite apenas valores válidos");
                sc.nextLine();
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Moto/Cliente - não localizado no banco");
                sc.nextLine();
            } catch (Exception e) {
                System.out.println("Cadastrado não realizado! " + e.getMessage());
                sc.nextLine();
            }

        } while (opcao != 7);

        System.out.println("Até mais!");

    }

}
