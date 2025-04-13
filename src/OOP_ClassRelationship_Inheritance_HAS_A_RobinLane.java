/*********************************************************************************
 *
 * File: OOP_ClassRelationship_Inheritance_HAS_A_RobinLane.java
 * By: Robin Lane
 * Date: 04-10-2025
 *
 * Description: Driver class that tests each other class (Hotel, Room, Guest, Staff).
 *              demonstrates the HAS-A relationship between classes.
 *
 *********************************************************************************/

public class OOP_ClassRelationship_Inheritance_HAS_A_RobinLane
{
    public static void main(String[] args)
    {
        hotelTest();
        //staffTest();
        //guestTest();
        //roomTest();
    }

    static void hotelTest()
    {
        System.out.println("... Creating Hotel ...");
        Hotel myHotel = new Hotel("SF");

        System.out.println("... Creating Rooms ...");
        for(int i = 0; i < 3; i++)
            myHotel.addRoom(1+i);

        System.out.println("... Creating Staff ...");
        for(int i = 0; i < 6; i++)
            myHotel.addStaff(new Staff("S" + "y".repeat(i+1) + "dney", 16.5 - i));

        System.out.println("... Creating Guests ...");
        myHotel.addGuest(new Guest("Johny",2), 1);
        myHotel.addGuest(new Guest("Mary",14), 2);
        myHotel.addGuest(new Guest("Susan",14), 2);
        myHotel.addGuest(new Guest("Chris",5), 3);
        myHotel.addGuest(new Guest("Trisha",7), 3);
        myHotel.addGuest(new Guest("Barry",7), 3);

        System.out.println("... Welcome Test ...");
        myHotel.welcome();

        System.out.println("... toString Test ...");
        System.out.println(myHotel);

        System.out.println("... Passing 3 days ...");
        myHotel.passDay();
        myHotel.passDay();
        myHotel.passDay();

        System.out.println("... passDay test ...");
        System.out.println(myHotel);

        System.out.println("... Passing 3 days ...");
        myHotel.passDay();
        myHotel.passDay();
        myHotel.passDay();

        System.out.println("... passDay test ...");
        System.out.println(myHotel);

        System.out.println("... Passing 3 days ...");
        myHotel.passDay();
        myHotel.passDay();
        myHotel.passDay();

        System.out.println("... passDay test ...");
        System.out.println(myHotel);
    }

    static void staffTest()
    {
        System.out.println("... Creating staff ...");
        Staff staff = new Staff("Sara", 16.50);

        System.out.println("...   Greet Test   ...");
        staff.greet();

        System.out.println("... toString test  ...");
        System.out.println(staff);

        System.out.println("...    Working     ...");
        staff.work();
        staff.work();

        System.out.println("...   Work Test    ...");
        staff.greet();
        System.out.println(staff);
    }

    static void guestTest()
    {
        System.out.println("... Creating guest ...");
        Guest guest = new Guest("Mary", 4);

        System.out.println("...   Greet test   ...");
        guest.greet();

        System.out.println("... toString test  ...");
        System.out.println(guest);

        System.out.println("... Passing Days   ...");
        guest.stay();
        guest.stay();

        System.out.println("...   Stay test    ...");
        guest.greet();
        System.out.println(guest);
    }

    static void roomTest()
    {
        System.out.println("...  Creating guests ...");
        Guest guest1 = new Guest("Jeremy", 3);
        Guest guest2 = new Guest("Michael", 4);
        Guest guest3 = new Guest("John", 14);
        Guest guest4 = new Guest("Harry", 14);

        System.out.println("...  Creating rooms  ...");
        Room room1 = new Room(1, 2);
        Room room2 = new Room(2, 2);

        System.out.println("... Populating rooms ...");
        room1.addGuest(guest1);
        room1.addGuest(guest2);
        room2.addGuest(guest3);
        room2.addGuest(guest4);

        System.out.println("...Room overfill test...");
        room1.addGuest(guest3);

        System.out.println("...  getGuest test   ...");
        System.out.println("...  Room 1 Guest 2  ...");
        System.out.println(room1.getGuest(1));
        System.out.println("...  Room 2 Guest 1  ...");
        System.out.println(room2.getGuest(0));

        System.out.println("...Out of Bounds test...");
        System.out.println(room1.getGuest(2));

        System.out.println("...  toString test   ...");
        System.out.println(room1);
        System.out.println(room2);
    }
}
