public class Rectangle extends Shape
{
    private double width;
    private double height;

    public Rectangle(){}

    public Rectangle(double width, double height)
    {
        super(width * height, 2*(width + height));
        this.width = width;
        this.height = height;
    }

    public double getWidth()
    {
        return width;
    }

    public double getHeight()
    {
        return height;
    }

    public void setSize(double width, double height)
    {
        this.width = width;
        this.height = height;
        super.setArea(width * height);
        super.setPerimeter(2 * (width + height));
    }

    @Override
    public void setArea(double area)
    {
        double increase = area / this.getArea();

        setSize(this.width * Math.sqrt(increase), this.height * Math.sqrt(increase));
    }

    @Override
    public void setPerimeter(double perimeter)
    {
        double increase = perimeter / this.getPerimeter();

        setSize(this.width * increase, this.height * increase);
    }

    @Override
    public String toString()
    {
        return String.format("This Rectangle:\n - Width: %.2f\n - Height: %.2f\n - Area: %.2f\n - Perimeter: %.2f", width, height, this.getArea(), this.getPerimeter());
    }
}
