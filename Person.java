/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bus_scheduler;
import javax.swing.JOptionPane;
/**
 * This person class tracks various aspects of a person and is the parent class
 * of passenger.
 * @author Stephen Smith
 */
public class Person {
    private String aFirstName;
    private String aLastName;
    private String aEmail;
    private String aAddress;
    private int aAge;
    private int aCellPhone;
    private int aHomePhone;
    private String result;
    private String message;
    
    //***********************************************************************
    //Constructor(s).
    //***********************************************************************
    
    public Person(){
        result = "";
        
    }
    
    public Person(String firstname, String lastname){
        aFirstName = firstname;
        aLastName = lastname;
        message = "Name cannot be blank";
        // ToDo
        // validate inputs.
        if(aFirstName == "" || aLastName == ""){
            JOptionPane.showMessageDialog(null, message);
            System.exit(0);
        }
    }
    
    //********************************************
    // Set methods
    //********************************************
    
    public void setFirstName(String firstname){
        aFirstName = firstname;
    }
    
    public void setLastName(String lastname){
        aLastName = lastname;
    }
    
    public void setEmail(String email){
        aEmail = email;
    }
    
    public void setAddress(String address){
        aAddress = address;
    }
    
    public void setAge(int age){
        aAge = age;
    }
    
    public void setCellPhone(int cellphone){
        aCellPhone = cellphone;
    }
    
    public void setHomePhone(int homephone){
        aHomePhone = homephone;
    }
    
    //*****************************************
    // get methods
    //*****************************************
    
    public String getFirstName(){
        return aFirstName;
    }
    
    public String getLastName(){
        return aLastName;
    }
    
    public String getName(){
        return aFirstName + " "+aLastName;
    }
    
    public String getEmail(){
        return aEmail;
    }
    
    public String getAddress(){
        return aAddress;
    }
    
    public int getAge(){
        return aAge;
    }
    
    public int getCellPhone(){
        return aCellPhone;
    }
    
    public int getHomePhone(){
        return aHomePhone;
    }
    
    @Override
    public String toString(){
        result += "      Name: "+getFirstName()+ " " + getLastName()+"\n";
        result += "     Email: "+getEmail()+"\n";
        result += "   Address: "+getAddress()+"\n";
        result += "       Age: "+ getAge()+"\n";
        result += "      Cell: "+getCellPhone()+"\n";
        result += "Home Phone: "+getHomePhone()+"\n";
        
        return result;
    }
}
