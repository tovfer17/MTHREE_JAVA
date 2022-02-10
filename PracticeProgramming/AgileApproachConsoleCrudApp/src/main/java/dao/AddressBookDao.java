/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author fer
 */
public class AddressBookDao {
    final static String filePath = "/Users/fer/Documents/Netbeans/mthree_Java/PracticeProgramming/AgileApproachConsoleCrudApp/src/main/java/addressBook.txt";
		
		// Create a scanner
		Scanner input = new Scanner(System.in);

	
                // read text file to HashMap
                Map<String, String> mapFromFile= HashMapFromTextFile();
                

                // iterate over HashMap entries
                for (Map.Entry<String, String> entry :
                     mapFromFile.entrySet()) {
                    System.out.println(entry.getKey() + " : "
                                       + entry.getValue());
                }
	

	
	public static Map<String, String> HashMapFromTextFile() {
		Map<String, String> map
            = new HashMap<String, String>();
        BufferedReader br = null;
  
        try {
  
            // create file object
            File file = new File(filePath);
  
            // create BufferedReader object from the File
            br = new BufferedReader(new FileReader(file));
  
            String line = null;
  
            // read file line by line
            while ((line = br.readLine()) != null) {
  
                // split the line by :
                String[] parts = line.split("::");
  
                // first part is name, second is number
                String name = parts[0].trim();
                String address = parts[1].trim();
  
                // put name, number in HashMap if they are
                // not empty
                if (!name.equals("") && !address.equals(""))
                    map.put(name, address);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
  
            // Always close the BufferedReader
            if (br != null) {
                try {
                    br.close();
                }
                catch (Exception e) {
                };
            }
        }
  
        return map;
}
}
