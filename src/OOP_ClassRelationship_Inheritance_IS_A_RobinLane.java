/*********************************************************************************
 *
 * File: OOP_ClassRelationship_Inheritance_IS_A_RobinLane.java
 * By: Robin Lane
 * Date: 04-18-2025
 *
 * Description:
 *
 *********************************************************************************/

public class OOP_ClassRelationship_Inheritance_IS_A_RobinLane
{
    public static void main(String[] args)
    {
        //rectangleTest();
        //squareTest();
        //circleTest();
        shapeTest();
    }

    static void shapeTest()
    {
        System.out.println("\n...           Creating Circle            ...");
        Circle myCircle = new Circle(6);
        System.out.println("\n...          Creating Rectangle          ...");
        Rectangle myRectangle = new Rectangle(5,10);
        System.out.println("\n...           Creating Square            ...");
        Square mySquare = new Square(4);

        System.out.println("\n...   Loading objects into Shape array   ...");
        Shape[] myShapes = new Shape[3];
        myShapes[0] = myCircle;
        myShapes[1] = myRectangle;
        myShapes[2] = mySquare;

        System.out.println("\n...   Printing shapes from Shape Array   ...");
        for(Shape shape : myShapes)
            System.out.println("\n"+shape);

        System.out.println("\n... Loading objects into Rectangle array ...");
        Rectangle[] myRectangles = new Rectangle[3];
        for(int i = 0; i < myShapes.length; i++)
            try{
                myRectangles[i] = (Rectangle) myShapes[i];
            }
            catch(Exception e){
                System.out.println("\033[31mErr: Attempted to load non-rectangle shape into Rectangle array\033[0m");
            }

        System.out.println("\n... Printing shapes from Rectangle Array ...");
        for(Shape shape : myRectangles)
            System.out.println("\n"+shape);
    }

    static void circleTest()
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
