/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projectFiles;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ahmet Nuri
 */
public class ShowList extends javax.swing.JFrame {

    /**
     * Creates new form ShowList
     */
    public ShowList() {
        initComponents();
        listFor(Clothing.DEPARTMENT_ID, (DefaultTableModel) tbl_clothing.getModel());
        listFor(CoffeeShop.DEPARTMENT_ID, (DefaultTableModel) tbl_coffee.getModel());
        listFor(Electronic.DEPARTMENT_ID, (DefaultTableModel) tbl_electronic.getModel());
        listUsers();
    }
    
    public void listUsers() {
        try {
            DB db = new DB();
            DefaultListModel<String> list = new DefaultListModel<>();
            List<String> users = db.userList();
            
            db.close();
            list.addAll(users);
            lst_users.setModel(list);
            
        } catch (SQLException ex) {
            Logger.getLogger(ShowList.class.getName()).log(Level.SEVERE, null, ex);
        }      
    }

    public void listFor(int dept, DefaultTableModel model){
        try {
            DB db = new DB();

            List<ItemClass> items = db.getItems(dept);
            
            for (ItemClass item : items) {
                Object[] objs = {item.id, item.name, item.amount, item.price};
                model.addRow(objs);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ShowList.class.getName()).log(Level.SEVERE, null, ex);
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_clothing = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_coffee = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_electronic = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        lst_users = new javax.swing.JList<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbl_clothing.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Ürün Adı", "Adet", "Fiyat(adet)"
            }
        ));
        jScrollPane1.setViewportView(tbl_clothing);

        jTabbedPane1.addTab("Giyim", jScrollPane1);

        tbl_coffee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Ürün Adı", "Adet", "Fiyat(adet)"
            }
        ));
        jScrollPane2.setViewportView(tbl_coffee);

        jTabbedPane1.addTab("Kahve ", jScrollPane2);

        tbl_electronic.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Ürün Adı", "Adet", "Fiyat(adet)"
            }
        ));
        jScrollPane3.setViewportView(tbl_electronic);

        jTabbedPane1.addTab("Elektronik", jScrollPane3);

        jScrollPane4.setViewportView(lst_users);

        jTabbedPane1.addTab("Üyeler", jScrollPane4);

        jMenu1.setText("Ekstralar");

        jMenuItem1.setText("Geri");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        FirstPage fp = new FirstPage();
        fp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(ShowList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShowList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShowList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShowList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JList<String> lst_users;
    private javax.swing.JTable tbl_clothing;
    private javax.swing.JTable tbl_coffee;
    private javax.swing.JTable tbl_electronic;
    // End of variables declaration//GEN-END:variables
}
