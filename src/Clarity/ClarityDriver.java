package Clarity;

public class ClarityDriver
{
    public static void main(String[] args)
    {
        Person person = new Person();

        // attributes can be set in any order
        person.setHeight(170);
        person.setName("Robin");
        person.setWeight(55);
        person.setAge(18);

        // methods can be called in any order
        person.greet();
        person.passTime();
        person.greet();
        person.passTime();
        person.passTime();
        person.greet();
    }
}
