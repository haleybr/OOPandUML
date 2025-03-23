public class Room {
    private int roomNumber;
    private RoomType roomType;
    private double pricePerNight;
    private boolean isAvailable;

    public Room(int roomNumber, RoomType roomType, double pricePerNight) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.pricePerNight = pricePerNight;
        this.isAvailable = true;
    }

    public Room(int roomNumber, RoomType roomType) {
        this(roomNumber, roomType, 100.0);
    }
    public void bookRoom() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Room " + roomNumber + " booked.");
        } else {
            System.out.println("Room " + roomNumber + " is unavailable.");
        }
    }
    public void checkoutRoom() {
        isAvailable = true;
        System.out.println("Room " + roomNumber + " is available");
    }
    public boolean isAvailable() {
        return isAvailable;
    }
    public double getPricePerNight() {
        return pricePerNight;
    }
    public int getRoomNumber() {
        return roomNumber;
    }
}
