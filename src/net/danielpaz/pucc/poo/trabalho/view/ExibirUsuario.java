package net.danielpaz.pucc.poo.trabalho.view;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import net.danielpaz.pucc.poo.trabalho.conexao.*;
import net.danielpaz.pucc.poo.trabalho.control.Usuario;
import net.danielpaz.pucc.poo.trabalho.model.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;


public class ExibirUsuario extends javax.swing.JPanel {

    
    public ExibirUsuario() {
        initComponents();
    }
                        
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbCodigo = new javax.swing.JLabel();
        tdCodigo = new javax.swing.JTextField();
        bBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableModelo = new javax.swing.JTable();
        bBuscarTodos = new javax.swing.JButton();
        bDeletar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Exibir Usu\u00E1rio");

        lbCodigo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbCodigo.setText("Código");

        tdCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tdCodigoActionPerformed(evt);
            }
        });

        bBuscar.setBackground(new java.awt.Color(255, 255, 255));
        bBuscar.setText("BUSCAR");
        bBuscar.setFocusable(false);
        bBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bBuscar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarActionPerformed(evt);
            }
        });

        tableModelo.setModel(new DefaultTableModel(
        	new Object[][] {
        		{null, null, null},
        	},
        	new String[] {
        		"Codigo", "Nome", "E-mail"
        	}
        ));
        jScrollPane1.setViewportView(tableModelo);

        bBuscarTodos.setBackground(new java.awt.Color(255, 255, 255));
        bBuscarTodos.setText("BUCAR TODOS");
        bBuscarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarTodosActionPerformed(evt);
            }
        });

        bDeletar.setBackground(new java.awt.Color(255, 255, 255));
        bDeletar.setText("DELETAR");
        bDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDeletarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2Layout.setHorizontalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addGap(75)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jLabel1)
        				.addComponent(lbCodigo)
        				.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING, false)
        					.addGroup(Alignment.LEADING, jPanel2Layout.createSequentialGroup()
        						.addGap(52)
        						.addComponent(tdCodigo))
        					.addGroup(Alignment.LEADING, jPanel2Layout.createSequentialGroup()
        						.addComponent(bBuscar)
        						.addGap(38)
        						.addComponent(bBuscarTodos)
        						.addGap(42)
        						.addComponent(bDeletar))))
        			.addContainerGap(97, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addGap(24)
        			.addComponent(jLabel1)
        			.addGap(42)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lbCodigo)
        				.addComponent(tdCodigo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(34)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(bBuscar)
        				.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        					.addComponent(bBuscarTodos)
        					.addComponent(bDeletar)))
        			.addGap(46)
        			.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 287, GroupLayout.PREFERRED_SIZE)
        			.addGap(0, 140, Short.MAX_VALUE))
        );
        jPanel2.setLayout(jPanel2Layout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(25, Short.MAX_VALUE))
        );
        this.setLayout(layout);
    }                      

    private void bBuscarActionPerformed(java.awt.event.ActionEvent evt) {                                        
        
      if(tdCodigo.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Por favor informe o código !", TOOL_TIP_TEXT_KEY, WIDTH, null);
                return;
            }
      
        try {
             
        	 BD bd = new BD ("oracle.jdbc.driver.OracleDriver","jdbc:oracle:thin:@localhost:1521:xe","system", "poo2014");
                
                Usuario usuario = new Usuario (Integer.parseInt(tdCodigo.getText()));
                
                int auxUsuario = usuario.getCodigo();
                UsuarioDAO usuarioDAO = new UsuarioDAO (bd);
                Usuario u = usuarioDAO.getUsuario(auxUsuario);
                tableModelo.getModel().setValueAt(u.getCodigo(), 0, 0);
                tableModelo.getModel().setValueAt(u.getNome(), 0, 1);
                tableModelo.getModel().setValueAt(u.getEmail(), 0, 2);
                
                repaint();
             
        } catch (Exception ex) {
            
            Logger.getLogger(ExibirUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }                                       

    private void tdCodigoActionPerformed(java.awt.event.ActionEvent evt) {                                         
       
    }                                        

    private void bBuscarTodosActionPerformed(java.awt.event.ActionEvent evt) {                                             
        
        try {
        	 BD bd = new BD ("oracle.jdbc.driver.OracleDriver","jdbc:oracle:thin:@localhost:1521:xe","system", "poo2014");
                
                UsuarioDAO usuarioDAO = new UsuarioDAO (bd);
                ResultSet resultado = usuarioDAO.getUsuario();
                TableModel tblModel = buildTableModel(resultado);
                tableModelo.setModel(tblModel);
           
                
        } catch (Exception e) {
            Logger.getLogger(ExibirUsuario.class.getName()).log(Level.SEVERE, null, e);
        }
    }                                            

    private void bDeletarActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if(tableModelo.getSelectedRowCount() > 0){
            try {

            	 BD bd = new BD ("oracle.jdbc.driver.OracleDriver","jdbc:oracle:thin:@localhost:1521:xe","system", "poo2014");
                
                UsuarioDAO usuarioDAO = new UsuarioDAO (bd);
                
                
                for (int i : tableModelo.getSelectedRows()) 
                {
                    Object usuarioDeletar = tableModelo.getValueAt(i, 0);
                    String tpUsuarioNome = (String) tableModelo.getValueAt(i, 1);
                    
                    int resposta;
                    resposta = JOptionPane.showConfirmDialog(null, "Deseja deletar o Usuario " +tpUsuarioNome + "?");
                    if (resposta == JOptionPane.YES_OPTION) 
                    {
                    	usuarioDAO.excluir(usuarioDeletar);  
                    }
                    else
                    {
                        return;
                    }
 
                }
                
                bd.fecharConexao();
               if (bd.sucessoBanco(true))
               {
                  JOptionPane.showMessageDialog(null, "Registros deletados com sucesso !", TOOL_TIP_TEXT_KEY, WIDTH, null);
                   return;
               }
               
               else
               {
                   JOptionPane.showMessageDialog(null, "Erro de conexão ao banco", TOOL_TIP_TEXT_KEY, WIDTH, null);
                   return;
               }
                } catch (Exception e) {
                Logger.getLogger(ExibirUsuario.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }                                        

    public static DefaultTableModel buildTableModel(ResultSet rs) throws SQLException {

    ResultSetMetaData metaData = rs.getMetaData();

    // names of columns
    Vector<String> columnNames = new Vector<String>();
    int columnCount = metaData.getColumnCount();
    for (int column = 1; column <= columnCount; column++) {
        columnNames.add(metaData.getColumnName(column));
    }

    // data of the table
    Vector<Vector<Object>> data = new Vector<Vector<Object>>();
    while (rs.next()) {
        Vector<Object> vector = new Vector<Object>();
        for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
            vector.add(rs.getObject(columnIndex));
        }
        data.add(vector);
    }

    return new DefaultTableModel(data, columnNames);

}
                    
    private javax.swing.JButton bBuscar;
    private javax.swing.JButton bBuscarTodos;
    private javax.swing.JButton bDeletar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableModelo;
    private javax.swing.JTextField tdCodigo;
                       
}
