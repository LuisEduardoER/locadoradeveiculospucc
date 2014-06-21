package net.danielpaz.pucc.poo.trabalho.model;

public class Marca {   
    
    protected int idMarca;
    protected String descricaoMarca;
 
    public void setCodigo (int idMarca) throws Exception
    {
        if (idMarca <= 0)
            throw new Exception ("Codigo invalido");

        this.idMarca = idMarca;
    }

    public void setDescricaoMarca (String descricaoMarca) throws Exception
    {
        if (descricaoMarca==null || descricaoMarca.equals(""))
            throw new Exception ("Descricao nao fornecida");

        this.descricaoMarca = descricaoMarca;
    }

    public int getIdMarca ()
    {
        return this.idMarca;
    }

    public String getDescricaoMarca ()
    {
        return this.descricaoMarca;
    }

    public Marca (int idMarca, String descricaoMarca) throws Exception
    {
        this.setCodigo (idMarca);
        this.setDescricaoMarca (descricaoMarca);
    }
    
    public Marca (String descricaoMarca) throws Exception
    {
        this.setDescricaoMarca (descricaoMarca);
    }
      
    public Marca (int idMarca) throws Exception
    {
        this.setCodigo (idMarca);
    }
}