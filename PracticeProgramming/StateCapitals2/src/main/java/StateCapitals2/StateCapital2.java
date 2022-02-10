/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StateCapitals2;

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
public class StateCapital2  {
    
    final static String filePath = "/Users/fer/Documents/Netbeans/mthree_Java/PracticeProgramming/StateCapitals2/src/main/java/StateCapitals2/StateCapitals.txt"; 
	public static void main(String[] args) throws Exception {	
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
	}

	/** Method getData stores the 50 states and their capitals in a map */
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
                String state = parts[0].trim();
                String capital = parts[1].trim();
  
                // put name, number in HashMap if they are
                // not empty
                if (!state.equals("") && !capital.equals(""))
                    map.put(state, capital);
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
