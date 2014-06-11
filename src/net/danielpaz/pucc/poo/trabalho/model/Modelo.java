package net.danielpaz.pucc.poo.trabalho.model;

public class Modelo {
    
    protected int codigo;
    protected int marca;
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
    
        public void setMarca (int marca) throws Exception
    {
        if (marca <= 0)   
        throw new Exception ("Marca invalido");
        
         this.marca = marca;
    }

         
    public int getCodigo ()
    {
        return this.codigo;
    }

    public String getDescricao ()
    {
        return this.descricao;
    }
    
        public int getMarca ()
    {
        return this.marca;
    }

      
    public Modelo (int codigo, int marca, String descricao) throws Exception
    {
        this.setCodigo (codigo);
        this.setMarca(marca);
        this.setDescricao (descricao);


    }
    
        public Modelo (int marca, String descricao) throws Exception
    {
        this.setMarca(marca);
        this.setDescricao (descricao);
    }
     
     public Modelo (int codigo) throws Exception
    {
        this.setCodigo (codigo);

    }

}

