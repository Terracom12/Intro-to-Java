import java.io.Console;

public class CallingMethodsInSameClass
{
    public CallingMethodsInSameClass()
    {
        printOne();
        printOne();
        printTwo();
    }

    public static void printOne()
    {
        System.out.println("PrintOne()");
    }

    public static void printTwo()
    {
        System.out.println("PrintTwo()");
    }

    public static void printWhat()
    {
        System.out.print("What do you want this to print? ");
        String printing = System.console().readLine();
        System.out.println("\n\nYou printed: " + printing);
    }
}