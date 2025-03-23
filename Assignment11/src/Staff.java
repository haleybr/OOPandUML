public class Staff extends Person {
    private final String role;
    
    public Staff(String name, String id, String contactInfo, String role) {
        super(name, id, contactInfo);
        this.role = role;
    }
    public void displayDetails() {
        System.out.println("Staff: " + name + ", Role: " + role);
    }
    public void checkInCustomer(Customer customer, Room room) {
        System.out.println("Staff " + name + " checked in " + customer.name);
        room.bookRoom();
    }
    public void checkOutCustomer(Customer customer, Room room) {
        System.out.println("Staff " + name + " checked out " + customer.name);
        room.checkoutRoom();
    }
}
