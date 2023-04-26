package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("The Iron Heel", 320);
        Book book2 = new Book("The Grapes of Wrath", 608);
        Book book3 = new Book("For Whom the Bell Tolls", 480);
        Book book4 = new Book("Clean Code", 721);
        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        for (int i = 0; i < books.length; i++) {
            System.out.println("Name of Book: " + books[i].getName() + " - " + "Pages: " + books[i].getPageNumber());
        }
        System.out.println();
        Book pr = books[0];
        books[0] = books[3];
        books[3] = pr;
        for (int i = 0; i < books.length; i++) {
            System.out.println("Name of Book: " + books[i].getName() + " - " + "Pages: " + books[i].getPageNumber());
        }
        System.out.println();
        for (int i = 0; i < books.length; i++) {
            if ("Clean Code".equals(books[i].getName())) {
                System.out.println("Name of Book: " + books[i].getName() + " - "
                        + "Pages: " + books[i].getPageNumber());
            }
        }
    }
}
