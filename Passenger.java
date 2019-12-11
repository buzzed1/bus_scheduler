/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus_scheduler;
import java.text.NumberFormat;

/**
 *
 * @author Stephen Smith
 */
public class Passenger extends Person{
    private int aFare;
    public static int aSeatNumber = 1;
    private int aSeat;
    private String result;
    private boolean child;
    private boolean adult;
    NumberFormat fmt;
    
    public Passenger(String firstname, String lastname, String state){
        super(firstname, lastname);
        fmt = NumberFormat.getCurrencyInstance();
        if(state.equals("A")){
            adult = true;
            aFare = 1200;
        }
        if(state.equals("C")){
            child = true;
            aFare = 600;
         }
        else{
            System.out.println("Please enter either A or C");   
        }
        result = "";
        aSeat = aSeatNumber;
        aSeatNumber++;
    }
    
    //*****************************
    // set methods
    //*****************************
    
    public void setFare(int fare){
        aFare = fare;
    }
    
    public void setSeat(int seatnumber){
        aSeatNumber = seatnumber;
    }
    
    public void setState(String state){
        if(state.equals("A") || state.equals("Adult")){
            adult = true;
            
        }
        else if(state.equals("C") || state.equals("Child")){
            child = true;
           
    }
    }
    
    //******************************
    // get methods
    //******************************
    public int getSeatNumber(){
        return aSeat;
    }
    
    public int getFare(){
        return aFare;
    }
    
    public String getState(){
        if (child){
            return "Child Fare";
        }
        else {
            return "Adult Fare";
        }
    }
    
    @Override
    public String toString(){
        
        result +=       " Name: "+getFirstName()+ " " + getLastName()+"\n";
        result +=       "State: "+ getState()+"\n";
       result +=         "Fare: "+fmt.format(getFare())+"\n";
       result +=  "Seat Number: "+getSeatNumber()+ "\n";
       
       return result;
    }
}
