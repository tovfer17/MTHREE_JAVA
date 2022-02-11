/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DVDCollection.dao;

import DVDCollection.dto.Dvd;
import java.util.List;

/**
 *
 * @author fer
 */
public interface DvdDao {
   
    Dvd addDvd(String title, Dvd dvd);

   
    List<Dvd> getAllDvds();


    Dvd getDvd(String title);


    Dvd removeDvd(String title);
    
    Dvd editDvd(String title, Dvd dvd);
    

    
    String saveFile(List<Dvd> dvdList);
    
    String loadFile();


   

    
}
