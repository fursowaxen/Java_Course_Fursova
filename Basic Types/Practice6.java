public class Practice6 {
    public static void main(String[] args) {
        //double -> int
        double pi = 3.14159;
        int intPi = (int) pi;
        System.out.println("double: 3.14159 -> int: " + intPi); //дробная часть отброшена

        //long -> byte
        long bigLong = 200L;
        byte byteVal = (byte) bigLong;
        System.out.println("long: 200 -> byte: " + byteVal); //переполнение

        //double -> float
        double precise = 123.456789;
        float floatVal = (float) precise;
        System.out.println("double: 123.456789 -> float: " + floatVal); //потеря точности
    }
}
