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
      //private UserIO io = new UserIOConsoleImpl();
      
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
                    keepGoing = false;
                    break;
                default:
                    unknownCommand();
            }

        }
        //io.print("GOOD BYE");
        exitMessage();
    }
    private int getMenuSelection() {
        return view.printMenuAndGetSelection();
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
    private void unknownCommand() {
    view.displayUnknownCommandBanner();
}

    private void exitMessage() {
    view.displayExitBanner();
}
}
