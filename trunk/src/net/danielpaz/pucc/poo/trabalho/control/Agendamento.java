package net.danielpaz.pucc.poo.trabalho.control;

public class Agendamento {
	
	private int codigo;
	private int usuario;
	private String data;
	private int veiculo;
	private int caucao;
	private String dataFinal;
	private float valorAluguel;
	

	public Agendamento (int codigo)
	{
		this.setCodigo(codigo);
	}
	
	public Agendamento (int codigo, int veiculo, int usuario, String data, String dataFinal, float valorAlguel, int caucao)
	{
		this.setCodigo(codigo);
		this.setVeiculo(veiculo);
		this.setUsuario(usuario);
		this.setData(data);
		this.setDataFinal(dataFinal);
		this.setValorAluguel(valorAlguel);
		this.setCaucao(caucao);
		adicionaValorCaucao(caucao,valorAlguel);
		
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
	
	public int getCaucao()
	{
		return this.caucao;
	}
	
	public void setCaucao(int caucao)
	{
		this.caucao = caucao;
	}
	
	public float getValorAluguel() {
		return valorAluguel;
	}

	public void setValorAluguel(float valorAluguel) {
		this.valorAluguel = valorAluguel;
	}
	
	/**

	 * Metodo que adiciona 10% do valor do alguel se for adicionado caucao

	 * @param caucao - caucao

	 * @param valorAlguel - valor do alguel

	 */
	public void adicionaValorCaucao (int caucao, float valorAluguel)
	{
		if (caucao == 1)
		{
			float valorComCaucao = (float) (valorAluguel + (valorAluguel * 0.1));
			setValorAluguel(valorComCaucao);
		}
		
		
	}

}

