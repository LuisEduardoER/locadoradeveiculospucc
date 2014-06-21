package net.danielpaz.pucc.poo.trabalho.model;
import java.sql.ResultSet;
import net.danielpaz.pucc.poo.trabalho.conexao.BD;
import net.danielpaz.pucc.poo.trabalho.control.TipoVeiculo;

public class TipoVeiculoDAO {
	 private BD bd;

	    public TipoVeiculoDAO (BD bd) throws Exception
	    {
	        if (bd==null)
	            throw new Exception ("Acesso a BD nao fornecido");

	        this.bd = bd;
	    }

	    public boolean cadastrado (int codigo) throws Exception
	    {	
	        String qry;

	        qry = "SELECT * FROM TipoVeiculo WHERE IdTipoVeiculo=" +codigo;

	        ResultSet resultado = bd.execConsulta (qry);

	        return resultado.first();
	     
	    }

	    public void incluir (TipoVeiculo tipoVeiculo) throws Exception
	    {
	        if (tipoVeiculo==null)
	            throw new Exception ("Modelo nao fornecida");

	        String cmd;

	        cmd = "INSERT INTO TipoVeiculo (IdTipoVeiculo, Preco, Descricao) VALUES ("+tipoVeiculo.getCodigo() +", " +tipoVeiculo.getPreco() + ", '" +tipoVeiculo.getDescricao()+ "')";
	        bd.execComando (cmd);
	    }

	    public void excluir (Object cod) throws Exception
	    {
	    	int codigo = Integer.valueOf(cod.toString());
	            if (codigo <= 0)
	            throw new Exception ("Codigo invalido");
	        
	        if (!cadastrado (codigo))
	            throw new Exception ("Codigo nao cadastrado");

	        String cmd;

	        cmd = "DELETE FROM TipoVeiculo WHERE IdTipoVeiculo=" + codigo;

	        bd.execComando (cmd);
	    }

	    public void alterar (TipoVeiculo tipoVeiculo) throws Exception
	    {
	        if (tipoVeiculo==null)
	            throw new Exception ("Modelo nao fornecido");

	        if (!cadastrado (tipoVeiculo.getCodigo()))
	            throw new Exception ("Modelo nao cadastrado");

	        String cmd;

	        cmd = "UPDATE TipoVeiculo SET Descricao= '" +tipoVeiculo.getDescricao() + "', Preco=" +tipoVeiculo.getPreco() +
	              " WHERE IdTipoVeiculo=" + tipoVeiculo.getCodigo();

	        bd.execComando (cmd);        
	    }

	    public TipoVeiculo getTipoVeiculo (int codigo) throws Exception
	    {
	            if (codigo <= 0)
	            throw new Exception ("Codigo invalido");
	        
	        String qry;

	        qry = "SELECT * FROM TipoVeiculo WHERE IdTipoVeiculo=" + codigo;

	        ResultSet resultado = bd.execConsulta (qry);
	        
	      

	        if (!resultado.first())
	            throw new Exception ("Codigo nao cadastrado");

	        TipoVeiculo tipoVeiculo = new TipoVeiculo (resultado.getInt("IdTipoVeiculo"), resultado.getFloat("Preco"), resultado.getString("Descricao"));
	      
	        return tipoVeiculo;

	    }

	    public ResultSet getTipoVeiculo () throws Exception
	    {
	        String qry;

	        qry = "SELECT * FROM TipoVeiculo";

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
