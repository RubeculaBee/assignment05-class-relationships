public class OOP_ClassRelationship_Inheritance_IS_A_RobinLane
{
    public static void main(String[] args)
    {
        rectangleTest();
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
