package ru.job4j.profession;

import java.util.Date;

public class Dentist extends Doctor {
    private String speciality;

    public Dentist(String name, String surname, String education, Date birthday, String speciality) {
        super(name, surname, education, birthday);
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    public Diagnose healTeeth(Patient patient) {
        return null;
    }
}
