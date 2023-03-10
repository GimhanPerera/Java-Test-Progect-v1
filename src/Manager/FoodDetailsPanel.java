/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Manager;
import DBconnection.Connect;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Gimhan
 */
public class FoodDetailsPanel extends javax.swing.JPanel {

    /**
     * Creates new form FoodDetailsPanel
     */
    public FoodDetailsPanel() {
        initComponents();
    }
    
    public void getFood() throws Exception{
        Connect obj = new Connect();
        Connection c = obj.getConnection();  //getConnection();//Establish the connection
        
        try{ //int q=1;System.out.println(q++); <- tester
            
                Statement stmt = c.createStatement();//Prepare statement
                ResultSet rs = stmt.executeQuery("select * from FOOD"); //SQL stetment
                while(rs.next()){
                    String foodID=rs.getString("FOOD_ID");
                    String foodName=rs.getString("FOOD_NAME");
                    String category=rs.getString("CATEGORY");
                    String qty=rs.getString("QUANTITY_TYPE");
                    String price=rs.getString("UNIT_PRICE");
                    String dailyqty=rs.getString("DAILY_QUANTITY");
                    String tbData[]={foodID,foodName,category,qty,price,dailyqty};
                    DefaultTableModel tblModel =(DefaultTableModel)jTable_food.getModel(); 
                    tblModel.addRow(tbData);
                }
        }
        catch(SQLException ex)//Is database has a problem, this catch stetment catch it
        {
            System.out.println(ex);
        }
        finally{
            c.close(); 
        }   
    }
    
    public void getFoodFromCatogorywise(int i) throws Exception{
        Connect obj = new Connect();
        Connection c = obj.getConnection();  //getConnection();//Establish the connection
        
        try{ //int q=1;System.out.println(q++); <- tester
            
                Statement stmt = c.createStatement();//Prepare statement
                ResultSet rs;
            switch (i) {
                case 1:
                    rs = stmt.executeQuery("select * from FOOD WHERE CATEGORY='COFFEE'"); //SQL stetment
                    while(rs.next()){
                        String foodID=rs.getString("FOOD_ID");
                    String foodName=rs.getString("FOOD_NAME");
                    String category=rs.getString("CATEGORY");
                    String qty=rs.getString("QUANTITY_TYPE");
                    String price=rs.getString("UNIT_PRICE");
                    String dailyqty=rs.getString("DAILY_QUANTITY");
                    String tbData[]={foodID,foodName,category,qty,price,dailyqty};
                        DefaultTableModel tblModel =(DefaultTableModel)jTable_food.getModel();
                        tblModel.addRow(tbData);
                    }   break;
                case 2:
                    rs = stmt.executeQuery("select * from FOOD WHERE CATEGORY='CAKE'"); //SQL stetment
                    while(rs.next()){
                        String foodID=rs.getString("FOOD_ID");
                    String foodName=rs.getString("FOOD_NAME");
                    String category=rs.getString("CATEGORY");
                    String qty=rs.getString("QUANTITY_TYPE");
                    String price=rs.getString("UNIT_PRICE");
                    String dailyqty=rs.getString("DAILY_QUANTITY");
                    String tbData[]={foodID,foodName,category,qty,price,dailyqty};
                        DefaultTableModel tblModel =(DefaultTableModel)jTable_food.getModel();
                        tblModel.addRow(tbData);
                    }   break;
                case 3:
                    rs = stmt.executeQuery("select * from FOOD WHERE CATEGORY='BUN'"); //SQL stetment
                    while(rs.next()){
                        String foodID=rs.getString("FOOD_ID");
                    String foodName=rs.getString("FOOD_NAME");
                    String category=rs.getString("CATEGORY");
                    String qty=rs.getString("QUANTITY_TYPE");
                    String price=rs.getString("UNIT_PRICE");
                    String dailyqty=rs.getString("DAILY_QUANTITY");
                    String tbData[]={foodID,foodName,category,qty,price,dailyqty};
                        DefaultTableModel tblModel =(DefaultTableModel)jTable_food.getModel();
                        tblModel.addRow(tbData);
                    }   break;
                default:
                    break;
            }
        }
        catch(SQLException ex)//Is database has a problem, this catch stetment catch it
        {
            System.out.println(ex);
        }
        finally{
            c.close(); 
        }
        
    }
    
    public void getFoodFromSearch(int i,String txt) throws Exception{
        Connect obj = new Connect();
        Connection c = obj.getConnection();  //getConnection();//Establish the connection
        
        try{ //int q=1;System.out.println(q++); <- tester
            
                Statement stmt = c.createStatement();//Prepare statement
                ResultSet rs;
            switch (i) {
                case 0:
                    rs = stmt.executeQuery("select * from FOOD WHERE FOOD_ID='"+txt+"'"); //SQL stetment
                    while(rs.next()){
                        String foodID=rs.getString("FOOD_ID");
                    String foodName=rs.getString("FOOD_NAME");
                    String category=rs.getString("CATEGORY");
                    String qty=rs.getString("QUANTITY_TYPE");
                    String price=rs.getString("UNIT_PRICE");
                    String dailyqty=rs.getString("DAILY_QUANTITY");
                    String tbData[]={foodID,foodName,category,qty,price,dailyqty};
                        DefaultTableModel tblModel =(DefaultTableModel)jTable_food.getModel();
                        tblModel.addRow(tbData);
                    }   break;
                case 1:
                    rs = stmt.executeQuery("select * from FOOD WHERE FOOD_NAME='"+txt+"'"); //SQL stetment
                    while(rs.next()){
                        String foodID=rs.getString("FOOD_ID");
                    String foodName=rs.getString("FOOD_NAME");
                    String category=rs.getString("CATEGORY");
                    String qty=rs.getString("QUANTITY_TYPE");
                    String price=rs.getString("UNIT_PRICE");
                    String dailyqty=rs.getString("DAILY_QUANTITY");
                    String tbData[]={foodID,foodName,category,qty,price,dailyqty};
                        DefaultTableModel tblModel =(DefaultTableModel)jTable_food.getModel();
                        tblModel.addRow(tbData);
                    }   break;
                default:
                    break;
            }
        }
        catch(SQLException ex)//Is database has a problem, this catch stetment catch it
        {
            System.out.println(ex);
        }
        finally{
            c.close(); 
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_search = new javax.swing.JTextField();
        btn_viewall = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_food = new javax.swing.JTable();
        btn_edit = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        lbl_foodtype = new javax.swing.JLabel();
        jComboBox_foodtype = new javax.swing.JComboBox<>();
        jComboBox_searchby = new javax.swing.JComboBox<>();
        lbl_searchby = new javax.swing.JLabel();
        btn_search = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        btn_add = new javax.swing.JButton();
        btn_searchByType = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(173, 85, 2));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 740, 1170, 30));

        jPanel1.setBackground(new java.awt.Color(173, 85, 2));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Food Details");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, -1, -1));

        txt_search.setEnabled(false);
        add(txt_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 210, 220, -1));

        btn_viewall.setText("View All");
        btn_viewall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_viewallActionPerformed(evt);
            }
        });
        add(btn_viewall, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 340, 110, 40));

        jTable_food.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTable_food.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Food ID", "Name", "catogery", "Unit Type", "Price", "Daily Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_food.setRowHeight(30);
        jScrollPane1.setViewportView(jTable_food);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 970, 420));

        btn_edit.setText("Edit");
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });
        add(btn_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 540, 100, 40));

        btn_clear.setText("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });
        add(btn_clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 400, 100, -1));

        btn_delete.setText("Delete");
        add(btn_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 600, 100, -1));

        lbl_foodtype.setText("Food Type");
        add(lbl_foodtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, -1, -1));

        jComboBox_foodtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "COFFEE", "CAKE", "BUN" }));
        jComboBox_foodtype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_foodtypeActionPerformed(evt);
            }
        });
        add(jComboBox_foodtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 240, -1));

        jComboBox_searchby.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Food ID", "Food Name" }));
        jComboBox_searchby.setEnabled(false);
        add(jComboBox_searchby, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, 150, -1));

        lbl_searchby.setText("Search by");
        lbl_searchby.setEnabled(false);
        add(lbl_searchby, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, -1, -1));

        btn_search.setText("Search");
        btn_search.setEnabled(false);
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });
        add(btn_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 210, 100, -1));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Filter Food");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, -1, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Search Food");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, -1, -1));

        btn_add.setText("Add");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });
        add(btn_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 480, 100, 40));

        btn_searchByType.setText("Search");
        btn_searchByType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchByTypeActionPerformed(evt);
            }
        });
        add(btn_searchByType, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 160, 100, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        if(jTable_food.getRowCount()==0){//validations
            JOptionPane.showMessageDialog(new JFrame(), "Please select a item",
               "Imformation", JOptionPane.ERROR_MESSAGE);
        }else{
            int row=jTable_food.getSelectedRow();
            String a=(String) jTable_food.getValueAt(row, 0);
            FoodAddEdit obj = new FoodAddEdit(a);
            obj.setVisible(true);
        }
    }//GEN-LAST:event_btn_editActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        FoodAddEdit obj = new FoodAddEdit();
        obj.show();
    }//GEN-LAST:event_btn_addActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        jComboBox_foodtype.setEnabled(true);
        lbl_foodtype.setEnabled(true);
        lbl_searchby.setEnabled(false);
        jComboBox_searchby.setEnabled(false);
        txt_search.setEnabled(false);
        btn_search.setEnabled(false);
        btn_searchByType.setEnabled(true);
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        jComboBox_foodtype.setEnabled(false);
        lbl_foodtype.setEnabled(false);
        lbl_searchby.setEnabled(true);
        jComboBox_searchby.setEnabled(true);
        txt_search.setEnabled(true);
        btn_search.setEnabled(true);
        btn_searchByType.setEnabled(false);
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void btn_viewallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_viewallActionPerformed
        try {
            clearTable();
            getFood();
        } catch (Exception ex) {
            Logger.getLogger(FoodDetailsPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_viewallActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        clearTable();
        jComboBox_foodtype.setSelectedIndex(0);
    }//GEN-LAST:event_btn_clearActionPerformed

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        try {
            clearTable();
            getFoodFromSearch(jComboBox_searchby.getSelectedIndex(),txt_search.getText());
            jTable_food.setRowSelectionInterval(0, 0);
        } catch (Exception ex) {
            Logger.getLogger(FoodDetailsPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_searchActionPerformed

    private void jComboBox_foodtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_foodtypeActionPerformed
        
    }//GEN-LAST:event_jComboBox_foodtypeActionPerformed

    private void btn_searchByTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchByTypeActionPerformed
        try {
            clearTable();
            getFoodFromCatogorywise(jComboBox_foodtype.getSelectedIndex());
            jTable_food.setRowSelectionInterval(0, 0);
        } catch (Exception ex) {
            Logger.getLogger(FoodDetailsPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_searchByTypeActionPerformed
    public void clearTable(){
        DefaultTableModel tblModel =(DefaultTableModel)jTable_food.getModel(); 
        int rowCount = tblModel.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
            tblModel.removeRow(i);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_search;
    private javax.swing.JButton btn_searchByType;
    private javax.swing.JButton btn_viewall;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> jComboBox_foodtype;
    private javax.swing.JComboBox<String> jComboBox_searchby;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_food;
    private javax.swing.JLabel lbl_foodtype;
    private javax.swing.JLabel lbl_searchby;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables
}
