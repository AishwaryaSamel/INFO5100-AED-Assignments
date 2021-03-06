/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Flight;

import Business.Airliner.Airliner;
import Business.Airliner.AirlinerDirectory;
import Business.Fleet.Fleet;
import Business.Flights.Flights;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sriram
 */
public class MasterFlightScheduleJPanel extends javax.swing.JPanel {

    /**
     * Creates new form MasterFlightScheduleJPanel
     */
    
    JPanel rightPanel;
    AirlinerDirectory airlinerDiectory;
    
    public MasterFlightScheduleJPanel(JPanel rightPanel, AirlinerDirectory airlinerDiectory) {
        this.rightPanel = rightPanel;
        this.airlinerDiectory = airlinerDiectory;
        initComponents();
        populateTable();
    }
    
    private void populateTable()
    {
        int rowCount = masterTable.getRowCount();
        DefaultTableModel model = (DefaultTableModel)masterTable.getModel();
        for(int i=rowCount-1;i>=0;i--) {
        model.removeRow(i);
        }
        DefaultTableModel dtm = (DefaultTableModel)masterTable.getModel();
        dtm.setRowCount(0);
        
        for(Airliner a : airlinerDiectory.getAirlinerDirectory())
        {
            for(Flights f : a.getFlightsDirectory().getFlightsDirectory())
            {
                Object[] row = new Object[dtm.getColumnCount()];
                row[0] = a.getName();
                row[1] = f.getFlightNumber();
                row[2] = f.getDepartureLocation();
                row[3] = f.getArrivalLocation();
                row[4] = f.getPreferedTimeOfDay();
                row[5] = f.getDate();
                row[6] = f.getAirplane();
                row[7]=String.valueOf(f.getSeatDirectory().getSeatCount());
                dtm.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        masterTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        masterTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Airliner", "Flight ID", "Departure", "Arrival", "Time of Day", "Date", "Airplane", "Seats"
            }
        ));
        jScrollPane1.setViewportView(masterTable);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Master Flight Schedule");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1180, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(51, 51, 51)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable masterTable;
    // End of variables declaration//GEN-END:variables
}
