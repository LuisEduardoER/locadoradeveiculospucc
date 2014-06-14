package net.danielpaz.pucc.poo.trabalho.model;

public class Usuario {	
	
	private int codigo;
	private String nome;
	private String senha;
	private String email;
	
	public Usuario(int codigo, String nome, String senha, String email) throws Exception
	{	
		this.setCodigo(codigo);
		this.setNome(nome);
		this.setSenha(senha);;
		this.setEmail(email);		
	}
	
	public Usuario(String nome, String senha, String email)
	{		
		this.setNome(nome);
		this.setSenha(senha);;
		this.setEmail(email);		
	}
	
	   public Usuario (int codigo) throws Exception
	    {
	        this.setCodigo (codigo);

	    }
	
	public String getNome()
	{
		return this.nome;
	}
	
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	
	public String getSenha()
	{
		return this.senha;
	}
	
	public void setSenha(String senha)
	{
		this.senha = senha;
	}
	
	public String getEmail()
	{
		return this.email;
	}
	
	public void setEmail(String email)
	{
		this.email = email;
	}	
	
	 public void setCodigo (int codigo) throws Exception
	    {
	        if (codigo <= 0)
	            throw new Exception ("Codigo invalido");

	        this.codigo = codigo;
	    }
	 
	    public int getCodigo ()
	    {
	        return this.codigo;
	    }
}