public class FinalFieldInit {
    public final int a;
    
    // Вариант 1: Инициализация в конструкторе
    public FinalFieldInit() {
        a = 10;
    }
    
    // Вариант 2: Инициализация в параметризованном конструкторе
    public FinalFieldInit(int value) {
        a = value;
    }
  
    public static void main(String[] args) {
      
        // Вариант 1
        FinalFieldInit obj1 = new FinalFieldInit();
        System.out.println("Вариант 1 (конструктор без параметров): a = " + obj1.a);
        
        // Вариант 2
        FinalFieldInit obj2 = new FinalFieldInit(99);
        System.out.println("Вариант 2 (параметризованный конструктор): a = " + obj2.a);

    }
}
