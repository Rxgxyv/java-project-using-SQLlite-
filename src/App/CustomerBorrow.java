/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package App;

import static App.CustomerDashboard.currentCustomer;
import Backend.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lenovo
 */
public class CustomerBorrow extends javax.swing.JFrame {

    /**
     * Creates new form CustomerBorrow
     */
    DefaultTableModel model;
    public CustomerBorrow() {
        initComponents();
        model = (DefaultTableModel) tblBooks.getModel();
        fillTable();
    }
    
    private void fillTable(){
        ArrayList<Object[]> books = new BookBackend().retrieveAvailableBooks(currentCustomer.customerId);
        
        for(Object[] book: books){
            model.insertRow(tblBooks.getRowCount(), new Object[]{
                book[0], book[1], book[2], book[3]
            });
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblBooks = new javax.swing.JTable();
        btnBorrowBook = new javax.swing.JButton();
        lblBorrowedBk = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblBooks.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tblBooks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BookID", "Name", "Author", "Genre"
            }
        ));
        tblBooks.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tblBooks.setShowGrid(true);
        jScrollPane1.setViewportView(tblBooks);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 263, 469, 271));

        btnBorrowBook.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        btnBorrowBook.setText("Borrow Book");
        btnBorrowBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrowBookActionPerformed(evt);
            }
        });
        getContentPane().add(btnBorrowBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 641, 199, -1));

        lblBorrowedBk.setFont(new java.awt.Font("Verdana", 1, 48)); // NOI18N
        lblBorrowedBk.setText("Available Books");
        getContentPane().add(lblBorrowedBk, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 87, 453, -1));

        btnBack.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 87, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\tgbrk\\Downloads\\janko-ferlic-sfL_QOnmy00-unsplash.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 760));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBorrowBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrowBookActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model= (DefaultTableModel) tblBooks.getModel();
        //get selected row index
        try{
            int SelectedRowIndex=tblBooks.getSelectedRow();
            int idCol = model.findColumn("BookID");
            int bookId = (int)model.getValueAt(SelectedRowIndex, idCol);
            int status = new Backend.BookBackend().borrowBook(bookId, currentCustomer.customerId);
            model.removeRow(SelectedRowIndex);
            if(status == 1)
                JOptionPane.showMessageDialog(CustomerBorrow.this,"Borrowed Book Successfully");
            
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(CustomerBorrow.this,ex);
        }
        //JOptionPane.showMessageDialog(null,"Borrowed Book Successfully");
    }//GEN-LAST:event_btnBorrowBookActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new CustomerDashboard("").setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CustomerBorrow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerBorrow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerBorrow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerBorrow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerBorrow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBorrowBook;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBorrowedBk;
    private javax.swing.JTable tblBooks;
    // End of variables declaration//GEN-END:variables
}
