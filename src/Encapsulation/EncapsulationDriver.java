package Encapsulation;

public class EncapsulationDriver
{
    public static void main(String[] args)
    {
        Example example = new Example();

        System.out.println(example.getReadable());
        //System.out.println(example.getWriteable());  <-- err
        System.out.println(example.getFullAccess());

        //example.setReadable("New Readable!");  <-- err
        example.setWritable("New Writeable!");
        example.setFullAccess("New Full Access!");

        // See how they've changed!
        System.out.println(example.getReadable());
        System.out.println(example.getFullAccess());
    }
}
