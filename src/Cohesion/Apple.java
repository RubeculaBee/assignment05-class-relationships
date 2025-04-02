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
        return volume * 2; // weight of an apple is twice it's volume and in grams. dont worry about the truthfulness of this conversion, its just an example
    }

    void bite()
    {
        System.out.println("*CHOMP*");
        this.volume -= 10;
    }

    /*
    Nonsensical method:
    void sayHi()
    {
        System.out.println("Hello! I'm an apple!")
    }
    */

    @Override
    public String toString()
    {
        return String.format("""
                The volume of this apple is: %6.2f cubic centimeters
                The weight of this apple is: %6.2f grams
                The colour of this apple is: \033[38;2;%d;%d;%dm■■■■■■\033[0m""", // ANSI rgb colour code to display the colour
                this.getVolume(), this.getWeight(), this.color.getRed(), this.color.getGreen(), this.color.getBlue());
    }
}
