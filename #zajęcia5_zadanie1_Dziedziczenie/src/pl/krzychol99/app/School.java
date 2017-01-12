package pl.krzychol99.app;

import pl.krzychol99.model.Student;
import pl.krzychol99.model.Teacher;

/**
 * Created by krzychol99 on 2017-01-12.
 */
public class School {

    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Jan", "Nowak", "Biology", "22213");
        Student student1 = new Student("Tomasz", "Walasik", "34223", "22254");

        teacher1.showInfo();
        student1.showInfo();
    }
}
