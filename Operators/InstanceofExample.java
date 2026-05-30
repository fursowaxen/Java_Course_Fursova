public class InstanceofExample {
    public static void main(String[] args) {
        // Базовые примеры
        String str = "Hello";
        Integer num = 100;
        System.out.println("str instanceof String: " + (str instanceof String));     // true
        System.out.println("str instanceof Object: " + (str instanceof Object));     // true
        System.out.println("num instanceof Integer: " + (num instanceof Integer));   // true
        System.out.println("num instanceof Number: " + (num instanceof Number));     // true

        // С null
        String nullStr = null;
        System.out.println("\nnullStr instanceof String: " + (nullStr instanceof String));  // false

        // С массивами
        int[] array = {1, 2, 3};
        System.out.println("array instanceof int[]: " + (array instanceof int[]));   // true
        System.out.println("array instanceof Object: " + (array instanceof Object)); // true

        // С иерархией классов
        Animal animal = new Dog();
        System.out.println("\nanimal instanceof Dog: " + (animal instanceof Dog));    // true
        System.out.println("animal instanceof Animal: " + (animal instanceof Animal));// true
        System.out.println("animal instanceof Cat: " + (animal instanceof Cat));      // false

        // С интерфейсами
        Dog dog = new Dog();
        System.out.println("dog instanceof Pet: " + (dog instanceof Pet));            // true

        // Практическое применение - проверка перед приведением
        Object obj = "Текст";
        if (obj instanceof String) {
            String text = (String) obj;
            System.out.println("\nУспешно приведено: " + text.toUpperCase());
        }
    }
}

// Базовые классы
class Animal {}
class Dog extends Animal implements Pet {}
class Cat extends Animal {}
interface Pet {}
