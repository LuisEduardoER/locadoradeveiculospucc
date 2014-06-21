package net.danielpaz.pucc.poo.trabalho.control;

public class TipoVeiculo {
    
    protected int codigo;
    protected float preco;
    protected String descricao;
 
    public void setCodigo (int codigo) throws Exception
    {
        if (codigo <= 0)
            throw new Exception ("Codigo invalido");

        this.codigo = codigo;
    }

    public void setDescricao (String descricao) throws Exception
    {
        if (descricao==null || descricao.equals(""))
            throw new Exception ("Descricao nao fornecida");

        this.descricao = descricao;
    }
    
        public void setPreco (float preco) throws Exception
    {
        if (preco <= 0)   
        throw new Exception ("Marca invalido");
        
         this.preco = preco;
    }

         
    public int getCodigo ()
    {
        return this.codigo;
    }

    public String getDescricao ()
    {
        return this.descricao;
    }
    
        public float getPreco ()
    {
        return this.preco;
    }

      
    public TipoVeiculo (int codigo, float preco, String descricao) throws Exception
    {
        this.setCodigo (codigo);
        this.setPreco(preco);
        this.setDescricao (descricao);


    }
    
        public TipoVeiculo (float preco, String descricao) throws Exception
    {
        this.setPreco(preco);
        this.setDescricao (descricao);
    }
     
     public TipoVeiculo (int codigo) throws Exception
    {
        this.setCodigo (codigo);

    }

}
