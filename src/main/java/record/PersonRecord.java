package record;

public record PersonRecord(String name, int age) {

   @Override
    public String toString() {
        return "Person{"
                + "name='" + name + '\''
                + ",age=" + age
                + '}';
    }
}