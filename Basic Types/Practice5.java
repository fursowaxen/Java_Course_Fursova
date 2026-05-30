public class Practice5 {
    public static void main(String[] args) {
        byte b = 10;
        short s = 20;
        int i = 30;
        double d = 2.5;

        //byte + short -> int
        int r1 = b + s;
        System.out.println("byte(10) + short(20) = int(" + r1 + ")");
        //byte и short оба расширяются до int перед операцией, результат int

        //int + double -> double
        double r5 = i + d;
        System.out.println("int(30) + double(2.5) = double(" + r5 + ")");
        //int расширяется до double, результат double
    }
}
