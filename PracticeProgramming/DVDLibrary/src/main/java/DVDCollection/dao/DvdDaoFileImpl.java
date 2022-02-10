/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DVDCollection.dao;

import DVDCollection.dto.Dvd;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    
}
