package net.danielpaz.pucc.poo.trabalho.model;

public class Marca {   
    
    protected int codigo;
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

    public int getCodigo ()
    {
        return this.codigo;
    }

    public String getDescricao ()
    {
        return this.descricao;
    }

    public Marca (int codigo, String descricao) throws Exception
    {
        this.setCodigo (codigo);
        this.setDescricao (descricao);
    }
    
    public Marca (String descricao) throws Exception
    {
        this.setDescricao (descricao);
    }
      
    public Marca (int codigo) throws Exception
    {
        this.setCodigo (codigo);
    }
}