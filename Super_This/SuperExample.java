class Parent {
    String name = "Родитель";
    
    Parent() {
        System.out.println("Конструктор Parent");
    }
    
    Parent(String msg) {
        System.out.println("Parent: " + msg);
    }
    
    void show() {
        System.out.println("Метод show() из Parent");
    }
}

class Child extends Parent {
    String name = "Ребенок";
    
    Child() {
        super("привет");  // 1. вызов конструктора суперкласса
        System.out.println("Конструктор Child");
    }
    
    void show() {
        System.out.println("super.name = " + super.name);  // 2. доступ к полю суперкласса
        super.show();  // 3. доступ к методу суперкласса
        System.out.println("this.name = " + this.name);
    }
}

public class SuperExample {
    public static void main(String[] args) {
        Child child = new Child();
        child.show();
    }
}
