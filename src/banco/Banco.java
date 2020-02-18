/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Administrator
 */
public class Banco {
    
    private  LocalDate dataSistema;
 
    public Banco() {
//        Date d = new Date();
//        dataSistema = LocalDate.of(d.getYear(), d.getMonth(), d.getDay());
          dataSistema = LocalDate.now();
    }

    public LocalDate getDataSistema() {
        return dataSistema;
    }

    public void setDataSistema(int ano, int mes, int dia) {
        dataSistema = LocalDate.of(ano, mes, dia);
        
    }

   
    
}
