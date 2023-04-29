package ru.job4j.poly;

public class Service {
    private Store store;

    public Service(Store store) {
        this.store = store;
    }

    public void add() {
        store.save("Petr Arsentev");
    }

    public static void main(String[] args) {
        FileStore store1 = new FileStore();
        MemStore store2 = new MemStore();
        Service service = new Service(store1);
        service.add();
        Service service2 = new Service(store2);
        service2.add();
        System.out.println(store1.read());
        System.out.println(store2.read());
    }
}
