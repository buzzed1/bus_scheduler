/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus_scheduler;

/**
 *
 * @author Steve
 */
public class Bus_Scheduler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Passenger pass = new Passenger("Stephen","Smith");
        pass.setSeat(1);
        
        
        System.out.println(pass);
    }
    
}
