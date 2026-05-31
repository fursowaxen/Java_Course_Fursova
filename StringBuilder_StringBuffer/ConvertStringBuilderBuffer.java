public class ConvertStringBuilderBuffer {
    public static void main(String[] args) {
        // StringBuilder → StringBuffer
        StringBuilder sb = new StringBuilder("Hello");
        StringBuffer sbf = new StringBuffer(sb.toString());
        System.out.println("StringBuilder → StringBuffer: " + sbf);
        
        // StringBuffer → StringBuilder
        StringBuffer sbf2 = new StringBuffer("World");
        StringBuilder sb2 = new StringBuilder(sbf2.toString());
        System.out.println("StringBuffer → StringBuilder: " + sb2);
        
        // Дополнительно: через append()
        StringBuffer sbf3 = new StringBuffer();
        sbf3.append(sb);
        System.out.println("Через append(): " + sbf3);
        
        // StringBuilder → String → StringBuffer
        String str = sb.toString();
        StringBuffer sbf4 = new StringBuffer(str);
        System.out.println("Через String: " + sbf4);
    }
}
