import bookingmanagment.Booking;
import bookingmanagment.BookingService;
import bookingmanagment.UserInput;
import rooms.AbstractRoom;
import rooms.KingRoom;
import rooms.StandardRoom;
import rooms.SuperiorRoom;

import java.util.ArrayList;
import java.util.Scanner;

public class HotelBookingApp {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        ArrayList<String> userList = new ArrayList<>();

        System.out.println("Please enter the information below: " + "\nNumber of booking people?" );

        String numberPeople = scanner.nextLine();
        userList.add(numberPeople);

        System.out.println("How many days you stay?" );
        String days = scanner.nextLine();
        userList.add(days);

        System.out.println("Do you want breakfast? (Y/N)" );
        String breakfast = scanner.nextLine();
        userList.add(breakfast);

        System.out.println("What name can we register your booking?" );
        String name = scanner.nextLine();
        userList.add(name);

        System.out.println("Which room would you like to choose?(Standard/King/Superior)" );
        String roomType = scanner.nextLine();
        userList.add(roomType);

        System.out.println("Do you need extra bed?(Y/N)" );
        String extraBed = scanner.nextLine();
        userList.add(extraBed);

        BookingService bookingService = new BookingService();
        bookingService.newBooking(userList);
        bookingService.WriteDataToFile(userList);
    }
}
