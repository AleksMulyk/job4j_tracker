package record;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person("Ivan", 30);
        System.out.println("Name: " + person.getName() + ", Age: " + person.getAge());
        System.out.println(person);
        PersonRecord record = new PersonRecord("Ivan", 30);
        System.out.println("Name: " + record.name() + ", Age: " + record.age());
        System.out.println(record);
        PersonRecord record1 = new PersonRecord("Ivan", 30);
        System.out.println(record.equals(record1));
        PersonRecord record2 = new PersonRecord("Ivan", 30);
        PersonRecord newRecord = new PersonRecord(record2.name(), 35);
        System.out.println(newRecord);
    }
}