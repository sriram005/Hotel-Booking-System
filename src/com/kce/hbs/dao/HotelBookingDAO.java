package com.kce.hbs.dao;

import java.util.Scanner;
import com.kce.hbs.bean.Room;

public class HotelBookingDAO {
    public static Room getBookingDetails() {
        int hotelId; // hotelId of the Hotel (generated using random() method )
        String name; // hotel name
        String location; // location of the hotel
        int roomNo; // room no that guest wants
        int guestCount; // total no of guest
        String guestName; // guest name (one who books the room)
        String check_in_date; // date of check-in to the hotel
        String check_out_date; // date of check out

        // Creating room referance to store details
        Room room = null;

        // Scanner for getting inputs
        Scanner sc = new Scanner(System.in);

        hotelId = (int) Math.random() * (5 - 1 + 1) + 1; // random number of three digits for hotel id
        System.out.println("Enter Hotel Name: ");
        name = sc.nextLine();
        System.out.println("Enter Location:");
        location = sc.nextLine();
        System.out.println("Enter Room no: ");
        roomNo = sc.nextInt();
        System.out.println("Enter Guest Count: ");
        guestCount = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Guest Name: ");
        guestName = sc.nextLine();
        System.out.println("Check In Date: ");
        check_in_date = sc.nextLine();
        System.out.println("Check Out Date: ");
        check_out_date = sc.nextLine();

        // Initialize the Room class fields with the Constructor
        room = new Room(hotelId, name, location, roomNo, guestCount, guestName, check_in_date, check_out_date);

        return room;
    }
}
