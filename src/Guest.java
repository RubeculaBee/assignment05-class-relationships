public class Guest
{
    private String name;        // Guests name
    private int durationOfStay; // How long the guest will stay in the hotel in days

    public Guest() {}

    public Guest(String name, int durationOfStay)
    {
        this.name = name;
        this.durationOfStay = durationOfStay;
    }

    public String getName()
    {
        return name;
    }

    public int getDurationOfStay()
    {
        return durationOfStay;
    }

    public void greet()
    {
        System.out.printf("Hey there! I'm %s, and I'm a guest here. I'll be here another %d day(s).\n", name, durationOfStay);
    }

    public void stay()
    {
        durationOfStay--;
    }

    @Override
    public String toString()
    {
        return String.format("Guest name: %s\nDays left:  %d", name, durationOfStay);
    }
}
