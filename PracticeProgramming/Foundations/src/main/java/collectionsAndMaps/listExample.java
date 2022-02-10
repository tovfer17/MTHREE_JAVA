/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collectionsAndMaps;

/**
 *
 * @author fer
 */
public class listExample {
    List<String> myList; //declare a list of strings:
    List<Student> studentList; //declaration of a list of Student objects:
    
     List<Integer> numbers = new ArrayList<>(); // list of ints
     
     List<String> strings = new ArrayList<>(); //a list of String types
     //The List class is not static, so we use the new keyword to instantiate it.
     //At the time of creation, you must identify the type of elements that you want 
     //to store in the List. 
     
    
     
     strings.add("A");
     strings.add("B");
     strings.add("C");
     strings.remove("B");
     
     //accessing items in a list
     for(int i = 0;i < strings.size(); i++) {
    System.out.println(strings.get(i));        
    
    //enhanced for loops and lists
    for(String s : strings) {
    System.out.println(s);
}
}
}
