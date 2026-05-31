public class VarargsOverload {

    // Вариант 1: массив int
    public static void printNumbers(String prefix, int... numbers) {
        System.out.print(prefix + ": ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Вариант 2: массив String
    public static void printStrings(String prefix, String... strings) {
        System.out.print(prefix + ": ");
        for (String str : strings) {
            System.out.print(str + " ");
        }
        System.out.println();
    }

    // Вариант 3: массив Object
    public static void printObjects(Object... objects) {
        System.out.print("Object[]: ");
        for (Object obj : objects) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }

    // Вариант 4: разные типы + varargs
    public static void printMixed(String first, int second, double... values) {
        System.out.print("first=" + first + ", second=" + second + ", doubles: ");
        for (double d : values) {
            System.out.print(d + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Вариант 1
        printNumbers("INT", 1, 2, 3, 4);

        // Вариант 2
        printStrings("STR", "A", "B", "C");

        // Вариант 3
        printObjects(1, "hello", 3.14, true);

        // Вариант 4
        printMixed("test", 100, 1.1, 2.2, 3.3);
    }
}
