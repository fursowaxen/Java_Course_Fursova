import java.io.*;

public class MultipleCatchExample {
    
    static void exceptionDemo(int type) throws Exception {
        switch(type) {
            case 1: throw new NullPointerException("NPE");
            case 2: throw new IllegalArgumentException("IAE");
            case 3: throw new IOException("IOE");
            case 4: throw new Exception("Общее исключение");
        }
    }
    
    public static void main(String[] args) {
        
        // Ситуация 1: несколько исключений обрабатываются одинаково (multi-catch)
        try {
            exceptionDemo(1);
        } catch (NullPointerException | IllegalArgumentException e) {
            System.out.println("Обработано одинаково: " + e.getClass().getSimpleName());
        }
        
        // Ситуация 2: иерархия исключений (подкласс -> суперкласс)
        try {
            exceptionDemo(4);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException");
        } catch (IOException e) {
            System.out.println("IOException");
        } catch (Exception e) {
            System.out.println("Exception (суперкласс) - всегда последним");
        }
        
        // Ошибка: нельзя объединять исключения из одной иерархии
        // catch (IOException | FileNotFoundException e) - ОШИБКА! FileNotFoundException extends IOException
    }
}
