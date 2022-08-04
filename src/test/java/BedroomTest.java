import Guests.Guest;
import Rooms.Bedroom;
import Rooms.RoomType;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;

    @Before
    public void before(){
        bedroom = new Bedroom(RoomType.DOUBLE, 5);
    }

    @Test
    public void roomHasType() {
        assertEquals(RoomType.DOUBLE, bedroom.getRoomType());
    }

    @Test
    public void roomHasCapacity() {
        assertEquals(2, bedroom.getCapacity());
    }

    @Test
    public void roomHasNumber() {
        assertEquals(5, bedroom.getRoomNumber());
    }

    @Test
    public void bedroomStartsEmpty() {
        assertEquals(0, bedroom.getGuestListSize());
    }

    @Test
    public void canAddGuestsToBedroom() {
        Guest guest = new Guest("Jack");
        bedroom.addToGuestList(guest);
        assertEquals(1, bedroom.getGuestListSize());
    }

    @Test
    public void canRemoveGuestsToBedroom() {
        Guest guest = new Guest("Jack");
        bedroom.addToGuestList(guest);
        bedroom.removeFromGuestList(guest);
        assertEquals(0, bedroom.getGuestListSize());
    }

}
