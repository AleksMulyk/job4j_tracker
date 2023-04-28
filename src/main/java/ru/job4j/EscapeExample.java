package ru.job4j;

public class EscapeExample {
    public static void main(String[] args) {
        String str = "I am learning at \"Job4j\" character escaping";
        System.out.println(str);
        char escape = '\"';
        System.out.println(escape);
        System.out.println('\'');
        str = "I am learning at 'Job4j' character escaping";
        System.out.println(str);
        str = "C:\\projects\\job4j\\File.java";
        System.out.println(str);
        System.out.print("Old long text\r");
        System.out.println("New text");
        System.out.print("First row\nSecond row\n");
        System.out.println("No tab");
        System.out.println("\tOne tab");
        System.out.println("\t\tTwo tab");
        System.out.println("Job4jjj\b\b");
    }
}
