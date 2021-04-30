/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Customer;

import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.Helper;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Aishwarya
 */
public class CreateCustomerJPanel extends javax.swing.JPanel {

    /**reateCustomerJPanel
     */
    JPanel rightpanel;
    CustomerDirectory cusDir;

    
    public CreateCustomerJPanel(JPanel rightpanel, CustomerDirectory cusDir) {
        this.rightpanel = rightpanel;
        this.cusDir = cusDir;
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
        jLabel6 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        customerIDTextField = new javax.swing.JTextField();
        resetBtn = new javax.swing.JButton();
        createBtn = new javax.swing.JButton();
        customerNameTextField = new javax.swing.JTextField();
        customerAddressTextField = new javax.swing.JTextField();
        idTypeTextField = new javax.swing.JTextField();
        mobileNumberTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Create New Customer");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Customer ID:");

        backBtn.setText("< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Customer Name:");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Address:");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("ID Type:");

        customerIDTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerIDTextFieldActionPerformed(evt);
            }
        });

        resetBtn.setText("Reset");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });

        createBtn.setText("Create");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Mobile Number:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(363, 363, 363)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(customerIDTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                                    .addComponent(idTypeTextField)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(customerAddressTextField))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(customerNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(resetBtn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(createBtn))
                                    .addComponent(mobileNumberTextField)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backBtn)))
                .addGap(427, 461, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(backBtn)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(customerIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(customerNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(customerAddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(idTypeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(mobileNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createBtn)
                    .addComponent(resetBtn))
                .addContainerGap(235, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        rightpanel.remove(this);
        CardLayout cardLayout = (CardLayout)rightpanel.getLayout();
        cardLayout.previous(rightpanel);

        Component[] components = rightpanel.getComponents();
        for(Component c: components)
        {
            if(c instanceof ManageCustomerJPanel){
                ManageCustomerJPanel m = (ManageCustomerJPanel)c;
                m.populate();
            }
        }
    }//GEN-LAST:event_backBtnActionPerformed

    private void customerIDTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerIDTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerIDTextFieldActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        // TODO add your handling code here:
        customerIDTextField.setText("");
        customerAddressTextField.setText("");
        idTypeTextField.setText("");
        customerNameTextField.setText("");
        mobileNumberTextField.setText("");
    }//GEN-LAST:event_resetBtnActionPerformed

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        // TODO add your handling code here:
        if(customerIDTextField.getText().isEmpty() || customerAddressTextField.getText().isEmpty() || idTypeTextField.getText().isEmpty() || customerNameTextField.getText().isEmpty() || mobileNumberTextField.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Field(s) cannot be empty.","ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(mobileNumberTextField.getText().length() == 10){
        try{
            Long.parseLong(mobileNumberTextField.getText());
            
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this,"Invalid Mobile Number","ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Customer customer = cusDir.addCustomer();
        customer.setMobileNumber(Long.parseLong(mobileNumberTextField.getText()));
        customer.setCustomerName(customerNameTextField.getText());
        customer.setCustomerAddress(customerAddressTextField.getText());
        customer.setCustomerID(customerIDTextField.getText());
        customer.setIdType(idTypeTextField.getText());
        
        customerNameTextField.setText("");
        customerAddressTextField.setText("");
        customerIDTextField.setText("");
        mobileNumberTextField.setText("");
        idTypeTextField.setText("");
        
        JOptionPane.showMessageDialog(this,"Customer added sucessfully!!","SUCCESS",JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(this,"Invalid Mobile Number, Please enter a 10 digit mobile number","ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_createBtnActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton createBtn;
    private javax.swing.JTextField customerAddressTextField;
    private javax.swing.JTextField customerIDTextField;
    private javax.swing.JTextField customerNameTextField;
    private javax.swing.JTextField idTypeTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField mobileNumberTextField;
    private javax.swing.JButton resetBtn;
    // End of variables declaration//GEN-END:variables
}