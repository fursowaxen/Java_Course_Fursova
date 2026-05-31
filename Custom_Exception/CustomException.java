// Собственное исключение
class InvalidAgeException extends Exception {
    
    // Конструктор 1: без параметров
    public InvalidAgeException() {
        super("Недопустимый возраст");
    }
    
    // Конструктор 2: с сообщением
    public InvalidAgeException(String message) {
        super(message);
    }
    
    // Конструктор 3: с сообщением и причиной
    public InvalidAgeException(String message, Throwable cause) {
        super(message, cause);
    }
}

public class CustomException {
    
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 150) {
            throw new InvalidAgeException("Возраст " + age + " не в диапазоне 0-150");
        }
        System.out.println("Возраст " + age + " допустим");
    }
    
    public static void main(String[] args) {
        try {
            checkAge(-5);
        } catch (InvalidAgeException e) {
            System.out.println("Перехвачено: " + e.getMessage());
        }
        
        try {
            checkAge(25);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
