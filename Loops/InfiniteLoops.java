public class InfiniteLoops {
    public static void main(String[] args) {
        while(true) {
            System.out.println("while: бесконечный цикл");
        }

        do {
            System.out.println("do-while: бесконечный цикл");
        } while(true);

    }
}
