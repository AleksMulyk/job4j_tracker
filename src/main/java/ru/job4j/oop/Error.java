package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String massage;

    public Error() {
    }

    public Error(boolean active, int status, String massage) {
        this.active = active;
        this.status = status;
        this.massage = massage;
    }

    public void printinfo() {
        System.out.println("active " + active);
        System.out.println("status " + status);
        System.out.println("massage " + massage);
    }

    public static void main(String[] args) {
        Error error1 = new Error();
        Error error2 = new Error(true, 400, "HTTP 400 Bad request");
        Error error3 = new Error(true, 401, "HTTP 401 Unauthorized");
        Error error4 = new Error(true, 402, "HTTP 404 Not found");
        error1.printinfo();
        error2.printinfo();
        error3.printinfo();
        error4.printinfo();
    }

}
