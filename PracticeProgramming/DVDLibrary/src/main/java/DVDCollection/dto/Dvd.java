/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DVDCollection.dto;

/**
 *
 * @author fer
 */
public class Dvd {
    private String title;
    private String releaseDate;
    private String mpaaRating;
    private String directorName;
    private String studio;
    private String userRating;

    public Dvd(String title) {
        this.title = title;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getMpaaRating() {
        return mpaaRating;
    }

    public void setMpaaRating(String mpaaRating) {
        this.mpaaRating = mpaaRating;
    }
    public String getStudio() {
        return studio;
    }
    
    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }  
    public String getDirectorName() {
        return directorName;
    }
    
    public void setStudio(String studio) {
        this.studio = studio;
    }   

    public String getUserRating() {
        return userRating;
    }

    public void setUserRating(String userRating) {
        this.userRating = userRating;
    }   
    
    public String getTitle() {
        return title;
    }
}
