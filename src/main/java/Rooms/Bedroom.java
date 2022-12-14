package Rooms;

public class Bedroom extends Room {

    private RoomType roomType;
    private int roomNumber;

    public Bedroom(RoomType roomType, int roomNumber) {
        super(roomType);
        this.roomNumber = roomNumber;
    }

    public int getRoomNumber() {
        return roomNumber;
    }
}
