/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus_scheduler;
import java.util.Map;
import java.util.HashMap;
/**
 *
 * @author Steve
 */
public class Bus {
    private final int COASTER = 29;
    private final int MINIBUS = 14;
    private final int COACH = 54; // Check this for correct figure
    private int passengercount;
    private String coaster;
    private String minibus;
    private String coach;
    private Map<Passenger, Integer> busload;
    
    public Bus(){
        coaster = "COASTER";
        minibus = "MINIBUS";
        coach = "COACH";
        passengercount = 0;
        busload = new HashMap<Passenger, Integer>();
    }
    
    public int getCoasterSize(){
        return COASTER;
    }
    
    public int getMinibusSize(){
        return MINIBUS;
    }
    
    public int getCoachSize(){
        return COACH;
    }
    
    public int getPassengerCount(){
        return passengercount;
    }
    
    public void load(Passenger pass){
        int seat = pass.getSeatNumber();
        busload.put(pass, seat);
        
    }
    
   
}
