public class StringMethods {
    public static void main(String[] args) {
        String str = "  Java Programming  ";
        String text = "Hello, World!";
        
        // 1. length() - возвращает длину строки
        System.out.println("1. length(): " + str.length());
        
        // 2. charAt() - возвращает символ по индексу
        System.out.println("2. charAt(0): '" + str.charAt(0) + "'");
        
        // 3. trim() - удаляет пробелы в начале и конце
        System.out.println("3. trim(): '" + str.trim() + "'");
        
        // 4. toLowerCase() / toUpperCase() - меняет регистр
        System.out.println("4. toLowerCase(): " + str.toLowerCase());
        System.out.println("   toUpperCase(): " + str.toUpperCase());
        
        // 5. substring() - извлекает подстроку
        System.out.println("5. substring(2,6): '" + text.substring(2, 6) + "'");
        
        // 6. indexOf() - ищет первое вхождение
        System.out.println("6. indexOf('o'): " + text.indexOf('o'));
        
        // 7. contains() - проверяет наличие подстроки
        System.out.println("7. contains(\"World\"): " + text.contains("World"));
        
        // 8. replace() - заменяет символы
        System.out.println("8. replace('o', 'a'): " + text.replace('o', 'a'));
        
        // 9. split() - разбивает на массив
        String[] words = "apple,banana,orange".split(",");
        System.out.println("9. split(','): " + words[0] + ", " + words[1] + ", " + words[2]);
        
        // 10. equals() / equalsIgnoreCase() - сравнение
        System.out.println("10. equals(\"hello\"): " + "Hello".equals("hello"));
        System.out.println("    equalsIgnoreCase(\"hello\"): " + "Hello".equalsIgnoreCase("hello"));
    }
}
