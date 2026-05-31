import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamWriteExample {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("output.txt")) {
            String text = "Hello Java!";
            for (char c : text.toCharArray()) {
                fos.write((int) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
