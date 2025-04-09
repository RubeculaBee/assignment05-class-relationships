public class Room
{
    private int number;
    private Guest[] guests;

    public Room() {}

    public Room(int number, int capacity)
    {
        this.number = number;
        this.guests = new Guest[capacity];
    }

    public int getNumber()
    {
        return number;
    }

    public Guest getGuest(int index)
    {
        if (index >= 0 && index < guests.length)
            return guests[index];

        System.out.println("Requested index outside of room capacity!");
        return null;
    }

    public void addGuest(Guest newGuest)
    {
        for(int i = 0; i < guests.length; i++)
            if(guests[i] == null)
            {
                guests[i] = newGuest;
                return;
            }

        System.out.println("Sorry, this room is full!");
    }

    @Override
    public String toString()
    {
        String output = String.format("Room Number: %d\nCapacity: %d\nGuest List:\n", number, guests.length);
        for (Guest g : guests)
            if (g != null)
            {
                output += "----------";
                output += g + "\n";
            }
        output += "----------";
        return output;
    }
}
