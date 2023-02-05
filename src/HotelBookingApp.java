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

        UserInput userInput = new UserInput();

        Scanner scannerInt = new Scanner(System.in);
        Scanner scannerString = new Scanner(System.in);

        System.out.println("Please enter the information below: " + "\nNumber of booking people?");
        userInput.setNumberPeople(scannerInt.nextInt());

        System.out.println("How many days you stay?");
        userInput.setDays(scannerInt.nextInt());

        System.out.println("What name can we register your booking?");
        userInput.setName(scannerString.nextLine());

        System.out.println("Which room would you like to choose?(Standard/King/Superior)");
        userInput.setRoomType(scannerString.nextLine());

        System.out.println("Do you need extra bed?(Y/N)");
        String extraBedInput = scannerString.nextLine();

        if (extraBedInput.equalsIgnoreCase("Y")) {
            userInput.setExtraBed(true);
        }

        System.out.println("Do you want breakfast?(Y/N)");
        String breakfastInput = scannerString.nextLine();

        if (breakfastInput.equalsIgnoreCase("Y")) {
            userInput.setBreakfast(true);
        }

        BookingService bookingService = new BookingService();
        bookingService.newBooking(userInput);
        bookingService.WriteDataToFile(userInput);
    }
}
