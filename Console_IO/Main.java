import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Пожалуйста, введите ваше имя: ");
        String name = scan.next();
        System.out.println("Привет, " + name);
        scan.close();
    }
}
