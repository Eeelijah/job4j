package ru.job4j.profession;

import java.util.Date;

public class Surgeon extends Doctor {
    private String classification;

    public Surgeon(String name, String surname, String education, Date birthday, String classification) {
        super(name, surname, education, birthday);
        this.classification = classification;
    }

    public String getClassification() {
        return classification;
    }

    public Diagnose doSurgery(Patient patient) {
        return null;
    }
}
