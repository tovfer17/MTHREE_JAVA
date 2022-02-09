/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RefactorFactorizer;



/**
 *
 * @author fer
 */
public class AppFactorizer {
     public static void main(String[] args) {
      
     Factorizer question = new Factorizer();
     int pick =  question.askPrompt();
     
     int sum = question.calculateFactors(pick);
     question.calculatePerfect(pick, sum);
     
     if (question.isPrime(pick)) {  
           System.out.println(pick+ " is a prime number");  
       } else {  
           System.out.println(pick + " is not a prime number");  
       }  
}
}
