public class Reservation {
private final Customer customer;
private final Room room;
private final String checkInDate;
private final String checkOutDate;

public Reservation(Customer customer, Room room, String checkInDate, String checkOutDate) {
    this.customer = customer;
    this.room = room;
    this.checkInDate = checkInDate;
    this.checkOutDate =checkOutDate;
}
public void printReservationDetails() {
    System.out.println("Reservation for: " + customer.name);
    System.out.println("Room: " + room.getPricePerNight() + " per night");
    System.out.println("Checkin: " + checkInDate + ", Checkout: " + checkOutDate);
}   
}
