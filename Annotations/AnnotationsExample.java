// 1. @Override - проверяет, что метод действительно переопределяет метод суперкласса
class Parent {
    void oldMethod() {
        System.out.println("Parent method");
    }
}

class Child extends Parent {
    @Override
    void oldMethod() {  // Без @Override опечатка oldMethod -> oldmethod была бы незамечена
        System.out.println("Child method");
    }
}

// 2. @Deprecated - помечает элемент как устаревший
class Utils {
    @Deprecated
    public void oldAPI() {
        System.out.println("Старый метод, не рекомендуется использовать");
    }
    
    public void newAPI() {
        System.out.println("Новый метод");
    }
}

// 3. @SuppressWarnings - подавляет предупреждения компилятора
public class AnnotationsExample {
    
    @SuppressWarnings({"unchecked", "deprecation"})
    public static void main(String[] args) {
        // Подавляем предупреждение об использовании устаревшего метода
        Utils utils = new Utils();
        utils.oldAPI();  // Компилятор не выдаст warning
        
        // Подавляем предупреждение о непроверяемом приведении
        @SuppressWarnings("rawtypes")
        java.util.List list = new java.util.ArrayList();  // raw type - без warning
        list.add("text");
        
        Child child = new Child();
        child.oldMethod();
    }
}
