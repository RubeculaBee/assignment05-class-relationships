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

        if(!rooms.get(roomNumber).addGuest(guest))
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

    @Override
    public String toString()
    {
        return String.format("Welcome to the %s Hotel! We have %d staff member(s) serving %d guests in %d rooms", name, staff.size(), guests.size(), rooms.size());
    }
}
