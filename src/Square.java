public class Square extends Rectangle
{
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
        return String.format("This Rectangle:\n - Side Length: %.2f\n - Area: %.2f\n - Perimeter: %.2f", this.getWidth(), this.getArea(), this.getPerimeter());
    }
}
