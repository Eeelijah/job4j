package ru.job4j.profession;

import java.util.Date;

public class Programmer extends Engineer {
    private String programmingLanguage;

    public Programmer(String name, String surname, String education, Date birthday, String programmingLanguage) {
        super(name, surname, education, birthday);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void fixBugs(Program program) {

    }
}
