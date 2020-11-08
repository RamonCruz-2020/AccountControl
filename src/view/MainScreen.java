/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.AccountPayableController;
import dao.AccountPayableDAO;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.AccountPayable;

/**
 *
 * @author Ramon
 */
public class MainScreen extends javax.swing.JFrame {

    AccountPayableController apc = new AccountPayableController();
    /**
     * Creates new form MainScreen
     */
    public MainScreen() {
        initComponents();
        //readTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldDocNumber = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxType = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jFormattedTextFieldExpirationDate = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jFormattedTextFieldValue = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jComboBoxStatus = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jTextFieldProvider = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setName("mainScreen"); // NOI18N
        setResizable(false);

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setToolTipText("");
        jTabbedPane1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jTable1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Fornecedor", "Doc nº", "Tipo", "Data de Vencimento", "Valor", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setToolTipText("");
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Fornecedor");

        jLabel2.setText("Doc nº");

        jTextFieldDocNumber.setToolTipText("");
        jTextFieldDocNumber.setName(""); // NOI18N

        jLabel3.setText("Tipo");

        jComboBoxType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boleto" }));

        jLabel4.setText("Data de Vecimento");

        try {
            jFormattedTextFieldExpirationDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldExpirationDate.setToolTipText("");

        jLabel5.setText("Valor");

        jFormattedTextFieldValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldValueActionPerformed(evt);
            }
        });

        jLabel6.setText("Status");

        jComboBoxStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pago", "A pagar" }));

        jButton1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton1.setText("Salvar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextFieldProvider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldProviderActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/refresh-icon.png"))); // NOI18N
        jButton2.setPreferredSize(new java.awt.Dimension(36, 36));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton3.setText("Atualizar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton4.setText("Excluir");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldProvider, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldDocNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxType, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jFormattedTextFieldExpirationDate, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jFormattedTextFieldValue, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(954, 954, 954)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldDocNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBoxType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jFormattedTextFieldExpirationDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jFormattedTextFieldValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldProvider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jButton3)
                        .addComponent(jButton4)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Contas a Pagar", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1308, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 679, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Contas a Receber", jPanel2);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jFormattedTextFieldValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldValueActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if(jTextFieldProvider.getText().isEmpty() == false && jTextFieldDocNumber.getText().isEmpty() == false && jComboBoxType.getSelectedItem().toString().isEmpty() == false && jFormattedTextFieldExpirationDate.getText().isEmpty() == false && jFormattedTextFieldValue.getText().isEmpty() == false && jComboBoxStatus.getSelectedItem().toString().isEmpty() == false){
            apc.save(jTextFieldProvider.getText(), jTextFieldDocNumber.getText(), jComboBoxType.getSelectedItem().toString(), jFormattedTextFieldExpirationDate.getText(),Float.parseFloat(jFormattedTextFieldValue.getText()), jComboBoxStatus.getSelectedItem().toString());
            jTextFieldProvider.setText("");
            jTextFieldDocNumber.setText("");
            jFormattedTextFieldExpirationDate.setText("");
            jFormattedTextFieldValue.setText("");
            
        }else{
            JOptionPane.showMessageDialog(null, "Campo vazio!");
        }
        readTable();
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextFieldProviderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldProviderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldProviderActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        readTable();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if(jTable1.getSelectedRow() != -1){
            jTextFieldProvider.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
            jTextFieldDocNumber.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
            jComboBoxType.setSelectedItem(selectIten(jComboBoxType, jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString()));
            jFormattedTextFieldExpirationDate.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString());
            jFormattedTextFieldValue.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 5).toString());
            jComboBoxStatus.setSelectedItem(selectIten(jComboBoxStatus, jTable1.getValueAt(jTable1.getSelectedRow(), 6).toString()));
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(jTable1.getSelectedRow() != -1){
            if(jTextFieldProvider.getText().isEmpty() == false && jTextFieldDocNumber.getText().isEmpty() == false && jComboBoxType.getSelectedItem().toString().isEmpty() == false && jFormattedTextFieldExpirationDate.getText().isEmpty() == false && jFormattedTextFieldValue.getText().isEmpty() == false && jComboBoxStatus.getSelectedItem().toString().isEmpty() == false){
            apc.update((int)jTable1.getValueAt(jTable1.getSelectedRow(), 0), jTextFieldProvider.getText(), jTextFieldDocNumber.getText(), jComboBoxType.getSelectedItem().toString(), jFormattedTextFieldExpirationDate.getText(),Float.parseFloat(jFormattedTextFieldValue.getText()), jComboBoxStatus.getSelectedItem().toString());
            jTextFieldProvider.setText("");
            jTextFieldDocNumber.setText("");
            jFormattedTextFieldExpirationDate.setText("");
            jFormattedTextFieldValue.setText("");
            
            }else{
                JOptionPane.showMessageDialog(null, "Campo vazio!");
            }
        readTable();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        if(jTable1.getSelectedRow() != -1){
            if(jTextFieldProvider.getText().isEmpty() == false && jTextFieldDocNumber.getText().isEmpty() == false && jComboBoxType.getSelectedItem().toString().isEmpty() == false && jFormattedTextFieldExpirationDate.getText().isEmpty() == false && jFormattedTextFieldValue.getText().isEmpty() == false && jComboBoxStatus.getSelectedItem().toString().isEmpty() == false){
            apc.delete((int)jTable1.getValueAt(jTable1.getSelectedRow(), 0), jTextFieldProvider.getText(), jTextFieldDocNumber.getText(), jComboBoxType.getSelectedItem().toString(), jFormattedTextFieldExpirationDate.getText(),Float.parseFloat(jFormattedTextFieldValue.getText()), jComboBoxStatus.getSelectedItem().toString());
            jTextFieldProvider.setText("");
            jTextFieldDocNumber.setText("");
            jFormattedTextFieldExpirationDate.setText("");
            jFormattedTextFieldValue.setText("");
            
            }else{
                JOptionPane.showMessageDialog(null, "Campo vazio!");
            }
        readTable();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MainScreen().setVisible(true);
        });
    }
    
    public final void readTable(){
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setNumRows(0);
        AccountPayableDAO apDao = new AccountPayableDAO();
        for(AccountPayable ap: apDao.read()){
            model.addRow(new Object[]{
                ap.getId(),
                ap.getProvider(),
                ap.getDocNumber(),
                ap.getType(),
                ap.getExpirationDate(),
                ap.getValue(),
                ap.getStatus()
            });
        }
    }
    
    public Object selectIten(JComboBox jcb, String ref){
        
        for (int i = 0; i < jcb.getItemCount(); i++)
        {
            if (jcb.getItemAt(i).toString().equals(ref))
            {
                return jcb.getItemAt(i);
            }
        }
        return null;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBoxStatus;
    private javax.swing.JComboBox<String> jComboBoxType;
    private javax.swing.JFormattedTextField jFormattedTextFieldExpirationDate;
    private javax.swing.JFormattedTextField jFormattedTextFieldValue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldDocNumber;
    private javax.swing.JTextField jTextFieldProvider;
    // End of variables declaration//GEN-END:variables
}
