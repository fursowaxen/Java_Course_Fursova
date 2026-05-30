public class DecodeExample {
    public static void main(String[] args) {
        Integer dec = Integer.decode("123");        // десятичная
        Integer hex = Integer.decode("0x7B");       // hex (123)
        Integer oct = Integer.decode("0173");       // octal (123)
        Integer neg = Integer.decode("-123");       // отрицательное
        Integer pos = Integer.decode("+123");       // положительное
        
        System.out.println("dec: " + dec);
        System.out.println("hex (0x7B): " + hex);
        System.out.println("oct (0173): " + oct);
        System.out.println("negative: " + neg);
        System.out.println("positive: " + pos);
    }
}
