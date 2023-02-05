package bookingmanagment;

import rooms.AbstractRoom;
import rooms.SuperiorRoom;

public class Booking {
    private int roomPrice;
    private int person;
    private int days;
    private String bookingName;


    public Booking(int roomPrice, int person, int days, String bookingName) {
        this.roomPrice = roomPrice;
        this.person = person;
        this.days = days;
        this.bookingName = bookingName;
    }

    public int getTotalCost() {
        return roomPrice;
    }
}
