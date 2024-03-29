package net.danielpaz.pucc.poo.trabalho.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.*;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.danielpaz.pucc.poo.trabalho.model.*;
import net.danielpaz.pucc.poo.trabalho.conexao.*;
import net.danielpaz.pucc.poo.trabalho.control.Modelo;

public class AlterarModelo extends javax.swing.JPanel {

    /**
     * Creates new form ModeloLayout
     */
    public AlterarModelo() {
        initComponents();
    }

                         
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tdCodigo = new javax.swing.JTextField();
        tdDescricao = new javax.swing.JTextField();
        bGravar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabelSucesso = new javax.swing.JLabel();
        jLabelErro = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tdMarca = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(679, 631));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Alterar Modelo");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Descri��o");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("C�digo do Modelo");

        tdCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tdCodigoActionPerformed(evt);
            }
        });

        bGravar.setBackground(new java.awt.Color(255, 255, 255));
        bGravar.setText("GRAVAR");
        bGravar.setFocusable(false);
        bGravar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bGravar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGravarActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabelSucesso.setBackground(new java.awt.Color(255, 255, 255));
        jLabelSucesso.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabelSucesso.setForeground(new java.awt.Color(0, 153, 51));
        jLabelSucesso.setText("Sucesso !");
        jLabelSucesso.setRequestFocusEnabled(false);

        jLabelErro.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
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

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("C�digo da Marca");

        tdMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tdMarcaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))
                                .addGap(53, 53, 53)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tdDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tdCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tdMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(131, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bGravar))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tdCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tdMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tdDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(bGravar)
                .addGap(34, 34, 34)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 125, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleParent(this);
    }                       

    private void bGravarActionPerformed(java.awt.event.ActionEvent evt) {                                        
        
      if (tdCodigo.getText().isEmpty() || tdMarca.getText().isEmpty() || tdDescricao.getText().isEmpty())
        {     
            JOptionPane.showMessageDialog(null, "Por favor preencher todos os campos", TOOL_TIP_TEXT_KEY, WIDTH, null);
            return;
        }
      
      boolean erro;
      
        try {
            
           Modelo modelo = new Modelo(Integer.parseInt(tdCodigo.getText()), Integer.parseInt(tdMarca.getText()), tdDescricao.getText());
           
           BD bd = new BD ("oracle.jdbc.driver.OracleDriver","jdbc:oracle:thin:@localhost:1521:xe","system", "poo2014");
    
             MarcaDAO marcaDAO = new MarcaDAO (bd);
             
             if (marcaDAO.cadastrado(Integer.parseInt(tdMarca.getText()))== false)
             {
                 JOptionPane.showMessageDialog(null, "A marca n�o existe, por favor verificar o c�digo novamente.", TOOL_TIP_TEXT_KEY, WIDTH, null);
                 repaint();
                 return;
             }
             
             else
             {    
             ModeloDAO modeloDAO = new ModeloDAO (bd); 
             if (modeloDAO.cadastrado(Integer.parseInt(tdCodigo.getText()))== false)
             {
                 JOptionPane.showMessageDialog(null, "O Modelo n�o existe, por favor verificar o c�digo novamente.", TOOL_TIP_TEXT_KEY, WIDTH, null);
                 repaint();
                 return;
             }
             else
             {
             modeloDAO.alterar(modelo);
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
        } catch (Exception ex) {
            Logger.getLogger(AlterarModelo.class.getName()).log(Level.SEVERE, null, ex);
            erro = true;
        }
       
       
        
    }                                       

    private void tdCodigoActionPerformed(java.awt.event.ActionEvent evt) {                                         
       
    }                                        

    private void tdMarcaActionPerformed(java.awt.event.ActionEvent evt) {                                        
        
    }                                       

    // Variables declaration                     
    private javax.swing.JButton bGravar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelErro;
    private javax.swing.JLabel jLabelSucesso;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField tdCodigo;
    private javax.swing.JTextField tdDescricao;
    private javax.swing.JTextField tdMarca;
    // End of variables declaration                   
}
