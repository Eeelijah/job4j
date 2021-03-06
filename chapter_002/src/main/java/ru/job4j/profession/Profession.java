package ru.job4j.profession;

import java.util.Date;

public abstract class Profession {
    private String name;
    private String surname;
    private String education;
    private Date birthday;

    public Profession(String name, String surname, String education, Date birthday) {
        this.name = name;
        this.surname = surname;
        this.education = education;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEducation() {
        return education;
    }

    public Date getBirthday() {
        return birthday;
    }
}
