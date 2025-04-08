import java.util.ArrayList;

public class Hotel
{
    private String name;
    private ArrayList<Room> rooms;
    private ArrayList<Guest> guests;
    private ArrayList<Staff> staff;

    public Hotel()
    {
        rooms = new ArrayList<>();
        guests = new ArrayList<>();
        staff = new ArrayList<>();
    }

    public Hotel(String name)
    {
        this.name = name;
        rooms = new ArrayList<>();
        guests = new ArrayList<>();
        staff = new ArrayList<>();
    }

    public String getName()
    {
        return name;
    }

    public Room getRoom(int index)
    {
        return rooms.get(index);
    }

    public Guest getGuest(int index)
    {
        return guests.get(index);
    }

    public Staff getStaff(int index)
    {
        return staff.get(index);
    }

    @Override
    public String toString()
    {
        return String.format("Welcome to the %s Hotel! We have %d staff member(s) serving %d guests in %d rooms", name, staff.size(), guests.size(), rooms.size());
    }
}
