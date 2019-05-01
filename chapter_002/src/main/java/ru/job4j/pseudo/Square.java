package ru.job4j.pseudo;

public class Square implements Shape {

    @Override
    public String draw() {
        StringBuilder pic = new StringBuilder();
        pic.append(" ---- ").append(System.lineSeparator());
        pic.append("|    |").append(System.lineSeparator());
        pic.append("|    |").append(System.lineSeparator());
        pic.append(" ---- ");
        return pic.toString();
    }
}
