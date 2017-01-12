package pl.krzychol99.model;

/**
 * Created by krzychol99 on 2017-01-12.
 */
public class Teacher extends Library{

    private String schoolSubject;

    public String getSchoolSubject() {
        return schoolSubject;
    }

    public void setSchoolSubject(String schoolSubject) {
        this.schoolSubject = schoolSubject;
    }

    public Teacher(String firstName, String lastName, String schoolSubject, String libraryID) {
        super(firstName,lastName,libraryID);
        this.schoolSubject = schoolSubject;
    }
    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("SHOOL SUBJECT: " + schoolSubject);
    }
}
