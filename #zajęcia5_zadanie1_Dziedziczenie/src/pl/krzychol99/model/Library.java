package pl.krzychol99.model;

/**
 * Created by krzychol99 on 2017-01-12.
 */
public class Library {
    private String firstName;
    private String lastName;
    private String libraryID;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLibraryID() {
        return libraryID;
    }

    public void setLibraryID(String libraryID) {
        this.libraryID = libraryID;
    }

    public Library(String firstName, String lastName, String libraryID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.libraryID = libraryID;
    }
    public void showInfo(){
        System.out.println("FIRST NAME: " + firstName + "; LAST NAME: " + lastName + "; SCHOOL LIBRARY ID: " + libraryID + "; ");
    }
}
