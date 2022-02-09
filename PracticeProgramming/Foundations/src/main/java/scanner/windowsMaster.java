/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scanner;

import java.util.Scanner;

/**
 *
 * @author fer
 */
public class windowsMaster {
    public static void main(String [] args) {
    // declare variables for height and width
    float height;
    float width;

   

    // declare other variables
    float areaOfWindow;
    float cost;
    float perimeterOfWindow;

    // declare and initialize the Scanner
    Scanner myScanner = new Scanner(System.in);

    /** old way 
     *  // declare String variables to hold the user's height and
    // width input
    String stringHeight;
    String stringWidth;
     * // get input from the user
    System.out.println("Please enter window height:");
    stringHeight = myScanner.nextLine();
    System.out.println("Please enter window width:");
    stringWidth = myScanner.nextLine();

    // convert String values of height and width to float values
    height = Float.parseFloat(stringHeight);
    width = Float.parseFloat(stringWidth);
     */
    
    // get input from user
        height = readValue("Please enter window height:");
        width = readValue("Please enter window width:");

    // calculate the area of the window
    areaOfWindow = height * width;

    // calculate the perimeter of the window
    perimeterOfWindow = 2 * (height + width);

    // calculate the total cost - use a hard-coded value
    // for material cost
    cost = ((3.50f * areaOfWindow) + (2.25f * perimeterOfWindow));

    // display the results to the user
    System.out.println("Window height = " + height);
    System.out.println("Window width = " + width);
    System.out.println("Window area = " + areaOfWindow);
    System.out.println("Window perimeter = " + perimeterOfWindow);
    System.out.println("Total Cost =  " + cost);
}
     public static float readValue(String prompt) {
        // declare and initialize a Scanner variable
        Scanner sc = new Scanner(System.in);
        // print prompt to console
        System.out.println(prompt);
        // read value into String data type
        String input = sc.nextLine();
        // convert the String to a float
        float floatVal = Float.parseFloat(input);
        // return the float value
        return floatVal;
    }
}
