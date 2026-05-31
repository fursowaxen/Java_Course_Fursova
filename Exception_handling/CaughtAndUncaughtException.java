public class CaughtAndUncaughtException {
    
    // Метод, который бросает проверяемое исключение (должно быть обработано или объявлено)
    public static void methodWithException() throws Exception {
        throw new Exception("Проверяемое исключение");
    }
    
    // Метод с неперехваченным исключением
    public static void methodWithUncaught() {
        int[] arr = new int[2];
        int x = arr[5];  // ArrayIndexOutOfBoundsException - не перехватывается
    }
    
    public static void main(String[] args) {
        
        // ПЕРЕХВАЧЕННОЕ исключение
        try {
            methodWithException();
        } catch (Exception e) {
            System.out.println("Исключение перехвачено: " + e.getMessage());
        }
        
        // НЕПЕРЕХВАЧЕННОЕ исключение - приведет к аварийной остановке
        System.out.println("Сейчас будет неперехваченное исключение...");
        methodWithUncaught();
        
        // Этот код не выполнится
        System.out.println("Эта строка не будет напечатана");
    }
}
