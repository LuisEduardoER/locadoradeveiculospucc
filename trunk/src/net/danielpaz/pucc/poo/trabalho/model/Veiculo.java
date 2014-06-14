package net.danielpaz.pucc.poo.trabalho.model;

public class Veiculo 
{	
	private int codigo;
	private int modelo;
	private String placa;
	private int tipoVeiculo;
	
	public Veiculo(int modelo, String placa, int tipoVeiculo)
	{		
		this.setModelo(modelo);
		this.setPlaca(placa);
		this.setTipoVeiculo(tipoVeiculo);
		
	}
	
	public Veiculo (int codigo) throws Exception
	    {
	        this.setCodigo (codigo);

	    }
	   
		public Veiculo(int codigo, int modelo, String placa, int tipoVeiculo) throws Exception
		{	
			this.setCodigo(codigo);
			this.setModelo(modelo);
			this.setPlaca(placa);
			this.setTipoVeiculo(tipoVeiculo);
		}
		
		
	public int getModelo()
	{
		return this.modelo;
	}
	
	public void setModelo(int modelo)
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
	    
	    public int getTipoVeiculo() {
			return tipoVeiculo;
		}

		public void setTipoVeiculo(int tipoVeiculo) {
			this.tipoVeiculo = tipoVeiculo;
		}
	
	
}
