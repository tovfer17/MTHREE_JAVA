/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factorizer;

import java.util.Scanner;

/**
 *
 * @author fer
 */
public class factorizer {
    public static void main(String[] args) {
        
     int pick = askPrompt();
     int sum = calculateFactors(pick);
     calculatePerfect(pick, sum);
     if (isPrime(pick)) {  
           System.out.println(pick+ " is a prime number");  
       } else {  
           System.out.println(pick + " is not a prime number");  
       }  
}
    
    public static int askPrompt(){
     System.out.println("what number would you like to factor? ");
     Scanner inputReader = new Scanner(System.in);
     int number = Integer.parseInt(inputReader.nextLine());
     System.out.println("The factors of 6 are: ");
     return number;
    }
    public static int calculateFactors(int number){
     int count =0;
     int sum =0; 
    
    
     for (int i =1; i<= number; ++i){
         if (number % i==0){
            System.out.println(i + " ");
            count++;
            sum +=i;
         }
        
     }
     System.out.println(number + " has " + count+ " factors ");
     return sum;
     
    }
     public static void calculatePerfect(int number,int sum){
     if((sum-number) == number){
         System.out.println( number +" is a perfect number");
     }
     else{
         System.out.println( number +" is not a perfect number");
     }
     
     
    }
    
    public static boolean isPrime(int n) {  
       if (n <= 1) {  
           return false;  
       }  
       for (int i = 2; i < Math.sqrt(n); i++) {  
           if (n % i == 0) {  
               return false;  
           }  
       }  
       return true;  
   }  
}