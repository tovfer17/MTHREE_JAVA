/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DVDCollection.controller;

import DVDCollection.dao.DvdDao;
import DVDCollection.dao.DvdDaoFileImpl;
import DVDCollection.dto.Dvd;
import DVDCollection.dto.DvdView;
import java.util.List;

/**
 *
 * @author fer
 */
public class DvdController {
   private DvdView view = new DvdView();
   private DvdDao dao = new DvdDaoFileImpl();

    public void run() {
        boolean keepGoing = true;
        int menuSelection = 0;

        while (keepGoing) {

           menuSelection = getMenuSelection();
           

            switch (menuSelection) {
                case 1:
                    listDvds();
                    break;
                case 2:
                    addDvd();
                    break;
                case 3:
                    viewDvd();
                    break;
                case 4:
                     removeDvd();
                    break;
                case 5:
                     editDvd();
                    break;
                case 6:
                     searchTitle();
                     break;
                case 7:
                     loadFile();
                     break;
                case 8:
                      saveFile();
                      break;
                case 9:
                     int timesSelection = getTimesSelection();
                     int smallSelection = getSmallMenuSelection();
                      switch(smallSelection){
                          case 1:
                              for (int i=0; i<timesSelection ; i++){
                                    addDvd();
                              }
                            break;
                          case 2:
                             for (int i=0; i<timesSelection ; i++){
                                    editDvd();
                              }
                             break;
                          case 3:
                             for (int i=0; i<timesSelection ; i++){
                                    removeDvd();
                              }
                      
                      }
                      break;
                case 10:
                    keepGoing = false;
                    break;
                default:
                    unknownCommand();
            }

        }
     
        exitMessage();
    }
    private int getMenuSelection() {
        return view.printMenuAndGetSelection();
    }
    private int getTimesSelection(){
       return view.timesMenuAndGetSelection();
    }
    private int getSmallMenuSelection(){
        return view.manyMenuAndGetSelection();
    }

    private void addDvd() {
    view.displayAddDvdBanner();
    Dvd newDvd = view.getNewDvdInfo();
    dao.addDvd(newDvd.getTitle(), newDvd);
    view.displayCreateSuccessBanner();
 
    }
    
    private void listDvds() {
    view.displayAllBanner();
    List<Dvd> dvdList = dao.getAllDvds();
    view.displayDvdList(dvdList);
    
    
    }
    private void viewDvd() {
    view.displayDvdBanner();
    String title = view.getTitleChoice();
    Dvd dvd = dao.getDvd(title);
    view.displayDvd(dvd);
    }
    private void removeDvd() {
    view.displayRemoveDvdBanner();
    String title = view.getTitleChoice();
    Dvd removedDvd = dao.removeDvd(title);
    view.displayRemoveResult(removedDvd);
    }
    private void editDvd(){
    view.displayEditDvdBanner();
    Dvd newDvd = view.getNewDvdInfo();
    dao.editDvd(newDvd.getTitle(), newDvd);
    view.displayEditedResult(newDvd);
    
    }
    private void searchTitle(){
    view.displaySearchDvdBanner(); 
    String title = view.getTitleChoice();
    Dvd dvd= dao.getDvd(title);
    List<Dvd> dvdList = dao.getAllDvds();
    view.displaySearchResult(dvdList, dvd);
    
    }
    private void loadFile(){
        String result = dao.loadFile();
      view.displayLoadFileResults(result);
      
    }
     private void saveFile(){
        List<Dvd> dvdList = dao.getAllDvds();
        String result = dao.saveFile(dvdList);
        view.displaySaveFileResults(result);
     }
    private void unknownCommand() {
    view.displayUnknownCommandBanner();
    }

    private void exitMessage() {
    view.displayExitBanner();
    }
}
