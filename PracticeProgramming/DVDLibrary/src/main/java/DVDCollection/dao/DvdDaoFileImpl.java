/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DVDCollection.dao;

import DVDCollection.dto.Dvd;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fer
 */
public class DvdDaoFileImpl implements DvdDao {

     private Map<String, Dvd> dvds = new HashMap<>();
     
    @Override
    public Dvd addDvd(String title, Dvd dvd) { 
       Dvd prevDvd = dvds.put(title, dvd);
       return prevDvd;
    }

    @Override
    public List<Dvd> getAllDvds() {
         return new ArrayList<Dvd>(dvds.values());
    }

    @Override
    public Dvd getDvd(String title) {
        return dvds.get(title);
    }

    @Override
    public Dvd removeDvd(String title) {
        Dvd removedDvd = dvds.remove(title);
        return removedDvd;
    }
    
    @Override
    public Dvd editDvd(String title, Dvd dvd){
       Dvd edited = dvds.replace(title,dvd);
       return edited;
          
    }
  

    @Override
    public String saveFile(List<Dvd> save) {
  
        String dvdInfo = "" ;
        String fileName ="/Users/fer/Documents/Netbeans/mthree_Java/PracticeProgramming/DVDLibrary/dvd1.txt";
          
        for (Dvd currentDvd : save) {
            dvdInfo += String.format("%s,%s,%s,%s,%s,%s",
              currentDvd.getTitle(),
              currentDvd.getReleaseDate(),
              currentDvd.getMpaaRating(),
              currentDvd.getDirectorName(),
              currentDvd.getStudio(),
              currentDvd.getUserRating()
              
        );
            dvdInfo += "\n";
           // System.out.println(dvdInfo);
                
        }
          try {
                FileWriter fos = new FileWriter(fileName);
                PrintWriter pw = new PrintWriter(fos);
                
                pw.println(dvdInfo);
                pw.close();
            } catch (IOException ex) {
                Logger.getLogger(DvdDaoFileImpl.class.getName()).log(Level.SEVERE, null, ex);
                return "Data save failed!";
            }
   
    
        return "Data Saved";
    }

    @Override
    public String loadFile() {
        BufferedReader br = null;
        String fileName ="/Users/fer/Documents/Netbeans/mthree_Java/PracticeProgramming/DVDLibrary/dvd1.txt";
        
        try {
  
           // create file object
            File file = new File(fileName);
  
            // create BufferedReader object from the File
            br = new BufferedReader(new FileReader(file));
            
            String line = null;
  
            // read file line by line
            while ((line = br.readLine()) != null) {
  
                // split the line by :
                String[] parts = line.split(",");
                
             
                String title = parts[0].trim();
                String releaseDate = parts[1].trim();
                String mpaaRating = parts[2].trim();
                String directorName = parts[3].trim();
                String studio = parts[4].trim();
                String userRating = parts[5].trim();
                
                System.out.println("DVD Title:" + title + " Release Date:" +releaseDate+ " MPAA Rating: "+ mpaaRating+ " Director's Name: "+directorName + " Studio: " +studio + " User Rating: "+userRating);
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
  
       return "file";
    }

    

    
}
