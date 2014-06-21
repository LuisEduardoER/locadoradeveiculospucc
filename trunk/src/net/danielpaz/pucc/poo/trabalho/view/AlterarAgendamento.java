package net.danielpaz.pucc.poo.trabalho.view;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;

import net.danielpaz.pucc.poo.trabalho.conexao.*;
import net.danielpaz.pucc.poo.trabalho.control.Agendamento;
import net.danielpaz.pucc.poo.trabalho.model.*;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;


public class AlterarAgendamento extends JPanel {

	private javax.swing.JButton bGravar;
    private javax.swing.JLabel lbCadastrarAgendamento;
    private javax.swing.JLabel lbCodigoVeiculo;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel jLabelErro;
    private javax.swing.JLabel jLabelSucesso;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField tdCodigo;
    private javax.swing.JTextField tdCodigoVeiculo;
    private JLabel lbCodigoUsuario;
    private JTextField tdCodigoUsuario;
    private JTextField tdDataInicial;
    private JTextField tdDataFinal;
    private JLabel lbValor;
    private JTextField tdValor;
	
    
	public AlterarAgendamento() {
		
		initComponents();

	}
	
	 private void initComponents() {
		 
		 

	        jPanel2 = new javax.swing.JPanel();
	        lbCadastrarAgendamento = new javax.swing.JLabel();
	        lbCodigoVeiculo = new javax.swing.JLabel();
	        lbCodigo = new javax.swing.JLabel();
	        tdCodigo = new javax.swing.JTextField();
	        tdCodigoVeiculo = new javax.swing.JTextField();
	        bGravar = new javax.swing.JButton();
	        jPanel1 = new javax.swing.JPanel();
	        jLabelSucesso = new javax.swing.JLabel();
	        jLabelErro = new javax.swing.JLabel();

	        setBackground(new java.awt.Color(255, 255, 255));
	        setMinimumSize(new java.awt.Dimension(679, 631));

	        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

	        lbCadastrarAgendamento.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
	        lbCadastrarAgendamento.setText("Alterar Agendamento");

	        lbCodigoVeiculo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
	        lbCodigoVeiculo.setText("Codigo Veiculo");

	        lbCodigo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
	        lbCodigo.setText("Código");

	        tdCodigo.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                
	            }
	        });

	        bGravar.setBackground(new java.awt.Color(255, 255, 255));
	        bGravar.setText("GRAVAR");
	        bGravar.setFocusable(false);
	        bGravar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
	        bGravar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
	        bGravar.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	            	if (tdCodigo.getText().isEmpty() || tdCodigoVeiculo.getText().isEmpty() || tdCodigoUsuario.getText().isEmpty() || tdDataInicial.getText().isEmpty() || tdDataFinal.getText().isEmpty() || tdValor.getText().isEmpty())
	    	        {     
	    	            JOptionPane.showMessageDialog(null, "Por favor preencher todos os campos", TOOL_TIP_TEXT_KEY, WIDTH, null);
	    	            return;
	    	        }
	    	       
	    	       boolean erro;
	    	       
	    	        try {
	    	        	int resposta;
	                    resposta = JOptionPane.showConfirmDialog(null, "Deseja incluir caucao ?");
	                    if (resposta == JOptionPane.YES_OPTION) 
	                    {
	                    	Agendamento agendamento = new Agendamento (Integer.parseInt(tdCodigo.getText()), Integer.parseInt(tdCodigoVeiculo.getText()), Integer.parseInt(tdCodigoUsuario.getText()), tdDataInicial.getText(), tdDataFinal.getText(), Float.valueOf(tdValor.getText().replace(",", ".")), 1);
	                    	BD bd = new BD ("oracle.jdbc.driver.OracleDriver","jdbc:oracle:thin:@localhost:1521:xe","system", "poo2014");
	    	    
	                    	AgendamentoDAO agendamentoDAO = new AgendamentoDAO(bd);  
	                    	
	                    	UsuarioDAO usuarioDAO = new UsuarioDAO (bd);
	                    	VeiculoDAO veiculoDAO = new VeiculoDAO(bd);
	                         
	                         if (usuarioDAO.cadastrado(Integer.parseInt(tdCodigoUsuario.getText()))== false || veiculoDAO.cadastrado(Integer.parseInt(tdCodigoVeiculo.getText()))== false)
	                         {
	                             JOptionPane.showMessageDialog(null, "O Codigo do Usuario ou Codigo do Veiculo não existe, por favor verificar o código novamente.", TOOL_TIP_TEXT_KEY, WIDTH, null);
	                             repaint();
	                             return;
	                         }
	                         
	                         else
	                         { 
	                    	if (agendamentoDAO.cadastrado(Integer.parseInt(tdCodigo.getText()))== false)
	                    	{
	                    		JOptionPane.showMessageDialog(null, "O codigo do Agendamento não existe, por favor verificar o código novamente.", TOOL_TIP_TEXT_KEY, WIDTH, null);
	                    		repaint();
	                    		return;
	                    	}
	                    	else
	                    	{
	                    		agendamentoDAO.alterar(agendamento);
	                    		bd.fecharConexao();
	                    		
	                    		if (bd.sucessoBanco(true))
	                    		{
	                    			jLabelSucesso.setVisible(true);
	                    		}
	                    		else
	                    		{
	                    			if (erro =true)
	                    			{    
	                    				jLabelErro.setVisible(true);
	                    			}
	                    		}
	                    	}
	                    }
	                    }
	                    else
	                    {
	                    	if (resposta == JOptionPane.NO_OPTION) 
		                    {
		                    	Agendamento agendamento = new Agendamento (Integer.parseInt(tdCodigo.getText()), Integer.parseInt(tdCodigoVeiculo.getText()), Integer.parseInt(tdCodigoUsuario.getText()), tdDataInicial.getText(), tdDataFinal.getText(), Float.parseFloat(tdValor.getText()), 0);
		                    	BD bd = new BD ("oracle.jdbc.driver.OracleDriver","jdbc:oracle:thin:@localhost:1521:xe","system", "poo2014");
		    	    
		                    	AgendamentoDAO agendamentoDAO = new AgendamentoDAO(bd);   
		                    	if (agendamentoDAO.cadastrado(Integer.parseInt(tdCodigo.getText()))== false)
		                    	{
		                    		JOptionPane.showMessageDialog(null, "O codigo do Agendamento não existe, por favor verificar o código novamente.", TOOL_TIP_TEXT_KEY, WIDTH, null);
		                    		repaint();
		                    		return;
		                    	}
		                    	else
		                    	{
		                    		agendamentoDAO.alterar(agendamento);
		                    		bd.fecharConexao();
		                    		
		                    		if (bd.sucessoBanco(true))
		                    		{
		                    			jLabelSucesso.setVisible(true);
		                    		}
		                    		else
		                    		{
		                    			if (erro =true)
		                    			{    
		                    				jLabelErro.setVisible(true);
		                    			}
		                    		}
		                    	}
		                    }
	                    }
	                    
	    	        } catch (Exception ex) {
	    	            Logger.getLogger(AlterarAgendamento.class.getName()).log(Level.SEVERE, null, ex);
	    	            erro = true;
	    	        }
	            }
	        });

	        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

	        jLabelSucesso.setBackground(new java.awt.Color(255, 255, 255));
	        jLabelSucesso.setFont(new java.awt.Font("Arial", 0, 24)); 
	        jLabelSucesso.setForeground(new java.awt.Color(0, 153, 51));
	        jLabelSucesso.setText("Sucesso !");
	        jLabelSucesso.setRequestFocusEnabled(false);

	        jLabelErro.setFont(new java.awt.Font("Arial", 0, 24)); 
	        jLabelErro.setForeground(new java.awt.Color(255, 0, 0));
	        jLabelErro.setText("Erro ! Por favor verificar");

	        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
	        jPanel1.setLayout(jPanel1Layout);
	        jPanel1Layout.setHorizontalGroup(
	            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel1Layout.createSequentialGroup()
	                .addGap(66, 66, 66)
	                .addComponent(jLabelSucesso, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                .addComponent(jLabelErro)
	                .addContainerGap(58, Short.MAX_VALUE))
	        );
	        jPanel1Layout.setVerticalGroup(
	            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel1Layout.createSequentialGroup()
	                .addGap(27, 27, 27)
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jLabelSucesso)
	                    .addComponent(jLabelErro))
	                .addContainerGap(60, Short.MAX_VALUE))
	        );

	        jLabelSucesso.setVisible(false);
	        jLabelErro.setVisible(false);
	        
	        lbCodigoUsuario = new JLabel();
	        lbCodigoUsuario.setText("Codigo Usu\u00E1rio");
	        lbCodigoUsuario.setFont(new Font("Arial", Font.PLAIN, 12));
	        
	        tdCodigoUsuario = new JTextField();
	        
	        JLabel lbDataInicial = new JLabel();
	        lbDataInicial.setText("Data Inicial");
	        lbDataInicial.setFont(new Font("Arial", Font.PLAIN, 12));
	        
	        tdDataInicial = new JTextField();
	        
	        JLabel lbDataFinal = new JLabel();
	        lbDataFinal.setText("Data Final");
	        lbDataFinal.setFont(new Font("Arial", Font.PLAIN, 12));
	        
	        tdDataFinal = new JTextField();
	        
	        lbValor = new JLabel();
	        lbValor.setText("Valor");
	        lbValor.setFont(new Font("Arial", Font.PLAIN, 12));
	        
	        tdValor = new JTextField();

	        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
	        jPanel2Layout.setHorizontalGroup(
	        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
	        		.addGroup(jPanel2Layout.createSequentialGroup()
	        			.addContainerGap()
	        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
	        				.addComponent(lbCodigoVeiculo)
	        				.addComponent(lbCodigo)
	        				.addComponent(lbCodigoUsuario))
	        			.addGap(9)
	        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
	        				.addComponent(lbCadastrarAgendamento)
	        				.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	        				.addComponent(bGravar)
	        				.addGroup(jPanel2Layout.createSequentialGroup()
	        					.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING, false)
	        						.addComponent(tdCodigo)
	        						.addComponent(tdCodigoVeiculo)
	        						.addGroup(jPanel2Layout.createSequentialGroup()
	        							.addGap(1)
	        							.addComponent(tdCodigoUsuario, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)))
	        					.addGap(33)
	        					.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
	        						.addComponent(lbDataFinal, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
	        						.addComponent(lbValor, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
	        						.addComponent(lbDataInicial))
	        					.addPreferredGap(ComponentPlacement.RELATED)
	        					.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
	        						.addComponent(tdDataInicial, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
	        						.addComponent(tdValor, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
	        						.addComponent(tdDataFinal, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE))))
	        			.addContainerGap())
	        );
	        jPanel2Layout.setVerticalGroup(
	        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
	        		.addGroup(jPanel2Layout.createSequentialGroup()
	        			.addContainerGap()
	        			.addComponent(lbCadastrarAgendamento)
	        			.addGap(25)
	        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
	        				.addGroup(jPanel2Layout.createSequentialGroup()
	        					.addComponent(lbCodigo)
	        					.addPreferredGap(ComponentPlacement.UNRELATED)
	        					.addComponent(lbCodigoVeiculo))
	        				.addGroup(jPanel2Layout.createSequentialGroup()
	        					.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
	        						.addComponent(tdCodigo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	        						.addComponent(lbDataInicial, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
	        						.addComponent(tdDataInicial, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	        					.addPreferredGap(ComponentPlacement.RELATED)
	        					.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
	        						.addComponent(tdCodigoVeiculo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	        						.addComponent(lbDataFinal, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
	        						.addComponent(tdDataFinal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	        					.addGap(6)))
	        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
	        				.addGroup(jPanel2Layout.createSequentialGroup()
	        					.addGap(64)
	        					.addComponent(bGravar))
	        				.addGroup(jPanel2Layout.createSequentialGroup()
	        					.addPreferredGap(ComponentPlacement.RELATED)
	        					.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
	        						.addComponent(lbCodigoUsuario, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
	        						.addComponent(tdCodigoUsuario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	        						.addComponent(lbValor, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
	        						.addComponent(tdValor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
	        			.addPreferredGap(ComponentPlacement.RELATED)
	        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	        			.addGap(0, 22, Short.MAX_VALUE))
	        );
	        jPanel2.setLayout(jPanel2Layout);

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
	        layout.setHorizontalGroup(
	        	layout.createParallelGroup(Alignment.TRAILING)
	        		.addGroup(Alignment.LEADING, layout.createSequentialGroup()
	        			.addContainerGap()
	        			.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	        			.addContainerGap(20, Short.MAX_VALUE))
	        );
	        layout.setVerticalGroup(
	        	layout.createParallelGroup(Alignment.LEADING)
	        		.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
	        			.addContainerGap(80, Short.MAX_VALUE)
	        			.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, 341, GroupLayout.PREFERRED_SIZE)
	        			.addContainerGap())
	        );
	        this.setLayout(layout);

	        getAccessibleContext().setAccessibleParent(this);
	    }
}
