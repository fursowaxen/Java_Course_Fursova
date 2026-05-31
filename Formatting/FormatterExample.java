import java.util.Formatter;

public class FormatterExample {
    public static void main(String[] args) {
        // %d - десятичное целое
        System.out.printf("%d\n", 12345);
        
        // %f - число с плавающей точкой
        System.out.printf("%.2f\n", 3.14159);
        
        // %s - строковое представление
        System.out.printf("%s\n", "Hello Java");
        
        // %b - логическое значение
        System.out.printf("%b\n", 5 > 3);
        
        // %n - символ новой строки
        System.out.printf("Первая строка%nВторая строка%n");
        
        // Форматирование с несколькими спецификаторами
        System.out.printf("Имя: %s, Возраст: %d, Рост: %.1f%n", "Анна", 25, 168.5);
        
        // Использование Formatter
        Formatter formatter = new Formatter();
        formatter.format("Число: %d, Хэшкод: %h%n", 100, "object");
        System.out.print(formatter);
        formatter.close();
    }
}
