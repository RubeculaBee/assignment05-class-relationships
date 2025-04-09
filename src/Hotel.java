import java.util.ArrayList;

public class Hotel
{
    private String name;
    private ArrayList<Room> rooms = new ArrayList<>();
    private ArrayList<Guest> guests = new ArrayList<>();
    private ArrayList<Staff> staff = new ArrayList<>();

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
        rooms.add(new Room(rooms.size()+1, capacity));
    }

    public Guest getGuest(int index)
    {
        return guests.get(index);
    }

    public void addGuest(Guest guest, int roomNumber)
    {
        guests.add(guest);

        if(!rooms.get(roomNumber - 1).addGuest(guest))
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
        for(Staff s : staff)
            s.work();

        for(Guest g : guests)
            g.stay();
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
