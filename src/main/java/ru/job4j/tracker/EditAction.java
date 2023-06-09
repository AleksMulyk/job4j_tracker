package ru.job4j.tracker;

public class EditAction implements UserAction {

    @Override
    public String name() {
        return "=== Edit item ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Edit item ===");
        int id = input.askInt("Enter id: ");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            System.out.println("Item is replaced successful.");
        } else {
            System.out.println("Error replaced item.");
        }
        return true;
    }
}
