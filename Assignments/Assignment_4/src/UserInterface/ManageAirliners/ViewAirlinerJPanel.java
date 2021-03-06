/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageAirliners;

import Business.Airliner.Airliner;
import Business.Airliner.AirlinerDirectory;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Sriram
 */
public class ViewAirlinerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewAirlinerJPanel
     */
    
    private AirlinerDirectory airDir;
    private JPanel rightPanel;
    private Airliner airliner;
    
    public ViewAirlinerJPanel(JPanel rightPanel, Airliner airliner, AirlinerDirectory airDir) {
        initComponents();
        this.rightPanel = rightPanel;
        this.airliner = airliner;
        nameTextField.setText(airliner.getName());
        addressTextField.setText(airliner.getAddress());
        originTextField.setText(airliner.getOriginCountry());
        totalFlightsTextField.setText(String.valueOf(airliner.getTotalFlights()));
        this.airDir = airDir;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        originTextField = new javax.swing.JTextField();
        totalFlightsTextField = new javax.swing.JTextField();
        addressTextField = new javax.swing.JTextField();
        updateBtn = new javax.swing.JButton();
        nameTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        SaveBtn = new javax.swing.JButton();

        backBtn.setText("< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Airline Details");

        originTextField.setEnabled(false);

        totalFlightsTextField.setEnabled(false);

        addressTextField.setEnabled(false);

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        nameTextField.setEnabled(false);
        nameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextFieldActionPerformed(evt);
            }
        });

        jLabel5.setText("Total Flights/Day: ");

        jLabel4.setText("Country Origin");

        jLabel3.setText("Address:");

        jLabel6.setText("Name:");

        SaveBtn.setText("Save");
        SaveBtn.setEnabled(false);
        SaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(backBtn)
                .addGap(318, 318, 318)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(SaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(updateBtn))
                    .addComponent(nameTextField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addressTextField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(originTextField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(totalFlightsTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(507, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(2, 2, 2)
                .addComponent(backBtn)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(originTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(totalFlightsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateBtn)
                    .addComponent(SaveBtn))
                .addContainerGap(265, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextFieldActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        rightPanel.remove(this);
        CardLayout cardLayout = (CardLayout)rightPanel.getLayout();
        cardLayout.previous(rightPanel);
        
        Component[] components = rightPanel.getComponents();
        for(Component c: components)
        {
            if(c instanceof ManageAirlinersJPanel){
            ManageAirlinersJPanel m = (ManageAirlinersJPanel)c;
            m.populate();
            }
        }
    }//GEN-LAST:event_backBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        nameTextField.setEnabled(true);
        originTextField.setEnabled(true);
        totalFlightsTextField.setEnabled(true);
        addressTextField.setEnabled(true);
        SaveBtn.setEnabled(true);
        updateBtn.setEnabled(false);
             
    }//GEN-LAST:event_updateBtnActionPerformed

    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed
        // TODO add your handling code here:
        if(nameTextField.getText().isEmpty() || originTextField.getText().isEmpty() || totalFlightsTextField.getText().isEmpty() || addressTextField.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Field(s) cannot be empty.","ERROR",JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try{
            Integer.parseInt(totalFlightsTextField.getText());
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this,"Invalid Total Flights.","ERROR",JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        //Airliner airliner = airDir.addAirliner();
        airliner.setName(nameTextField.getText());
        airliner.setAddress(addressTextField.getText());
        airliner.setOriginCountry(originTextField.getText());
        airliner.setTotalFlights(Integer.parseInt(totalFlightsTextField.getText()));
        JOptionPane.showMessageDialog(this,"Airliner Updated sucessfully!!");  
        nameTextField.setEnabled(false);
        originTextField.setEnabled(false);
        totalFlightsTextField.setEnabled(false);
        addressTextField.setEnabled(false);
        SaveBtn.setEnabled(false);
        updateBtn.setEnabled(true);
    }//GEN-LAST:event_SaveBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SaveBtn;
    private javax.swing.JTextField addressTextField;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTextField originTextField;
    private javax.swing.JTextField totalFlightsTextField;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
