/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus_scheduler;

/**
 *
 * @author Stephen Smith
 */
public class Passenger extends Person{
    private int aFare;
    private int aSeat;
    
    public Passenger(String firstname, String lastname){
        super(firstname, lastname);
        
    }
}
