public class VarargsOverload {
    
    // Вариант 1: массив int
    public static void print(String prefix, int... numbers) {
        System.out.print(prefix + ": ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    // Вариант 2: массив String
    public static void print(String prefix, String... strings) {
        System.out.print(prefix + ": ");
        for (String str : strings) {
            System.out.print(str + " ");
        }
        System.out.println();
    }
    
    // Вариант 3: массив Object
    public static void print(Object... objects) {
        System.out.print("Object[]: ");
        for (Object obj : objects) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }
    
    // Вариант 4: разные типы + varargs
    public static void print(String first, int second, double... values) {
        System.out.print("first=" + first + ", second=" + second + ", doubles: ");
        for (double d : values) {
            System.out.print(d + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        // Вариант 1
        print("INT", 1, 2, 3, 4);
        
        // Вариант 2
        print("STR", "A", "B", "C");
        
        // Вариант 3
        print(1, "hello", 3.14, true);
        
        // Вариант 4
        print("test", 100, 1.1, 2.2, 3.3);
    }
}
