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


public class Principal extends javax.swing.JFrame {
	 protected String opcaoSelecionada;
	  
	 
	    private boolean verificador = false;
	 
	    public Principal() {
	               
	        initComponents();
	    }

	                           
	    private void initComponents() {

	        jPanel2 = new javax.swing.JPanel();
	        jButton2 = new javax.swing.JButton();
	        jButton1 = new javax.swing.JButton();
	        jLabel1 = new javax.swing.JLabel();
	        jPanel3 = new javax.swing.JPanel();
	        menu = new javax.swing.JMenuBar();
	        mMarca = new javax.swing.JMenu();
	        jMarcaAlterar = new javax.swing.JMenuItem();
	        jMarcaCadastrar = new javax.swing.JMenuItem();
	        jMarcaExibir = new javax.swing.JMenuItem();
	        mModelo = new javax.swing.JMenu();
	        jModeloAlterar = new javax.swing.JMenuItem();
	        jModeloCadastrar = new javax.swing.JMenuItem();
	        jModeloExibir = new javax.swing.JMenuItem();
	        mTpVeiculo = new javax.swing.JMenu();
	        jTpVeiculoAlterar = new javax.swing.JMenuItem();
	        jTpVeiculoCadastrar = new javax.swing.JMenuItem();
	        jTpVeiculoExibir = new javax.swing.JMenuItem();	        
	        mUsuario = new javax.swing.JMenu();
	        jUsuarioAlterar = new javax.swing.JMenuItem();
	        jUsuarioCadastrar = new javax.swing.JMenuItem();
	        jUsuarioExibir = new javax.swing.JMenuItem();	        
	        mVeiculo = new javax.swing.JMenu();
	        jVeiculoAlterar = new javax.swing.JMenuItem();
	        jVeiculoCadastrar = new javax.swing.JMenuItem();
	        jVeiculoExibir = new javax.swing.JMenuItem();	        
	        mAgendamento = new javax.swing.JMenu();
	        jAgendamentoAlterar = new javax.swing.JMenuItem();
	        jAgendamentoCadastrar = new javax.swing.JMenuItem();
	        jAgendamentoExibir = new javax.swing.JMenuItem();
	        

	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
	        setBackground(new java.awt.Color(255, 255, 255));
	        setMaximumSize(new java.awt.Dimension(800, 782));
	        setMinimumSize(new java.awt.Dimension(800, 782));
	        setName("framePrincipal"); // NOI18N
	        setPreferredSize(new java.awt.Dimension(800, 782));

	        jPanel2.setBackground(new java.awt.Color(0, 153, 204));
	        jPanel2.setMaximumSize(new java.awt.Dimension(1, 1));
	        jPanel2.setMinimumSize(new java.awt.Dimension(800, 85));
	        jPanel2.setPreferredSize(new java.awt.Dimension(800, 85));

	        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/danielpaz/pucc/poo/trabalho/view/RentCar.jpg"))); // NOI18N
	        jPanel2.add(jButton2);
	        jButton2.getAccessibleContext().setAccessibleName("icon");

	        jButton1.setBackground(new java.awt.Color(0, 153, 204));
	        jButton1.setForeground(new java.awt.Color(0, 153, 204));
	        jButton1.setBorder(null);
	        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
	        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
	        jButton1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
	        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
	        jPanel2.add(jButton1);

	        jLabel1.setFont(new java.awt.Font("Bradley Hand ITC", 1, 24)); // NOI18N
	        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
	        jLabel1.setText("Locação de Veículos - O melhor para aluguel de carros");
	        jPanel2.add(jLabel1);

	        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.LINE_AXIS));

	        menu.setMaximumSize(new java.awt.Dimension(800, 782));

	        mMarca.setText("Marca");

	        jMarcaAlterar.setText("Alterar");
	        jMarcaAlterar.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jMarcaAlterarActionPerformed(evt);
	            }
	        });
	        mMarca.add(jMarcaAlterar);

	        jMarcaCadastrar.setText("Cadastrar");
	        jMarcaCadastrar.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jMarcaCadastrarActionPerformed(evt);
	            }
	        });
	        mMarca.add(jMarcaCadastrar);

	        jMarcaExibir.setText("Exibir");
	        jMarcaExibir.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jMarcaExibirActionPerformed(evt);
	            }
	        });
	        mMarca.add(jMarcaExibir);

	        menu.add(mMarca);

	        mModelo.setText("Modelo");

	        jModeloAlterar.setText("Alterar");
	        jModeloAlterar.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jModeloAlterarActionPerformed(evt);
	            }
	        });
	        mModelo.add(jModeloAlterar);

	        jModeloCadastrar.setText("Cadastrar");
	        jModeloCadastrar.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jModeloCadastrarActionPerformed(evt);
	            }
	        });
	        mModelo.add(jModeloCadastrar);

	        jModeloExibir.setText("Exibir");
	        jModeloExibir.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jModeloExibirActionPerformed(evt);
	            }
	        });
	        mModelo.add(jModeloExibir);

	        menu.add(mModelo);

	        mTpVeiculo.setText("Tipo de Veiculo");

	        jTpVeiculoAlterar.setText("Alterar");
	        jTpVeiculoAlterar.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jTpVeiculoAlterarActionPerformed(evt);
	            }
	        });
	        mTpVeiculo.add(jTpVeiculoAlterar);

	        jTpVeiculoCadastrar.setText("Cadastrar");
	        jTpVeiculoCadastrar.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jTpVeiculoCadastrarActionPerformed(evt);
	            }
	        });
	        mTpVeiculo.add(jTpVeiculoCadastrar);

	        jTpVeiculoExibir.setText("Exibir");
	        jTpVeiculoExibir.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jTpVeiculoExibirActionPerformed(evt);
	            }
	        });
	        mTpVeiculo.add(jTpVeiculoExibir);

	        menu.add(mTpVeiculo);
	        
	        
	        mUsuario.setText("Usuario");

	        jUsuarioAlterar.setText("Alterar");
	        jUsuarioAlterar.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jUsuarioAlterarActionPerformed(evt);
	            }
	        });
	        mUsuario.add(jUsuarioAlterar);

	        jUsuarioCadastrar.setText("Cadastrar");
	        jUsuarioCadastrar.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jUsuarioCadastrarActionPerformed(evt);
	            }
	        });
	        mUsuario.add(jUsuarioCadastrar);

	        jUsuarioExibir.setText("Exibir");
	        jUsuarioExibir.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jUsuarioExibirActionPerformed(evt);
	            }
	        });
	        mUsuario.add(jUsuarioExibir);

	        menu.add(mUsuario);
	        
	        
	        mVeiculo.setText("Veiculo");

	        jVeiculoAlterar.setText("Alterar");
	        jVeiculoAlterar.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jVeiculoAlterarActionPerformed(evt);
	            }
	        });
	        mVeiculo.add(jVeiculoAlterar);

	        jVeiculoCadastrar.setText("Cadastrar");
	        jVeiculoCadastrar.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jVeiculoCadastrarActionPerformed(evt);
	            }
	        });
	        mVeiculo.add(jVeiculoCadastrar);

	        jVeiculoExibir.setText("Exibir");
	        jVeiculoExibir.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jVeiculoExibirActionPerformed(evt);
	            }
	        });
	        mVeiculo.add(jVeiculoExibir);

	        menu.add(mVeiculo);

	        //
	        mAgendamento.setText("Agendamento");

	        jAgendamentoAlterar.setText("Alterar");
	        jAgendamentoAlterar.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jAgendamentoAlterarActionPerformed(evt);
	            }
	        });
	        mAgendamento.add(jAgendamentoAlterar);

	        jAgendamentoCadastrar.setText("Cadastrar");
	        jAgendamentoCadastrar.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jAgendamentoCadastrarActionPerformed(evt);
	            }
	        });
	        mAgendamento.add(jAgendamentoCadastrar);

	        jAgendamentoExibir.setText("Exibir");
	        jAgendamentoExibir.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jAgendamentoExibirActionPerformed(evt);
	            }
	        });
	        mAgendamento.add(jAgendamentoExibir);

	        menu.add(mAgendamento);
	        
	        setJMenuBar(menu);

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                    .addGroup(layout.createSequentialGroup()
	                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                    .addGroup(layout.createSequentialGroup()
	                        .addGap(2, 2, 2)
	                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
	                .addGap(802, 802, 802))
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE))
	        );

	        setBounds(0, 0, 816, 820);
	    }// </editor-fold>                        

	    private void jTpVeiculoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {                                                    
	        CadastrarTipoVeiculo cadastroTpVeiculo = new CadastrarTipoVeiculo();
	  if (verificador = false)
	        {    
	         jPanel3.add(cadastroTpVeiculo);
	        cadastroTpVeiculo.setVisible(true);
	        repaint();
	        jPanel3.revalidate();
	        }
	        else
	        {
	         jPanel3.removeAll();
	        jPanel3.add(cadastroTpVeiculo);
	        cadastroTpVeiculo.setVisible(true);
	        repaint();
	        jPanel3.revalidate();
	        verificador = true;  
	        }
	    }                                                   

	    private void jModeloCadastrarActionPerformed(java.awt.event.ActionEvent evt) {                                                 
	 CadastrarModelo cadastroModelo = new CadastrarModelo();
	  if (verificador = false)
	        {    
	         jPanel3.add(cadastroModelo);
	        cadastroModelo.setVisible(true);
	        repaint();
	        jPanel3.revalidate();
	        }
	        else
	        {
	         jPanel3.removeAll();
	        jPanel3.add(cadastroModelo);
	        cadastroModelo.setVisible(true);
	        repaint();
	        jPanel3.revalidate();
	        verificador = true;  
	        }
	                         
	    }                                                

	    private void jMarcaCadastrarActionPerformed(java.awt.event.ActionEvent evt) {                                                
	        
	        CadastrarMarca cadastrarMarca = new CadastrarMarca();
	  if (verificador = false)
	        {    
	         jPanel3.add(cadastrarMarca);
	         cadastrarMarca.setVisible(true);
	        repaint();
	        jPanel3.revalidate();
	        }
	        else
	        {
	         jPanel3.removeAll();
	        jPanel3.add(cadastrarMarca);
	        cadastrarMarca.setVisible(true);
	        repaint();
	        jPanel3.revalidate();
	        verificador = true;  
	        }
	    }                                               

	    private void jModeloExibirActionPerformed(java.awt.event.ActionEvent evt) {                                              
	        ExibirModelo exibirModelo = new ExibirModelo();  
	        if (verificador = false)
	        {    
	         jPanel3.add(exibirModelo);
	        exibirModelo.setVisible(true);
	        repaint();
	        jPanel3.revalidate();
	        }
	        else
	        {
	         jPanel3.removeAll();
	        jPanel3.add(exibirModelo);
	        exibirModelo.setVisible(true);
	        repaint();
	        jPanel3.revalidate();
	        verificador = true;
	        }
	    }                                             

	    private void jMarcaAlterarActionPerformed(java.awt.event.ActionEvent evt) {                                              
	        
	                AlterarMarca alterarMarca = new AlterarMarca();
	        if (verificador = false)
	        {    
	         jPanel3.add(alterarMarca);
	        alterarMarca.setVisible(true);
	        repaint();
	        jPanel3.revalidate();
	        }
	        else
	        {
	         jPanel3.removeAll();
	        jPanel3.add(alterarMarca);
	        alterarMarca.setVisible(true);
	        repaint();
	        jPanel3.revalidate();
	        verificador = true;  
	        }

	    }                                             

	    private void jModeloAlterarActionPerformed(java.awt.event.ActionEvent evt) {                                               
	        
	         AlterarModelo alterarModelo = new AlterarModelo();
	   if (verificador = false)
	        {    
	         jPanel3.add(alterarModelo);
	        alterarModelo.setVisible(true);
	        repaint();
	        jPanel3.revalidate();
	        }
	        else
	        {
	         jPanel3.removeAll();
	        jPanel3.add(alterarModelo);
	        alterarModelo.setVisible(true);
	        repaint();
	        jPanel3.revalidate();
	        verificador = true;  
	        }
	    
	        
	    }                                              

	    private void jMarcaExibirActionPerformed(java.awt.event.ActionEvent evt) {                                             
	        
	        ExibirMarca exibirMarca = new ExibirMarca();
	        if (verificador = false)
	        {
	            jPanel3.add(exibirMarca);
	            exibirMarca.setVisible(true);
	            repaint();
	            jPanel3.revalidate();
	        }
	        else
	        {
	            jPanel3.removeAll();
	            jPanel3.add(exibirMarca);
	            exibirMarca.setVisible(true);
	            repaint();
	            jPanel3.revalidate();
	            verificador = true;
	        }

	    }                                            

	    private void jTpVeiculoAlterarActionPerformed(java.awt.event.ActionEvent evt) {                                                  
	        AlterarTipoVeiculo alterarTpVeiculo = new AlterarTipoVeiculo();
	   if (verificador = false)
	        {    
	         jPanel3.add(alterarTpVeiculo);
	        alterarTpVeiculo.setVisible(true);
	        repaint();
	        jPanel3.revalidate();
	        }
	        else
	        {
	         jPanel3.removeAll();
	        jPanel3.add(alterarTpVeiculo);
	        alterarTpVeiculo.setVisible(true);
	        repaint();
	        jPanel3.revalidate();
	        verificador = true;  
	        }
	    }                                                 

	    private void jTpVeiculoExibirActionPerformed(java.awt.event.ActionEvent evt) {                                                 
	        ExibirTipoVeiculo exibirTpVeiculo = new ExibirTipoVeiculo();
	        if (verificador = false)
	        {
	            jPanel3.add(exibirTpVeiculo);
	            exibirTpVeiculo.setVisible(true);
	            repaint();
	            jPanel3.revalidate();
	        }
	        else
	        {
	            jPanel3.removeAll();
	            jPanel3.add(exibirTpVeiculo);
	            exibirTpVeiculo.setVisible(true);
	            repaint();
	            jPanel3.revalidate();
	            verificador = true;
	        }
	    }        
	    
	    // Usuario
	    private void jUsuarioCadastrarActionPerformed(java.awt.event.ActionEvent evt) { 
	    	
	    }
	    
	    private void jUsuarioAlterarActionPerformed(java.awt.event.ActionEvent evt) { 
	    	
	    }
	    
	    private void jUsuarioExibirActionPerformed(java.awt.event.ActionEvent evt) { 
	    	
	    }
	    
	    //Veiculo
	    private void jVeiculoCadastrarActionPerformed(java.awt.event.ActionEvent evt) { 
	    	
	    }
	    
	    private void jVeiculoAlterarActionPerformed(java.awt.event.ActionEvent evt) { 
	    	
	    }
	    
	    private void jVeiculoExibirActionPerformed(java.awt.event.ActionEvent evt) { 
	    	
	    }
	    
	    // Agendamento
	    private void jAgendamentoCadastrarActionPerformed(java.awt.event.ActionEvent evt) { 
	    	
	    }
	    
	    private void jAgendamentoAlterarActionPerformed(java.awt.event.ActionEvent evt) { 
	    	
	    }
	    
	    private void jAgendamentoExibirActionPerformed(java.awt.event.ActionEvent evt) { 
	    	
	    }
	    

	    /**
	     * @param args the command line arguments
	     */
	    public static void main(String args[]) {
	      
	        try {
	            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
	                if ("Nimbus".equals(info.getName())) {
	                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
	                    break;
	                }
	            }
	        } catch (ClassNotFoundException ex) {
	            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (InstantiationException ex) {
	            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (IllegalAccessException ex) {
	            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        }
	        

	        
	        java.awt.EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                new Principal().setVisible(true);
	                           }
	        });

	    }
	    // Variables declaration - do not modify                     
	    private javax.swing.JButton jButton1;
	    private javax.swing.JButton jButton2;
	    private javax.swing.JLabel jLabel1;
	    private javax.swing.JMenuItem jMarcaAlterar;
	    private javax.swing.JMenuItem jMarcaCadastrar;
	    private javax.swing.JMenuItem jMarcaExibir;
	    private javax.swing.JMenuItem jModeloAlterar;
	    private javax.swing.JMenuItem jModeloCadastrar;
	    private javax.swing.JMenuItem jModeloExibir;
	    private javax.swing.JPanel jPanel2;
	    private javax.swing.JPanel jPanel3;
	    private javax.swing.JMenuItem jTpVeiculoAlterar;
	    private javax.swing.JMenuItem jTpVeiculoCadastrar;
	    private javax.swing.JMenuItem jTpVeiculoExibir;
	    private javax.swing.JMenuItem jUsuarioAlterar;
	    private javax.swing.JMenuItem jUsuarioCadastrar;
	    private javax.swing.JMenuItem jUsuarioExibir;
	    private javax.swing.JMenuItem jVeiculoAlterar;
	    private javax.swing.JMenuItem jVeiculoCadastrar;
	    private javax.swing.JMenuItem jVeiculoExibir;	    
	    private javax.swing.JMenuItem jAgendamentoAlterar;
	    private javax.swing.JMenuItem jAgendamentoCadastrar;
	    private javax.swing.JMenuItem jAgendamentoExibir;
	    private javax.swing.JMenu mMarca;
	    private javax.swing.JMenu mModelo;
	    private javax.swing.JMenu mTpVeiculo;
	    private javax.swing.JMenu mUsuario;
	    private javax.swing.JMenu mVeiculo;
	    private javax.swing.JMenu mAgendamento;
	    private javax.swing.JMenuBar menu;
	    
	    // End of variables declaration                   
	}

	 
	
