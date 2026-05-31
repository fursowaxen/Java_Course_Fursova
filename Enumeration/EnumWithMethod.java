public class EnumWithMethod {
    
    enum Level {
        LOW(1),
        MEDIUM(5),
        HIGH(10);
        
        private int code;
        
        Level(int code) {
            this.code = code;
        }
        
        // Дополнительный метод
        public int getCode() {
            return code;
        }
        
        public boolean isGreaterThan(Level other) {
            return this.code > other.code;
        }
        
        public static Level fromCode(int code) {
            for (Level level : values()) {
                if (level.code == code) {
                    return level;
                }
            }
            return LOW;
        }
    }
    
    public static void main(String[] args) {
        Level l1 = Level.LOW;
        Level l2 = Level.HIGH;
        
        System.out.println("LOW code = " + l1.getCode());
        System.out.println("HIGH code = " + l2.getCode());
        System.out.println("LOW > HIGH? " + l1.isGreaterThan(l2));
        System.out.println("HIGH > LOW? " + l2.isGreaterThan(l1));
        System.out.println("fromCode(5): " + Level.fromCode(5));
    }
}
