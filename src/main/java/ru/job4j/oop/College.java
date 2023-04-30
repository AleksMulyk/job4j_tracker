package ru.job4j.oop;

public class College {
    public static void main(String[] args) {
        Freshman freshMan = new Freshman();
        Student student = freshMan;
        Object obj = student;
        System.out.println(obj);
    }
}
