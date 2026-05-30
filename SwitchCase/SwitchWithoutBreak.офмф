public class SwitchWithoutBreak {
    public static void main(String[] args) {

        for (int value = 1; value <= 3; value++) {
            int i = 0;
            System.out.print("value = " + value + " -> ");
            
            switch(value) {
                case 1:
                    i = 1;
                    System.out.print("case 1 выполнен, ");
                    // нет break - проваливается в case 2
                case 2:
                    i = 2;
                    System.out.print("case 2 выполнен, ");
                    // нет break - проваливается в case 3
                case 3:
                    i = 3;
                    System.out.print("case 3 выполнен");
                    break;
                default:
                    i = 0;
            }
            System.out.println(" -> i = " + i);
        }
        System.out.println("value=1: case1 -> case2 -> case3 (все три)");
        System.out.println("value=2: case2 -> case3 (два)");
        System.out.println("value=3: только case3");
    }
}
