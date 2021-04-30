/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Seat;

import Business.Customer.CustomerDirectory;

/**
 *
 * @author Rishab
 */
public class Seat {
    private int Row;
    private String Column;
    
    private CustomerDirectory cusDir;

    public CustomerDirectory getCusDir() {
        return cusDir;
    }

    public void setCusDir(CustomerDirectory cusDir) {
        this.cusDir = cusDir;
    }


    public int getRow() {
        return Row;
    }

    public void setRow(int Row) {
        this.Row = Row;
    }

    public String getColumn() {
        return Column;
    }

    public void setColumn(String Column) {
        this.Column = Column;
    }
}
