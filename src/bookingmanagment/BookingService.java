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
    public void newBooking(ArrayList<String> newBooking) {

        if (newBooking.get(4).equalsIgnoreCase("Standard")) {

            if (newBooking.get(5).equalsIgnoreCase("Y") && newBooking.get(2).equalsIgnoreCase("N")) {
                StandardRoom standardRoom = new StandardRoom(true);
                roomPrice = standardRoom.calculateRoomPrice() + (extraBed * Integer.parseInt(newBooking.get(1)));
                System.out.println("Room price: " + roomPrice);

                Booking booking = new Booking(roomPrice, Integer.parseInt(newBooking.get(0)), Integer.parseInt(newBooking.get(1)), newBooking.get(3));

                bookingCost = booking.getTotalCost();

                System.out.println("\nBooking cost: " + bookingCost);
                System.out.println("\nRegistered Data: " + newBooking);

            } else if (newBooking.get(5).equalsIgnoreCase("N") && newBooking.get(2).equalsIgnoreCase("N")) {
                StandardRoom standardRoom = new StandardRoom(false);
                roomPrice = standardRoom.calculateRoomPrice();
                System.out.println("Room price: " + roomPrice);

                Booking booking = new Booking(roomPrice, Integer.parseInt(newBooking.get(0)), Integer.parseInt(newBooking.get(1)), newBooking.get(3));

                bookingCost = booking.getTotalCost();

                System.out.println("\nBooking cost: " + bookingCost);
                System.out.println("\nRegistered Data: " + newBooking);

            } else if (newBooking.get(5).equalsIgnoreCase("Y") && newBooking.get(2).equalsIgnoreCase("Y")) {

                StandardRoom standardRoom = new StandardRoom(true);
                roomPrice = standardRoom.calculateRoomPrice() + (extraBed * Integer.parseInt(newBooking.get(1))) + (breakfast * Integer.parseInt(newBooking.get(0)));
                System.out.println("Room price: " + roomPrice);

                Booking booking = new Booking(roomPrice, Integer.parseInt(newBooking.get(0)), Integer.parseInt(newBooking.get(1)), newBooking.get(3));

                bookingCost = booking.getTotalCost();

                System.out.println("\nBooking cost: " + bookingCost);
                System.out.println("\n Registered Data: " + newBooking);

            } else if (newBooking.get(5).equalsIgnoreCase("N") && newBooking.get(2).equalsIgnoreCase("Y")) {

                StandardRoom standardRoom = new StandardRoom(false);
                roomPrice = standardRoom.calculateRoomPrice() + (breakfast * Integer.parseInt(newBooking.get(0)));
                System.out.println("Room price: " + roomPrice);

                Booking booking = new Booking(roomPrice, Integer.parseInt(newBooking.get(0)), Integer.parseInt(newBooking.get(1)), newBooking.get(3));

                bookingCost = booking.getTotalCost();

                System.out.println("\nBooking cost: " + bookingCost);
                System.out.println("\nRegistered Data: " + newBooking);

            }
        } else if (newBooking.get(4).equalsIgnoreCase("King")) {

            if (newBooking.get(5).equalsIgnoreCase("Y") && newBooking.get(2).equalsIgnoreCase("N")) {
                KingRoom kingroom = new KingRoom(true, 11000);
                roomPrice = kingroom.calculateRoomPrice() + (extraBed * Integer.parseInt(newBooking.get(1)));
                System.out.println("Room price: " + roomPrice);

                Booking booking = new Booking(roomPrice, Integer.parseInt(newBooking.get(0)), Integer.parseInt(newBooking.get(1)), newBooking.get(3));

                bookingCost = booking.getTotalCost();

                System.out.println("\nBooking cost: " + bookingCost);
                System.out.println("\nRegistered Data: " + newBooking);

            } else if (newBooking.get(5).equalsIgnoreCase("N") && newBooking.get(2).equalsIgnoreCase("N")) {
                KingRoom kingRoom = new KingRoom(false, 11000);
                roomPrice = kingRoom.calculateRoomPrice();
                System.out.println("Room price: " + roomPrice);

                Booking booking = new Booking(roomPrice, Integer.parseInt(newBooking.get(0)), Integer.parseInt(newBooking.get(1)), newBooking.get(3));

                bookingCost = booking.getTotalCost();

                System.out.println("\nBooking cost: " + bookingCost);
                System.out.println("\nRegistered Data: " + newBooking);

            } else if (newBooking.get(5).equalsIgnoreCase("Y") && newBooking.get(2).equalsIgnoreCase("Y")) {
                KingRoom kingroom = new KingRoom(true, 11000);
                roomPrice = kingroom.calculateRoomPrice() + (extraBed * Integer.parseInt(newBooking.get(1)) + (breakfast * Integer.parseInt(newBooking.get(0))));
                System.out.println("Room price: " + roomPrice);

                Booking booking = new Booking(roomPrice, Integer.parseInt(newBooking.get(0)), Integer.parseInt(newBooking.get(1)), newBooking.get(3));

                bookingCost = booking.getTotalCost();

                System.out.println("\nBooking cost: " + bookingCost);
                System.out.println("\nRegistered Data: " + newBooking);

            } else if (newBooking.get(5).equalsIgnoreCase("N") && newBooking.get(2).equalsIgnoreCase("Y")) {
                KingRoom kingRoom = new KingRoom(false, 11000);
                roomPrice = kingRoom.calculateRoomPrice() + (breakfast * Integer.parseInt(newBooking.get(0)));
                System.out.println("Room price: " + roomPrice);

                Booking booking = new Booking(roomPrice, Integer.parseInt(newBooking.get(0)), Integer.parseInt(newBooking.get(1)), newBooking.get(3));

                bookingCost = booking.getTotalCost();

                System.out.println("\nBooking cost: " + bookingCost);
                System.out.println("\nRegistered Data: " + newBooking);
            }

        } else if (newBooking.get(4).equalsIgnoreCase("Superior")) {

            if (newBooking.get(5).equalsIgnoreCase("Y") && newBooking.get(2).equalsIgnoreCase("N")) {
                SuperiorRoom superiorRoom = new SuperiorRoom(true, 3500);
                roomPrice = superiorRoom.calculateRoomPrice() + (extraBed * Integer.parseInt(newBooking.get(1)));
                System.out.println("Room price: " + roomPrice);

                Booking booking = new Booking(roomPrice, Integer.parseInt(newBooking.get(0)), Integer.parseInt(newBooking.get(1)), newBooking.get(3));

                bookingCost = booking.getTotalCost();

                System.out.println("\nBooking cost: " + bookingCost);
                System.out.println("\nRegistered Data: " + newBooking);

            } else if (newBooking.get(5).equalsIgnoreCase("N") && newBooking.get(2).equalsIgnoreCase("N")) {
                SuperiorRoom superiorRoom = new SuperiorRoom(false, 3500);
                roomPrice = superiorRoom.calculateRoomPrice();
                System.out.println("Room price: " + roomPrice);

                Booking booking = new Booking(roomPrice, Integer.parseInt(newBooking.get(0)), Integer.parseInt(newBooking.get(1)), newBooking.get(3));

                bookingCost = booking.getTotalCost();

                System.out.println("\nBooking cost: " + bookingCost);
                System.out.println("\nRegistered Data: " + newBooking);

            } else if (newBooking.get(5).equalsIgnoreCase("Y") && newBooking.get(2).equalsIgnoreCase("Y")) {
                SuperiorRoom superiorRoom = new SuperiorRoom(true, 3500);
                roomPrice = superiorRoom.calculateRoomPrice() + (extraBed * Integer.parseInt(newBooking.get(1))) + (breakfast * Integer.parseInt(newBooking.get(0)));
                System.out.println("Room price: " + roomPrice);

                Booking booking = new Booking(roomPrice, Integer.parseInt(newBooking.get(0)), Integer.parseInt(newBooking.get(1)), newBooking.get(3));

                bookingCost = booking.getTotalCost();

                System.out.println("\nBooking cost: " + bookingCost);
                System.out.println("\nRegistered Data: " + newBooking);
            } else if (newBooking.get(5).equalsIgnoreCase("N") && newBooking.get(2).equalsIgnoreCase("Y")) {
                SuperiorRoom superiorRoom = new SuperiorRoom(false, 3500);
                roomPrice = superiorRoom.calculateRoomPrice() + (breakfast * Integer.parseInt(newBooking.get(0)));
                System.out.println("Room price: " + roomPrice);

                Booking booking = new Booking(roomPrice, Integer.parseInt(newBooking.get(0)), Integer.parseInt(newBooking.get(1)), newBooking.get(3));

                bookingCost = booking.getTotalCost();

                System.out.println("\nBooking cost: " + bookingCost);
                System.out.println("\nRegistered Data: " + newBooking);
            }
        }
    }

    public void WriteDataToFile(ArrayList<String> newBooking) {
        LocalDate now = LocalDate.now();
        try {
            String content = "\nBooking cost: " + bookingCost + "\nRoom price: " + roomPrice + "\nRegistered Data: " + newBooking;
            Files.write(Paths.get("src/resources/foglalási adatok-"+ now +".txt"), content.getBytes("UTF-8"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
