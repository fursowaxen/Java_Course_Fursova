public class ExceptionsDemo {
    public static void main(String[] args) {
        
        // 1. ArithmeticException - деление на ноль
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }
        
        // 2. ArrayIndexOutOfBoundsException - выход за границы массива
        try {
            int[] arr = new int[3];
            int x = arr[5];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: индекс вне диапазона");
        }
        
        // 3. IllegalArgumentException - недопустимый аргумент
        try {
            setAge(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: " + e.getMessage());
        }
        
        // 4. ClassCastException - неверное приведение типа
        try {
            Object obj = "String";
            Integer num = (Integer) obj;
        } catch (ClassCastException e) {
            System.out.println("ClassCastException: нельзя привести String к Integer");
        }
        
        // 5. NullPointerException - вызов метода на null
        try {
            String str = null;
            int length = str.length();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: обращение к null объекту");
        }
    }
    
    static void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным");
        }
    }
}
