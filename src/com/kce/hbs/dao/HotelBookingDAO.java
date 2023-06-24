package com.kce.hbs.dao;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;
import com.kce.hbs.bean.Room;
import com.kce.hbs.util.DBUtil;

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

    public static boolean update_Check_out_date() throws Exception {
        Scanner sc = new Scanner(System.in);
        // Getting hotel Id
        System.out.println("Enter your Hotel Id: ");
        int hotelId = sc.nextInt();
        // Getting Room No
        System.out.println("Enter your Room No: ");
        int roomNo = sc.nextInt();
        // Getting updated date
        System.out.println("Enetr the new Check out Date: ");
        String updatedDate = sc.nextLine();

        // Creating Connection to the Database
        Connection con = DBUtil.getConnection();
        Statement stmt = con.createStatement();
        String query = "UPDATE check_out_date = " + updatedDate + " where hotelId = " + hotelId + "and roomNo = "
                + roomNo;
        int n = stmt.executeUpdate(query);
        if (n == 1)
            return true;
        else
            return false;
    }
}
