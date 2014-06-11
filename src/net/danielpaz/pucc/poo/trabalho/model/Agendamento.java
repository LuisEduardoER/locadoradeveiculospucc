package net.danielpaz.pucc.poo.trabalho.model;

public class Agendamento {
	
	private String nomeUsuario;
	private String placaVeiculo;
	private String dataLocacao;
	private boolean caucao;
	private String dataFinal;
	private double valorAluguel;
	
	public Agendamento(String nomeUsuario, String placaVeiculo, String dataLocacao, boolean caucao, String dataFinal, double valorAluguel)
	{
		this.setNomeUsuario(nomeUsuario);
		this.setPlacaVeiculo(placaVeiculo);
		this.setDataLocacao(dataLocacao);
		this.setCaucao(caucao);
		this.setDataFinal(dataFinal);
		this.setValorAluguel(valorAluguel);
	}
	
	

	public String getNomeUsuario()
	{
		return this.nomeUsuario;
	}
	
	public void setNomeUsuario(String nomeUsuario)
	{
		this.nomeUsuario = nomeUsuario;
	}
	
	public String getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(String dataFinal) {
		this.dataFinal = dataFinal;
	}

	public String getPlacaVeiculo()
	{
		return this.placaVeiculo;
	}
	
	public void setPlacaVeiculo(String placaVeiculo)
	{
		this.placaVeiculo = placaVeiculo;
	}
	
	public String getDataLocacao()
	{
		return this.dataLocacao;
	}
	
	public void setDataLocacao(String dataLocacao)
	{
		this.dataLocacao = dataLocacao;
	}
	
	public boolean getCaucao()
	{
		return this.caucao;
	}
	
	public void setCaucao(boolean caucao)
	{
		this.caucao = caucao;
	}
	
	public double getValorAluguel() {
		return valorAluguel;
	}

	public void setValorAluguel(double valorAluguel) {
		this.valorAluguel = valorAluguel;
	}
	
	public void adicionaValorCaucao (boolean caucao, double valorAluguel)
	{
		if (caucao == true)
		{
			double valorComCaucao = valorAluguel + (valorAluguel * 0.1);
			setValorAluguel(valorComCaucao);
		}
		
		
	}

}

