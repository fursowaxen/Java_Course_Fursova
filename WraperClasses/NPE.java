public class NPE {
    public static void main(String[] args) {
        // NullPointerException при распаковке
        Integer wrapped = null;
        
        // Случай 1: присваивание примитиву
        try {
            int primitive = wrapped;  // unboxing null -> NPE
        } catch (NullPointerException e) {
            System.out.println("Ошибка при unboxing: " + e);
        }
        
        // Случай 2: арифметическая операция
        try {
            int result = wrapped + 5;  // unboxing null -> NPE
        } catch (NullPointerException e) {
            System.out.println("Ошибка при операции: " + e);
        }
        
        // Случай 3: сравнение
        try {
            boolean isEqual = wrapped == 10;  // unboxing null -> NPE
        } catch (NullPointerException e) {
            System.out.println("Ошибка при сравнении: " + e);
        }
    }
}
