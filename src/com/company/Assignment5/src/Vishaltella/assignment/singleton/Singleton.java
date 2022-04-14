package Vishaltella.assignment.singleton;

public class Singleton {
    public String str;
    public  static Singleton(String name)    // modifier static not allowed here
    {
        str=name;
        return new Singleton();     // incompatible types: unexpected return value
    }
    public static void print()
    {
        System.out.println(str);
    }
    //compilation error because non-static variable str cannot be referenced from a static context
}
