package model;

import controller.ControllerCaixa;

/**
*
* @author contato@blsoft.com.br
*/
public class ModelCaixa extends ControllerCaixa{

    private int codigo=0, id_usuario=0, status=1, id_terminal;
    private float dinheiro=0, cheque=0, cartao=0, 
            convenio=0, debito=0, total=0;
    private float vale, valor_abertura=0;
    private String data_abertura="", data_fechamento="", operador="";
    public static final int CAIXA_ABERTO=0; 
    public static final int CAIXA_FECHADO=1; 

    /**
    * Construtor
    */
    public ModelCaixa(){
    
    }

    /**
    * seta o valor de codigo
    * @param pCodigo
    */
    public void setCodigo(int pCodigo){
        this.codigo = pCodigo;
    }
    /**
    * return codigo
    */
    public int getCodigo(){
        return this.codigo;
    }

    /**
    * seta o valor de dinheiro
    * @param pDinheiro
    */
    public void setDinheiro(float pDinheiro){
        this.dinheiro = pDinheiro;
    }
    /**
    * return dinheiro
    */
    public float getDinheiro(){
        return this.dinheiro;
    }

    public void setDebito(float valor){
        this.debito = valor;
    }
    
    public float getDebito(){
        return this.debito;
    }
    
    
    /**
    * seta o valor de cheque
    * @param pCheque
    */
    public void setCheque(float pCheque){
        this.cheque = pCheque;
    }
    
    /**
    * return cheque
    */
    public float getCheque(){
        return this.cheque;
    }
    
    public float getValorAbertura(){
        return this.valor_abertura;
    }
    
     public void setValorAbertura(float valor){
        this.valor_abertura = valor;
    }
     
     public int getIdUsuario(){
        return this.id_usuario;
    }
    
     public void setIdUsuario(int id){
        this.id_usuario = id;
    }
     
     public void setDataAbertura(String data){
        this.data_abertura = data;
    }
     
     public String getDataAbertura(){
        return this.data_abertura;
    }
     
     
     public void setDataFechamento(String data){
        this.data_fechamento = data;
    }
     
     public void setIdTerminal(int terminal){
        this.id_terminal = terminal;
    }
     
     public int getIdTerminal(){
        return this.id_terminal;
    }

     public float getTotal(){
         return this.dinheiro + this.cartao + this.convenio
            + this.cheque + this.debito + this.vale;
     }
     
    /**
    * seta o valor de cartao
    * @param pCartao
    */
    public void setCartao(float pCartao){
        this.cartao = pCartao;
    }
    /**
    * return cartao
    */
    public float getCartao(){
        return this.cartao;
    }
    
    
    public void setOperador(String nome){
        this.operador=nome;
    }
    
    public String getOperador(){
        return this.operador;
    }

    /**
    * seta o valor de vale
    * @param pVale
    */
    public void setVale(float pVale){
        this.vale = pVale;
    }
    /**
    * return vale
    */
    public float getVale(){
        return this.vale;
    }
    
    public void setConvenio(float valor){
        this.convenio = valor;
    }
     
    public float getConvenio(){
        return this.convenio;
    }

    @Override
    public String toString(){
        return "ModelCaixa {" + "::codigo = " + this.codigo + "::dinheiro = " + this.dinheiro + "::cheque = " + this.cheque + "::cartao = " + this.cartao + "::vale = " + this.vale +  "}";
    }
    
    public int retornarStatus(){
        return this.status;
        //return this.getStatus(terminal);
    }
    
    public int retornarStatus(int terminal){
        return this.getStatus(terminal);
    }
        
    public void setStatus(int status){
        this.status = status;
    }
    
    
    public boolean fecharCaixa(){
        if(this.codigo==0){
            
            return false;
        }else{
            return this.fecharCaixaController(this);
        }
        
    }
    
}