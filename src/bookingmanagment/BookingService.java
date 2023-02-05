package bookingmanagment;


import rooms.KingRoom;
import rooms.StandardRoom;
import rooms.SuperiorRoom;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;

public class BookingService implements BookingInterface {
    int breakfast = 4500;
    int extraBed = 3000;
    int bookingCost;
    int roomPrice;

    @Override
    public void newBooking(UserInput userInput) {

        if (userInput.roomType.equalsIgnoreCase("Standard")) {

            if (userInput.extraBed && !userInput.breakfast) {
                StandardRoom standardRoom = new StandardRoom(true);
                roomPrice = standardRoom.calculateRoomPrice() + (extraBed * userInput.days);
                System.out.println("Room price: " + roomPrice);

                Booking booking = new Booking(roomPrice, userInput.numberPeople, userInput.days, userInput.name);

                bookingCost = booking.getTotalCost();

                System.out.println("\nBooking cost: " + bookingCost);
                System.out.println("\nRegistered Data: " + userInput);

            } else if (!userInput.extraBed && !userInput.breakfast) {
                StandardRoom standardRoom = new StandardRoom(false);
                roomPrice = standardRoom.calculateRoomPrice();
                System.out.println("Room price: " + roomPrice);

                Booking booking = new Booking(roomPrice, userInput.numberPeople, userInput.days, userInput.name);

                bookingCost = booking.getTotalCost();

                System.out.println("\nBooking cost: " + bookingCost);
                System.out.println("\nRegistered Data: " + userInput);

            } else if (userInput.extraBed && userInput.breakfast) {
                StandardRoom standardRoom = new StandardRoom(true);
                roomPrice = standardRoom.calculateRoomPrice() + (extraBed * userInput.days) + (breakfast * userInput.numberPeople);
                System.out.println("Room price: " + roomPrice);

                Booking booking = new Booking(roomPrice, userInput.numberPeople, userInput.days, userInput.name);

                bookingCost = booking.getTotalCost();

                System.out.println("\nBooking cost: " + bookingCost);
                System.out.println("\nRegistered Data: " + userInput);

            } else if (!userInput.extraBed && userInput.breakfast) {
                StandardRoom standardRoom = new StandardRoom(false);
                roomPrice = standardRoom.calculateRoomPrice() + (breakfast * userInput.numberPeople);
                System.out.println("Room price: " + roomPrice);

                Booking booking = new Booking(roomPrice, userInput.numberPeople, userInput.days, userInput.name);

                bookingCost = booking.getTotalCost();

                System.out.println("\nBooking cost: " + bookingCost);
                System.out.println("\nRegistered Data: " + userInput);
            }

        } else if (userInput.roomType.equalsIgnoreCase("King")) {

            if (userInput.extraBed && !userInput.breakfast) {
                KingRoom kingroom = new KingRoom(true, 11000);
                roomPrice = kingroom.calculateRoomPrice() + (extraBed * userInput.days);
                System.out.println("Room price: " + roomPrice);

                Booking booking = new Booking(roomPrice, userInput.numberPeople, userInput.days, userInput.name);

                bookingCost = booking.getTotalCost();

                System.out.println("\nBooking cost: " + bookingCost);
                System.out.println("\nRegistered Data: " + userInput);

            } else if (!userInput.extraBed && !userInput.breakfast) {
                KingRoom kingRoom = new KingRoom(false, 11000);
                roomPrice = kingRoom.calculateRoomPrice();
                System.out.println("Room price: " + roomPrice);

                Booking booking = new Booking(roomPrice, userInput.numberPeople, userInput.days, userInput.name);

                bookingCost = booking.getTotalCost();

                System.out.println("\nBooking cost: " + bookingCost);
                System.out.println("\nRegistered Data: " + userInput);

            } else if (userInput.extraBed && userInput.breakfast) {
                KingRoom kingroom = new KingRoom(true, 11000);
                roomPrice = kingroom.calculateRoomPrice() + (extraBed * userInput.days) + (breakfast * userInput.numberPeople);
                System.out.println("Room price: " + roomPrice);

                Booking booking = new Booking(roomPrice, userInput.numberPeople, userInput.days, userInput.name);

                bookingCost = booking.getTotalCost();

                System.out.println("\nBooking cost: " + bookingCost);
                System.out.println("\nRegistered Data: " + userInput);

            } else if (!userInput.extraBed && userInput.breakfast) {
                KingRoom kingRoom = new KingRoom(false, 11000);
                roomPrice = kingRoom.calculateRoomPrice() + (breakfast * userInput.numberPeople);
                System.out.println("Room price: " + roomPrice);

                Booking booking = new Booking(roomPrice, userInput.numberPeople, userInput.days, userInput.name);

                bookingCost = booking.getTotalCost();

                System.out.println("\nBooking cost: " + bookingCost);
                System.out.println("\nRegistered Data: " + userInput);
            }

        } else if (userInput.roomType.equalsIgnoreCase("Superior")) {

            if (userInput.extraBed && !userInput.breakfast) {
                SuperiorRoom superiorRoom = new SuperiorRoom(true, 3500);
                roomPrice = superiorRoom.calculateRoomPrice() + (extraBed * userInput.days);
                System.out.println("Room price: " + roomPrice);

                Booking booking = new Booking(roomPrice, userInput.numberPeople, userInput.days, userInput.name);

                bookingCost = booking.getTotalCost();

                System.out.println("\nBooking cost: " + bookingCost);
                System.out.println("\nRegistered Data: " + userInput);

            } else if (!userInput.extraBed && !userInput.breakfast) {
                SuperiorRoom superiorRoom = new SuperiorRoom(false, 3500);
                roomPrice = superiorRoom.calculateRoomPrice();
                System.out.println("Room price: " + roomPrice);

                Booking booking = new Booking(roomPrice, userInput.numberPeople, userInput.days, userInput.name);

                bookingCost = booking.getTotalCost();

                System.out.println("\nBooking cost: " + bookingCost);
                System.out.println("\nRegistered Data: " + userInput);

            } else if (userInput.extraBed && userInput.breakfast) {
                SuperiorRoom superiorRoom = new SuperiorRoom(true, 3500);
                roomPrice = superiorRoom.calculateRoomPrice() + (extraBed * userInput.days) + (breakfast * userInput.numberPeople);
                System.out.println("Room price: " + roomPrice);

                Booking booking = new Booking(roomPrice, userInput.numberPeople, userInput.days, userInput.name);

                bookingCost = booking.getTotalCost();

                System.out.println("\nBooking cost: " + bookingCost);
                System.out.println("\nRegistered Data: " + userInput);

            } else if (!userInput.extraBed && userInput.breakfast) {
                SuperiorRoom superiorRoom = new SuperiorRoom(false, 3500);
                roomPrice = superiorRoom.calculateRoomPrice() + (breakfast * userInput.numberPeople);
                System.out.println("Room price: " + roomPrice);

                Booking booking = new Booking(roomPrice, userInput.numberPeople, userInput.days, userInput.name);

                bookingCost = booking.getTotalCost();

                System.out.println("\nBooking cost: " + bookingCost);
                System.out.println("\nRegistered Data: " + userInput);
            }
        }
    }

    public void WriteDataToFile(UserInput userInput) {
        LocalDate now = LocalDate.now();
        try {
            String content = "\nBooking cost: " + bookingCost + "\nRoom price: " + roomPrice + "\nRegistered Data: " + userInput;
            Files.write(Paths.get("src/resources/foglalási adatok-" + now + ".txt"), content.getBytes("UTF-8"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
