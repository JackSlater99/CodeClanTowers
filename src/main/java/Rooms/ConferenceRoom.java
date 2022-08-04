package Rooms;

public class ConferenceRoom extends Room{

    private RoomType roomType;
    private String roomName;

    public ConferenceRoom(RoomType roomType, String roomName) {
        super(roomType);
        this.roomName = roomName;
    }

    public String getRoomName() {
        return roomName;
    }
}
