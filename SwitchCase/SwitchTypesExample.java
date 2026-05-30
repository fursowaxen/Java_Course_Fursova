public class SwitchTypesExample {
    public static void main(String[] args) {
        byte b = 2;
        switch(b) {
            case 1: System.out.println("byte = 1"); break;
            case 2: System.out.println("byte = 2"); break;
            default: System.out.println("byte другое");
        }

        short s = 100;
        switch(s) {
            case 100: System.out.println("short = 100"); break;
            case 200: System.out.println("short = 200"); break;
        }

        int i = 5;
        switch(i) {
            case 5: System.out.println("int = 5"); break;
            case 10: System.out.println("int = 10"); break;
        }
        
        char c = 'A';
        switch(c) {
            case 'A': System.out.println("char = A"); break;
            case 'B': System.out.println("char = B"); break;
        }

        String str = "java";
        switch(str) {
            case "java": System.out.println("String = java"); break;
            case "python": System.out.println("String = python"); break;
        }

        Day day = Day.MONDAY;
        switch(day) {
            case MONDAY: System.out.println("Понедельник"); break;
            case FRIDAY: System.out.println("Пятница"); break;
        }
    }
    
    enum Day { MONDAY, TUESDAY, FRIDAY }
}
