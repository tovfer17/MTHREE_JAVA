/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collectionsAndMaps;

/**
 *
 * @author fer
 */
public class HashMapExample {
    // create a map that maps a country to its population
    
    Map<String, Integer> populations = new HashMap<>(); 
    
    //the key is a country name (String) and the value is the population (Integer):
    //Similar to Lists we instantiate to the interface, a Map is equal to a new HashMap, 
    //the concrete implementation.
    
        // add the first country
    populations.put("USA", 313000000);

    // add the next country
    populations.put("Canada", 34000000);

    // add another country
    populations.put("United Kingdom", 63000000);

    // add another country
    populations.put("Japan", 127000000);
    
        // replace the mapping for population of the USA - original
    // number was too low
    populations.put("USA", 313000000);
    
        // get the poplation of Japan and print it to the screen
    Integer japanPopulation = populations.get("Japan");
    System.out.println("The population of Japan is: " + japanPopulation);
    
    // remove USA from the map entirely
    populations.remove("USA");
    
    //listing all the keys
    
    // get the Set of keys from the map
    Set<String> keys = populations.keySet();
    // print the keys to the screen
    for (String k : keys) {
        System.out.println(k);
    }
    //Note that we can not necessarily predict the order of the Keys in the Set,
    //Maps do not save their data in a specific order.


    //listing all the values key by key
    // get the Set of keys from the map
    Set<String> keys = populations.keySet();

    // print the keys and associated values to the screen
    for (String k : keys) {
        System.out.println("The population of " + k +
                " is " + populations.get(k));
    }
    
    //listing all the values: value collection
    
    // get the Collection of values from the Map
    Collection<Integer> popValues = populations.values();

    // list all of the population values
    for (Integer p : popValues) {
        System.out.println(p);
}