package pl.krzychol99.model;

/**
 * Created by krzychol99 on 2017-01-12.
 */
public class Student extends Library{

    private String indexNumber;

    public String getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(String indexNumber) {
        this.indexNumber = indexNumber;
    }

    public Student(String firstName, String lastName, String indexNumber, String libraryID) {
        super(firstName,lastName,libraryID);
        this.indexNumber = indexNumber;
    }
    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("INDEX NO. - " + indexNumber);
    }
}

// Zastanów się jak można te klasy
//        połączyć relacją dziedziczenia – zdefiniuj dla nich dodatkową klasę bazową.
//        Na podstawie kodu z zajęć (Zoo) spróbuj wyeliminować w kodzie wszelkie powtarzalne
//        fragmenty kodu wykorzystując dziedziczenie oraz instrukcję super.