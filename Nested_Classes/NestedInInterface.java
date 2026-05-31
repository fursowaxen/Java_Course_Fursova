// Интерфейс со вложенным классом
interface Calculator {
    // Вложенный класс в интерфейсе (всегда static по умолчанию)
    class Operation {
        public int add(int a, int b) {
            return a + b;
        }
        
        public int multiply(int a, int b) {
            return a * b;
        }
        
        public static void showInfo() {
            System.out.println("Calculator.Operation вложенный класс");
        }
    }
    
    // Другой вложенный класс
    class Helper {
        public void help() {
            System.out.println("Helper class inside interface");
        }
    }
}

public class NestedInInterface {
    public static void main(String[] args) {
        // Способ 1: создание экземпляра вложенного класса
        Calculator.Operation op = new Calculator.Operation();
        System.out.println("add(5,3) = " + op.add(5, 3));
        System.out.println("multiply(5,3) = " + op.multiply(5, 3));
        
        // Способ 2: вызов статического метода
        Calculator.Operation.showInfo();
        
        // Способ 3: другой вложенный класс
        Calculator.Helper helper = new Calculator.Helper();
        helper.help();
    }
}
