public class HelloWorld {
    public static void main(String[] arguments) {
        System.out.println("Hello World!");
        CallingMethodsInSameClass call = new CallingMethodsInSameClass();
        call.printWhat();
    }
}