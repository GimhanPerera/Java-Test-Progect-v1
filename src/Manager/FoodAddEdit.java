/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Manager;
import DBconnection.Food;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Gimhan
 */
public class FoodAddEdit extends javax.swing.JFrame {

    /**
     * Creates new form FoodAddEdit
     */
    public FoodAddEdit() {
        initComponents();
        newid();
    }

    public FoodAddEdit(String id) {
        try {
            initComponents();
            btn_add.setText("Save");
        lbl_title.setText("Edit item");
            Food obj1=new Food(id);
            txt_foodID.setText(obj1.getfoodID());
            txt_foodname.setText(obj1.getfoodName());
            txt_maxQty.setText(obj1.getDailyQty());
            txt_price.setText(obj1.getPrice());
            txt_qtyType.setText(obj1.getQtyType());
        } catch (Exception ex) {
            Logger.getLogger(FoodAddEdit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        txt_foodID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_foodname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_price = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_maxQty = new javax.swing.JTextField();
        lbl_title = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_qtyType = new javax.swing.JTextField();
        jComboBox_ftype = new javax.swing.JComboBox<>();
        btn_cancel = new javax.swing.JButton();
        btn_add = new javax.swing.JButton();
        lbl_background1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Food ID");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

        txt_foodID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_foodID.setEnabled(false);
        getContentPane().add(txt_foodID, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 170, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Food name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, -1));

        txt_foodname.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(txt_foodname, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 190, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Price (Rs.)");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, -1, -1));

        txt_price.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(txt_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, 170, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Daily maximum Quentify");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, -1, -1));

        txt_maxQty.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(txt_maxQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 420, 170, -1));

        lbl_title.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbl_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_title.setText("New Item");
        getContentPane().add(lbl_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 440, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Food Category");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Quentity Type");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, -1, -1));

        txt_qtyType.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(txt_qtyType, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 170, -1));

        jComboBox_ftype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "COFFEE", "CAKE", "BUN" }));
        jComboBox_ftype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_ftypeActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox_ftype, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 170, -1));

        btn_cancel.setText("Cancel");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 490, 130, 50));

        btn_add.setText("Add");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });
        getContentPane().add(btn_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 490, 130, 50));
        getContentPane().add(lbl_background1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 563, 589));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        if(false){//validation need to add
            
        }
        else if(btn_add.getText().equals("Save")){//edit existing food item
            try {
                Food obj=new Food();
                obj.updateFood(txt_foodID.getText(),txt_foodname.getText(),txt_price.getText(),txt_maxQty.getText(),txt_qtyType.getText());
            } catch (Exception ex) {
                Logger.getLogger(FoodAddEdit.class.getName()).log(Level.SEVERE, null, ex);
            }  
        }
        else{//add new food item
            try {
                Food obj=new Food();
                obj.addNewFood(txt_foodID.getText(),txt_foodname.getText(),String.valueOf(jComboBox_ftype.getSelectedItem()),txt_price.getText(),txt_maxQty.getText(),txt_qtyType.getText());
            } catch (Exception ex) {
                Logger.getLogger(FoodAddEdit.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
    }//GEN-LAST:event_btn_addActionPerformed

    private void jComboBox_ftypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_ftypeActionPerformed
        if(btn_add.getText().equals("Add")){//edit existing food item
            newid();
        }
        
    }//GEN-LAST:event_jComboBox_ftypeActionPerformed
    public void newid(){
        try {
            Food obj =new Food();
                switch (jComboBox_ftype.getSelectedIndex()) {
                    case 0:
                        txt_foodID.setText(obj.newFID("CF"));
                        break;
                    case 1:
                        txt_foodID.setText(obj.newFID("CK"));
                        break;
                    case 2:
                        txt_foodID.setText(obj.newFID("BN"));
                        break;
                    default:
                        break;
                }
        } catch (Exception ex) {
            Logger.getLogger(FoodAddEdit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
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
            java.util.logging.Logger.getLogger(FoodAddEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FoodAddEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FoodAddEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FoodAddEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FoodAddEdit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_cancel;
    private javax.swing.JComboBox<String> jComboBox_ftype;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lbl_background1;
    private javax.swing.JLabel lbl_title;
    private javax.swing.JTextField txt_foodID;
    private javax.swing.JTextField txt_foodname;
    private javax.swing.JTextField txt_maxQty;
    private javax.swing.JTextField txt_price;
    private javax.swing.JTextField txt_qtyType;
    // End of variables declaration//GEN-END:variables
}
