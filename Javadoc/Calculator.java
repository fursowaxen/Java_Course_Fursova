/**
 * Калькулятор для выполнения базовых арифметических операций.
 *
 * @author Фурсова Ксения
 * @version 1.0
 * @since 1.0
 */
public class Calculator {
    /**
     * Суммирует два целых числа.
     *
     * @param a первое слагаемое
     * @param b второе слагаемое
     * @return сумма a и b
     */
    public int add(int a, int b) {
        return a + b;
    }
    
    /**
     * Главный метод для демонстрации работы.
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("5 + 3 = " + calc.add(5, 3));
    }
}
