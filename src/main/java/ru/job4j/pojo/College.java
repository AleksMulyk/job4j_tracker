package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.setName("Mulyk Aleksandr");
        st1.setGroupID(2);
        st1.setDate(2003);
        System.out.println("Last and First name: " + st1.getName() + System.lineSeparator()
                + "Group: " + st1.getGroupID() + System.lineSeparator()
                + "Admission date: " + st1.getDate());
    }
}
