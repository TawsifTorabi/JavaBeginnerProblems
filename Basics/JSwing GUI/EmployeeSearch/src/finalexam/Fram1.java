package finalexam;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;





public class Fram1 extends javax.swing.JFrame {
    
    public Fram1() {
        
        initComponents();
        
        employeeIDSearchField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode()==KeyEvent.VK_ENTER){
                    employeeIDSearchBtn.doClick();
                }
            }
        });
        
        
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
        jLabel2 = new javax.swing.JLabel();
        employeeIDSearchField = new javax.swing.JTextField();
        employeeIDSearchBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        FirstNameInput = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        LastNameInput = new javax.swing.JTextField();
        SalaryInput = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        BonusInput = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        notific = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Employee Info Searching");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Employees ID");

        employeeIDSearchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeIDSearchFieldActionPerformed(evt);
            }
        });

        employeeIDSearchBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        employeeIDSearchBtn.setText("Search");
        employeeIDSearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeIDSearchBtnActionPerformed(evt);
            }
        });

        jLabel3.setText("First Name");

        FirstNameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstNameInputActionPerformed(evt);
            }
        });

        jLabel4.setText("Last Name");

        LastNameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastNameInputActionPerformed(evt);
            }
        });

        SalaryInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalaryInputActionPerformed(evt);
            }
        });

        jLabel5.setText("Salary");

        BonusInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BonusInputActionPerformed(evt);
            }
        });

        jLabel6.setText("Bonus");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(BonusInput, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(employeeIDSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(employeeIDSearchBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(SalaryInput, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FirstNameInput, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(LastNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(notific)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel1)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(employeeIDSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(employeeIDSearchBtn))
                        .addGap(1, 1, 1)
                        .addComponent(notific)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FirstNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LastNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SalaryInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BonusInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void employeeIDSearchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeIDSearchFieldActionPerformed
        
    }//GEN-LAST:event_employeeIDSearchFieldActionPerformed

    private void employeeIDSearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeIDSearchBtnActionPerformed
        BufferedReader BR = null;
        try {
            BR = new BufferedReader(new FileReader("C:\\Users\\WALTON\\Desktop\\Final\\FinalExam\\src\\finalexam\\data.txt"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Fram1.class.getName()).log(Level.SEVERE, null, ex);
        }
        int EmployeeIDin = Integer.parseInt(employeeIDSearchField.getText());
        String line;
        String[] lineParts;
        int LineCounter = 0;
        try{
            while ((line = BR.readLine())!=null){
                lineParts = line.split(",");
                int EmployeeID = Integer.parseInt(lineParts[0]);
                if(EmployeeIDin == EmployeeID){
                    FirstNameInput.setText(lineParts[1]);
                    LastNameInput.setText(lineParts[2]);
                    SalaryInput.setText(lineParts[3]);
                    double BonusVal = (Integer.parseInt(lineParts[3])*25)/100;
                    BonusInput.setText(BonusVal + "");
                    notific.setText("");
                    employeeIDSearchField.setText("");
                    LineCounter++;
                }
            }
            if(LineCounter <= 0){
                notific.setText("Not Found!");
                employeeIDSearchField.setText("");
                FirstNameInput.setText("");
                LastNameInput.setText("");
                SalaryInput.setText("");
                BonusInput.setText("");
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_employeeIDSearchBtnActionPerformed

    private void FirstNameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstNameInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FirstNameInputActionPerformed

    private void LastNameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastNameInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LastNameInputActionPerformed

    private void SalaryInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalaryInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SalaryInputActionPerformed

    private void BonusInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BonusInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BonusInputActionPerformed


    
    
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
            java.util.logging.Logger.getLogger(Fram1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fram1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fram1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fram1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fram1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BonusInput;
    private javax.swing.JTextField FirstNameInput;
    private javax.swing.JTextField LastNameInput;
    private javax.swing.JTextField SalaryInput;
    private javax.swing.JButton employeeIDSearchBtn;
    private javax.swing.JTextField employeeIDSearchField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel notific;
    // End of variables declaration//GEN-END:variables
}
