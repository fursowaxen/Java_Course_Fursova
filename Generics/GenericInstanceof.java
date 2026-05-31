import java.util.ArrayList;
import java.util.List;

public class GenericInstanceof {
    public static void main(String[] args) {
        // instanceof работает с сырым типом (raw type)
        List<String> stringList = new ArrayList<>();
        List<Integer> intList = new ArrayList<>();
        
        System.out.println("stringList instanceof List: " + (stringList instanceof List));
        System.out.println("intList instanceof List: " + (intList instanceof List));
        
        // Обход через wildcard
        if (stringList instanceof List<?>) {
            System.out.println("stringList instanceof List<?>: true");
        }
        
        // С пользовательским классом
        Wrapper<String> strWrapper = new Wrapper<>();
        Wrapper<Integer> intWrapper = new Wrapper<>();
        
        System.out.println("\nstrWrapper instanceof Wrapper: " + (strWrapper instanceof Wrapper));
        System.out.println("strWrapper instanceof Wrapper<?>: " + (strWrapper instanceof Wrapper<?>));
    }
}

class Wrapper<T> {
    private T item;
    public void setItem(T item) { this.item = item; }
    public T getItem() { return item; }
}
