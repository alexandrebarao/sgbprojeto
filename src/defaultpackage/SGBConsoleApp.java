/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package defaultpackage;

import contasbancarias.ContaOrdem;
import contasbancarias.ContaPrazo;
import banco.*;
import entidades.Cliente;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import movimentos.Deposito;
import movimentos.Levantamento;
import movimentos.Transferencia;
import padroes.Composto;
import padroes.Elemento;

/**
 *
 * @author Administrator
 */
public class SGBConsoleApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Banco b = Banco.getInstance();
        
        
        b.setDataSistema(2020, 1, 1);
        ContaOrdem c = new ContaOrdem(b);
        c.depositar(5000);
        ContaPrazo p = new ContaPrazo(b); // foi data sistema 18 / 2
        p.depositar(1000);
        b.setDataSistema(2021, 1, 1);
       
        Cliente c1 = new Cliente("Sérgio", 1001011, "s@s.pt");
        Cliente c2 = new Cliente("Raquel", 102011, "r@s.pt");
        b.getListaClientes().add(c1);
        b.getListaClientes().add(c2);
        
        p.getListaClientes().add(c1);
        p.getListaClientes().add(c2);
        
        System.out.println(b.getListaClientes().get(0).toString());
        System.out.println(b.getListaClientes().get(1).toString());
        System.out.println(p.getListaClientes().get(0).toString());        
        System.out.println(p.getListaClientes().get(1).toString());     
        
        b.getListaContas().add(p);
        b.getListaContas().add(c);
       
        System.out.println(b.consultaContasClientes());
        
        
    }
    
}
