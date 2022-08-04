import Guests.Guest;
import Rooms.Bedroom;
import Rooms.ConferenceRoom;
import Rooms.RoomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom(RoomType.SMALLCONFERENCE, "Board Room");
    }

    @Test
    public void roomHasType() {
        assertEquals(RoomType.SMALLCONFERENCE, conferenceRoom.getRoomType());
    }

    @Test
    public void roomHasCapacity() {
        assertEquals(10, conferenceRoom.getCapacity());
    }

    @Test
    public void conferenceRoomStartsEmpty() {
        assertEquals(0, conferenceRoom.getGuestListSize());
    }

    @Test
    public void canAddGuestsToConferenceRoom() {
        Guest guest = new Guest("Jack");
        conferenceRoom.addToGuestList(guest);
        assertEquals(1, conferenceRoom.getGuestListSize());
    }

    @Test
    public void canRemoveGuestsToBedroom() {
        Guest guest = new Guest("Jack");
        conferenceRoom.addToGuestList(guest);
        conferenceRoom.removeFromGuestList(guest);
        assertEquals(0, conferenceRoom.getGuestListSize());
    }
}
