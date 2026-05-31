public class Outer {
    
    public class Inner {
        private int privateField = 10;
        public int publicField = 20;
        protected int protectedField = 30;
        int defaultField = 40;
        
        private void privateMethod() { System.out.println("Inner privateMethod"); }
        public void publicMethod() { System.out.println("Inner publicMethod"); }
    }
    
    public void accessInner(Inner inner) {
        // Внешний класс имеет доступ КО ВСЕМ полям и методам внутреннего
        System.out.println("privateField: " + inner.privateField);
        System.out.println("publicField: " + inner.publicField);
        System.out.println("protectedField: " + inner.protectedField);
        System.out.println("defaultField: " + inner.defaultField);
        
        inner.privateMethod();
        inner.publicMethod();
    }
    
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        outer.accessInner(inner);  // Все работает
    }
}
