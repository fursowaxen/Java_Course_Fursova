package pkg1;

// Класс для демонстрации всех спецификаторов доступа
class DefaultClass {
    int defaultVar = 10;
}

public class AccessModifiersDemo {
    // Поля с разными спецификаторами
    private int privateVar = 1;
    int defaultVar = 2;
    protected int protectedVar = 3;
    public int publicVar = 4;
    
    // Методы с разными спецификаторами
    private void privateMethod() {
        System.out.println("private - только внутри класса");
    }
    
    void defaultMethod() {
        System.out.println("default - внутри пакета");
    }
    
    protected void protectedMethod() {
        System.out.println("protected - пакет + наследники");
    }
    
    public void publicMethod() {
        System.out.println("public - везде");
    }
    
    public void testInsideClass() {
        System.out.println("\n=== Внутри того же класса ===");
        System.out.println("privateVar: " + privateVar);
        System.out.println("defaultVar: " + defaultVar);
        System.out.println("protectedVar: " + protectedVar);
        System.out.println("publicVar: " + publicVar);
        
        privateMethod();
        defaultMethod();
        protectedMethod();
        publicMethod();
    }
    
    public static void main(String[] args) {
        AccessModifiersDemo obj = new AccessModifiersDemo();
        obj.testInsideClass();
        
        // Тот же пакет (pkg1)
        System.out.println("Из того же пакета (тот же класс main)");
        System.out.println("defaultVar: " + obj.defaultVar);
        System.out.println("protectedVar: " + obj.protectedVar);
        System.out.println("publicVar: " + obj.publicVar);
        // System.out.println(obj.privateVar); // Ошибка!
        
        // Класс из того же пакета
        SamePackageTest.test(obj);
        
        // Подкласс в другом пакете
        pkg2.SubclassTest.test();
        
        // Другой пакет (не наследник)
        pkg2.OtherPackageTest.test();
    }
}

// Класс в том же пакете
class SamePackageTest {
    static void test(AccessModifiersDemo obj) {
        System.out.println("Из того же пакета (другой класс)");
        // System.out.println(obj.privateVar); // НЕТ
        System.out.println("defaultVar: " + obj.defaultVar);     // ДА
        System.out.println("protectedVar: " + obj.protectedVar); // ДА
        System.out.println("publicVar: " + obj.publicVar);       // ДА
        
        obj.defaultMethod();     // ДА
        obj.protectedMethod();   // ДА
        obj.publicMethod();      // ДА
    }
}

// Подкласс в другом пакете
package pkg2;

import pkg1.AccessModifiersDemo;

class SubclassTest extends AccessModifiersDemo {
    void access() {
        System.out.println("Из подкласса в другом пакете");
        // System.out.println(privateVar); // НЕТ
        // System.out.println(defaultVar); // НЕТ
        System.out.println("protectedVar: " + protectedVar); // ДА
        System.out.println("publicVar: " + publicVar);       // ДА
        
        // defaultMethod(); // НЕТ
        protectedMethod();   // ДА
        publicMethod();      // ДА
    }
    
    static void test() {
        new SubclassTest().access();
    }
}

// Класс в другом пакете (не наследник)
class OtherPackageTest {
    static void test() {
        AccessModifiersDemo obj = new AccessModifiersDemo();
        System.out.println("Из другого пакета (не наследник)");
        // System.out.println(obj.privateVar); // НЕТ
        // System.out.println(obj.defaultVar); // НЕТ
        // System.out.println(obj.protectedVar); // НЕТ
        System.out.println("publicVar: " + obj.publicVar); // ДА - только public
        
        obj.publicMethod(); // ДА
    }
}
