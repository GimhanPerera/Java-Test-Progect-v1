/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package javaapplication10;

/**
 *
 * @author Gimhan
 */
public class SDDetailsPanel extends javax.swing.JPanel {

    /**
     * Creates new form sdDetailsPanel
     */
    public SDDetailsPanel() {
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

        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        lbl_background = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Customer/Stuff Details");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jRadioButton1.setText("Stuff Details");
        add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));

        jRadioButton2.setText("Customer Details");
        add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        jButton1.setText("View All");
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 240, -1, -1));

        jButton2.setText("Delete");
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 550, 100, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 810, 320));

        jButton3.setText("Add");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 510, 100, -1));
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 220, -1));

        jButton4.setText("Search");
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, 100, -1));
        add(lbl_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 0, 990, 620));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        AddStuffMember obj=new AddStuffMember();
        obj.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbl_background;
    // End of variables declaration//GEN-END:variables
}