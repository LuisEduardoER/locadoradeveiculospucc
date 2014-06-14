package net.danielpaz.pucc.poo.trabalho.model;
import java.sql.ResultSet;
import net.danielpaz.pucc.poo.trabalho.conexao.BD;

public class MarcaDAO {
	    private BD bd;

	    public MarcaDAO (BD bd) throws Exception
	    {
	        if (bd==null)
	            throw new Exception ("Acesso a BD nao fornecido");

	        this.bd = bd;
	    }

	    public boolean cadastrado (int codigo) throws Exception
	    {	
	        String qry;

	        qry = "SELECT * FROM Marca WHERE IdMarca=" +codigo +";";

	        ResultSet resultado = bd.execConsulta (qry);

	        return resultado.first();
	     
	    }

	    public void incluir (Marca marca) throws Exception
	    {
	        if (marca==null)
	            throw new Exception ("Marca nao fornecida");

	        String cmd;

	        cmd = "INSERT INTO Marca (IdMarca, Descricao) VALUES (" +marca.getCodigo() +", '"+marca.getDescricao()+"');";
	        bd.execComando (cmd);
	    }

	    public void excluir (int codigo) throws Exception
	    {
	            if (codigo <= 0)
	            throw new Exception ("Codigo invalido");
	        
	        if (!cadastrado (codigo))
	            throw new Exception ("Codigo nao cadastrado");

	        String cmd;

	        cmd = "DELETE FROM Marca WHERE IdMarca=" + codigo +";";

	        bd.execComando (cmd);
	    }

	    public void alterar (Marca marca) throws Exception
	    {
	        if (marca==null)
	            throw new Exception ("Marca nao fornecida");

	        if (!cadastrado (marca.getCodigo()))
	            throw new Exception ("Marca nao cadastrada");

	        String cmd;

	        cmd = "UPDATE Marca SET Descricao=" +
	              "'" + marca.getDescricao() + ", ' " +
	              "WHERE IdMarca=" +
	               marca.getCodigo() +";";

	        bd.execComando (cmd);        
	    }

	    public Marca getMarca (int codigo) throws Exception
	    {
	        if (codigo <= 0)
	        throw new Exception ("Codigo invalido");
	        
	        String qry;

	        qry = "SELECT * FROM Marca WHERE IdMarca=" + codigo +";";

	        ResultSet resultado = bd.execConsulta (qry);

	        if (!resultado.first())
	            throw new Exception ("Codigo nao cadastrado");

	        Marca marca;
	        marca = new Marca (resultado.getInt("IdMarca"), resultado.getString("Descricao"));

	        return marca;
	    }
	    
	    public Marca getMarca (String desc) throws Exception
	    {
	            if (desc == null || desc.equals(""))
	            throw new Exception ("Descricao invalido");
	        
	        String qry;

	        qry = "SELECT * FROM Marca WHERE Descricao= '" +desc + "';";

	        ResultSet resultado = bd.execConsulta (qry);

	        if (!resultado.first())
	            throw new Exception ("Descricao nao cadastrado");

	        
	        Marca marca = new Marca (resultado.getInt("IdMarca"), resultado.getString("Descricao"));

	        return marca;
	    }

	    public ResultSet getMarca () throws Exception
	    {
	        String qry;

	        qry = "SELECT * FROM Marca;";

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
