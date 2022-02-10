/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserIOclassLab;

import java.util.Scanner;

/**
 *
 * @author fer
 */
public class UserIOImpl implements UserIO{
    Scanner inputReader = new Scanner(System.in);
    
    @Override
    public void print(String message){
        System.out.println(message);
    }
    
    @Override
    public String readString(String prompt){
        System.out.println(prompt);
        return inputReader.nextLine();
    }
    
    @Override
    public int readInt(String prompt){
     System.out.println(prompt);
     return Integer.parseInt(inputReader.nextLine());
    }
    
    /*
    @Override
    public int readInt(String prompt, int min, int max){
     System.out.println(prompt);
     return;
    }
*/
   
    
    @Override
    public double readDouble(String prompt){
        System.out.println(prompt);
        return Double.parseDouble(inputReader.nextLine());
    }
    
    /*
    @Override
    public double readDouble(String prompt, double min, double max){
        System.out.println(prompt);
    }
       */
    
    @Override
    public float readFloat(String prompt){
        System.out.println(prompt);
        return Float.parseFloat(inputReader.nextLine());
    }
    
    /*
    @Override
    public float readFloat(String prompt, float min, float max){
        System.out.println(prompt);
        
    }
      */  
    @Override
    public long readLong(String prompt){
        System.out.println(prompt);
        return Long.parseLong(inputReader.nextLine());
    }
    
    /*
    @Override
    public long readLong(String prompt, long min, long max){
       System.out.println(prompt);
    }
*/
}
