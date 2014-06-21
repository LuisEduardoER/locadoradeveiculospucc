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
import net.danielpaz.pucc.poo.trabalho.control.Agendamento;
import net.danielpaz.pucc.poo.trabalho.model.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;


public class ExibirAgendamento extends javax.swing.JPanel {

    
    public ExibirAgendamento() {
        initComponents();
    }
                        
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jbExibiAgendamento = new javax.swing.JLabel();
        lbCodigoAgendamento = new javax.swing.JLabel();
        tdCodigoAgendamento = new javax.swing.JTextField();
        bBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableModelo = new javax.swing.JTable();
        bBuscarTodos = new javax.swing.JButton();
        bDeletar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jbExibiAgendamento.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jbExibiAgendamento.setText("Exibir Agendamento");

        lbCodigoAgendamento.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbCodigoAgendamento.setText("C\u00F3digo Agendamento");

        tdCodigoAgendamento.addActionListener(new java.awt.event.ActionListener() {
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
        		{null, null, null, null, null, null, null},
        	},
        	new String[] {
        		"C\u00F3digo Agendamento", "C\u00F3digo Veiculo", "C\u00F3digo Usu\u00E1rio", "Data Inicial", "Data Final", "Valor", "Seguro Adicional"
        	}
        ));
        tableModelo.getColumnModel().getColumn(0).setPreferredWidth(117);
        tableModelo.getColumnModel().getColumn(1).setPreferredWidth(95);
        tableModelo.getColumnModel().getColumn(2).setPreferredWidth(90);
        tableModelo.getColumnModel().getColumn(6).setPreferredWidth(95);
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
        				.addComponent(jbExibiAgendamento)
        				.addComponent(lbCodigoAgendamento)
        				.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        					.addComponent(tdCodigoAgendamento, GroupLayout.PREFERRED_SIZE, 198, GroupLayout.PREFERRED_SIZE)
        					.addGroup(Alignment.LEADING, jPanel2Layout.createSequentialGroup()
        						.addComponent(bBuscar)
        						.addGap(38)
        						.addComponent(bBuscarTodos)
        						.addGap(42)
        						.addComponent(bDeletar))))
        			.addContainerGap(166, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addGap(24)
        			.addComponent(jbExibiAgendamento)
        			.addGap(42)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lbCodigoAgendamento)
        				.addComponent(tdCodigoAgendamento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
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
        		.addGroup(Alignment.LEADING, layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(39)
        			.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(52, Short.MAX_VALUE))
        );
        this.setLayout(layout);
    }                      

    private void bBuscarActionPerformed(java.awt.event.ActionEvent evt) {                                        
        
      if(tdCodigoAgendamento.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Por favor informe o código !", TOOL_TIP_TEXT_KEY, WIDTH, null);
                return;
            }
      
        try {
             
        	 BD bd = new BD ("oracle.jdbc.driver.OracleDriver","jdbc:oracle:thin:@localhost:1521:xe","system", "poo2014");
                
                Agendamento agendamento = new Agendamento (Integer.parseInt(tdCodigoAgendamento.getText()));
                
                int auxAgendameto = agendamento.getCodigo();
                AgendamentoDAO agendamentoDAO = new AgendamentoDAO(bd);
                Agendamento a = agendamentoDAO.getAgendamento(auxAgendameto);
                tableModelo.getModel().setValueAt(a.getCodigo(), 0, 0);
                tableModelo.getModel().setValueAt(a.getVeiculo(), 0, 1);
                tableModelo.getModel().setValueAt(a.getUsuario(), 0, 2);
                tableModelo.getModel().setValueAt(a.getData(), 0, 3);
                tableModelo.getModel().setValueAt(a.getDataFinal(), 0, 4);
                tableModelo.getModel().setValueAt(a.getValorAluguel(), 0, 5);
                tableModelo.getModel().setValueAt(a.getCaucao(), 0, 6);
                
                repaint();
             
        } catch (Exception ex) {
            
            Logger.getLogger(ExibirAgendamento.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }                                       

    private void tdCodigoActionPerformed(java.awt.event.ActionEvent evt) {                                         
       
    }                                        

    private void bBuscarTodosActionPerformed(java.awt.event.ActionEvent evt) {                                             
        
        try {
        	 BD bd = new BD ("oracle.jdbc.driver.OracleDriver","jdbc:oracle:thin:@localhost:1521:xe","system", "poo2014");
                
                AgendamentoDAO agendamentoDAO = new AgendamentoDAO (bd);
                ResultSet resultado = agendamentoDAO.getAgendamento();
                TableModel tblModel = buildTableModel(resultado);
                tableModelo.setModel(tblModel);
           
                
        } catch (Exception e) {
            Logger.getLogger(ExibirAgendamento.class.getName()).log(Level.SEVERE, null, e);
        }
    }                                            

    private void bDeletarActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if(tableModelo.getSelectedRowCount() > 0){
            try {

            	 BD bd = new BD ("oracle.jdbc.driver.OracleDriver","jdbc:oracle:thin:@localhost:1521:xe","system", "poo2014");
                
                AgendamentoDAO agendamentoDAO = new AgendamentoDAO (bd);
                
                
                for (int i : tableModelo.getSelectedRows()) 
                {
                    Object agendamentoDeletar = tableModelo.getValueAt(i, 0);
                                     
                    int resposta;
                    resposta = JOptionPane.showConfirmDialog(null, "Deseja deletar o Agendamento " +agendamentoDeletar + "?");
                    if (resposta == JOptionPane.YES_OPTION) 
                    {
                    	agendamentoDAO.excluir(agendamentoDeletar);  
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
                Logger.getLogger(ExibirAgendamento.class.getName()).log(Level.SEVERE, null, e);
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
    private javax.swing.JLabel jbExibiAgendamento;
    private javax.swing.JLabel lbCodigoAgendamento;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableModelo;
    private javax.swing.JTextField tdCodigoAgendamento;
                       
}
