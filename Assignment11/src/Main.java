
public class Main {
    public static void main(String[] args) {
        // create some example rooms
        Room room1 = new Room(100, RoomType.SINGLE, 150.0);
        Room room2 = new Room(101, RoomType.DOUBLE, 250.0);
        Room room3 = new Room(102, RoomType.SUITE, 500.0);

        // create an example hotel and add example rooms
        Hotel hotel = new Hotel();
        hotel.addRoom(room1);
        hotel.addRoom(room2);
        hotel.addRoom(room3);

        // create customers
        Customer customer1 = new Customer("Walter White", "G15", "walter@gmail.com", "406 Negra Arroyo Lane", "Credit");
        Customer customer2 = new Customer("Milly James", "O18", "milly@gmail.com", "123 Avenue", "Debit");
        Customer customer3 = new Customer("Saul Goodman", "BCS", "505-503-4455", "Day Spa and Nail(salon)", "Cash");

        // add customers to the hotel list
        hotel.addCustomer(customer1);
        hotel.addCustomer(customer2);
        hotel.addCustomer(customer3);

        // add staff members to the hotel
        Staff staff1 = new Staff("Gus", "G47", "gus@hotel.com", "Manager");
        Staff staff2 = new Staff("Mike", "O76", "mike@hotel.com", "Receptionist");

        // print customer details
        customer1.displayDetails();
        customer2.displayDetails();
        customer3.displayDetails();

        // customer makes a reservation
        customer1.makeReservation(room1);
        customer2.makeReservation(room2);
        customer3.makeReservation(room3);

        // customer checks in
        staff1.checkInCustomer(customer1, room1);
        staff2.checkInCustomer(customer2, room2);
        staff2.checkInCustomer(customer3, room3);

        // customer checks out
        staff1.checkOutCustomer(customer1, room1);
        staff2.checkOutCustomer(customer2, room2);
        staff1.checkOutCustomer(customer3, room3);

        // customer pays
        Payment payment1 = new Payment(room1.getPricePerNight());
        payment1.processPayment(room1.getPricePerNight());
        
        // customer makes a reservation and prints the details
        Reservation reservation = new Reservation(customer1, room1, "2025-03-22", "2025-03-25");
        reservation.printReservationDetails();
    }
}