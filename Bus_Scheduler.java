/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus_scheduler;

import bus_scheduler.Bus;
import bus_scheduler.Passenger;

/**
 *
 * @author Steve
 */
public class Bus_Scheduler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Passenger pass = new Passenger("Stephen","Smith","A");
        Passenger pass2 = new Passenger("John", "Doe","c");

        Bus bus = new Bus();

        bus.load(pass);
        bus.load(pass2);



        System.out.println(pass);
        System.out.println(pass2);

        System.out.println("Number on Bus: " + bus.getPassengerCount());







    }

}
