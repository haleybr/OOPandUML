public class Customer extends Person {
    private final String address;
    private final String paymentMethod;

    public Customer(String name, String id, String contactInfo, String address, String paymentMethod) {
        super(name, id, contactInfo);
        this.address = address;
        this.paymentMethod = paymentMethod;
    }
    public Customer(String name, String id, String contactInfo) {
        super(name, id, contactInfo);
        this.address = "Not provided";
        this.paymentMethod = "Not provided";
    }
    public void displayDetails() {
        System.out.println("Customer: " + name + ", ID: " + id + ", Contact: " + contactInfo);
    }
    public void makeReservation(Room room){
        System.out.println(name + " has reserved Room " + room.getRoomNumber() + " for $" + room.getPricePerNight());
    }
}
