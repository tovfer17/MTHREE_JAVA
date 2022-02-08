/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 *
 * @author fer
 */
public class BarelyControlledChaos {
    
    public static void main(String[] args) {

        String color = pickColor(); // call color method here
        String animal = pickAnimal(); // call animal method again here
        String colorAgain = pickColor(); // call color method again here
        int weight = pickNumber(5,200); // call number method,
            // with a range between 5 - 200
        int distance = pickNumber(10,20); // call number method,
            // with a range between 10 - 20
        int number = pickNumber(1000,20000); // call number method,
            // with a range between 10000 - 20000
        int time = pickNumber(2,6); // call number method,
            // with a range between 2 - 6            

        System.out.println("Once, when I was very small...");

        System.out.println("I was chased by a " + color + ", "
            + weight + "lb " + " miniature " + animal
            + " for over " + distance + " miles!!");

        System.out.println("I had to hide in a field of over "
            + number + " " + colorAgain + " poppies for nearly "
            + time + " hours until it left me alone!");

        System.out.println("\nIt was QUITE the experience, "
            + "let me tell you!");
    }

    // ??? Method 1 ???
    public static String pickColor(){
       String [] listColors={"pink","purple","blue"};
       Random random = new Random();
       return listColors[random.nextInt(listColors.length)];
        
        
    }
    // ??? Method 2 ???
    public static String pickAnimal(){
        String [] listAnimals={"ant","bear","tiger"};
        Random random =new Random();
        return listAnimals[random.nextInt(listAnimals.length)];
    }
    // ??? Method 3 ???
    public static int pickNumber(int start, int end){
        Random rand =new Random();
        return rand.nextInt(start,(end+1));
    }
}
