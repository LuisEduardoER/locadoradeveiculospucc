package net.danielpaz.pucc.poo.trabalho.view;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import net.danielpaz.pucc.poo.trabalho.conexao.*;
import net.danielpaz.pucc.poo.trabalho.model.*;

public class ExibirMarca extends javax.swing.JPanel {

    /**
     * Creates new form ModeloLayout
     */
    public ExibirMarca()
    {
        initComponents();
    }

                          
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tdCodigo = new javax.swing.JTextField();
        bBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMarca = new javax.swing.JTable();
        bBuscarTodos = new javax.swing.JButton();
        bDeletar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Exibir Marca");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("Código");

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

        tableMarca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Codigo", "Descrição"
            }
        ));
        jScrollPane1.setViewportView(tableMarca);

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
                                    .addComponent(bBuscar))
                                .addGap(44, 44, 44)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(bBuscarTodos)
                                        .addGap(51, 51, 51)
                                        .addComponent(bDeletar))
                                    .addComponent(tdCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(196, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tdCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bBuscar)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bBuscarTodos)
                        .addComponent(bDeletar)))
                .addGap(54, 54, 54)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 140, Short.MAX_VALUE))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
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
    
    
    private void bBuscarActionPerformed(java.awt.event.ActionEvent evt) {                                        
       
      if(tdCodigo.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Por favor informe o código !", TOOL_TIP_TEXT_KEY, WIDTH, null);
                return;
            }
      
        try {
          
        	BD bd = new BD ("oracle.jdbc.driver.OracleDriver","jdbc:oracle:thin:@localhost:1521:xe","system", "poo2014");
                
                Marca marca = new Marca (Integer.parseInt(tdCodigo.getText()));
                
                int auxMarca = marca.getIdMarca();
                MarcaDAO marcaDAO = new MarcaDAO(bd);
                Marca m = marcaDAO.getMarca(auxMarca);
                tableMarca.getModel().setValueAt(m.getIdMarca(), 0, 0);
                tableMarca.getModel().setValueAt(m.getDescricaoMarca(), 0, 1);
                
      
        } catch (Exception ex) {
            
            Logger.getLogger(ExibirMarca.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }                                       

    private void tdCodigoActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
    }                                        

    private void bBuscarTodosActionPerformed(java.awt.event.ActionEvent evt) {                                             
        
        try {
        	BD bd = new BD ("oracle.jdbc.driver.OracleDriver","jdbc:oracle:thin:@localhost:1521:xe","system", "poo2014");
                
                MarcaDAO marcaDAO = new MarcaDAO(bd);
                ResultSet resultado = marcaDAO.getMarca();
                TableModel tblModel = buildTableModel(resultado);
                tableMarca.setModel(tblModel);
                
                
                
        } catch (Exception e) {
            Logger.getLogger(ExibirMarca.class.getName()).log(Level.SEVERE, null, e);
        }
    }                                            

    private void bDeletarActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if(tableMarca.getSelectedRowCount() > 0)
        {
        	
            try {
            	BD bd = new BD ("oracle.jdbc.driver.OracleDriver","jdbc:oracle:thin:@localhost:1521:xe","system", "poo2014");
                
                MarcaDAO marcaDAO = new MarcaDAO(bd);
                
                
                for (int i : tableMarca.getSelectedRows()) {
                   Object marcaDeletar =  tableMarca.getValueAt(i, i);
                    String marcaDesc = (String) tableMarca.getValueAt(i, 1);
                    
                    int resposta;
                    resposta = JOptionPane.showConfirmDialog(null, "Deseja deletar a Marca " +marcaDesc + "?");
                    if (resposta == JOptionPane.YES_OPTION) 
                    {
                    	marcaDAO.excluir(marcaDeletar);  
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
                       }
               else
               {
                   JOptionPane.showMessageDialog(null, "Erro de conexão ao banco", TOOL_TIP_TEXT_KEY, WIDTH, null);
                   return;
               }
                } catch (Exception e) {
                Logger.getLogger(ExibirMarca.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }                                        

   
                        
    private javax.swing.JButton bBuscar;
    private javax.swing.JButton bBuscarTodos;
    private javax.swing.JButton bDeletar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableMarca;
    private javax.swing.JTextField tdCodigo;
                     
}