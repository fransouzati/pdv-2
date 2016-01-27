package model;

import controller.ControllerProdutos;
import java.util.ArrayList;

/**
 * @author  BLSoft
 * www.Blsoft.com.br
 * Venda de software e código fonte
*/
public class ModelProdutos {

    private String codigo;
    private int fornecedoresCodigo;
    private String nome;
    private Float valor;
    private Float valor_custo;
    private int estoque, id, estoqueMinino;
    private ArrayList<ModelProdutos> listaModelProdutoses;

    /**
    * Construtor
    */
    public ModelProdutos(){}

    /**
    * seta o valor de codigo
    * @param pCodigo
    */
    public void setCodigo(String pCodigo){
        this.codigo = pCodigo;
    }
    /**
    * return codigo
    */
    public String getCodigo(){
        return this.codigo;
    }
    
    public void setId(int pId){
        this.id = pId;
    }
    
     public int getId(){
        return this.id;
    }

     public boolean atualizarEstoque(int qtd){
         ControllerProdutos controllerProdutos = new ControllerProdutos();
         this.estoque +=qtd;
         return controllerProdutos.atualizarQuantidade(this);
     }
     
     public int inserirProdutoEstoque(int id_produto, int numero_da_nota, int quantidade){
         ControllerProdutos controllerProdutos = new ControllerProdutos();
        return controllerProdutos.inserirProdutoEstoque(id_produto, numero_da_nota, quantidade);
    }
     
    /**
    * seta o valor de fornecedoresCodigo
    * @param pFornecedores_codigo
    */
    public void setFornecedoresCodigo(int pFornecedores_codigo){
        this.fornecedoresCodigo = pFornecedores_codigo;
    }
    /**
    * return fornecedoresCodigo
    */
    public int getFornecedoresCodigo(){
        return this.fornecedoresCodigo;
    }

    /**
    * seta o valor de nome
    * @param pNome
    */
    public void setNome(String pNome){
        this.nome = pNome;
    }
    /**
    * return nome
    */
    public String getNome(){
        return this.nome;
    }

    /**
    * seta o valor de valor
    * @param pValor
    */
    public void setValor(float pValor){
        this.valor = pValor;
    }
    /**
    * return valor
    */
    public Float getValor(){
        return this.valor;
    }
    
    /**
    * seta o valor de custo do produto
    * @param valor_custo
    */
    public void setValorCusto(float valor_custo){
        this.valor_custo = valor_custo;
    }
    
    /**
    * retorna o valor de custo do produto
    */
    public Float getValorCusto(){
        return this.valor_custo;
    }

    /**
    * seta o valor de estoque
    * @param pEstoque
    */
    public void setEstoque(int pEstoque){
        this.estoque = pEstoque;
    }
    /**
    * return estoque
    */
    public int getEstoque(){
        return this.estoque;
    }
    
    public void setEstoqueMinimo(int pEstoque){
        this.estoqueMinino = pEstoque;
    }
    /**
    * return estoque
    */
    public Integer getEstoqueMinimo(){
        return this.estoqueMinino;
    }
    
    

    @Override
    public String toString(){
        return "ModelProdutos {" + "::codigo = " + this.codigo + "::fornecedores_codigo = " + this.fornecedoresCodigo + "::nome = " + this.nome + "::valor = " + this.valor + "::estoque = " + this.estoque +  "}";
    }

    /**
     * @return the listaModelProdutoses
     */
    public ArrayList<ModelProdutos> getListaModelProdutoses() {
        return listaModelProdutoses;
    }

    /**
     * @param listaModelProdutoses the listaModelProdutoses to set
     */
    public void setListaModelProdutoses(ArrayList<ModelProdutos> listaModelProdutoses) {
        this.listaModelProdutoses = listaModelProdutoses;
    }
}