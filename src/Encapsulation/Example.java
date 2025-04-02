package Encapsulation;

public class Example
{
    private String readable;
    private String writable;
    private String fullAccess;

    Example()
    {
        readable   = "You can read this, but can't update it";
        writable   = "You can update this, but can't read it";
        fullAccess = "You can do whatever to this one!";
    }

    String getReadable()
    {
        return readable;
    }

    void setWritable(String writable)
    {
        this.writable = writable;
    }

    String getFullAccess()
    {
        return fullAccess;
    }

    void setFullAccess(String fullAccess)
    {
        this.fullAccess = fullAccess;
    }
}
