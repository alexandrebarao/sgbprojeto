/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package defaultpackage;

import contasbancarias.ContaOrdem;
import contasbancarias.ContaPrazo;
import banco.*;
import java.util.Date;

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
        Banco b = new Banco();
        ContaOrdem c = new ContaOrdem(b);
                
        System.out.println(c);
        
        ContaPrazo p = new ContaPrazo(b); // foi data sistema 18 / 2
        p.depositar(1000);
        
       // b.setDataSistema(2020, 6, 27);
     
        System.out.println(p);
        
        b.setDataSistema(2020, 2, 28);
        
        System.out.println(p);
        
        b.setDataSistema(2020, 3, 1);
        System.out.println(p);
        p.levantar(p.getSaldo());
        
          System.out.println(p); 
        p.depositar(500);
         b.setDataSistema(2020, 3, 10);
         System.out.println(p); 
        // b.setDataSistema(d);
      LocalDate.of
        
        for ( int i = 1; i <=10; i++ ) {
            
            b.setDataSistema(2020, 2+i, 28);
            System.out.println(b.getDataSistema() + " Mês: " + (i+2) + " "+ p); 
        }
        
        /*
        
        p.depositar(100);
        p.depositar(100);
        System.out.println(p.getSaldo());
        p.levantar(p.getSaldo());
        p.depositar(500);
        System.out.println(p.getSaldo());
        */
    }
    
}
