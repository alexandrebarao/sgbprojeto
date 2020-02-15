/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package defaultpackage;

import contasbancarias.ContaOrdem;
import contasbancarias.ContaPrazo;

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
        
        ContaOrdem c = new ContaOrdem();
                
        System.out.println(c);
        
        ContaPrazo p = new ContaPrazo();
        p.depositar(100);
        p.depositar(100);
        System.out.println(p.getSaldo());
        p.levantar(p.getSaldo());
        p.depositar(500);
        System.out.println(p.getSaldo());
        
    }
    
}
