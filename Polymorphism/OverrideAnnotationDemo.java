class Base {
    public void processData() {
        System.out.println("Base processData");
    }
    public void save() {
        System.out.println("Base save");
    }
}

class Derived extends Base {
    
    // Без @Override - ошибка не очевидна (опечатка в имени)
    public void processdata() {  // маленькая 'd' - это новый метод, не переопределение
        System.out.println("Derived processdata (новый метод)");
    }
    
    // С @Override - компилятор покажет ошибку
    @Override
    public void saveData() {  // Ошибка! Нет такого метода в Base
        System.out.println("Derived saveData");
    }
}

public class OverrideAnnotationDemo {
    public static void main(String[] args) {
        Base obj = new Derived();
        obj.processData();  // Вызовется Base.processData(), а не Derived.processdata()
        // Ожидалось переопределение, но из-за опечатки его нет
    }
}
