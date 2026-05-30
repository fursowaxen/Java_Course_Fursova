public class BreakContinueExample {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++) {
            if(i == 5) {
                System.out.println("break при i = " + i);
                break;
            }
            System.out.println("i = " + i);
        }
      
        for(int i = 1; i <= 10; i++) {
            if(i % 2 == 0) {
                System.out.println("continue для четного i = " + i);
                continue;
            }
            System.out.println("Нечетное i = " + i);
        }
      
        int j = 0;
        while(j < 10) {
            j++;
            if(j % 3 == 0) {
                System.out.println("Пропускаем " + j);
                continue;
            }
            System.out.println("Обработано: " + j);
        }
      
        int k = 0;
        do {
            k++;
            System.out.println("k = " + k);
            if(k == 3) {
                System.out.println("Выход на 3-й итерации");
                break;
            }
        } while(true);
      
        int[] arr = {10, 20, 30, 40, 50, 60};
        int target = 40;
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                System.out.println("Нашли " + target + " на позиции " + i);
                break;
            }
            System.out.println("Проверили " + arr[i]);
        }
        int[] numbers = {5, -2, 8, -1, 10, 4};
        int sum = 0;
        
        for(int num : numbers) {
            if(num < 0) {
                System.out.println("Пропускаем отрицательное: " + num);
                continue;
            }
            sum += num;
            System.out.println("Добавили " + num + ", сумма = " + sum);
        }
        System.out.println("Итоговая сумма: " + sum);
    }
}
