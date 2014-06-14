package net.danielpaz.pucc.poo.trabalho.model;

import net.danielpaz.pucc.poo.trabalho.conexao.BD;

public class LocacaoVeiculosMain {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception 
	{
		
		BD bd = new BD ("oracle.jdbc.driver.OracleDriver",
                "jdbc:oracle:thin:@localhost:1521:xe",
                "system", "poo2014");
		
		Marca marca = new Marca(2, "CONEXAOBANCO");
		MarcaDAO marcaDAO = new MarcaDAO (bd);
		marcaDAO.incluir(marca);
		
		
		
	}

}
