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

    public void setWage(double wage)
    {
        this.wage = wage;
    }

    public void greet()
    {
        System.out.printf("Hello, my name is %s. I have worked here for %d days.\n", name, daysWorked);
    }

    public void work()
    {
        int hours = (int)(Math.random() * 5) + 5;

        daysWorked++;
        money += wage * hours;
    }

    @Override
    public String toString()
    {
        return String.format("Staff name:     %s\nWage:           %.2f\nDollars Earned: %.2f\nDays Worked:    %d", name, wage, money, daysWorked);
    }
}
