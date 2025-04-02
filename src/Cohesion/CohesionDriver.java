package Cohesion;

import java.awt.Color;

public class CohesionDriver
{
    public static void main(String[] args)
    {
        Apple myRedApple = new Apple();
        Apple myGreenApple = new Apple(50, Color.green);

        System.out.println("Here's an example of the no-arg Apple constructor:\n" + myRedApple);

        System.out.println("Here's an example of the two-arg Apple constructor:\n" + myGreenApple);
    }
}
