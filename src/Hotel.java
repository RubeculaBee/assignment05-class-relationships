import java.util.ArrayList;

public class Hotel
{
    private String name;                                 // Name of the hotel
    private ArrayList<Room> rooms = new ArrayList<>();   // Rooms that exist in this hotel
    private ArrayList<Guest> guests = new ArrayList<>(); // Guests that are staying at this hotel
    private ArrayList<Staff> staff = new ArrayList<>();  // Staff that work at this hotel

    public Hotel() {}

    public Hotel(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public Room getRoom(int index)
    {
        return rooms.get(index);
    }

    public void addRoom(int capacity)
    {
        // Room numbers are assigned to room sequentially
        rooms.add(new Room(rooms.size()+1, capacity));
    }

    public Guest getGuest(int index)
    {
        return guests.get(index);
    }

    public void addGuest(Guest guest, int roomNumber)
    {
        guests.add(guest);

        // if the guest was not successfully added
        if(!rooms.get(roomNumber - 1).addGuest(guest))
            // remove that guest from the hotel
            guests.remove(guest);
    }

    public Staff getStaff(int index)
    {
        return staff.get(index);
    }

    public void addStaff(Staff staff)
    {
        this.staff.add(staff);
    }

    public void welcome()
    {
        System.out.printf("Welcome to the %s Hotel! We have %d staff member(s) serving %d guests in %d rooms\n", name, staff.size(), guests.size(), rooms.size());
    }

    public void passDay()
    {
        // each staff works
        for(Staff s : staff)
            s.work();

        // for each room
        for(Room r : rooms)
            // for each guest spot in that room
            // (can't use enhanced for loop since room's guest array is private)
            for(int i = 0; i < r.getCapacity(); i++)
            {
                Guest g = r.getGuest(i);
                // If the guest exists
                if(g != null)
                {
                    g.stay();

                    // If the guests duration has run out
                    if (g.getDurationOfStay() <= 0)
                    {
                        // guest leaves room and hotel
                        r.removeGuest(g);
                        this.guests.remove(g);
                    }
                }
            }
    }

    @Override
    public String toString()
    {
        String output = String.format("Hotel Name: %s\n", name);

        output += "Staff List:\n";
        for (Staff s : staff)
        {
            output += "----------\n";
            output += s + "\n";
        }
        output += "==========\n";

        output += "Guest List:\n";
        for (Guest g : guests)
        {
            output += "----------\n";
            output += g + "\n";
        }
        output += "==========\n";

        output += "Room List:\n";
        for (Room r : rooms)
        {
            output += "----------\n";
            output += r + "\n";
        }
        output += "==========";

        return output;
    }
}
