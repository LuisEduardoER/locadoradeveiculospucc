package net.danielpaz.pucc.poo.trabalho.model;
import java.sql.ResultSet;
import net.danielpaz.pucc.poo.trabalho.conexao.BD;
import net.danielpaz.pucc.poo.trabalho.control.Usuario;

public class UsuarioDAO {
	private BD bd;

    public UsuarioDAO (BD bd) throws Exception
    {
        if (bd==null)
            throw new Exception ("Acesso a BD nao fornecido");

        this.bd = bd;
    }

    public boolean cadastrado (int codigo) throws Exception
    {	
        String qry;

        qry = "SELECT * FROM Usuario WHERE IdUsuario=" +codigo;

        ResultSet resultado = bd.execConsulta (qry);

        return resultado.first();
     
    }

    public void incluir (Usuario usuario) throws Exception
    {
        if (usuario==null)
            throw new Exception ("Usuario nao fornecido");

        String cmd;

        cmd = "INSERT INTO Usuario (IdUsuario, Nome, Email) VALUES (" +usuario.getCodigo() +", '" +usuario.getNome() +"', '" +usuario.getEmail() +"')";
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

        cmd = "DELETE FROM Usuario WHERE IdUsuario=" + codigo;

        bd.execComando (cmd);
    }

    public void alterar (Usuario usuario) throws Exception
    {
        if (usuario==null)
            throw new Exception ("Usuario nao fornecido");

        if (!cadastrado (usuario.getCodigo()))
            throw new Exception ("Usuario nao cadastrado");

        String cmd;

        cmd = "UPDATE Usuario SET Nome= '" +usuario.getNome() + "', Email='" +usuario.getEmail() + "' WHERE IdUsuario=" +usuario.getCodigo();

        bd.execComando (cmd);        
    }

    public Usuario getUsuario (int codigo) throws Exception
    {
            if (codigo <= 0)
            throw new Exception ("Codigo invalido");
        
        String qry;

        qry = "SELECT * FROM Usuario WHERE IdUsuario=" + codigo;

        ResultSet resultado = bd.execConsulta (qry);
        
      

        if (!resultado.first())
            throw new Exception ("Codigo nao cadastrado");

        Usuario usuario = new Usuario (resultado.getInt("IdUsuario") ,resultado.getString("Nome"), resultado.getString("Email"));
      
        return usuario;

    }

    public ResultSet getUsuario () throws Exception
    {
        String qry;

        qry = "SELECT * FROM Usuario";

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
