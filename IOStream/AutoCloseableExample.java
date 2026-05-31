import java.io.*;
//AutoCloseable позволяет использовать конструкцию try-with-resources, которая автоматически закрывает ресурс (вызывает метод close()), даже если произошло исключение. Это упрощает код и предотвращает утечки ресурсов.
public class AutoCloseableExample {
    public static void main(String[] args) {
        // try-with-resources - автоматически закрывает ресурсы
        try (FileInputStream fis = new FileInputStream("input.txt");
             FileOutputStream fos = new FileOutputStream("output.txt")) {
            
            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // fis и fos автоматически закрыты
    }
}
