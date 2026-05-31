// Суперкласс
class Animal {
    // Метод для переопределения
    public void makeSound() {
        System.out.println("Животное издает звук");
    }
    
    // Перегруженные методы
    public void eat() {
        System.out.println("Животное ест");
    }
    
    public void eat(String food) {
        System.out.println("Животное ест " + food);
    }
    
    public void eat(int amount, String food) {
        System.out.println("Животное ест " + amount + " кг " + food);
    }
    
    public void eat(String food, int amount) {
        System.out.println("Животное ест " + food + " в количестве " + amount);
    }
}

// Подкласс
class Dog extends Animal {
    // Переопределение метода
    @Override
    public void makeSound() {
        System.out.println("Собака гавкает: Гав-гав!");
    }
    
    // Своя перегрузка
    public void eat(String food, boolean isHungry) {
        if(isHungry) {
            System.out.println("Голодная собака ест " + food);
        } else {
            System.out.println("Собака сыта, не ест " + food);
        }
    }
}

public class MethodOverloadingOverride {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();                                    // без параметров
        animal.eat("траву");                            // 1 параметр
        animal.eat(5, "сено");                          // 2 параметра (int, String)
        animal.eat("овощи", 3);                         // 2 параметра (String, int)
        
        
        Animal animalRef = new Animal();
        Animal dogRef = new Dog();
        
        animalRef.makeSound();  // метод суперкласса
        dogRef.makeSound();     // переопределенный метод
        
        Dog dog = new Dog();
        dog.makeSound();                    // переопределенный
        dog.eat();                          // унаследованный
        dog.eat("кость");                   // унаследованный перегруженный
        dog.eat(2, "мясо");                 // унаследованный перегруженный
        dog.eat("корм", true);              // свой перегруженный
    }
}
