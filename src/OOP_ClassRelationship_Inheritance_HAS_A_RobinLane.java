public class OOP_ClassRelationship_Inheritance_HAS_A_RobinLane
{
    public static void main(String[] args)
    {
        guestTest();
        //roomTest();
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
        System.out.println("...   Stay test    ...");
        guest.stay();
        guest.stay();
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
