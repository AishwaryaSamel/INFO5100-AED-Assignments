/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Customer;

import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.Helper;
import Business.Seat.Seat;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aishwarya
 */
public class ManageCustomerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageCustomerJPanel
     */
    JPanel rightPanel;
    CustomerDirectory cusDir;
    Helper helper;

    public ManageCustomerJPanel(JPanel rightPanel,CustomerDirectory cusDir, Helper helper) {
        this.cusDir = cusDir;
        this.rightPanel = rightPanel;
        this.helper = helper;
        initComponents();
        populate();
    }
    
    public void populate(){
        
        int rowCount = customerTable.getRowCount();
        DefaultTableModel model = (DefaultTableModel)customerTable.getModel();
        for(int i=rowCount-1;i>=0;i--) {
        model.removeRow(i);
        }
        
        DefaultTableModel dtm = (DefaultTableModel)customerTable.getModel();
        dtm.setRowCount(0);
        
        for(Customer a : cusDir.getCustomerDirectory()){
            Object[] row = new Object[dtm.getColumnCount()];
            row[0]=a;
            row[1]=a.getCustomerName();
            row[2]=a.getCustomerAddress();
            row[3]=a.getIdType();
            row[4]=a.getMobileNumber();
            row[5]=a.getAirliner();
            row[6]=a.getFlightID();
            row[7]=a.getSeat();
            dtm.addRow(row);
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

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        customerTable = new javax.swing.JTable();
        addCustomerBtn = new javax.swing.JButton();
        viewCustomerBtn = new javax.swing.JButton();
        removeBtn = new javax.swing.JButton();

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Manage Customers");

        customerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer ID", "Name", "Address", "ID Type", "Mobile", "Airliner", "Flight", "Seat"
            }
        ));
        jScrollPane1.setViewportView(customerTable);
        if (customerTable.getColumnModel().getColumnCount() > 0) {
            customerTable.getColumnModel().getColumn(6).setResizable(false);
            customerTable.getColumnModel().getColumn(7).setResizable(false);
        }

        addCustomerBtn.setText("Add Customer");
        addCustomerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCustomerBtnActionPerformed(evt);
            }
        });

        viewCustomerBtn.setText("View Customer");
        viewCustomerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewCustomerBtnActionPerformed(evt);
            }
        });

        removeBtn.setBackground(new java.awt.Color(255, 255, 255));
        removeBtn.setText("Delete");
        removeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1180, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(removeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(addCustomerBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viewCustomerBtn, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addCustomerBtn)
                    .addComponent(removeBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(viewCustomerBtn)
                .addContainerGap(266, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addCustomerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCustomerBtnActionPerformed
        // TODO add your handling code here:
        
        CreateCustomerJPanel ccPanel = new CreateCustomerJPanel(rightPanel, cusDir);
        rightPanel.add("CreateCustomerJPanel",ccPanel);
        CardLayout cardlayout = (CardLayout)rightPanel.getLayout();
        cardlayout.next(rightPanel);
    }//GEN-LAST:event_addCustomerBtnActionPerformed

    private void viewCustomerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewCustomerBtnActionPerformed
        // TODO add your handling code here:
        
        int SelectedRow = customerTable.getSelectedRow();
        if(SelectedRow >= 0)
        {
            Customer customer = (Customer) customerTable.getValueAt(SelectedRow, 0);
            ViewCustomerJPanel vcPanel = new ViewCustomerJPanel(rightPanel, customer, cusDir);
            CardLayout cardLayout = (CardLayout)rightPanel.getLayout();
            rightPanel.add("ViewCustomerJPanel",vcPanel);
            cardLayout.next(rightPanel);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Please select a Airline","Alert",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_viewCustomerBtnActionPerformed

    private void removeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBtnActionPerformed
        // TODO add your handling code here:
        int row = customerTable.getSelectedRow();
        if(row<0) {
          JOptionPane.showMessageDialog(null, "Please select a row from the table.", "Warning", JOptionPane.WARNING_MESSAGE);
          return;
        }
        Customer c = (Customer)customerTable.getValueAt(row, 0);
        helper.getCustomerDirectory().removeCustomer(c);
        populate();
    }//GEN-LAST:event_removeBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCustomerBtn;
    private javax.swing.JTable customerTable;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton removeBtn;
    private javax.swing.JButton viewCustomerBtn;
    // End of variables declaration//GEN-END:variables
}
