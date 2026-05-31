interface MyInterface {
    // Абстрактный метод
    void abstractMethod();
    
    // Неабстрактный (default) метод
    default void defaultMethod() {
        System.out.println("defaultMethod из интерфейса");
    }
    
    // Статический метод
    static void staticMethod() {
        System.out.println("staticMethod из интерфейса");
    }
}

class MyClass implements MyInterface {
    @Override
    public void abstractMethod() {
        System.out.println("Реализация abstractMethod");
    }
    
    // Можно переопределить default метод (необязательно)
    @Override
    public void defaultMethod() {
        System.out.println("Переопределенный defaultMethod");
    }
}

public class InterfaceDefaultStatic {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        
        // 1. Вызов абстрактного метода
        obj.abstractMethod();
        
        // 2. Вызов default метода
        obj.defaultMethod();
        
        // 3. Вызов статического метода (через интерфейс)
        MyInterface.staticMethod();
        
        // 4. Вызов через ссылку на интерфейс
        MyInterface ref = obj;
        ref.defaultMethod();
        ref.abstractMethod();
        // ref.staticMethod(); // Так нельзя!
    }
}
