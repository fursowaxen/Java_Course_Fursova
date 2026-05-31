import java.util.ArrayList;
import java.util.List;

class Animal { void sound() { System.out.println("Animal sound"); } }
class Dog extends Animal { void bark() { System.out.println("Woof!"); } }
class Puppy extends Dog {}

public class WildcardsExample {
    
    // ? extends T - читаем из коллекции (Producer)
    public static void printAnimals(List<? extends Animal> animals) {
        for (Animal a : animals) {
            a.sound();  // можем читать как Animal
        }
        // animals.add(new Animal()); // НЕЛЬЗЯ добавить
    }
    
    // ? super T - пишем в коллекцию (Consumer)
    public static void addDogs(List<? super Dog> list) {
        list.add(new Dog());     // МОЖНО добавить Dog
        list.add(new Puppy());   // МОЖНО добавить подтип
        // Animal a = list.get(0); // НЕЛЬЗЯ прочитать как Animal
    }
    
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        List<Animal> animals = new ArrayList<>();
        List<Puppy> puppies = new ArrayList<>();
        
        System.out.println("=== ? extends T (Producer) ===");
        printAnimals(dogs);     // OK - List<Dog>
        printAnimals(animals);  // OK - List<Animal>
        printAnimals(puppies);  // OK - List<Puppy>
        
        System.out.println("\n=== ? super T (Consumer) ===");
        addDogs(dogs);     // OK - List<Dog>
        addDogs(animals);  // OK - List<Animal>
        // addDogs(puppies); // ОШИБКА - Puppy не super для Dog
    }
}
