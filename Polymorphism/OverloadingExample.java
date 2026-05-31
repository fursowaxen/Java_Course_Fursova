public class OverloadingExample {
    
    // Перегруженные методы - одинаковое имя, разные параметры
    public void print(int a) {
        System.out.println("int: " + a);
    }
    
    public void print(String s) {
        System.out.println("String: " + s);
    }
    
    public void print(int a, int b) {
        System.out.println("int,int: " + a + ", " + b);
    }
    
    public void print(double d) {
        System.out.println("double: " + d);
    }
    
    public static void main(String[] args) {
        OverloadingExample obj = new OverloadingExample();
        obj.print(10);
        obj.print("Hello");
        obj.print(10, 20);
        obj.print(3.14);
    }
}
