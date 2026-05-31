class Parent {
    public Number getValue() {
        System.out.println("Parent getValue()");
        return 10;
    }
}

class Child extends Parent {
    @Override
    public Integer getValue() {  // Ковариантный тип (Integer extends Number) - работает
        System.out.println("Child getValue()");
        return 20;
    }
}

/*
// Ошибка - тип возвращаемого значения несовместим
class ChildWrong extends Parent {
    @Override
    public String getValue() {  // String не является подтипом Number
        return "ошибка";
    }
}
*/

public class OverridingExample {
    public static void main(String[] args) {
        Parent p = new Child();
        p.getValue();  // вызывается метод Child
    }
}
