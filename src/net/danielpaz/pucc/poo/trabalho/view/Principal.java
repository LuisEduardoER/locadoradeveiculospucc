package net.danielpaz.pucc.poo.trabalho.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Font;
import java.awt.Color;
import java.awt.Panel;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;


public class Principal extends JFrame {

	private JPanel contentPane;
	private boolean verificador = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() 
	{
		
		initComponents();
		
	}

	
	 private void initComponents()
	 {
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 727, 485);
			
			JMenuBar menuBar = new JMenuBar();
			setJMenuBar(menuBar);
			
			JMenu mnMarca = new JMenu("Marca");
			menuBar.add(mnMarca);
			
			JMenuItem mnItCadastrarMarca = new JMenuItem("Cadastrar Marca");
			mnItCadastrarMarca.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) 
				{
					 CadastrarMarca cadastrarMarca = new CadastrarMarca();
					  if (verificador = false)
					        {    
						  jPanelLocadoraVeiculo.add(cadastrarMarca);
						  cadastrarMarca.setVisible(true);
					        repaint();
					        jPanelLocadoraVeiculo.revalidate();
					        }
					        else
					        {
					        	jPanelLocadoraVeiculo.removeAll();
					        	jPanelLocadoraVeiculo.add(cadastrarMarca);
					        	cadastrarMarca.setVisible(true);
					        repaint();
					        jPanelLocadoraVeiculo.revalidate();
					        verificador = true;  
					        }
					    }                                               

					   
				
			});
			mnMarca.add(mnItCadastrarMarca);
			
			JMenuItem mnItAlterarMarca = new JMenuItem("Alterar Marca");
			mnMarca.add(mnItAlterarMarca);
			
			JMenuItem mnItExibirMarca = new JMenuItem("Exibir Marca");
			mnMarca.add(mnItExibirMarca);
			
			JMenu mnModelo = new JMenu("Modelo");
			menuBar.add(mnModelo);
			
			JMenuItem mnItCadastrarModelo = new JMenuItem("Cadastrar Modelo");
			mnModelo.add(mnItCadastrarModelo);
			
			JMenuItem mnItAlterarModelo = new JMenuItem("Alterar Modelo");
			mnModelo.add(mnItAlterarModelo);
			
			JMenuItem mnItExibirModelo = new JMenuItem("Exibir Modelo");
			mnModelo.add(mnItExibirModelo);
			
			JMenu mnTipoDeVeiculo = new JMenu("Tipo de Veiculo");
			menuBar.add(mnTipoDeVeiculo);
			
			JMenuItem mnItCadastrarTpVeiculo = new JMenuItem("Cadastrar Tipo de Veiculo");
			mnTipoDeVeiculo.add(mnItCadastrarTpVeiculo);
			
			JMenuItem mnItAlterarTpVeiculo = new JMenuItem("Alterar Tipo de Veiculo");
			mnTipoDeVeiculo.add(mnItAlterarTpVeiculo);
			
			JMenuItem mnItExibirTpVeiculo = new JMenuItem("Exibir Tipo de Veiculo");
			mnTipoDeVeiculo.add(mnItExibirTpVeiculo);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			contentPane.setLayout(new BorderLayout(0, 0));
			setContentPane(contentPane);
			
			JLabel lblLocadoraDeVeiculos = DefaultComponentFactory.getInstance().createTitle("Locadora de Veiculos");
			lblLocadoraDeVeiculos.setForeground(Color.BLUE);
			lblLocadoraDeVeiculos.setFont(new Font("Cooper Black", Font.PLAIN, 33));
			contentPane.add(lblLocadoraDeVeiculos, BorderLayout.NORTH);
			
			
			jPanelLocadoraVeiculo = new javax.swing.JPanel();
			jPanelLocadoraVeiculo.setLayout(new javax.swing.BoxLayout(jPanelLocadoraVeiculo, javax.swing.BoxLayout.LINE_AXIS));
	 }
	 
	
	 private javax.swing.JPanel jPanelLocadoraVeiculo;
	
}
