package DAO;

import model.ModelCaixa;
import conexoes.ConexaoMySql;
import java.util.ArrayList;
/**
*
* @author contato@blsoft.com.br
*/
public class DAOCaixa extends ConexaoMySql {

    /**
    * grava Caixa
    * @param pModelCaixa
    * return int
    */
    public int salvarCaixaDAO(ModelCaixa pModelCaixa){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO caixa ("
                    + "dinheiro,"
                    + "vl_valor_abertura,"
                    + "fk_operador,"
                    + "id_terminal"
                + ") VALUES ("
                    + "'" + pModelCaixa.getDinheiro() + "',"
                    + "'" + pModelCaixa.getValorAbertura() + "',"
                    + "'" + pModelCaixa.getIdUsuario() + "',"
                    + "'" + pModelCaixa.getIdTerminal() + "'"
                + ");"
            );
        }catch(Exception e){
            e.printStackTrace();
            return 0;
        }finally{
            this.fecharConexao();
        }
    }

    public int abrirCaixaDAO(ModelCaixa pModelCaixa){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO caixa ("
                    + "dinheiro,"
                    + "vl_valor_abertura,"
                    + "fk_operador,"
                    + "id_terminal"
                + ") VALUES ("
                    + "'" + pModelCaixa.getDinheiro() + "',"
                    + "'" + pModelCaixa.getValorAbertura() + "',"
                    + "'" + pModelCaixa.getIdUsuario() + "',"
                    + "'" + pModelCaixa.getIdTerminal()+ "'"
                + ");"
            );
        }catch(Exception e){
            e.printStackTrace();
            return 0;
        }finally{
            this.fecharConexao();
        }
    }
    
    
    /**
    * recupera Caixa
    * @param pCodigo
    * return ModelCaixa
    */
    public ModelCaixa getCaixaDAO(int pCodigo){
        ModelCaixa modelCaixa = new ModelCaixa();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "codigo,"
                    + "dinheiro,"
                    + "cheque,"
                    + "cartao,"
                    + "vale,"
                    + "vl_debito,"
                    + "convenio"
                 + " FROM"
                     + " caixa"
                 + " WHERE"
                     + " codigo = '" + pCodigo + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelCaixa.setCodigo(this.getResultSet().getInt(1));
                modelCaixa.setDinheiro(this.getResultSet().getFloat(2));
                modelCaixa.setCheque(this.getResultSet().getFloat(3));
                modelCaixa.setCartao(this.getResultSet().getFloat(4));
                modelCaixa.setVale(this.getResultSet().getFloat(5));
                modelCaixa.setDebito(this.getResultSet().getFloat(6));
                modelCaixa.setConvenio(this.getResultSet().getFloat(7));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelCaixa;
    }

    /**
    * recupera uma lista de Caixa
        * return ArrayList
    */
    public ArrayList<ModelCaixa> getListaCaixaDAO(){
        ArrayList<ModelCaixa> listamodelCaixa = new ArrayList();
        ModelCaixa modelCaixa = new ModelCaixa();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT codigo, "
                    + "dinheiro,"
                    + "cheque,"
                    + "cartao,"
                    + "vale, "
                    + "vl_debito,"
                    + "convenio,"
                    + "dt_abertura,"
                    + "vl_valor_abertura, "
                    + "tbl_usuarios.nome AS operador,"
                    + "dt_fechamento, "
                    + "id_terminal,"
                    + "ic_status FROM caixa "
                     + ";"
            );

            while(this.getResultSet().next()){
                modelCaixa = new ModelCaixa();
                modelCaixa.setCodigo(this.getResultSet().getInt(1));
                modelCaixa.setDinheiro(this.getResultSet().getFloat(2));
                modelCaixa.setCheque(this.getResultSet().getFloat(3));
                modelCaixa.setCartao(this.getResultSet().getFloat(4));
                modelCaixa.setVale(this.getResultSet().getFloat(5));
                modelCaixa.setDebito(this.getResultSet().getFloat(6));
                modelCaixa.setConvenio(this.getResultSet().getFloat(7));
                modelCaixa.setDataAbertura(this.getResultSet().getString(8));
                modelCaixa.setValorAbertura(this.getResultSet().getFloat(9));
                modelCaixa.setOperador(this.getResultSet().getString(10));
                modelCaixa.setDataFechamento(this.getResultSet().getString(11));
                modelCaixa.setIdTerminal(this.getResultSet().getInt(12));
                modelCaixa.setStatus(this.getResultSet().getInt(13));
                listamodelCaixa.add(modelCaixa);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelCaixa;
    }
    
    public ArrayList<ModelCaixa> getListaCaixaDAO(int status){
        ArrayList<ModelCaixa> listamodelCaixa = new ArrayList();
        ModelCaixa modelCaixa;
        try {
            this.conectar();
            this.executarSQL(
                "SELECT codigo, "
                    + "dinheiro,"
                    + "cheque,"
                    + "cartao,"
                    + "vale, "
                    + "vl_debito,"
                    + "convenio,"
                    + "dt_abertura,"
                    + "vl_valor_abertura, "
                    + "tbl_usuarios.nome AS operador,"
                    + "dt_fechamento, "
                    + "id_terminal,"
                    + "ic_status FROM caixa "
                    + "INNER JOIN tbl_usuarios ON caixa.fk_operador = tbl_usuarios.pk_codigo "
                    + "WHERE caixa.ic_status = "+status+" "
                + ";"
            );

            while(this.getResultSet().next()){
                modelCaixa = new ModelCaixa();
                modelCaixa.setCodigo(this.getResultSet().getInt(1));
                modelCaixa.setDinheiro(this.getResultSet().getFloat(2));
                modelCaixa.setCheque(this.getResultSet().getFloat(3));
                modelCaixa.setCartao(this.getResultSet().getFloat(4));
                modelCaixa.setVale(this.getResultSet().getFloat(5));
                modelCaixa.setDebito(this.getResultSet().getFloat(6));
                modelCaixa.setConvenio(this.getResultSet().getFloat(7));
                modelCaixa.setDataAbertura(this.getResultSet().getString(8));
                modelCaixa.setValorAbertura(this.getResultSet().getFloat(9));
                modelCaixa.setOperador(this.getResultSet().getString(10));
                modelCaixa.setDataFechamento(this.getResultSet().getString(11));
                modelCaixa.setIdTerminal(this.getResultSet().getInt(12));
                modelCaixa.setStatus(this.getResultSet().getInt(13));
                listamodelCaixa.add(modelCaixa);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelCaixa;
    }
    

    /**
    * atualiza Caixa
    * @param pModelCaixa
    * return boolean
    */
    public boolean atualizarCaixaDAO(ModelCaixa pModelCaixa){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE caixa SET "
                    + "dinheiro = '" + pModelCaixa.getDinheiro() + "',"
                    + "cheque = '" + pModelCaixa.getCheque() + "',"
                    + "cartao = '" + pModelCaixa.getCartao() + "',"
                    + "vl_debito = '" + pModelCaixa.getDebito()+ "',"
                    + "convenio = '" + pModelCaixa.getConvenio()+ "',"
                    + "vale = '" + pModelCaixa.getVale() + "'"
                + " WHERE "
                    + "codigo = '" + pModelCaixa.getCodigo() + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }
    
    public boolean fecharCaixaDAO(ModelCaixa pModelCaixa){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE caixa SET "
                    + "dt_fechamento = NOW(),"
                    + "ic_status = 1"
                + " WHERE "
                    + "codigo = '" + pModelCaixa.getCodigo() + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }
    public boolean fecharCaixaDAO(int id_caixa){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE caixa SET "
                    + "dt_fechamento = NOW(),"
                    + "ic_status = 1"
                + " WHERE "
                    + "codigo = '" + id_caixa + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * exclui Caixa
    * @param pCodigo
    * return boolean
    */
    public boolean excluirCaixaDAO(int pCodigo){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM caixa "
                + " WHERE "
                    + "codigo = '" + pCodigo + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }
    
    public int retornarStatus(int terminal){

        int status = 0;
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "ic_status FROM caixa"
                 + " WHERE id_terminal = '" + terminal + "' order by codigo desc limit 1"
                + ";"
            );

            while(this.getResultSet().next()){
                status = this.getResultSet().getInt(1);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return status;
    }
    
    public ModelCaixa retornarUltimoCaixa(int terminal){
        
        ModelCaixa modelCaixa = new ModelCaixa();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "codigo,"
                    + "dinheiro,"
                    + "cheque,"
                    + "cartao,"
                    + "vale,"
                    + "	DATE_FORMAT(dt_abertura,'%d/%m/%Y') AS dt_abertura,"
                    + "	vl_valor_abertura,"
                    + "	fk_operador,"
                    + "	dt_fechamento,"
                    + "	id_terminal,"
                    + "	ic_status,"
                    + "	vl_debito,"
                    + "	convenio"
                 + " FROM"
                     + " caixa"
                 + " WHERE"
                     + " id_terminal = '" + terminal + "' order by codigo desc limit 1"
                + ";"
            );

            while(this.getResultSet().next()){
                modelCaixa.setCodigo(this.getResultSet().getInt(1));                
                modelCaixa.setDinheiro(this.getResultSet().getFloat(2));
                modelCaixa.setCheque(this.getResultSet().getFloat(3));
                modelCaixa.setCartao(this.getResultSet().getFloat(4));
                modelCaixa.setVale(this.getResultSet().getFloat(5));
            
                modelCaixa.setDataAbertura(this.getResultSet().getString(6));
                modelCaixa.setValorAbertura(this.getResultSet().getFloat(7));
                modelCaixa.setIdUsuario(this.getResultSet().getInt(8));
                modelCaixa.setDataFechamento(this.getResultSet().getString(9));
                modelCaixa.setIdTerminal(this.getResultSet().getInt(10));
                modelCaixa.setStatus(this.getResultSet().getInt(11));
                modelCaixa.setDebito(this.getResultSet().getFloat(12));
                modelCaixa.setConvenio(this.getResultSet().getFloat(13));
                
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelCaixa;
    }
}