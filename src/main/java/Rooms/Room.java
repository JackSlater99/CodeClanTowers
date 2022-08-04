package Rooms;

import Guests.Guest;

import java.util.ArrayList;

public abstract class Room {

    private RoomType roomType;
    private int capacity;
    private ArrayList<Guest> guestList;

    public Room(RoomType roomType) {
        this.roomType = roomType;
        this.guestList = new ArrayList<>();
    }

    public int getCapacity() {
        return this.roomType.getCapacity();
    }

    public RoomType getRoomType() {
        return this.roomType;
    }

    public int getGuestListSize() {
        return guestList.size();
    }

    public ArrayList<Guest> getGuestList() {
        return guestList;
    }

    public void addToGuestList(Guest guest){
        guestList.add(guest);
    }

    public void removeFromGuestList(Guest guest){
        guestList.remove(guest);
    }
}
