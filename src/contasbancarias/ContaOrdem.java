/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contasbancarias;

/**
 *
 * @author Administrator
 */
public class ContaOrdem extends Conta {
    
    boolean transferir(Conta contaDestino, double valor) {
        boolean estado = true; 
        
        if ( contaDestino instanceof ContaPrazo ) {
            estado = false;
        } else {
            levantar(valor);
            contaDestino.depositar(valor);
            // gerar movimento Transferir para extracto
        }
        return estado;
    }
    
}
