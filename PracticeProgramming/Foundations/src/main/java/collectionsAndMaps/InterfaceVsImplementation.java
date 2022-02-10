/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collectionsAndMaps;

/**
 *
 * @author fer
 * using Collections is that we program to the interface, but instantiate using the implementation
 */
public class InterfaceVsImplementation {
    List<String> strings = new ArrayList<>(); //ist is an interface and ArrayList
    //is an implementation of that interface. The interface defines all the behavior 
    //we expect of the Collection, and the implementation decides how that behavior
    //is performed behind the scenes.
    
    
    Stack<String> stringStack = new Stack<>(); //like the Stack implementation of List,
    //will give you extra methods: push and pop in this example.
}
