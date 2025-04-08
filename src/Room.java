public class Room
{
    private int number;
    private Guest[] guests;

    public Room()
    {
        this.guests = new Guest[2];
    }

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
        for(Guest g : guests)
            if(g == null)
            {
                g = newGuest;
                return;
            }

        System.out.println("Sorry, this room is full!");
    }
}
