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
        System.out.println("Hey there! I'm a guest here, and my name is " + name);
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
