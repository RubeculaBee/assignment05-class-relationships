public class OOP_ClassRelationship_Inheritance_IS_A_RobinLane
{
    public static void main(String[] args)
    {
        //rectangleTest();
        //squareTest();
        circleTest();
    }

    static  void circleTest()
    {
        System.out.println("\n...   Creating Circle (3)  ...");
        Circle myCircle = new Circle(3);

        System.out.println("\n...      toString Test     ...");
        System.out.println(myCircle);

        System.out.println("\n...   setRadius Test (6)   ...");
        myCircle.setRadius(6);
        System.out.println(myCircle);

        System.out.println("\n...    setArea Test (60)   ...");
        myCircle.setArea(60);
        System.out.println(myCircle);

        System.out.println("\n... setPerimeter Test (10) ...");
        myCircle.setPerimeter(10);
        System.out.println(myCircle);
    }

    static void squareTest()
    {
        System.out.println("\n...   Creating Square (5)  ...");
        Square mySquare = new Square(5);

        System.out.println("\n...      toString Test     ...");
        System.out.println(mySquare);

        System.out.println("\n...    setSize Test (15)   ...");
        mySquare.setSize(15);
        System.out.println(mySquare);

        System.out.println("\n...   setArea Test (111)   ...");
        mySquare.setArea(111);
        System.out.println(mySquare);

        System.out.println("\n... setPerimeter Test (57) ...");
        mySquare.setPerimeter(57);
        System.out.println(mySquare);
    }

    static void rectangleTest()
    {
        System.out.println("\n... Creating Rectangle (10, 25) ...");
        Rectangle myRect = new Rectangle(10, 25);

        System.out.println("\n...        toString Test        ...");
        System.out.println(myRect);

        System.out.println("\n...     setSize Test (30,6)     ...");
        myRect.setSize(30, 6);
        System.out.println(myRect);

        System.out.println("\n...      setArea Test (100)      ...");
        myRect.setArea(100);
        System.out.println(myRect);

        System.out.println("\n...    setPerimeter Test (60)    ...");
        myRect.setPerimeter(60);
        System.out.println(myRect);

    }
}
