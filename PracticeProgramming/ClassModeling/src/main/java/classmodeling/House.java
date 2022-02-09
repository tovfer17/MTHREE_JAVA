/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classmodeling;

/**
 *
 * @author fer
 * 
 * House
Model a house as if the class were to be part of a GPS mapping system.
Model a house as if the class were to be part of a 3-D design system.
* 

* 
 */
public class House {
    private String street;
    private String city;
    private String zipcode;
    private String country;
    
    private double width;
    private double height;
    private double length;
    private double squareFootage;
    
    public House(String streetIn, String cityIn, String zipcodeIn, String countryIn){
        this.street = streetIn;
        this.city= cityIn;
        this.zipcode=zipcodeIn;
        this.country= countryIn;
        
    }
    
    public House(double widthIn, double heightIn, double lengthIn){
        this.width=widthIn;
        this.height= heightIn;
        this.length=lengthIn;
    }
    public String getStreet(){
        return street;
        
    }
    public void setStreet(String street){
        this.street =street;
        
    }
    public String getCity(){
        return city;
        
    }
    public void setCity(String city){
        this.city =city;
        
    }
    public String getZipcode(){
        return zipcode;
        
    }
    public void setZipcode(String zipcode){
        this.zipcode =zipcode;
        
    }
    public String getCountry(){
        return country;
        
    }
    public void setCountry(String country){
        this.country= country;
    }
    
    public void getDirections(){    
        System.out.println("Directions to the house");
        System.out.println(street+ " "+ city +" "+ zipcode + " "+ country);
    }
    public double getWidth(){
        return width;
        
    }
    public void setWidth(double width){
        this.width =width;
        
    }
    public double getLength(){
        return length;
        
    }
    public void setLength(double length){
        this.length =length;
        
    }
    public double getHeight(){
        return height;
        
    }
    public void setHeght(double height){
        this.height =height;
        
    }
    
    public  double getSquareFootage(){
        double squareFoot =0;
        
       squareFoot= length * width ;
       System.out.println("square footage is "+squareFoot+ " ft^2 ");
       return squareFoot;
       
    
    }
}
