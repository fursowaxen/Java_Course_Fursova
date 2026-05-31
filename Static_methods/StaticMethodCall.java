public class StaticMethodCall {
    public static int a = 1;
    public static int b;

    public static void printVars() {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    
    public static void main(String[] args) {
        // Вариант 1: Прямой вызов из статического метода того же класса
        System.out.println("1. Прямой вызов:");
        printVars();
        
        // Вариант 2: Через имя класса (рекомендуемый способ)
        System.out.println("\n2. Через имя класса:");
        StaticMethodCall.printVars();
        
        // Вариант 3: Через объект класса 
        System.out.println("\n3. Через объект класса:");
        StaticMethodCall obj = new StaticMethodCall();
        obj.printVars();
        
        // Вариант 4: Через переменную, хранящую null
        System.out.println("\n4. Через null-ссылку (странно, но работает):");
        StaticMethodCall nullObj = null;
        nullObj.printVars();  // Работает! Статические методы не требуют объекта
        
        // Вариант 5: Вызов из другого класса
        System.out.println("\n5. Из другого класса:");
        AnotherClass.callPrintVars();
        
        // Вариант 6: Вызов через импорт статического метода 
        System.out.println("\n6. Через статический импорт:");
        StaticImportDemo.demo();
    }
}

class AnotherClass {
    public static void callPrintVars() {
        // Через имя класса
        StaticMethodCall.printVars();
        
        // Через объект
        StaticMethodCall obj = new StaticMethodCall();
        obj.printVars();
    }
}

// Демонстрация статического импорта
import static StaticMethodCall.printVars;

class StaticImportDemo {
    public static void demo() {
        printVars();  
    }
}
