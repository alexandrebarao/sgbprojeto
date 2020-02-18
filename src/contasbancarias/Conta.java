/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contasbancarias;
import banco.*;

import java.util.Date;

/**
 *
 * @author Administrator
 */
public abstract class Conta {
    private Banco banco;
    private static int proximoNumero = 0;
    private int numero;
    private double saldo;
    private Date dataCriacaoConta;
    
    // Extracto
    
    public Conta(Banco b) {
        banco = b;
        ++proximoNumero;
        numero = proximoNumero;
        
        dataCriacaoConta = new Date();
    }

    public Banco getBanco() {
        return banco;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean levantar(double valor) {
        boolean estado = true;
        
        if ( valor <= getSaldo() ) {
            saldo-=valor;
            // movimento Levantar.. Extracto...
        }
        
        return estado;
    }
    
    public boolean depositar (double valor) {
        saldo+=valor;
        return true;
    }
    
    
    /**
     * @param aProximoNumero the proximoNumero to set
     */
    
    // Por causa da leitura BD
    public static void setProximoNumero(int aProximoNumero) {
        proximoNumero = aProximoNumero;
    }

    @Override
    public String toString() {
        return "Conta #" + numero + " " + getSaldo() + " [" + dataCriacaoConta.toString() + "]";
    }

    public Date getDataCriacaoConta() {
        return dataCriacaoConta;
    }


    
    
}
