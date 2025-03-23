import java.util.ArrayList;
import java.util.List;

public class Hotel {
private List<Room> rooms = new ArrayList<>();
private List<Customer> customers = new ArrayList<>();

public Hotel(){
    rooms = new ArrayList<>();
    customers = new ArrayList<>();
}

public Hotel(List<Room> rooms) {
    this.rooms = rooms;
    this.customers = new ArrayList<>();
}

public Hotel(List<Room> rooms, List<Customer> customers) {
    this.rooms = rooms;
    this.customers = customers;
}

public void addRoom(Room room) {
    rooms.add(room);
}
public void addCustomer(Customer customer){
    customers.add(customer);
}
public void checkInCustomer(Customer customer, Room room, String date) {
    if (room.isAvailable()) {
        room.bookRoom();
        System.out.println(customer.name + " has checked into room " + room.getPricePerNight() + " on " + date);
    } else {
        System.out.println(" Room " + room.getPricePerNight() + " is unavailable" );
    }
}

public void checkOutCustomer(Customer customer, Room room) {
    room.checkoutRoom();
    System.out.println(customer.name + " has checked out of room " + room.getPricePerNight());
}
}
