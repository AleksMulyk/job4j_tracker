package enumeration;

public class CarService {

    public static void main(String[] args) {
        Status toyota = Status.FINISHED;
        Status volvo = Status.WAITING;
        System.out.println(toyota);
        System.out.println(volvo);
        Order order = new Order(1, "Mercedes-Benz GLS", Status.IN_WORK);
        System.out.println("Order # " + order.getNumber() + " for car " + order.getCar()
                + ", fix status: " + order.getStatus().getInfo());
        Status[] statuses = Status.values();
                for (Status s: statuses) {
                    System.out.println("Status name: " + s.name() + ", count status number " + s.ordinal());
                }
        String accepted = "ACCEPTED";
        Status status = Status.valueOf(accepted);
        System.out.println(status);
        switch (status) {
            case ACCEPTED:
                System.out.println("Status: Car accepted to Car service");
                break;
            case IN_WORK:
                System.out.println("Status: Car is in work");
                break;
            case WAITING:
                System.out.println("Status: Car is waiting parts");
                break;
            case FINISHED:
                System.out.println("Status: Fix is finished");
                break;
            default:
        }
    }
}
