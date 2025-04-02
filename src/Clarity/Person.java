package Clarity;

public class Person
{
    private String name;
    private int age;     // age in years
    private int height;  // height in centimeters
    private int weight;  // weight in kilograms

    Person(){}

    Person(String name, int age, int height, int weight)
    {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    String getName(){return name;}
    void setName(String name){this.name = name;}

    int getAge(){return age;}
    void setAge(int age){this.age = age;}

    int getHeight(){return height;}
    void setHeight(int height){this.height = height;}

    int getWeight(){return weight;}
    void setWeight(int weight){this.weight = weight;}

    void greet()
    {
        System.out.printf("Hi, my name is %s, I am %d years old.\n", this.getName(), this.getAge());
    }

    void passTime()
    {
        int years = (int)(Math.random() * 5 + 1);
        System.out.printf("%d years have passed for %s.\n", years, this.getName());
        this.setAge(this.age + years);
    }
}
