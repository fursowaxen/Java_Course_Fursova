public class Outer {
    // public - доступен везде
    public class PublicInner {
        public void show() { System.out.println("PublicInner"); }
    }
    
    // private - только внутри Outer
    private class PrivateInner {
        void show() { System.out.println("PrivateInner"); }
    }
    
    // protected - доступен наследникам и в пакете
    protected class ProtectedInner {
        void show() { System.out.println("ProtectedInner"); }
    }
    
    // default - только в пакете
    class DefaultInner {
        void show() { System.out.println("DefaultInner"); }
    }
    
    public void testAccess() {
        // Внутри внешнего класса доступны все
        new PublicInner().show();
        new PrivateInner().show();
        new ProtectedInner().show();
        new DefaultInner().show();
    }
    
    public static void main(String[] args) {
        Outer o = new Outer();
        o.testAccess();
        
        // Извне:
        PublicInner pi = o.new PublicInner();     // ✅ public - доступен
        // PrivateInner pri = o.new PrivateInner(); // ❌ private - недоступен
        // ProtectedInner pro = o.new ProtectedInner(); // ✅ если в том же пакете
        // DefaultInner di = o.new DefaultInner();     // ✅ если в том же пакете
    }
}
