//Если класс реализует два интерфейса с одинаковыми default-методами, возникает конфликт. Компилятор требует явно переопределить метод в классе и указать, какой из интерфейсов использовать через super.

interface InterfaceA {
    default void commonMethod() {
        System.out.println("InterfaceA.commonMethod");
    }
}

interface InterfaceB {
    default void commonMethod() {
        System.out.println("InterfaceB.commonMethod");
    }
}

class MyClass implements InterfaceA, InterfaceB {
    // Обязательно переопределяем конфликтующий метод
    @Override
    public void commonMethod() {
        // Выбираем, какой интерфейс использовать
        InterfaceA.super.commonMethod();  // вызываем метод из A
        // или
        // InterfaceB.super.commonMethod(); // вызываем метод из B
        // или добавляем свою реализацию
        System.out.println("Своя реализация");
    }
}

public class InterfaceConflict {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.commonMethod();
    }
}
