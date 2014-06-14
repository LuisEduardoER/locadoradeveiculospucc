package net.danielpaz.pucc.poo.trabalho.model;

public class Agendamento {
	
	private int codigo;
	private int usuario;
	private String data;
	private int veiculo;
	private boolean caucao;
	private String dataFinal;
	private float valorAluguel;
	

	public Agendamento (int codigo)
	{
		this.setCodigo(codigo);
	}
	
	public Agendamento (int codigo, int usuario, String data, boolean caucao, String dataFinal, int veiculo, float valorAlguel)
	{
		this.setCodigo(codigo);
		this.setUsuario(usuario);
		this.setData(data);
		this.setCaucao(caucao);
		this.setDataFinal(dataFinal);
		this.setVeiculo(veiculo);
		this.setValorAluguel(valorAlguel);
	}


	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getUsuario() {
		return usuario;
	}

	public void setUsuario(int usuario) {
		this.usuario = usuario;
	}

	public int getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(int veiculo) {
		this.veiculo = veiculo;
	}

	public String getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(String dataFinal) {
		this.dataFinal = dataFinal;
	}

	
	public String getData()
	{
		return this.data;
	}
	
	public void setData(String data)
	{
		this.data = data;
	}
	
	public boolean getCaucao()
	{
		return this.caucao;
	}
	
	public void setCaucao(boolean caucao)
	{
		this.caucao = caucao;
	}
	
	public float getValorAluguel() {
		return valorAluguel;
	}

	public void setValorAluguel(float valorAluguel) {
		this.valorAluguel = valorAluguel;
	}
	
	public void adicionaValorCaucao (boolean caucao, float valorAluguel)
	{
		if (caucao == true)
		{
			float valorComCaucao = (float) (valorAluguel + (valorAluguel * 0.1));
			setValorAluguel(valorComCaucao);
		}
		
		
	}

}

