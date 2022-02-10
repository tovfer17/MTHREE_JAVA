/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

/**
 *
 * @author fer
 */
public class Address {
  
    private String streetAddress;
    private String city;
    private String state;
    private String zip;
    
   


    public Address(String streetAddress, String city,String state, String zip) {
        this.streetAddress = streetAddress;
        this.city= city;
        this.state=state;
        this.zip=zip;
    }
    
    
    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    } 

    public String getStreetAddress() {
        return streetAddress;
    }
    
    public void setCity(String city) {
        this.city = city;
    } 
    public String getCity() {
        return city;
    }
    
     public void setState(String state) {
        this.state = state;
    } 
    public String getState() {
        return state;
    }
    
     public void setZip(String zip) {
        this.zip = zip;
    } 
    public String getZip() {
        return zip;
    }
    
}
