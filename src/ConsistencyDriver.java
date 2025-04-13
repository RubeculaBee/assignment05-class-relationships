/*********************************************************************************
 *
 * File: ConsistencyDriver.java
 * By: Robin Lane
 * Date: 04-01-2025
 *
 * Description: Driver to test Circle class.
 *              Demonstrates the guideline of Consistency.
 *
 *********************************************************************************/

public class ConsistencyDriver
{
    public static void main(String[] args)
    {
        Circle emptyCircle = new Circle();
        Circle definedCircle = new Circle(4);

        System.out.printf("No-arg   constructor circle has radius %.2f and area %.2f\n\n", emptyCircle.getRadius(), emptyCircle.getArea());

        System.out.printf("Argument constructor circle has radius %.2f and area %.2f", definedCircle.getRadius(), definedCircle.getArea());
    }
}
