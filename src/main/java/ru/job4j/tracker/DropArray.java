package ru.job4j.tracker;

import java.util.Arrays;

public class DropArray {
    public static void main(String[] args) {
        String[] names = {"Petr", null, "Ivan", "Stepan", null};
        String[] rsl = new String[names.length];
        int size = 0;
        for (int index = 0; index < names.length; index++) {
            if (names[index] != null) {
                rsl[size] = names[index];
                size++;
            }
        }
        rsl = Arrays.copyOf(rsl, size);
        for (int index = 0; index < rsl.length; index++) {
            System.out.println(rsl[index]);
        }
        String[] names1 = {"Petr", null, "Ivan", "Stepan", "Fedor"};
        System.arraycopy(names1, 2, names1, 1, 3);
        System.out.println(Arrays.toString(names1));
    }
}
