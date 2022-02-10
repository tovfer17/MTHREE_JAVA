/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import java.util.Scanner;

/**
 *
 * @author fer
 */
public class UserIO {
    
    Scanner inputReader = new Scanner(System.in);
    
   
    public void print(String message){
        System.out.println(message);
    }
    
 
    public String readString(String prompt){
        System.out.println(prompt);
        return inputReader.nextLine();
    }
    

   
    
  
}

