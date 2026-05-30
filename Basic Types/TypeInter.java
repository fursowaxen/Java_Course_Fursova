public class TypeInter {
    public static void main(String[] args) {
        var number = 42;        // int
        var text = "Hello";     // String

        System.out.println(number + " - " + ((Object)number).getClass().getSimpleName());
        System.out.println(text + " - " + text.getClass().getSimpleName());
    }
}
