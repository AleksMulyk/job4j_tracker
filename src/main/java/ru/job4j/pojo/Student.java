package ru.job4j.pojo;

import java.time.LocalDateTime;

public class Student {
    private String name;
    private int groupID;
    private int date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroupID() {
        return groupID;
    }

    public void setGroupID(int groupID) {
        this.groupID = groupID;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int dateTime) {
        this.date = dateTime;
    }
}
