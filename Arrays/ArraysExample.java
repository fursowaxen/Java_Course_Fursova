import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        
        // 1. toString() - преобразование массива в строку
        int[] numbers = {5, 2, 8, 1, 9};
        System.out.println("toString: " + Arrays.toString(numbers));
        
        // 2. sort() - сортировка массива
        int[] toSort = {5, 2, 8, 1, 9};
        Arrays.sort(toSort);
        System.out.println("sort: " + Arrays.toString(toSort));
        
        // 3. binarySearch() - бинарный поиск 
        int[] sorted = {1, 2, 5, 8, 9};
        int index = Arrays.binarySearch(sorted, 5);
        System.out.println("binarySearch(5): индекс = " + index);
        
        // 4. equals() - сравнение массивов
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        int[] arr3 = {1, 2, 4};
        System.out.println("equals(arr1, arr2): " + Arrays.equals(arr1, arr2));
        System.out.println("equals(arr1, arr3): " + Arrays.equals(arr1, arr3));
        
        // 5. compare() - лексикографическое сравнение (Java 9+)
        int[] cmp1 = {1, 2, 3};
        int[] cmp2 = {1, 2, 5};
        int result = Arrays.compare(cmp1, cmp2);
        System.out.println("compare: " + result + " (отрицательное, т.к. 3 < 5)");
    }
}
