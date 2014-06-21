package net.danielpaz.pucc.poo.trabalho.model;

public class Modelo extends Marca 
{
    
    protected int idModelo;
    protected String descricaoModelo;
 
    public void setIdModelo (int idModelo) throws Exception
    {
        if (idModelo <= 0)
            throw new Exception ("Codigo invalido");

        this.idModelo = idModelo;
    }

    public void setDescricaoModelo (String descricaoModelo) throws Exception
    {
        if (descricaoModelo==null || descricaoModelo.equals(""))
            throw new Exception ("Descricao nao fornecida");

        this.descricaoModelo = descricaoModelo;
    }
    
    

         
    public int getIdModelo ()
    {
        return this.idModelo;
    }

    public String getDescricaoModelo ()
    {
        return this.descricaoModelo;
    }
    

      
    public Modelo (int idMarca, int codigo, String descricaoModelo) throws Exception
    {
    	super(idMarca);
        this.setCodigo (codigo);
        this.setDescricaoModelo (descricaoModelo);


    }
    
        public Modelo (int idMarca,String descricaoModelo) throws Exception
    {
        super(idMarca);	
        this.setDescricaoModelo (descricaoModelo);
    }

		  
  

}

