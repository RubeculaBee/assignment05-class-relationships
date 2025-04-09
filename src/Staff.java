public class Staff
{
    private String name;
    private double wage;
    private double money;
    private int daysWorked;

    public Staff() {}

    public Staff(String name, double wage)
    {
        this.name = name;
        this.wage = wage;
    }

    public String getName()
    {
        return name;
    }

    public double getMoney()
    {
        return money;
    }

    public double getDaysWorked()
    {
        return daysWorked;
    }

    public void greet()
    {
        System.out.printf("Hello, my name is %s. I have worked here for %d days.\n", name, daysWorked);
    }

    public void work()
    {
        daysWorked++;
        money += wage;
    }

    @Override
    public String toString()
    {
        return String.format("This Worker:\nName: %s\nWage: %f\nDollars Earned: %f\n Days Worked: %d", name, wage, money, daysWorked);
    }
}
