package ru.job4j.profession;

import java.util.Date;

public class Builder extends Engineer {
    private String category;

    public Builder(String name, String surname, String education, Date birthday, String category) {
        super(name, surname, education, birthday);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void build() {

    }
}
