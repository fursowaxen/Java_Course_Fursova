public class DataTypesExample {
    public static void main(String[] args) {

        byte byteValue = 127;
        byte byteZero = 0;

        short shortValue = 32560;
        short shortZero = 0;

        int intValue = 1_078_322_560;
        int intZero = 0;

        long longValue = 6_223_372_036_854_775_807L;
        long longZero = 0L;

        float floatValue = 3.4028235E38f;
        float floatZero = 0.0f;

        double doubleValue = 1.797E38;
        double doubleZero = 0.0;

        char charValue = 'A';
        char charZero = '\u0000';

        boolean boolTrue = true;
        boolean boolFalse = false;

        System.out.println("byte: " + byteValue + ", zero: " + byteZero);
        System.out.println("short: " + shortValue + ", zero: " + shortZero);
        System.out.println("int: " + intValue + ", zero: " + intZero);
        System.out.println("long: " + longValue + ", zero: " + longZero);
        System.out.println("float: " + floatValue + ", zero: " + floatZero);
        System.out.println("double: " + doubleValue + ", zero: " + doubleZero);
        System.out.println("char: " + charValue);
        System.out.println("char zero: '" + charZero + "'");
        System.out.println("boolean true: " + boolTrue);
        System.out.println("boolean false: " + boolFalse);
    }
}
