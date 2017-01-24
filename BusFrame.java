/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus_scheduler;

/**
 *
 * @author Steve
 */
public class BusFrame extends javax.swing.JFrame {

    /**
     * Creates new form BustFrame
     */
    public BusFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jTxt_Firstname = new javax.swing.JTextField();
        jTxt_Lastname = new javax.swing.JTextField();
        jChx_Adult = new javax.swing.JCheckBox();
        jChx_Child = new javax.swing.JCheckBox();
        jLbl_Firstname = new javax.swing.JLabel();
        jLbl_Lastname = new javax.swing.JLabel();
        jBtn_Save = new javax.swing.JButton();
        jBtn_Reset = new javax.swing.JButton();
        jBtn_Cancel = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList_Names = new javax.swing.JList();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMnu_File = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMnu_Exit = new javax.swing.JMenuItem();
        jMnu_Edit = new javax.swing.JMenu();

        jDialog1.setName("diag_error"); // NOI18N
        jDialog1.setUndecorated(true);

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTxt_Firstname.setToolTipText("Enter firstname");
        jTxt_Firstname.setName("jTxt_Firstname"); // NOI18N

        jTxt_Lastname.setToolTipText("Enter lastname");

        jChx_Adult.setText("Adult ");

        jChx_Child.setText("Child ");

        jLbl_Firstname.setLabelFor(jTxt_Firstname);
        jLbl_Firstname.setText("Firstname");
        jLbl_Firstname.setToolTipText("");

        jLbl_Lastname.setLabelFor(jTxt_Lastname);
        jLbl_Lastname.setText("Lastname");
        jLbl_Lastname.setToolTipText("");

        jBtn_Save.setText("Save");
        jBtn_Save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtn_SaveMouseClicked(evt);
            }
        });

        jBtn_Reset.setText("Reset");

        jBtn_Cancel.setText("Cancel");

        jList_Names.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList_Names.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jList_Names);

        jMnu_File.setText("File");

        jMenuItem1.setText("jMenuItem1");
        jMnu_File.add(jMenuItem1);

        jMenuItem2.setText("jMenuItem2");
        jMnu_File.add(jMenuItem2);

        jMnu_Exit.setText("Exit");
        jMnu_Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMnu_ExitMouseClicked(evt);
            }
        });
        jMnu_File.add(jMnu_Exit);

        jMenuBar1.add(jMnu_File);

        jMnu_Edit.setText("Edit");
        jMenuBar1.add(jMnu_Edit);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBtn_Save)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLbl_Lastname, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLbl_Firstname, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(jTxt_Lastname, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                            .addComponent(jLabel4)
                            .addComponent(jTxt_Firstname))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jChx_Child)
                            .addComponent(jChx_Adult)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jBtn_Reset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtn_Cancel)))
                .addGap(127, 127, 127))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxt_Firstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLbl_Firstname))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTxt_Lastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLbl_Lastname))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jChx_Adult)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jChx_Child)))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBtn_Save)
                            .addComponent(jBtn_Reset)
                            .addComponent(jBtn_Cancel)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMnu_ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMnu_ExitMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMnu_ExitMouseClicked

    private void jBtn_SaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtn_SaveMouseClicked
        // TODO add your handling code here:
        if(jTxt_Firstname.getText() != "" || jTxt_Lastname.getText() != ""){
        Passenger p = new Passenger(jTxt_Firstname.getText(), jTxt_Lastname.getText());
        jList_Names;
        }
        else{
            jLabel3.setText("Please enter a Firstname");
            
            
            jLabel4.setText("Please enter a last name");
        }
    }//GEN-LAST:event_jBtn_SaveMouseClicked

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
            java.util.logging.Logger.getLogger(BusFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BusFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BusFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BusFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BusFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtn_Cancel;
    private javax.swing.JButton jBtn_Reset;
    private javax.swing.JButton jBtn_Save;
    private javax.swing.JCheckBox jChx_Adult;
    private javax.swing.JCheckBox jChx_Child;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLbl_Firstname;
    private javax.swing.JLabel jLbl_Lastname;
    private javax.swing.JList jList_Names;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenu jMnu_Edit;
    private javax.swing.JMenuItem jMnu_Exit;
    private javax.swing.JMenu jMnu_File;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTxt_Firstname;
    private javax.swing.JTextField jTxt_Lastname;
    // End of variables declaration//GEN-END:variables
}
