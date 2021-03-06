/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DVDCollection.dto;

import java.util.List;

/**
 *
 * @author fer
 */
public class DvdView {
    private UserIO io = new UserIOConsoleImpl();

    public int printMenuAndGetSelection() {
        io.print("Main Menu");
        io.print("1. show Dvd Collection");
        io.print("2. Add a Dvd");
        io.print("3. View a Dvd");
        io.print("4. Remove a Dvd");
        io.print("5. Edit an existing Dvd");
        io.print("6. search by title");
        io.print("7. load the dvd library from file");
        io.print("8. Save the dvd library back to file");
        io.print("9. add, edit, or delete many DVDs");
        io.print("10. Exit");

        return io.readInt("Please select from the above choices.", 1, 10);
    }
   
    public int timesMenuAndGetSelection(){
       return io.readInt("Please pick how many times you would like to complete the same action? ");
       
    }
    
    public int manyMenuAndGetSelection(){
       io.print("How many times do you want to add,edit, or delete?");
       io.print("1. Add mutiple DVDS");
       io.print("2. Edit mutiple DVDS");
       io.print("3. Remove mutiple DVDS");
       return io.readInt("Please select from the above choices.", 1, 3);
       
    }
    
    public Dvd getNewDvdInfo() {
    String title = io.readString("Please enter title");
    String releaseDate = io.readString("Please enter release date");
    String mpaaRating = io.readString("Please enter MPAA rating");
    String directorName = io.readString("Please enter Director's name");
    String studio = io.readString("Please enter Studio");
    String userRating = io.readString("Please enter User Rating");
    
    Dvd currentDvd = new Dvd(title);
    currentDvd.setReleaseDate(releaseDate);
    currentDvd.setMpaaRating(mpaaRating);
    currentDvd.setDirectorName(directorName);
    currentDvd.setStudio(studio );
    currentDvd.setUserRating(userRating);
    
    return currentDvd;
}
    public void displayAddDvdBanner() {
    io.print("=== Add DVD ===");
}
    public void displayCreateSuccessBanner() {
    io.readString(
            "DVD successfully added.  Please hit enter to continue");
}
    public void displayDvdList(List<Dvd> dvdList) {
    io.print("Here are all of the DVDs in your collection: ");
    for (Dvd currentDvd : dvdList) {
        String dvdInfo = String.format("#%s : %s,%s,%s,%s,%s",
              currentDvd.getTitle(),
              currentDvd.getReleaseDate(),
              currentDvd.getMpaaRating(),
              currentDvd.getDirectorName(),
              currentDvd.getStudio(),
              currentDvd.getUserRating()
        );
        io.print(dvdInfo);
    }
    io.readString("Please hit enter to continue.");
}
    public void displayAllBanner() {
    io.print("=== Show All DVDS ===");
}
    
    public void displayDvdBanner () {
    io.print("=== View DVD ===");
}

public String getTitleChoice() {
    return io.readString("Please enter the title of the movie.");
}

public void displayDvd(Dvd dvd) {
    if (dvd != null) {
        io.print("Here is the information about that DVD: ");
        io.print(dvd.getTitle());
        io.print(dvd.getReleaseDate());
        io.print(dvd.getMpaaRating());
        io.print(dvd.getDirectorName());
        io.print(dvd.getStudio());
        io.print(dvd.getUserRating());
        
        io.print("");
    } else {
        io.print("No such DVD.");
    }
    io.readString("Please hit enter to continue.");
}
public void displayRemoveDvdBanner () {
    io.print("=== Remove Dvd ===");
}

public void displayRemoveResult(Dvd dvdRecord) {
    if(dvdRecord != null){
      io.print("DVD successfully removed.");
    }else{
      io.print("No such DVD.");
    }
    io.readString("Please hit enter to continue.");
}

public void displayExitBanner() {
    io.print("Good Bye!!!");
}

public void displayUnknownCommandBanner() {
    io.print("Unknown Command!!!");
}

public void displayEditDvdBanner() {
    io.print("=== Edit DVD ===");
}

public void displayEditedResult(Dvd dvdRecord){
    if(dvdRecord != null){
      io.print("DVD successfully edited.");
    }else{
      io.print("No such DVD.");
    }
    io.readString("Please hit enter to continue.");

}

public void displaySearchDvdBanner() {
    io.print("=== Search DVD ===");
}
public void displaySearchResult(List<Dvd> dvdList,Dvd dvd){
     if (!(dvdList.contains(dvd))) {
                throw new IllegalArgumentException("There is no movie with that title: '" + dvd+ "'");
            }
     else{
         io.print("The DVD "+ dvd.getTitle() + " was found! ");
         displayDvd(dvd);
     }
    }

public void displaySaveFileResults(String result){
    io.print("=== Saved File Results, also check text file ===");
}

public void displayLoadFileResults(String result){
    io.print("=== Loaded File Results from text file ===");
}

    
}








