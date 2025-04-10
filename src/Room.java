public class Room
{
    private int number;
    private int capacity;
    private Guest[] guests;

    public Room() {}

    public Room(int number, int capacity)
    {
        this.number = number;
        this.capacity = capacity;
        this.guests = new Guest[this.capacity];
    }

    public int getNumber()
    {
        return number;
    }

    public int getCapacity()
    {
        return capacity;
    }

    public Guest getGuest(int index)
    {
        if (index >= 0 && index < guests.length)
            return guests[index];

        System.out.println("Requested index outside of room capacity!");
        return null;
    }

    public boolean addGuest(Guest newGuest)
    {
        for(int i = 0; i < guests.length; i++)
            if(guests[i] == null)
            {
                guests[i] = newGuest;
                return true;
            }

        System.out.println("Sorry, this room is full!");
        return false;
    }

    @Override
    public String toString()
    {
        String output = String.format("Room Number: %d\nCapacity: %d\nGuest List:\n", number, guests.length);
        for (Guest g : guests)
            if (g != null)
            {
                output += "----------\n";
                output += g + "\n";
            }
        output += "----------";
        return output;
    }
}
