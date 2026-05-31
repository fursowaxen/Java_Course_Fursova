final class FinalParent {
    public void someMethod() {
        System.out.println("Метод final класса");
    }
}

// Попытка наследоваться от final класса - ОШИБКА КОМПИЛЯЦИИ
/*
class Child extends FinalParent {
    // Этот класс не может существовать
}
*/

class NormalParent {
    public void hello() {
        System.out.println("Обычный класс");
    }
}

class NormalChild extends NormalParent {
    // Это работает - класс не final
}

public class FinalClassDemo {
    public static void main(String[] args) {
        FinalParent obj = new FinalParent();
        obj.someMethod();
        
        System.out.println("final класс существует, но создать его подкласс нельзя");
    }
}
