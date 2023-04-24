package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void main(String[] args) {
        Item item1 = new Item();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        String currentDateTimeFormat = item1.getCreated().format(formatter);
        System.out.println(currentDateTimeFormat);
        Item item2 = new Item(2, "Bugs");
        System.out.println(item2);
    }
}
