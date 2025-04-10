public class Room
{
    private int number;     // This rooms Room Number
    private int capacity;   // How many guests can be put in this room
    private Guest[] guests; // What guests are in this room

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
        // Guest number requested must be within the amount of guests that can be in the room
        if (index >= 0 && index < guests.length)
            return guests[index];

        // If guest number is outside the rooms capacity, return null
        System.out.println("Requested index outside of room capacity!");
        return null;
    }

    public boolean addGuest(Guest newGuest)
    {
        // For each spot a guest can occupy
        for(int i = 0; i < guests.length; i++)
            // If that spot is empty
            if(guests[i] == null)
            {
                // put the guest in that spot
                guests[i] = newGuest;
                // returns true if guest successfully assigned room
                return true;
            }

        // If there are no empty spots in room, return false
        System.out.println("Sorry, this room is full!");
        return false;
    }

    public void removeGuest(Guest guest)
    {
        // for each spot in the room
        for(int i = 0; i < guests.length; i++)
            // if that spot has the guest to be removed
            if(this.guests[i] == guest)
                // remove that guest
                this.guests[i] = null;
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
