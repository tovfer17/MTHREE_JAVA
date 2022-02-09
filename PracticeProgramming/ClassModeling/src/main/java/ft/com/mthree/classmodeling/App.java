package ft.com.mthree.classmodeling;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fer
 */
public class App {
   public static void main(String[] args) {
        
    House house1 = new House("32 second ave", "pelham", "10803","USA");
    house1.getDirections();
    
    House house2= new House(10,14,19);
    house2.getSquareFootage();
    
}
}
