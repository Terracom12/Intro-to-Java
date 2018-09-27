public class CallingMethodsInSameClass
{
    public static void main(String[] arguments)
    {
        printOne();
    }

    public static void printOne()
    {
        System.out.println("PrintOne()");
    }

    public static void printTwo()
    {
        System.out.println("PrintTwo()");
    }
}
