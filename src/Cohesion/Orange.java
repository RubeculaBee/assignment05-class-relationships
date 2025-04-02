package Cohesion;

public class Orange
{
    private double volume;        // volume of the orange in cubic centimeters
    private double peelThickness; // thickness of the orange peel in millimeters

    Orange()
    {
        this.volume = 100.0;
        this.peelThickness = 1.0;
    }

    Orange(double volume, double peelThickness)
    {
        this.volume = volume;
        this.peelThickness = peelThickness;
    }

    double getVolume()
    {
        return this.volume;
    }

    double getWeight()
    {
        return this.volume * 1.5; // weight is in grams and is 1.5 times the volume
    }

    double getPeelThickness()
    {
        return this.peelThickness;
    }

    void peel()
    {
        // any peel thicker than 1.5 mm is hard to peel
        System.out.printf("Wow that was really %s to peel!\n", this.peelThickness > 1.5 ? "hard" : "easy");
        this.peelThickness = 0;
    }

    void bite()
    {
        if(this.peelThickness > 0)
            // cant bite into an orange with the peel on!
            System.out.println("Oof, that was all peel...");
        else
        {
            System.out.println("*CHOMP*");
            this.volume -= 20;
        }
    }

    /*
    Nonsensical method:
    void tellTime()
    {
        System.out.println("The current time is:" + time)
    }
    */

    @Override
    public String toString()
    {
        // If there is peel, print the peels thickness. otherwise say the peel is gone
        String peelStatus = this.peelThickness > 0 ? String.format("%6.2f millimeters thick", this.peelThickness) : "gone";

        return String.format("""
                The volume of this orange is: %6.2f cubic centimeters
                The weight of this orange is: %6.2f grams
                The peel   of this orange is: %s""",
                this.getVolume(), this.getWeight(), peelStatus);
    }
}
