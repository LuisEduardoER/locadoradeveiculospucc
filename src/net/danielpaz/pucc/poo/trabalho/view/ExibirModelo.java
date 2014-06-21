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
import net.danielpaz.pucc.poo.trabalho.model.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

public class ExibirModelo extends javax.swing.JPanel {

    public ExibirModelo() {
        initComponents();
    }

                          
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableModelo = new javax.swing.JTable();
        bBuscarTodos = new javax.swing.JButton();
        bDeletar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Exibir Modelo");

        tableModelo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Codigo", "Marca", "Descrição"
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
        				.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addGap(48)
        					.addComponent(bBuscarTodos)
        					.addGap(153)
        					.addComponent(bDeletar)))
        			.addContainerGap(94, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addGap(24)
        			.addComponent(jLabel1)
        			.addGap(96)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(bDeletar)
        				.addComponent(bBuscarTodos))
        			.addGap(46)
        			.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 287, GroupLayout.PREFERRED_SIZE)
        			.addGap(0, 140, Short.MAX_VALUE))
        );
        jPanel2.setLayout(jPanel2Layout);

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
    }                      

    private void bBuscarTodosActionPerformed(java.awt.event.ActionEvent evt) {                                             
        
        try {
        	BD bd = new BD ("oracle.jdbc.driver.OracleDriver","jdbc:oracle:thin:@localhost:1521:xe","system", "poo2014");
                
                ModeloDAO modeloDAO = new ModeloDAO (bd);
                ResultSet resultado = modeloDAO.getModelo();
                TableModel tblModel = buildTableModel(resultado);
                tableModelo.setModel(tblModel);
           
                
        } catch (Exception e) {
            Logger.getLogger(ExibirModelo.class.getName()).log(Level.SEVERE, null, e);
        }
    }                                            

    private void bDeletarActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if(tableModelo.getSelectedRowCount() > 0){
            try {
            	
            	BD bd = new BD ("oracle.jdbc.driver.OracleDriver","jdbc:oracle:thin:@localhost:1521:xe","system", "poo2014");
                
            	ModeloDAO modeloDAO = new ModeloDAO (bd);
                
                
                for (int i : tableModelo.getSelectedRows()) 
                {
                    Object modeloDeletar = tableModelo.getValueAt(i, 0);
                    String modeloDesc = (String) tableModelo.getValueAt(i, 1);
                    
                    
                    int resposta;
                    resposta = JOptionPane.showConfirmDialog(null, "Deseja deletar o Modelo " +modeloDesc + "?");
                    if (resposta == JOptionPane.YES_OPTION) 
                    {
                    	modeloDAO.excluir(modeloDeletar);  
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
                Logger.getLogger(ExibirModelo.class.getName()).log(Level.SEVERE, null, e);
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
    private javax.swing.JButton bBuscarTodos;
    private javax.swing.JButton bDeletar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableModelo;
                     
}
