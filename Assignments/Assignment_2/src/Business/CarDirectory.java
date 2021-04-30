/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aishwaryasamel
 */



public class CarDirectory {
    private ArrayList<CarDetails> carDetailsList;
    public ArrayList<String> makeList;
    public ArrayList<String> cityList;
    public ArrayList<String> modelNumberList;
    public ArrayList<String> manufacturerList;
    public ArrayList<String> seatsList;
    public ArrayList<String> yearList;
    public ArrayList<Integer> availabilityList;
    public ArrayList<String> certExpiryList;
    
    public CarDirectory(){
        this.carDetailsList = new ArrayList<CarDetails>();
        this.makeList = new ArrayList<String>();
        this.cityList = new ArrayList<String>();
        this.modelNumberList = new ArrayList<String>();
        this.manufacturerList = new ArrayList<String>();
        this.seatsList = new ArrayList<String>();
        this.yearList = new ArrayList<String>();
        this.availabilityList = new ArrayList<Integer>();
        this.certExpiryList = new ArrayList<String>();
        populateCarValues();
        
    }
    
    public void populateCarValues(){
        CarDetails carDet1 = new CarDetails();
        carDet1.setSerialID("1001");
        carDet1.setAttributes("Strong");
        carDet1.setAvailability("No");
        carDet1.setCarName("Corolla");
        carDet1.setCity("Atlanta");
        carDet1.setMake("Toyota");
        carDet1.setManufacturer("John");
        carDet1.setModelNumber("TOYCOR");
        carDet1.setNumberOfSeats(5);
        carDet1.setYearOfManufacture(2000);
        carDetailsList.add(carDet1);
        
        CarDetails carDet2 = new CarDetails();
        carDet2.setSerialID("1002");
        carDet2.setAttributes("Stylish");
        carDet2.setAvailability("Yes");
        carDet2.setCarName("Camri");
        carDet2.setCity("Missouri");
        carDet2.setMake("Toyota");
        carDet2.setManufacturer("Williams");
        carDet2.setModelNumber("TOYCAM");
        carDet2.setNumberOfSeats(5);
        carDet2.setYearOfManufacture(2005);
        carDetailsList.add(carDet2);
        
        CarDetails carDet3 = new CarDetails();
        carDet3.setSerialID("1003");
        carDet3.setAttributes("Royal");
        carDet3.setAvailability("No");
        carDet3.setCarName("Mini Cooper");
        carDet3.setCity("Los Angeles");
        carDet3.setMake("BMW");
        carDet3.setManufacturer("Julia");
        carDet3.setModelNumber("BMWCOO");
        carDet3.setNumberOfSeats(4);
        carDet3.setYearOfManufacture(2015);
        carDetailsList.add(carDet3);
        
        CarDetails carDet4 = new CarDetails();
        carDet4.setSerialID("1004");
        carDet4.setAttributes("Good ground clearance");
        carDet4.setAvailability("Yes");
        carDet4.setCarName("Pilot");
        carDet4.setCity("Los Angeles");
        carDet4.setMake("Honda");
        carDet4.setManufacturer("Julia");
        carDet4.setModelNumber("HONPIL");
        carDet4.setNumberOfSeats(8);
        carDet4.setYearOfManufacture(2000);
        
        CarDetails carDet5 = new CarDetails();
        carDet5.setSerialID("1005");
        carDet5.setAttributes("Sturdy");
        carDet5.setAvailability("Yes");
        carDet5.setCarName("Odyssey");
        carDet5.setCity("Los Angeles");
        carDet5.setMake("Honda");
        carDet5.setManufacturer("Julia");
        carDet5.setModelNumber("HONODY");
        carDet5.setNumberOfSeats(7);
        carDet5.setYearOfManufacture(2000);
        carDetailsList.add(carDet5);
        
        DateFormat format = new SimpleDateFormat("MM-dd-yyyy");
        try {
            Date update1 = format.parse("10-23-1985");
            Date cert1 = format.parse("10-23-2005");
            carDet1.setCertExpiryDate(cert1);
            carDet1.setLastUpdateDate(update1);
            
            Date update2 = format.parse("10-23-1985");
            Date cert2 = format.parse("10-23-2022");
            carDet2.setCertExpiryDate(cert2);
            carDet2.setLastUpdateDate(update2);
            
            Date update3 = format.parse("10-23-1985");
            Date cert3 = format.parse("10-23-2005");
            carDet3.setCertExpiryDate(cert3);
            carDet3.setLastUpdateDate(update3);
            
            Date update4 = format.parse("10-23-1985");
            Date cert4 = format.parse("10-23-2005");
            carDet4.setCertExpiryDate(cert4);
            carDet4.setLastUpdateDate(update4);
            
            Date update5 = format.parse("10-23-1985");
            Date cert5 = format.parse("10-23-2023");
            carDet5.setCertExpiryDate(cert5);
            carDet5.setLastUpdateDate(update5);
            
        } catch (ParseException ex) {
            Logger.getLogger(CarDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
        carDetailsList.add(carDet4);
        
        
    }
    

    public ArrayList<CarDetails> getCarDetails() {
        return carDetailsList;
    }

    public void setCarDetails(ArrayList<CarDetails> carDetails) {
        this.carDetailsList = carDetailsList;
    }
    
    public CarDetails addCarDetails(){
        CarDetails carDetails = new CarDetails();
        carDetailsList.add(carDetails);
        return carDetails;
        
    }
    
    public void  deleteCarDetails(CarDetails carDetails){
        carDetailsList.remove(carDetails);
    }
    
    public CarDetails searchByID(String serialID){
        for (CarDetails carDetails: carDetailsList){
            if(carDetails.getSerialID().equals(serialID)){
                return carDetails;
            }
        }
        return null;
    }
    
    public ArrayList searchByModelNumber(String modelNumber){
        for (CarDetails carDetails: carDetailsList){
            if(carDetails.getModelNumber().equals(modelNumber)){
               modelNumberList.add(carDetails.getSerialID());
            }
        }
        return modelNumberList;
    }
    
    public ArrayList searchByMake(String make){
        for (CarDetails carDetails : carDetailsList){
            if(carDetails.getMake().equals(make)){
                makeList.add(carDetails.getMake());
            }            
        }
        return makeList;
    }
    
    public ArrayList searchByCity(String city){
        for (CarDetails carDetails : carDetailsList){
            if(carDetails.getCity().equals(city)){
                cityList.add(carDetails.getSerialID());
            }            
        }
        return cityList;
    }
    
    public ArrayList searchByManufacturer(String manufacturer){
        for (CarDetails carDetails : carDetailsList){
            if(carDetails.getManufacturer().equals(manufacturer)){
                yearList.add(carDetails.getSerialID());
            }            
        }
        return yearList;
    }
    public ArrayList searchByYear(int year){
        for (CarDetails carDetails : carDetailsList){
            if(carDetails.getYearOfManufacture() == year){
                manufacturerList.add(carDetails.getSerialID());
            }            
        }
        return manufacturerList;
    }
    
    public ArrayList searchBasedOnSeats(int min, int max){
        for (CarDetails carDetails : carDetailsList){
            if(carDetails.getNumberOfSeats()>=min && carDetails.getNumberOfSeats()<=max){
                seatsList.add(carDetails.getSerialID());
            }            
        }
        return seatsList;
    }
    
    public ArrayList checkAvailability(){
        int avbl = 0,unavbl = 0;
        for (CarDetails carDetails : carDetailsList){
            if(carDetails.getAvailability() == "Yes"){
                avbl += 1;
            }
            else if(carDetails.getAvailability() == "No"){
                
                unavbl += 1;
            }            
        }
        availabilityList.add(avbl);
        availabilityList.add(unavbl);
        return availabilityList;
    }
    
    public String findAvailableCar(){
        String availableCar = "";
        for (CarDetails carDetails : carDetailsList){
            if(carDetails.getAvailability()== "Yes"){
                availableCar =  carDetails.getSerialID();
                break;
            }            
        }
        return availableCar;
    }
    
    public String getUpdateDate(){
        String updateDate = "";
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM-dd-yyyy");  
        LocalDateTime now = LocalDateTime.now();  
        updateDate = dtf.format(now).toString();
        return updateDate;
    }
    
    public ArrayList findExpiredCertificate(){
        
        Date todayDate = null;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM-dd-yyyy");  
       // LocalDateTime now = LocalDateTime.now();  
        todayDate = new Date();
        for (CarDetails carDetails : carDetailsList){
            if(carDetails.getCertExpiryDate().before(todayDate)){
                certExpiryList.add(carDetails.getSerialID());
            }
        }
        return certExpiryList;
    }
    
    
}
