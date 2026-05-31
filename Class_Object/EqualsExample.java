import java.util.Objects;

class Person {
    private String name;
    private int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    @Override
    public boolean equals(Object obj) {
        // 1. Проверка на тот же объект (рефлексивность)
        if (this == obj) return true;
        
        // 2. Проверка на null
        if (obj == null) return false;
        
        // 3. Проверка совпадения классов
        if (getClass() != obj.getClass()) return false;
        
        // 4. Приведение типа
        Person other = (Person) obj;
        
        // 5. Сравнение полей
        return age == other.age && Objects.equals(name, other.name);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
    
    public static void main(String[] args) {
        Person p1 = new Person("Иван", 25);
        Person p2 = new Person("Иван", 25);
        Person p3 = new Person("Петр", 30);
        
        System.out.println("p1.equals(p2): " + p1.equals(p2));  // true
        System.out.println("p1.equals(p3): " + p1.equals(p3));  // false
        System.out.println("p1.equals(null): " + p1.equals(null)); // false
        System.out.println("p1.equals(p1): " + p1.equals(p1));  // true
    }
}
