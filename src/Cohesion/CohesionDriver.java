package Cohesion;

import java.awt.Color;

public class CohesionDriver
{
    public static void main(String[] args)
    {
        Orange[] oranges = new Orange[3];
        Apple[] apples = new Apple[3];

        oranges[0] = new Orange();
        oranges[1] = new Orange(120, 2);
        oranges[2] = new Orange(60, 0);

        apples[0] = new Apple();
        apples[1] = new Apple(150, Color.green);
        apples[2] = new Apple(80, Color.yellow);

        System.out.println("----- ORANGES LIST -----");
        System.out.println("First  Orange:\n" + oranges[0]);
        System.out.println("Second Orange:\n" + oranges[1]);
        System.out.println("Third  Orange:" + oranges[2]);
        System.out.println("------------------------");
        System.out.println();
        System.out.println("----- APPLES  LIST -----");
        System.out.println("First   Apple:\n" + apples[0]);
        System.out.println("Second  Apple:\n" + apples[1]);
        System.out.println("Third   Apple:" + apples[2]);
        System.out.println("------------------------");
    }
}
