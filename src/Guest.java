public class Guest
{
    private String name;
    private int durationOfStay;

    public Guest() {}

    public Guest(String name, int durationOfStay)
    {
        this.name = name;
        this.durationOfStay = durationOfStay;
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
