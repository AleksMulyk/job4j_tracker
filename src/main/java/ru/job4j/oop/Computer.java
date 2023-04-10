package ru.job4j.oop;

public class Computer {
    private boolean multiMonitor;
    private int ssd;
    private String cpu;

    public Computer(boolean multiMonitor, int ssd, String cpu) {
        this.multiMonitor = multiMonitor;
        this.ssd = ssd;
        this.cpu = cpu;
    }

    public Computer() {
    }

    public void printInfo() {
        System.out.println("A lot monitors: " + multiMonitor);
        System.out.println("SSD: " + ssd + " GB");
        System.out.println("Model CPU: " + cpu);
    }

    public static void main(String[] args) {
        Computer computer = new Computer(true, 500, "Intel Core I7-10700K");
        computer.printInfo();
        Computer comp = new Computer(true, 256, "AMD Ryzen 5 3600");
        comp.printInfo();
        Computer third = new Computer();
        third.printInfo();
    }
}
