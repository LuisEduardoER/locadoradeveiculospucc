package net.danielpaz.pucc.poo.trabalho.view;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;

import net.danielpaz.pucc.poo.trabalho.conexao.*;
import net.danielpaz.pucc.poo.trabalho.control.Marca;
import net.danielpaz.pucc.poo.trabalho.model.*;


public class CadastrarMarca extends JPanel {

	private javax.swing.JButton bGravar;
    private javax.swing.JLabel lbCadastrarMarca;
    private javax.swing.JLabel lbDescricao;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel jLabelErro;
    private javax.swing.JLabel jLabelSucesso;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField tdCodigo;
    private javax.swing.JTextField tdDescricao;
	
    
	public CadastrarMarca() {
		
		initComponents();

	}
	
	 private void initComponents() {
		 
		 

	        jPanel2 = new javax.swing.JPanel();
	        lbCadastrarMarca = new javax.swing.JLabel();
	        lbDescricao = new javax.swing.JLabel();
	        lbCodigo = new javax.swing.JLabel();
	        tdCodigo = new javax.swing.JTextField();
	        tdDescricao = new javax.swing.JTextField();
	        bGravar = new javax.swing.JButton();
	        jPanel1 = new javax.swing.JPanel();
	        jLabelSucesso = new javax.swing.JLabel();
	        jLabelErro = new javax.swing.JLabel();

	        setBackground(new java.awt.Color(255, 255, 255));
	        setMinimumSize(new java.awt.Dimension(679, 631));

	        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

	        lbCadastrarMarca.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
	        lbCadastrarMarca.setText("Cadastrar Marca");

	        lbDescricao.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
	        lbDescricao.setText("Descri��o");

	        lbCodigo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
	        lbCodigo.setText("C�digo");

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
	            	if (tdCodigo.getText().isEmpty() || tdDescricao.getText().isEmpty())
	    	        {     
	    	            JOptionPane.showMessageDialog(null, "Por favor preencher todos os campos", TOOL_TIP_TEXT_KEY, WIDTH, null);
	    	            return;
	    	        }
	    	       
	    	       boolean erro;
	    	       
	    	        try {
	    	            Marca marca = new Marca(Integer.parseInt(tdCodigo.getText()), tdDescricao.getText());
	    	            BD bd = new BD ("oracle.jdbc.driver.OracleDriver","jdbc:oracle:thin:@localhost:1521:xe","system", "poo2014");
	    	    
	    	             MarcaDAO marcaDAO = new MarcaDAO (bd);   
	    	             if (marcaDAO.cadastrado(Integer.parseInt(tdCodigo.getText()))== true)
	    	             {
	    	                 JOptionPane.showMessageDialog(null, "O codigo da Marca j� existe, por favor verificar o c�digo novamente.", TOOL_TIP_TEXT_KEY, WIDTH, null);
	    	                 repaint();
	    	                 return;
	    	             }
	    	             else
	    	             {
	    	             marcaDAO.incluir(marca);
	    	    		 
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
	    	            Logger.getLogger(CadastrarMarca.class.getName()).log(Level.SEVERE, null, ex);
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

	        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
	        jPanel2.setLayout(jPanel2Layout);
	        jPanel2Layout.setHorizontalGroup(
	            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel2Layout.createSequentialGroup()
	                .addGap(75, 75, 75)
	                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(jPanel2Layout.createSequentialGroup()
	                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addComponent(lbCadastrarMarca)
	                            .addGroup(jPanel2Layout.createSequentialGroup()
	                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                    .addComponent(lbCodigo)
	                                    .addComponent(lbDescricao))
	                                .addGap(53, 53, 53)
	                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                    .addComponent(tdDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                    .addComponent(tdCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
	                        .addContainerGap(131, Short.MAX_VALUE))
	                    .addGroup(jPanel2Layout.createSequentialGroup()
	                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addComponent(bGravar))
	                        .addGap(0, 0, Short.MAX_VALUE))))
	        );
	        jPanel2Layout.setVerticalGroup(
	            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel2Layout.createSequentialGroup()
	                .addGap(24, 24, 24)
	                .addComponent(lbCadastrarMarca)
	                .addGap(18, 18, 18)
	                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(lbCodigo)
	                    .addComponent(tdCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(18, 18, 18)
	                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(lbDescricao)
	                    .addComponent(tdDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(30, 30, 30)
	                .addComponent(bGravar)
	                .addGap(34, 34, 34)
	                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(0, 148, Short.MAX_VALUE))
	        );

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
	        layout.setHorizontalGroup(
	        	layout.createParallelGroup(Alignment.TRAILING)
	        		.addGroup(layout.createSequentialGroup()
	        			.addContainerGap(40, Short.MAX_VALUE)
	        			.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	        			.addGap(20))
	        );
	        layout.setVerticalGroup(
	        	layout.createParallelGroup(Alignment.LEADING)
	        		.addGroup(layout.createSequentialGroup()
	        			.addGap(91)
	        			.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, 341, GroupLayout.PREFERRED_SIZE)
	        			.addContainerGap(52, Short.MAX_VALUE))
	        );
	        this.setLayout(layout);

	        getAccessibleContext().setAccessibleParent(this);
	    }
        
	    
}
