public class Circle extends Shape
{
    private double radius;

    public Circle(){}

    public Circle(double radius)
    {
        super(Math.PI*radius*radius, 2*Math.PI*radius);
        this.radius = radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
        super.setArea(Math.PI*radius*radius);
        super.setPerimeter(2*Math.PI*radius);
    }

    @Override
    public void setArea(double area)
    {
        double increase = area / this.getArea();

        setRadius(increase * this.radius);
    }

    @Override
    public void setPerimeter(double perimeter)
    {
        double increase = perimeter / this.getPerimeter();

        setRadius(increase * this.radius);
    }

    @Override
    public String toString()
    {
        return String.format("This Circle:\n - Radius: %.2f\n - Area: %.2f\n - Circumference: %.2f", this.radius, this.getArea(), this.getPerimeter());
    }
}
