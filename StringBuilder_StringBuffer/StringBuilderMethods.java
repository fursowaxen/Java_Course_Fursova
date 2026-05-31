public class StringBuilderMethods {
    public static void main(String[] args) {
        // Создание StringBuilder
        StringBuilder sb = new StringBuilder("Java");
        
        // 1. append() - добавляет строку в конец
        sb.append(" Programming");
        System.out.println("1. append: " + sb);
        
        // 2. insert() - вставляет строку в указанную позицию
        sb.insert(0, "Learn ");
        System.out.println("2. insert: " + sb);
        
        // 3. delete() - удаляет символы с start до end-1
        sb.delete(6, 11);
        System.out.println("3. delete: " + sb);
        
        // 4. deleteCharAt() - удаляет символ по индексу
        sb.deleteCharAt(5);
        System.out.println("4. deleteCharAt: " + sb);
        
        // 5. replace() - заменяет подстроку
        sb.replace(0, 5, "Mastering");
        System.out.println("5. replace: " + sb);
        
        // 6. reverse() - переворачивает строку
        sb.reverse();
        System.out.println("6. reverse: " + sb);
        sb.reverse();
        
        // 7. charAt() - возвращает символ по индексу
        System.out.println("7. charAt(0): " + sb.charAt(0));
        
        // 8. setCharAt() - заменяет символ по индексу
        sb.setCharAt(0, 'm');
        System.out.println("8. setCharAt: " + sb);
        
        // 9. length() - возвращает длину
        System.out.println("9. length: " + sb.length());
        
        // 10. substring() - извлекает подстроку
        System.out.println("10. substring(0,5): " + sb.substring(0, 5));
        
        // 11. indexOf() - ищет подстроку
        System.out.println("11. indexOf(\"va\"): " + sb.indexOf("va"));
        
        // 12. capacity() - текущая емкость
        System.out.println("12. capacity: " + sb.capacity());
    }
}
