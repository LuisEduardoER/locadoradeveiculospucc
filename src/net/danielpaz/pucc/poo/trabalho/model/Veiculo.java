package net.danielpaz.pucc.poo.trabalho.model;

public class Veiculo 
{	
	private String marca;
	private String modelo;
	private String placa;
	private float preco;
	private String descricaoTipoVeiculo;
	
	public Veiculo(String marca, String modelo, String placa, float preco, String descricaoTipoVeiculo)
	{		
		this.setMarca(marca);
		this.setModelo(modelo);
		this.setPlaca(placa);
		this.setPreco(preco);
		this.setDescricaoTipoVeiculo(descricaoTipoVeiculo);
	}
	
	public String getMarca()
	{
		return this.marca;
	}
	
	public void setMarca(String marca)
	{
		this.marca = marca;
	}
	
	public String getModelo()
	{
		return this.modelo;
	}
	
	public void setModelo(String modelo)
	{
		this.modelo = modelo;
	}
	
	public String getPlaca()
	{
		return this.placa;
	}
	
	public void setPlaca(String placa)
	{
		this.placa = placa;
	}
	
	public float getPreco()
	{
		return this.preco;
	}
	
	public void setPreco(float preco)
	{
		this.preco = preco;
	}
	
	public String getDescricaoTipoVeiculo()
	{
		return this.descricaoTipoVeiculo;
	}
	
	public void setDescricaoTipoVeiculo(String descricaoTipoVeiculo)
	{
		this.descricaoTipoVeiculo = descricaoTipoVeiculo;
	}
	
	
}
