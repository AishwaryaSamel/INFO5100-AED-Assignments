/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.CarDetails;
import Business.CarDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author aishwaryasamel
 */
public class ViewCarJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private CarDetails carDetails;

    ViewCarJPanel(JPanel userProcessContainer, CarDetails carDetails) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.carDetails = carDetails;
        displayCarDetails();
        btnSave.setEnabled(false);
        btnUpdate.setEnabled(true);
    }
    
    public void displayCarDetails(){
        try{
            
            txtSerialId.setText(String.valueOf(carDetails.getSerialID()));
            txtMake.setText(carDetails.getMake());
            txtYear.setText(String.valueOf(carDetails.getYearOfManufacture()));
            txtNoOfSeats.setText(String.valueOf(carDetails.getNumberOfSeats()));
            txtAttributes.setText(carDetails.getAttributes());
            txtAvailability.setText(carDetails.getAvailability());
            txtModelNo.setText(String.valueOf(carDetails.getModelNumber()));
            txtManufacturer.setText(String.valueOf(carDetails.getManufacturer()));
            txtCity.setText(carDetails.getCity());
            txtCarName.setText(carDetails.getCarName());
            txtLastUpdate.setText(String.valueOf(carDetails.getLastUpdateDate()));
            txtCertExpiryDate.setText(String.valueOf(carDetails.getCertExpiryDate()));
        }
        catch(Exception e){
            System.out.println("Check your form");
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
        lblBanner = new javax.swing.JLabel();
        lblSerialId = new javax.swing.JLabel();
        lblAvailability = new javax.swing.JLabel();
        txtSerialId = new javax.swing.JTextField();
        lblMake = new javax.swing.JLabel();
        txtMake = new javax.swing.JTextField();
        lblYear = new javax.swing.JLabel();
        txtYear = new javax.swing.JTextField();
        lblNoOfSeats = new javax.swing.JLabel();
        txtNoOfSeats = new javax.swing.JTextField();
        lblAttributes = new javax.swing.JLabel();
        txtAttributes = new javax.swing.JTextField();
        lblModelNo = new javax.swing.JLabel();
        txtModelNo = new javax.swing.JTextField();
        lblManufacturer = new javax.swing.JLabel();
        txtManufacturer = new javax.swing.JTextField();
        lblLastUpdate = new javax.swing.JLabel();
        txtLastUpdate = new javax.swing.JTextField();
        lblCity = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        lblCertExpiryDate = new javax.swing.JLabel();
        txtCertExpiryDate = new javax.swing.JTextField();
        txtAvailability = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblCarName = new javax.swing.JLabel();
        txtCarName = new javax.swing.JTextField();

        lblBanner.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        lblBanner.setText("View Car Details");

        lblSerialId.setText("Serial ID:");

        lblAvailability.setText("Availability:");

        txtSerialId.setEnabled(false);

        lblMake.setText("Make:");

        txtMake.setEnabled(false);

        lblYear.setText("Year Of Manufacture:");

        txtYear.setEnabled(false);

        lblNoOfSeats.setText("Number of Seats:");

        txtNoOfSeats.setEnabled(false);
        txtNoOfSeats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoOfSeatsActionPerformed(evt);
            }
        });

        lblAttributes.setText("Attributes:");

        txtAttributes.setEnabled(false);
        txtAttributes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAttributesActionPerformed(evt);
            }
        });

        lblModelNo.setText("Model Number:");

        txtModelNo.setEnabled(false);

        lblManufacturer.setText("Manufacturer:");

        txtManufacturer.setEnabled(false);
        txtManufacturer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtManufacturerActionPerformed(evt);
            }
        });

        lblLastUpdate.setText("Last Update Date:");

        txtLastUpdate.setEnabled(false);
        txtLastUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastUpdateActionPerformed(evt);
            }
        });

        lblCity.setText("City:");

        txtCity.setEnabled(false);
        txtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityActionPerformed(evt);
            }
        });

        lblCertExpiryDate.setText("Certificate Expiration Date:");

        txtCertExpiryDate.setEnabled(false);

        txtAvailability.setEnabled(false);
        txtAvailability.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAvailabilityActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnBack.setText("<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblCarName.setText("Car Name:");

        txtCarName.setEnabled(false);
        txtCarName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCarNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(btnBack)
                        .addGap(214, 214, 214)
                        .addComponent(lblBanner, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblSerialId, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addComponent(txtSerialId, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblMake)
                                    .addComponent(lblYear)
                                    .addComponent(lblNoOfSeats)
                                    .addComponent(lblAttributes)
                                    .addComponent(lblModelNo)
                                    .addComponent(lblManufacturer)
                                    .addComponent(lblLastUpdate)
                                    .addComponent(lblCity)
                                    .addComponent(lblCertExpiryDate)
                                    .addComponent(lblAvailability))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtMake)
                                    .addComponent(txtYear)
                                    .addComponent(txtNoOfSeats)
                                    .addComponent(txtAttributes)
                                    .addComponent(txtModelNo)
                                    .addComponent(txtManufacturer)
                                    .addComponent(txtLastUpdate)
                                    .addComponent(txtCity)
                                    .addComponent(txtCertExpiryDate, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                                    .addComponent(txtAvailability, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblCarName)
                                .addGap(41, 41, 41)
                                .addComponent(txtCarName)))
                        .addGap(71, 71, 71)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSave)
                            .addComponent(btnUpdate))))
                .addContainerGap(233, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(lblBanner, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack)
                        .addGap(31, 31, 31)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSerialId, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSerialId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblAvailability)
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMake)
                            .addComponent(txtMake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblYear)
                            .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSave))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNoOfSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNoOfSeats))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAttributes)
                                    .addComponent(txtAttributes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(btnUpdate)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblModelNo)
                            .addComponent(txtModelNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblManufacturer)
                            .addComponent(txtManufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLastUpdate)
                            .addComponent(txtLastUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCity)
                            .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCertExpiryDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCertExpiryDate)))
                    .addComponent(txtAvailability, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCarName))
                    .addComponent(txtCarName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 869, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 599, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNoOfSeatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoOfSeatsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNoOfSeatsActionPerformed

    private void txtAttributesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAttributesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAttributesActionPerformed

    private void txtManufacturerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtManufacturerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtManufacturerActionPerformed

    private void txtLastUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastUpdateActionPerformed

    private void txtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityActionPerformed

    private void txtAvailabilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAvailabilityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAvailabilityActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

            txtSerialId.setEnabled(true);
            txtMake.setEnabled(true);
            txtYear.setEnabled(true);
            txtNoOfSeats.setEnabled(true);
            txtAttributes.setEnabled(true);
            txtAvailability.setEnabled(true);
            txtModelNo.setEnabled(true);
            txtManufacturer.setEnabled(true);
            txtCity.setEnabled(true);
            txtCarName.setEnabled(true);
            btnSave.setEnabled(true);
            btnUpdate.setEnabled(false);
            
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
            
            carDetails.setSerialID(txtSerialId.getText());
            carDetails.setCarName(txtCarName.getText());
            carDetails.setMake(txtMake.getText());
            carDetails.setYearOfManufacture(Integer.parseInt(txtYear.getText()));
            carDetails.setNumberOfSeats(Integer.parseInt(txtNoOfSeats.getText()));
            carDetails.setAttributes(txtAttributes.getText());
            carDetails.setModelNumber(txtModelNo.getText());
            carDetails.setManufacturer(txtManufacturer.getText());
            carDetails.setCity(txtCity.getText());
            carDetails.setCarName(txtCarName.getText());
            carDetails.setAvailability(txtAvailability.getText());
          
            btnSave.setEnabled(true);
            btnUpdate.setEnabled(false);
            
            JOptionPane.showMessageDialog(null, "Account updated successfully");
// TODO add your handling code here:
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtCarNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCarNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCarNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAttributes;
    private javax.swing.JLabel lblAvailability;
    private javax.swing.JLabel lblBanner;
    private javax.swing.JLabel lblCarName;
    private javax.swing.JLabel lblCertExpiryDate;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblLastUpdate;
    private javax.swing.JLabel lblMake;
    private javax.swing.JLabel lblManufacturer;
    private javax.swing.JLabel lblModelNo;
    private javax.swing.JLabel lblNoOfSeats;
    private javax.swing.JLabel lblSerialId;
    private javax.swing.JLabel lblYear;
    private javax.swing.JTextField txtAttributes;
    private javax.swing.JTextField txtAvailability;
    private javax.swing.JTextField txtCarName;
    private javax.swing.JTextField txtCertExpiryDate;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtLastUpdate;
    private javax.swing.JTextField txtMake;
    private javax.swing.JTextField txtManufacturer;
    private javax.swing.JTextField txtModelNo;
    private javax.swing.JTextField txtNoOfSeats;
    private javax.swing.JTextField txtSerialId;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables
}