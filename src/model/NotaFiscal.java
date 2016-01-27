/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import DAO.DAONotafiscal;

/**
 *
 * @author Lucas
 */
public class NotaFiscal {
    
    private int numero;
    //private DAONotafiscal nota;
    
    
    public static NotaFiscal retornarUltimaNota(){
       
        DAONotafiscal nota = new DAONotafiscal();
        return nota.retornarUltimaNota();
        
    }
    
    public void atribuirNumero(int numero){
        this.numero = numero;
    }
    
    public int retornarNumero(){
        return this.numero;
    }
    
    
}
