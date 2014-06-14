package net.danielpaz.pucc.poo.trabalho.model;
import java.sql.ResultSet;
import net.danielpaz.pucc.poo.trabalho.conexao.BD;

public class ModeloDAO {
	 private BD bd;

	    public ModeloDAO (BD bd) throws Exception
	    {
	        if (bd==null)
	            throw new Exception ("Acesso a BD nao fornecido");

	        this.bd = bd;
	    }

	    public boolean cadastrado (int codigo) throws Exception
	    {	
	        String qry;

	        qry = "SELECT * FROM Modelo WHERE IdModelo=" +codigo +";";

	        ResultSet resultado = bd.execConsulta (qry);

	        return resultado.first();
	     
	    }

	    public void incluir (Modelo modelo) throws Exception
	    {
	        if (modelo==null)
	            throw new Exception ("Modelo nao fornecida");

	        String cmd;

	        cmd = "INSERT INTO Modelo (IdModelo, IdMarca, Descricao) VALUES ("+modelo.getCodigo() +", " +modelo.getMarca() + ", '" +modelo.getDescricao()+ "');";
	        bd.execComando (cmd);
	    }

	    public void excluir (int codigo) throws Exception
	    {
	            if (codigo <= 0)
	            throw new Exception ("Codigo invalido");
	        
	        if (!cadastrado (codigo))
	            throw new Exception ("Codigo nao cadastrado");

	        String cmd;

	        cmd = "DELETE FROM Modelo WHERE IdModelo=" + codigo +";";

	        bd.execComando (cmd);
	    }

	    public void alterar (Modelo modelo) throws Exception
	    {
	        if (modelo==null)
	            throw new Exception ("Modelo nao fornecido");

	        if (!cadastrado (modelo.getCodigo()))
	            throw new Exception ("Modelo nao cadastrado");

	        String cmd;

	        cmd = "UPDATE Modelo SET Descricao= '" +modelo.getDescricao() + "', IdMarca=" +modelo.getMarca() +
	              " WHERE IdModelo=" + modelo.getCodigo() +";";

	        bd.execComando (cmd);        
	    }

	    public Modelo getModelo (int codigo) throws Exception
	    {
	            if (codigo <= 0)
	            throw new Exception ("Codigo invalido");
	        
	        String qry;

	        qry = "SELECT * FROM Modelo WHERE IdModelo=" + codigo +";";

	        ResultSet resultado = bd.execConsulta (qry);
	        
	      

	        if (!resultado.first())
	            throw new Exception ("Codigo nao cadastrado");

	        Modelo modelo = new Modelo (resultado.getInt("IdModelo"), resultado.getInt("IdMarca"), resultado.getString("Descricao"));
	      
	        return modelo;

	    }

	    public ResultSet getModelo () throws Exception
	    {
	        String qry;

	        qry = "SELECT * FROM Modelo;";

	        ResultSet resultado;
	        
	        try
	        {
	            resultado = bd.execConsulta (qry);
	        }
	        catch (Exception e)
	        {
	        	throw new Exception ("Problema de acesso ao BD");
	        }

	        return resultado;
	    }

	    

}
