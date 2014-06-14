package net.danielpaz.pucc.poo.trabalho.model;

import java.sql.ResultSet;

import net.danielpaz.pucc.poo.trabalho.conexao.BD;

public class AgendamentoDAO {
	
	private BD bd;
	
	private AgendamentoDAO (BD bd) throws Exception
	{
		 if (bd==null)
	            throw new Exception ("Acesso a BD nao fornecido");

	        this.bd = bd;
	    }	
		
	public boolean cadastrado (int codigo) throws Exception
    {	
        String qry;

        qry = "SELECT * FROM Agendamento WHERE IdAgendamento=" +codigo +";";

        ResultSet resultado = bd.execConsulta (qry);

        return resultado.first();
     
    }

    public void incluir (Agendamento agendamento) throws Exception
    {
        if (agendamento==null)
            throw new Exception ("Agendamento nao fornecido");

        String cmd;

        cmd = "INSERT INTO Agendamento (IdAgendamento, IdUsuario, Data, Caucao, DataFinal, IdVeiculo, ValorFinal) VALUES (" 
        +agendamento.getCodigo() +"," +agendamento.getUsuario() +", '" +agendamento.getData() +"', " +agendamento.getCaucao() + ",'" 
        +agendamento.getDataFinal() +", '" +agendamento.getDataFinal() +"', " +agendamento.getVeiculo() +"," +agendamento.getValorAluguel()  +");";
        
        bd.execComando (cmd);
    }

    public void excluir (int codigo) throws Exception
    {
            if (codigo <= 0)
            throw new Exception ("Codigo invalido");
        
        if (!cadastrado (codigo))
            throw new Exception ("Codigo nao cadastrado");

        String cmd;

        cmd = "DELETE FROM Agendamento WHERE IdAgendamento=" + codigo +";";

        bd.execComando (cmd);
    }

    public void alterar (Agendamento agendamento) throws Exception
    {
        if (agendamento==null)
            throw new Exception ("Veiculo nao fornecido");

        if (!cadastrado (agendamento.getCodigo()))
            throw new Exception ("Agendamento nao cadastrado");

        String cmd;

        cmd = "UPDATE Agendamento SET IdUsuario= " +agendamento.getUsuario() 
        		+", Data= '" +agendamento.getData() + "', Caucao=" +agendamento.getCaucao()
        		+", DataFinal = '" +agendamento.getDataFinal() +"', IdVeiculo=" +agendamento.getVeiculo()
        		+", ValorFinal =" +agendamento.getValorAluguel()
                +" WHERE IdAgendamento=" +agendamento.getCodigo() +";";

        bd.execComando (cmd);     
        
    }

    public Agendamento getAgendamento (int codigo) throws Exception
    {
            if (codigo <= 0)
            throw new Exception ("Codigo invalido");
        
        String qry;

        qry = "SELECT * FROM Agendamento WHERE IdAgendamento=" + codigo +";";

        ResultSet resultado = bd.execConsulta (qry);

        if (!resultado.first())
            throw new Exception ("Codigo nao cadastrado");

        Agendamento agendamento = new Agendamento (resultado.getInt("IdAgendamento") ,resultado.getInt("IdUsuario")
        ,resultado.getString("Data"), resultado.getBoolean("Caucao"), resultado.getString("DataFinal")
        ,resultado.getInt("IdVeiculo"), resultado.getFloat("ValorFinal"));
      
        return agendamento;

    }

    public ResultSet getAgendamento () throws Exception
    {
        String qry;

        qry = "SELECT * FROM Agendamento;";

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
