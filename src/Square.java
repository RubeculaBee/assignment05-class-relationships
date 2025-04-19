/*********************************************************************************
 *
 * File: Square.java
 * By: Robin Lane
 * Date: 04-18-2025
 *
 * Description: Represents a basic Square. A square IS A Rectangle and IS A Shape.
 *              Width and height are the same. Area and perimeter defined using
 *              side length
 *
 *********************************************************************************/

public class Square extends Rectangle
{
    public Square() {}

    public Square(double sideLength)
    {
        super(sideLength, sideLength);
    }

    public void setSize(double sideLength)
    {
        super.setSize(sideLength, sideLength);
    }

    @Override
    public String toString()
    {
        return String.format("This Square:\n - Side Length: %.2f\n - Area: %.2f\n - Perimeter: %.2f", this.getWidth(), this.getArea(), this.getPerimeter());
    }
}
