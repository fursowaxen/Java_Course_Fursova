import java.util.StringJoiner;

public class StringJoinerExample {
    public static void main(String[] args) {
        // С разделителем
        StringJoiner sj1 = new StringJoiner(", ");
        sj1.add("Яблоко").add("Банан").add("Апельсин");
        System.out.println("Строка: " + sj1);
        
        // С разделителем, префиксом и суффиксом
        StringJoiner sj2 = new StringJoiner(", ", "[", "]");
        sj2.add("Красный").add("Зеленый").add("Синий");
        System.out.println("С префиксом/суффиксом: " + sj2);
        
        // Объединение StringJoiner
        StringJoiner sj3 = new StringJoiner("; ");
        sj3.add("Понедельник").add("Вторник");
        sj2.merge(sj3);
        System.out.println("После merge: " + sj2);
    }
}
