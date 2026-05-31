class Parent {
    public void normalMethod() {
        System.out.println("Обычный метод");
    }
    
    public final void finalMethod() {
        System.out.println("final метод - нельзя переопределить");
    }
}

class Child extends Parent {
    // Переопределяем обычный метод - работает
    @Override
    public void normalMethod() {
        System.out.println("Переопределенный метод");
    }
    
    // Попытка переопределить final метод - ОШИБКА КОМПИЛЯЦИИ
    /*
    @Override
    public void finalMethod() {
        System.out.println("Попытка переопределить final метод");
    }
    */
}

public class FinalMethodDemo {
    public static void main(String[] args) {
        Child child = new Child();
        child.normalMethod();   // Работает
        child.finalMethod();    // Вызов унаследованного final метода
    }
}
