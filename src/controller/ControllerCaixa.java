package controller;

import model.ModelCaixa;
import DAO.DAOCaixa;
import java.util.ArrayList;

/**
*
* @author contato@blsoft.com.br
*/
public class ControllerCaixa {

    private DAOCaixa daoCaixa = new DAOCaixa();

    /**
    * grava Caixa
    * @param pModelCaixa
    * return int
    */
    public int salvarCaixaController(ModelCaixa pModelCaixa){
        return this.daoCaixa.salvarCaixaDAO(pModelCaixa);
    }
    
    public int abrirCaixaController(ModelCaixa pModelCaixa){
        return this.daoCaixa.abrirCaixaDAO(pModelCaixa);
    }

    /**
    * recupera Caixa
    * @param pCodigo
    * return ModelCaixa
    */
    public ModelCaixa getCaixaController(int pCodigo){
        return this.daoCaixa.getCaixaDAO(pCodigo);
    }

    /**
    * recupera uma lista deCaixa
    * @param pCodigo
    * return ArrayList
    */
    public ArrayList<ModelCaixa> getListaCaixaController(){
        return this.daoCaixa.getListaCaixaDAO();
    }
    public ArrayList<ModelCaixa> getListaCaixaController(int status){
        return this.daoCaixa.getListaCaixaDAO(status);
    }

    /**
    * atualiza Caixa
    * @param pModelCaixa
    * return boolean
    */
    public boolean atualizarCaixaController(ModelCaixa pModelCaixa){
        return this.daoCaixa.atualizarCaixaDAO(pModelCaixa);
    }

    /**
    * exclui Caixa
    * @param pCodigo
    * return boolean
    */
    public boolean excluirCaixaController(int pCodigo){
        return this.daoCaixa.excluirCaixaDAO(pCodigo);
    }
    
    protected int getStatus(int terminal){
        return this.daoCaixa.retornarStatus(terminal);
    }
    
    public ModelCaixa retornarUltimoCaixa(int terminal){
        return this.daoCaixa.retornarUltimoCaixa(terminal);
    }
    
    public boolean fecharCaixaController(ModelCaixa caixa){
        return this.daoCaixa.fecharCaixaDAO(caixa);
    }
    
    
    
}