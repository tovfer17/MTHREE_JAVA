/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package submissions;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author fer
 */
public class RockPaperScissor {
    public static void main(String[] args) {
         int again = 1;
         while (again == 1){
            int rounds = askRounds();
            playGame(rounds);
            again = playAgain();
         }
         
     }
     
     
     public static int askRounds(){
         System.out.println("How many rounds of RockPaperScissors?, max rounds:10");
         Scanner inputReader = new Scanner(System.in);
         int round = Integer.parseInt(inputReader.nextLine());
        
         if((round  > 1) || (round < 10)){
             System.out.println("You selected "+ round + " rounds");
          
         }else{
             System.out.println("You selected something outside the range? ");
             System.exit(0);
         }
         return round ;
     
      }
     public static void playGame(int rounds){
         
         int tie=0;
         int userWin=0;
         int computerWin=0; 
         
         for (int i=0; i<rounds; i++){
              System.out.println("input 1 (rock),2 (paper), 3(scissor) ");
              Scanner inputReader = new Scanner(System.in);
              int userPick = Integer.parseInt(inputReader.nextLine());
              
              int [] listChoices={1,2,3};
              Random random = new Random();
              int computerPick= listChoices[random.nextInt(listChoices.length)];
              
              if (userPick == computerPick){
                  tie++;
                  System.out.println("The game is a tie");
              }
              else if((userPick ==1 || computerPick ==2)||(userPick ==2 || computerPick ==1)||(userPick ==1 || computerPick ==3)||(userPick ==3 || computerPick ==2) ){
                  
                 userWin++;
                 System.out.println("The user wins");
                  
              }
              else{
                  computerWin++;
                  System.out.println("The computer wins");
              }
         }
         results (tie,userWin,computerWin);
        
         
     }
     
     public static void results(int tie, int userWin, int computerWin){
         System.out.println(tie +" tie(s)");
         System.out.println(userWin +" user win(s)");
         System.out.println(computerWin +" computer win(s)");
        
         if (userWin > computerWin){
             System.out.println("User won more rounds");
          
         }else if(computerWin > userWin){
             System.out.println("Computer won more rounds");
             
         }else{
             System.out.println("all of the rounds were ties");
         }
         
         
     }
     public static int playAgain(){
   
         System.out.println("Do you want to play again?, 1 =yes or 2= no ");
         Scanner inputReader = new Scanner(System.in);
         int again = Integer.parseInt(inputReader.nextLine());
         
         if (again ==1){
             return again;
         }
         else{
           System.out.println("Thanks for playing! ");
           return 0;
         }
         
     }
     
     
}
