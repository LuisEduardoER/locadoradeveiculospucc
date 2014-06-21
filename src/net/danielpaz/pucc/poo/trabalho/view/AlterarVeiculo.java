package net.danielpaz.pucc.poo.trabalho.view;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;

import net.danielpaz.pucc.poo.trabalho.conexao.*;
import net.danielpaz.pucc.poo.trabalho.control.Veiculo;
import net.danielpaz.pucc.poo.trabalho.model.*;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;


public class AlterarVeiculo extends JPanel {

	private javax.swing.JButton bGravar;
    private javax.swing.JLabel lbCadastrarVeiculo;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbCodigoVeiculo;
    private javax.swing.JLabel jLabelErro;
    private javax.swing.JLabel jLabelSucesso;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField tdCodigoVeiculo;
    private javax.swing.JTextField tdCodigoModelo;
    private JLabel lbCodigoTpVeiculo;
    private JTextField tdCodigoTpVeiculo;
    private JTextField tdPlaca;
	
    
	public AlterarVeiculo() {
		
		initComponents();

	}
	
	 private void initComponents() {
		 
		 

	        jPanel2 = new javax.swing.JPanel();
	        lbCadastrarVeiculo = new javax.swing.JLabel();
	        lbNome = new javax.swing.JLabel();
	        lbCodigoVeiculo = new javax.swing.JLabel();
	        tdCodigoVeiculo = new javax.swing.JTextField();
	        tdCodigoModelo = new javax.swing.JTextField();
	        bGravar = new javax.swing.JButton();
	        jPanel1 = new javax.swing.JPanel();
	        jLabelSucesso = new javax.swing.JLabel();
	        jLabelErro = new javax.swing.JLabel();

	        setBackground(new java.awt.Color(255, 255, 255));
	        setMinimumSize(new java.awt.Dimension(679, 631));

	        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

	        lbCadastrarVeiculo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
	        lbCadastrarVeiculo.setText("Alterar Ve\u00EDculo");

	        lbNome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
	        lbNome.setText("C\u00F3digo do Modelo");

	        lbCodigoVeiculo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
	        lbCodigoVeiculo.setText("C\u00F3digo do Ve\u00EDculo");

	        tdCodigoVeiculo.addActionListener(new java.awt.event.ActionListener() {
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
	            	if (tdCodigoVeiculo.getText().isEmpty() || tdCodigoModelo.getText().isEmpty() || tdCodigoTpVeiculo.getText().isEmpty() || tdPlaca.getText().isEmpty())
	    	        {     
	    	            JOptionPane.showMessageDialog(null, "Por favor preencher todos os campos", TOOL_TIP_TEXT_KEY, WIDTH, null);
	    	            return;
	    	        }
	    	       
	    	       boolean erro;
	    	       
	    	        try {
	    	            Veiculo veiculo = new Veiculo(Integer.parseInt(tdCodigoVeiculo.getText()),Integer.parseInt(tdCodigoModelo.getText()),tdPlaca.getText(), Integer.parseInt(tdCodigoTpVeiculo.getText()));
	    	            BD bd = new BD ("oracle.jdbc.driver.OracleDriver","jdbc:oracle:thin:@localhost:1521:xe","system", "poo2014");
	    	    
	    	             VeiculoDAO veiculoDAO = new VeiculoDAO(bd);   
	    	             if (veiculoDAO.cadastrado(Integer.parseInt(tdCodigoVeiculo.getText()))== false)
	    	             {
	    	                 JOptionPane.showMessageDialog(null, "O codigo do Veiculo não existe, por favor verificar o código novamente.", TOOL_TIP_TEXT_KEY, WIDTH, null);
	    	                 repaint();
	    	                 return;
	    	             }
	    	             else
	    	             {
	    	             veiculoDAO.alterar(veiculo);
	    	    		 
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
	    	        } catch (Exception ex) {
	    	            Logger.getLogger(AlterarVeiculo.class.getName()).log(Level.SEVERE, null, ex);
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
	        
	        lbCodigoTpVeiculo = new JLabel();
	        lbCodigoTpVeiculo.setText("C\u00F3digo Tipo do Ve\u00EDculo");
	        lbCodigoTpVeiculo.setFont(new Font("Arial", Font.PLAIN, 12));
	        
	        tdCodigoTpVeiculo = new JTextField();
	        
	        JLabel lbPlaca = new JLabel();
	        lbPlaca.setText("Placa");
	        lbPlaca.setFont(new Font("Arial", Font.PLAIN, 12));
	        
	        tdPlaca = new JTextField();

	        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
	        jPanel2Layout.setHorizontalGroup(
	        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
	        		.addGroup(jPanel2Layout.createSequentialGroup()
	        			.addGap(75)
	        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
	        				.addGroup(jPanel2Layout.createSequentialGroup()
	        					.addComponent(bGravar)
	        					.addContainerGap())
	        				.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
	        					.addGroup(jPanel2Layout.createSequentialGroup()
	        						.addPreferredGap(ComponentPlacement.RELATED)
	        						.addComponent(lbPlaca, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
	        						.addPreferredGap(ComponentPlacement.RELATED)
	        						.addComponent(tdPlaca, GroupLayout.PREFERRED_SIZE, 306, GroupLayout.PREFERRED_SIZE)
	        						.addContainerGap())
	        					.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
	        						.addGroup(jPanel2Layout.createSequentialGroup()
	        							.addComponent(lbCodigoTpVeiculo, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
	        							.addPreferredGap(ComponentPlacement.RELATED)
	        							.addComponent(tdCodigoTpVeiculo, GroupLayout.PREFERRED_SIZE, 306, GroupLayout.PREFERRED_SIZE)
	        							.addGap(143))
	        						.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
	        							.addGroup(jPanel2Layout.createSequentialGroup()
	        								.addComponent(lbNome)
	        								.addContainerGap())
	        							.addGroup(jPanel2Layout.createSequentialGroup()
	        								.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
	        									.addComponent(lbCadastrarVeiculo)
	        									.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	        									.addGroup(jPanel2Layout.createSequentialGroup()
	        										.addComponent(lbCodigoVeiculo)
	        										.addGap(56)
	        										.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
	        											.addComponent(tdCodigoVeiculo)
	        											.addComponent(tdCodigoModelo, GroupLayout.PREFERRED_SIZE, 306, GroupLayout.PREFERRED_SIZE))))
	        								.addContainerGap(74, Short.MAX_VALUE)))))))
	        );
	        jPanel2Layout.setVerticalGroup(
	        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
	        		.addGroup(jPanel2Layout.createSequentialGroup()
	        			.addContainerGap()
	        			.addComponent(lbCadastrarVeiculo)
	        			.addPreferredGap(ComponentPlacement.UNRELATED)
	        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
	        				.addComponent(lbCodigoVeiculo)
	        				.addComponent(tdCodigoVeiculo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	        			.addGap(18)
	        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
	        				.addComponent(lbNome)
	        				.addComponent(tdCodigoModelo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	        			.addGap(18)
	        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
	        				.addComponent(lbCodigoTpVeiculo, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
	        				.addComponent(tdCodigoTpVeiculo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	        			.addGap(18)
	        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
	        				.addComponent(lbPlaca, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
	        				.addComponent(tdPlaca, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	        			.addPreferredGap(ComponentPlacement.RELATED)
	        			.addComponent(bGravar)
	        			.addPreferredGap(ComponentPlacement.UNRELATED)
	        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	        			.addContainerGap())
	        );
	        jPanel2.setLayout(jPanel2Layout);

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
	        layout.setHorizontalGroup(
	        	layout.createParallelGroup(Alignment.LEADING)
	        		.addGroup(layout.createSequentialGroup()
	        			.addContainerGap()
	        			.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, 680, GroupLayout.PREFERRED_SIZE)
	        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	        );
	        layout.setVerticalGroup(
	        	layout.createParallelGroup(Alignment.LEADING)
	        		.addGroup(layout.createSequentialGroup()
	        			.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, 341, GroupLayout.PREFERRED_SIZE)
	        			.addContainerGap(22, Short.MAX_VALUE))
	        );
	        this.setLayout(layout);

	        getAccessibleContext().setAccessibleParent(this);
	    }
}
