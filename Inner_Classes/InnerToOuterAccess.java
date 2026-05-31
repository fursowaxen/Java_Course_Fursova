public class Outer {
    private int privateField = 1;
    public int publicField = 2;
    protected int protectedField = 3;
    int defaultField = 4;
    
    private void privateMethod() { System.out.println("privateMethod"); }
    public void publicMethod() { System.out.println("publicMethod"); }
    
    public class Inner {
        public void accessOuter() {
            // Внутренний класс имеет доступ КО ВСЕМ полям и методам внешнего
            System.out.println("privateField: " + privateField);
            System.out.println("publicField: " + publicField);
            System.out.println("protectedField: " + protectedField);
            System.out.println("defaultField: " + defaultField);
            
            privateMethod();
            publicMethod();
        }
    }
    
    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner i = o.new Inner();
        i.accessOuter();  // Все работает - спецификаторы не ограничивают доступ
    }
}
