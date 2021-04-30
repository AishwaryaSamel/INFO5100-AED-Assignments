/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Seat;

import Business.Customer.CustomerDirectory;
import Business.Flights.FlightsDirectory;
import java.util.ArrayList;

/**
 *
 * @author Rishab
 */
public class SeatDirectory {
    
    private ArrayList<Seat> seatDir;
    private int count;
    
    private String[][] seats;
    
        public SeatDirectory() {
        this.seatDir = new ArrayList<Seat>();
        count = 25*6;
        seats  =  new String[][] {{"1A","1B","1C","1D","1E","1F"},
                            {"2A","2B","2C","2D","2E","2F"},
                            {"3A","3B","3C","3D","3E","3F"},
                            {"4A","4B","4C","4D","4E","4F"},
                            {"5A","5B","5C","5D","5E","5F"},
                            {"6A","6B","6C","6D","6E","6F"},
                            {"7A","7B","7C","7D","7E","7F"},
                            {"8A","8B","8C","8D","8E","8F"},
                            {"9A","9B","9C","9D","9E","9F"},
                            {"10A","10B","10C","10D","10E","10F"},
                            {"11A","11B","11C","11D","11E","11F"},
                            {"12A","12B","12C","12D","12E","12F"},
                            {"13A","13B","13C","13D","13E","13F"},
                            {"14A","14B","14C","14D","14E","14F"},
                            {"15A","15B","15C","15D","15E","15F"},
                            {"16A","16B","16C","16D","16E","16F"},
                            {"17A","17B","17C","17D","17E","17F"},
                            {"18A","18B","18C","18D","18E","18F"},
                            {"19A","19B","19C","19D","19E","19F"},
                            {"20A","20B","20C","20D","20E","20F"},
                            {"21A","21B","21C","21D","21E","21F"},
                            {"22A","22B","22C","22D","22E","22F"},
                            {"23A","23B","23C","23D","23E","23F"},
                            {"24A","24B","24C","24D","24E","24F"},
                            {"25A","25B","25C","25D","25E","25F"}};	
    }

    public String[][] getSeats() {
        return seats;
    }

    public ArrayList<Seat> getSeatDirectory() {
        return seatDir;
    }
    
    public Seat addSeat(){
        Seat fleet = new Seat();
        seatDir.add(fleet);
        return fleet;
    }
    
    public String[][] reserveSeat(String selectedSeat)
    {
//        String[][] a = seats.clone();
        for(int i=0;i<25;i++)
        {
            for(int j=0; j<6; j++)
            {
                    if(seats[i][j] == selectedSeat)
                    {
                       seats[i][j] = seats[i][j] + " - Not Available" ;
                       count = count - 1;
                    }
            }
        }
    return seats;
    }
    
    public int getSeatCount()
    {
    return count;  
    }
}
