/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package App;
import Backend.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author lenovo
 */
public class CustomerDashboard extends javax.swing.JFrame {
    public static Customer currentCustomer; 
    /**
     * Creates new form CustomerDashboard
     */
    String userName;
    DefaultTableModel model;
    ArrayList<Object[]> books;
    //int fine = 0;
    public CustomerDashboard(String name) {;
        initComponents();
        userName = name;
        if(!name.isEmpty())
            currentCustomer = new PasswordChecker().retrieveCustomer(userName).get(0);
        
        currentCustomer.displayDebug();
        lblWelcome.setText("Welcome " + currentCustomer.getUserName().toUpperCase());
        model = (DefaultTableModel) tblBorrowedBooks.getModel();
        fillTable();
        //calculateGeneration();
        txtFine.setText(currentCustomer.fine+"");
    }
    
    /*private void calculateGeneration(){
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dateToday = LocalDate.now();
        for(Object[] book : books){
            String dueDateString = (String) book[5];
            if(dueDateString != null){
                LocalDate dueDate = LocalDate.parse(dueDateString, dtf);
                long daysBetween = Period.between(dueDate, dateToday).getDays();
                if(daysBetween > 0)
                    fine += daysBetween * 5;
            }
        }
    }
    */
  
    private void fillTable(){
        books = new BookBackend().retrieveBorrowedBooks(currentCustomer.customerId);
        for(Object[] book: books){
            model.insertRow(tblBorrowedBooks.getRowCount(), new Object[]{
                book[1], book[2], book[3], book[5]
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

        jPanel1 = new javax.swing.JPanel();
        lblWelcome = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        btnEditProfile = new javax.swing.JButton();
        btnChangePass = new javax.swing.JButton();
        lblBorrowedBooks = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBorrowedBooks = new javax.swing.JTable();
        btnBorrow = new javax.swing.JButton();
        btnPayFine = new javax.swing.JButton();
        lblFine = new javax.swing.JLabel();
        txtFine = new javax.swing.JTextField();
        btnReturn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dashboard");
        setBackground(new java.awt.Color(255, 51, 51));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        lblWelcome.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        btnLogout.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        btnEditProfile.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        btnEditProfile.setText("Edit Profile");
        btnEditProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditProfileActionPerformed(evt);
            }
        });

        btnChangePass.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        btnChangePass.setText("Change Password");
        btnChangePass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 291, Short.MAX_VALUE)
                .addComponent(btnChangePass)
                .addGap(35, 35, 35)
                .addComponent(btnEditProfile)
                .addGap(33, 33, 33)
                .addComponent(btnLogout)
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblWelcome)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogout)
                    .addComponent(btnEditProfile)
                    .addComponent(btnChangePass))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 25, -1, -1));

        lblBorrowedBooks.setFont(new java.awt.Font("Verdana", 1, 48)); // NOI18N
        lblBorrowedBooks.setText("Borrowed Books");
        getContentPane().add(lblBorrowedBooks, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 94, 455, -1));

        tblBorrowedBooks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title", "Author", "Genre", "Due Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblBorrowedBooks);
        if (tblBorrowedBooks.getColumnModel().getColumnCount() > 0) {
            tblBorrowedBooks.getColumnModel().getColumn(0).setResizable(false);
            tblBorrowedBooks.getColumnModel().getColumn(1).setResizable(false);
            tblBorrowedBooks.getColumnModel().getColumn(2).setResizable(false);
            tblBorrowedBooks.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(469, 197, -1, 249));

        btnBorrow.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        btnBorrow.setText("Borrow Book");
        btnBorrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrowActionPerformed(evt);
            }
        });
        getContentPane().add(btnBorrow, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 609, -1, -1));

        btnPayFine.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        btnPayFine.setText("Pay Fine");
        btnPayFine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayFineActionPerformed(evt);
            }
        });
        getContentPane().add(btnPayFine, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 618, -1, -1));

        lblFine.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        lblFine.setText("Fine Incurred: ");
        getContentPane().add(lblFine, new org.netbeans.lib.awtextra.AbsoluteConstraints(469, 520, -1, -1));

        txtFine.setEditable(false);
        txtFine.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        txtFine.setText("Rs. 0");
        getContentPane().add(txtFine, new org.netbeans.lib.awtextra.AbsoluteConstraints(766, 514, 105, -1));

        btnReturn.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        btnReturn.setText("Return Book");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });
        getContentPane().add(btnReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(489, 609, -1, -1));

        jLabel1.setBackground(new java.awt.Color(0, 0, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\tgbrk\\OneDrive\\Pictures\\res 1.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 710));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        currentCustomer = null;
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnEditProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditProfileActionPerformed
        new UpdateAccount("customer", currentCustomer.customerId).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnEditProfileActionPerformed

    private void btnChangePassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePassActionPerformed
        new ChangePassword(currentCustomer.customerId, "customer").setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnChangePassActionPerformed

    private void btnPayFineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayFineActionPerformed
        if(currentCustomer.fine == 0){
            JOptionPane.showMessageDialog(CustomerDashboard.this, "No fine to pay");
            return;
        }
        new Fine(currentCustomer.customerId, currentCustomer.fine).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPayFineActionPerformed

    private void btnBorrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrowActionPerformed
        if(currentCustomer.fine > 0){
            JOptionPane.showMessageDialog(CustomerDashboard.this, "You can't borrow books until you pay your fine");
            return;
        }
        new CustomerBorrow().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBorrowActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        tblBorrowedBooks.clearSelection();
    }//GEN-LAST:event_formMouseClicked

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        if(books.size() == 0){
            JOptionPane.showMessageDialog(CustomerDashboard.this, "No book to return");
            return;
        }
        new CustomerReturn().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnReturnActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerDashboard("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrow;
    private javax.swing.JButton btnChangePass;
    private javax.swing.JButton btnEditProfile;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnPayFine;
    private javax.swing.JButton btnReturn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBorrowedBooks;
    private javax.swing.JLabel lblFine;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JTable tblBorrowedBooks;
    private javax.swing.JTextField txtFine;
    // End of variables declaration//GEN-END:variables
}
