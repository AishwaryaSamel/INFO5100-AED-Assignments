/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.CarDetails;
import Business.CarDirectory;
import java.awt.CardLayout;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aishwaryasamel
 */
public class SearchByExpMCJPanel extends javax.swing.JPanel {
     private JPanel userProcessContainer;
    private CarDirectory carDirectory;
    /**
     * Creates new form SearchByExpiredMC
     */
    public SearchByExpMCJPanel(JPanel userProcessContainer, CarDirectory carDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
         this.carDirectory = carDirectory;
         populateByExpiredMC();
         
    }
    
    public void populateByExpiredMC(){
        DefaultTableModel emc = (DefaultTableModel) tblEMC.getModel();
        emc.setRowCount(0);
        
        
        for(CarDetails carDetails: carDirectory.getCarDetails()){
            Object [] row = new Object[5];
           
            row[0] = carDetails;
            row[1] = carDetails.getSerialID();
            row[2] = carDetails.getManufacturer();
            row[3] = carDetails.getYearOfManufacture();
            row[4] = carDetails.getCertExpiryDate();
            
            
        Date todayDate = null;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("mm-dd-yyyy");  
        todayDate = new Date();
       
        if(carDetails.getCertExpiryDate().before(todayDate)){
                emc.addRow(row);
            }
        
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

        btnBack = new javax.swing.JButton();
        lblBanner = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEMC = new javax.swing.JTable();

        btnBack.setText("< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblBanner.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblBanner.setText("Expired Maintenance Certificate");

        tblEMC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Car Name", "Serial ID", "Manufacturer", "Year Of Manufacture", "Date Of Expiry"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblEMC);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(btnBack)
                        .addGap(177, 177, 177)
                        .addComponent(lblBanner, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 817, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack)
                    .addComponent(lblBanner, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(96, 96, 96)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(270, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBanner;
    private javax.swing.JTable tblEMC;
    // End of variables declaration//GEN-END:variables
}
