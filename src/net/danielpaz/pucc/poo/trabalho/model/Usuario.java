package net.danielpaz.pucc.poo.trabalho.model;

public class Usuario {	
	
	private String nome;
	private String senha;
	private String email;
	
	public Usuario(String nome, String senha, String email)
	{		
		this.setNome(nome);
		this.setSenha(senha);;
		this.setEmail(email);		
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
}