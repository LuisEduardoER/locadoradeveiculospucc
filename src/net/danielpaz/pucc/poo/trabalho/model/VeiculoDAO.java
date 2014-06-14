package net.danielpaz.pucc.poo.trabalho.model;
import java.sql.ResultSet;


import net.danielpaz.pucc.poo.trabalho.conexao.BD;

public class VeiculoDAO {
	private BD bd;
		
		private VeiculoDAO (BD bd) throws Exception
		{
			 if (bd==null)
		            throw new Exception ("Acesso a BD nao fornecido");

		        this.bd = bd;
		    }	
			
		public boolean cadastrado (int codigo) throws Exception
	    {	
	        String qry;

	        qry = "SELECT * FROM Veiculo WHERE IdVeiculo=" +codigo +";";

	        ResultSet resultado = bd.execConsulta (qry);

	        return resultado.first();
	     
	    }

	    public void incluir (Veiculo veiculo) throws Exception
	    {
	        if (veiculo==null)
	            throw new Exception ("Veiculo nao fornecido");

	        String cmd;

	        cmd = "INSERT INTO Veiculo (IdVeiculo, IdModelo, Placa, IdTipoVeiculo) VALUES ("+veiculo.getCodigo() +"," +veiculo.getModelo() +", '" 
	        +veiculo.getPlaca() +"', " +veiculo.getTipoVeiculo() +");";
	        bd.execComando (cmd);
	    }

	    public void excluir (int codigo) throws Exception
	    {
	            if (codigo <= 0)
	            throw new Exception ("Codigo invalido");
	        
	        if (!cadastrado (codigo))
	            throw new Exception ("Codigo nao cadastrado");

	        String cmd;

	        cmd = "DELETE FROM Veiculo WHERE IdVeiculo=" + codigo +";";

	        bd.execComando (cmd);
	    }

	    public void alterar (Veiculo veiculo) throws Exception
	    {
	        if (veiculo==null)
	            throw new Exception ("Veiculo nao fornecido");

	        if (!cadastrado (veiculo.getCodigo()))
	            throw new Exception ("Veiculo nao cadastrado");

	        String cmd;

	        cmd = "UPDATE Veiculo SET IdModelo= " +veiculo.getModelo() + ", Placa= '" +veiculo.getPlaca() + "', IdTipoVeiculo=" +veiculo.getTipoVeiculo()
	              +" WHERE IdVeiculo=" +veiculo.getCodigo() +";";

	        bd.execComando (cmd);        
	    }

	    public Veiculo getVeiculo (int codigo) throws Exception
	    {
	            if (codigo <= 0)
	            throw new Exception ("Codigo invalido");
	        
	        String qry;

	        qry = "SELECT * FROM Veiculo WHERE IdVeiculo=" + codigo;

	        ResultSet resultado = bd.execConsulta (qry);
	        
	      

	        if (!resultado.first())
	            throw new Exception ("Codigo nao cadastrado");

	        Veiculo veiculo = new Veiculo (resultado.getInt("IdVeiculo") ,resultado.getInt("IdModelo"), resultado.getString("Placa"), resultado.getInt("IdTipoVeiculo"));
	      
	        return veiculo;

	    }

	    public ResultSet getUsuario () throws Exception
	    {
	        String qry;

	        qry = "SELECT * FROM Veiculo;";

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
