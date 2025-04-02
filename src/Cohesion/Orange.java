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
        return this.volume * 1.5;
    }

    double getPeelThickness()
    {
        return this.peelThickness;
    }

    @Override
    public String toString()
    {
        String peelStatus = this.peelThickness > 0 ? String.format("%6.2f millimeters thick", this.peelThickness) : "gone";

        return String.format("""
                The volume of this orange is: %6.2f cubic centimeters
                The weight of this orange is: %6.2f grams
                The peel   of this orange is: %s""",
                this.getVolume(), this.getWeight(), peelStatus);
    }
}
