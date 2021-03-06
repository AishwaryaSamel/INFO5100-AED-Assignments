/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Flight;

import Business.Airliner.Airliner;
import Business.Flights.Flights;
import Business.Flights.FlightsDirectory;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Sriram
 */
public class ViewFlightJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewFlightJPanel
     */
    
    private JPanel rightpanel;
    private FlightsDirectory fliDir;
    private Flights flight;
    private Airliner airliner;
    
    public ViewFlightJPanel(JPanel rightPanel, Flights flight) {
        this.rightpanel = rightPanel;
        this.flight = flight;
        this.airliner = airliner;
        initComponents();
        
        flightNumberTextField.setText(flight.getFlightNumber());
        departureTextField.setText(flight.getDepartureLocation());
        arrivalTextField.setText(flight.getArrivalLocation());
        timeOfDayComboBox.setSelectedItem(flight.getPreferedTimeOfDay());
        dateTextField.setText(flight.getDate());
        airplaneComboBox.setSelectedItem(flight.getAirplane());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        updateBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        arrivalTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        departureTextField = new javax.swing.JTextField();
        flightNumberTextField = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        saveBtn = new javax.swing.JButton();
        airplaneComboBox = new javax.swing.JComboBox();
        timeOfDayComboBox = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        priceTxt = new javax.swing.JTextField();

        setEnabled(false);

        dateTextField.setEnabled(false);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Date:");

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View Flight Details");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Arrival Location:");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Departure Location:");

        arrivalTextField.setEnabled(false);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Flight Number:");

        departureTextField.setEnabled(false);

        flightNumberTextField.setEnabled(false);

        backBtn.setText("<< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Time of Day:");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Airplane:");

        saveBtn.setText("Save");
        saveBtn.setEnabled(false);
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        airplaneComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        airplaneComboBox.setEnabled(false);

        timeOfDayComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Morning", "Evening", "Night" }));
        timeOfDayComboBox.setEnabled(false);
        timeOfDayComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeOfDayComboBoxActionPerformed(evt);
            }
        });

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Price:");

        priceTxt.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 552, Short.MAX_VALUE)
                .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(updateBtn)
                .addGap(489, 489, 489))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(priceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(backBtn))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(398, 398, 398)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel3))
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(29, 29, 29)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(departureTextField)
                                .addComponent(arrivalTextField)
                                .addComponent(flightNumberTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(dateTextField)
                                .addComponent(timeOfDayComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, 224, Short.MAX_VALUE)
                                .addComponent(airplaneComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(440, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addComponent(backBtn)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(flightNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(departureTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(arrivalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(airplaneComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(timeOfDayComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateBtn)
                    .addComponent(saveBtn))
                .addContainerGap(190, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        flightNumberTextField.setEnabled(true);
        departureTextField.setEnabled(true);
        arrivalTextField.setEnabled(true);
        dateTextField.setEnabled(true);
        priceTxt.setEnabled(true);
        saveBtn.setEnabled(true);
        updateBtn.setEnabled(false);
        timeOfDayComboBox.setEnabled(true);
        airplaneComboBox.setEnabled(true);
        
        
       
    }//GEN-LAST:event_updateBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        rightpanel.remove(this);
        CardLayout cardLayout = (CardLayout)rightpanel.getLayout();
        cardLayout.previous(rightpanel);

        Component[] components = rightpanel.getComponents();
        for(Component c: components)
        {
            if(c instanceof ManageFlightsJPanel){
                ManageFlightsJPanel m = (ManageFlightsJPanel)c;
                m.populate();
            }
        }
    }//GEN-LAST:event_backBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
         if(flightNumberTextField.getText().isEmpty() || departureTextField.getText().isEmpty() || arrivalTextField.getText().isEmpty() || dateTextField.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Field(s) cannot be empty.","ERROR",JOptionPane.ERROR_MESSAGE);
            return;
        }

        //Flights flights = fliDir.addFlight();
        flight.setFlightNumber(flightNumberTextField.getText());
        flight.setDepartureLocation(departureTextField.getText());
        flight.setArrivalLocation(arrivalTextField.getText());
        flight.setPreferedTimeOfDay((String) timeOfDayComboBox.getSelectedItem());
        flight.setDate(dateTextField.getText());
        flight.setPrice(Integer.parseInt(priceTxt.getText()));
        flight.setAirplane((String) airplaneComboBox.getSelectedItem());
        JOptionPane.showMessageDialog(this,"Airliner updated sucessfully!!","SUCESS",JOptionPane.INFORMATION_MESSAGE);
          flightNumberTextField.setEnabled(false);
        departureTextField.setEnabled(false);
        arrivalTextField.setEnabled(false);
        dateTextField.setEnabled(false);
        timeOfDayComboBox.setEnabled(false);
        airplaneComboBox.setEnabled(false);
        priceTxt.setEnabled(false);                
        saveBtn.setEnabled(false);
        updateBtn.setEnabled(true);
    }//GEN-LAST:event_saveBtnActionPerformed

    private void timeOfDayComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeOfDayComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timeOfDayComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox airplaneComboBox;
    private javax.swing.JTextField arrivalTextField;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField dateTextField;
    private javax.swing.JTextField departureTextField;
    private javax.swing.JTextField flightNumberTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField priceTxt;
    private javax.swing.JButton saveBtn;
    private javax.swing.JComboBox timeOfDayComboBox;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
