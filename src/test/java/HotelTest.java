import Hotel.Hotel;
import Rooms.Bedroom;
import Rooms.ConferenceRoom;
import Rooms.RoomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    Hotel hotel;
    Bedroom bedroom;
    Bedroom bedroom1;
    ConferenceRoom conferenceRoom;

    @Before

    public void before() {
        hotel = new Hotel();
        bedroom = new Bedroom(RoomType.TRIPLE, 8);
        bedroom1 = new Bedroom(RoomType.FAMILY, 5);
        conferenceRoom = new ConferenceRoom(RoomType.LARGERCONFERENCE, "Executive Lounge");
    }

    @Test
    public void bedroomStartEmpty() {
        assertEquals(0 , hotel.getNumberOfBedrooms());
    }

    
    
    @Test
    public void hotelStartsWith0ConferenceRooms() {
        assertEquals(0, hotel.getNumberOfConferenceRooms());
    }
    
    @Test 
    public void canAddConferenceRooms() {
        hotel.addConferenceRoom(conferenceRoom);
        assertEquals(1, hotel.getNumberOfConferenceRooms());
    }
    
    @Test
    public void canAddBedRooms() {
        hotel.addBedroom(bedroom);
        assertEquals(1, hotel.getNumberOfBedrooms());
    }
}
