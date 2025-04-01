package Cohesion;
import java.awt.Color;

public class Apple
{
    private double volume; // size of the apple in cubic centimeters
    private Color color;   // the color of the apples skin

    Apple()
    {
        this.volume = 100.0;
        this.color = Color.RED;
    }

    Apple(double volume, Color color)
    {
        this.volume = volume;
        this.color = color;
    }

    double getVolume()
    {
        return volume;
    }

    double getWeight()
    {
        return volume*2;
    }

    @Override
    public String toString()
    {
        return String.format("""
                The volume of this apple is: %.2f
                The weight of this apple is: %.2f
                The colour of this apple is: \033[38;2;%d;%d;%dm%s\033[0m
                """, volume, getWeight(), color.getRed(), color.getGreen(), color.getBlue(), color.toString());
    }
}
