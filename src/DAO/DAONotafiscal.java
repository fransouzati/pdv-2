/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import conexoes.ConexaoMySql;
import model.NotaFiscal;

/**
 *
 * @author Lucas
 */
public class DAONotafiscal extends ConexaoMySql {
    
    public NotaFiscal retornarUltimaNota(){
    
        NotaFiscal nota = new NotaFiscal();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT nr_nota FROM entrada_estoque ORDER BY id_entrada DESC LIMIT 1 "
            );

            while(this.getResultSet().next()){
                nota.atribuirNumero(this.getResultSet().getInt(1));                
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return nota;
    }
        
}
 