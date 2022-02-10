/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author fer
 */
import ui.UserIO;

public class View extends UserIO {
    
       userIO.print("Hey welcome to your addresss book!");
       
       switch(userIO.readString("Select from the menu below :")){
           case 1: 
                userIO.print("press 1 to Add an Address");
                break;
           case 2: 
                 userIO.print("press 2 to view an Address");
                 break;
        
       }
       
       
      int addAddress = userIO.readString("Add an address ( street city state zip :");
      
          
         
      
}
