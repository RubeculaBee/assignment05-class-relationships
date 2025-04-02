package Cohesion;

import java.awt.Color;

public class CohesionDriver
{
    public static void main(String[] args)
    {
        Orange thinOrange = new Orange();
        Orange thickOrange = new Orange(120, 2);
        Orange goneOrange = new Orange(60, 0);

        System.out.printf("First Orange:\n%s\n\nSecond Orange:\n%s\n\nThird Orange:\n%s\n\n", thinOrange, thickOrange, goneOrange);

        thinOrange.bite();
        System.out.println(thinOrange);

        thinOrange.peel();
        thinOrange.bite();
        System.out.println(thinOrange);
    }
}
