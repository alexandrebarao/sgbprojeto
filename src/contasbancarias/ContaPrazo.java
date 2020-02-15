/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contasbancarias;

import java.util.Date;

/**
 *
 * @author Administrator
 */
public class ContaPrazo extends Conta {
    private Date dataCriacaoMovimento;
    private double taxaJuro;
    private boolean podeDepositar; 
    
    public ContaPrazo() {
        podeDepositar = true;
    }

    @Override
    public boolean depositar(double valor) {
        boolean estado = false;
        if ( podeDepositar )  { // o mesmo que if ( podeDepositar = true ) 
            
            super.depositar(valor);
            // gerar movimento... na classe abstracta
            
            podeDepositar = false;
            estado = true;
        }
        
        return estado; 
    }

    
    @Override
    public boolean levantar(double valor) {
        
        //liquidar
        depositar(calculaJuros());
        super.levantar(getSaldo());
        // gerar movimento Levantar
        podeDepositar = true;
        return true;
    }
    
    private double calculaJuros() {
        return 10; // to do 
    }

   
    
    
}
