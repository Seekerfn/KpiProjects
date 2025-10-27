import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Task 1: Sum of negative elements ===");
        SumOfNegatives.main(args);

        System.out.println("\n=== Task 2: Sum in range [5;10] ===");
        SumInRange.main(args);

        System.out.println("\n=== Task 3: Reverse array ===");
        ReverseArray.main(args);
    }
}

// 1. Сума від’ємних елементів 
class SumOfNegatives {

    // Метод для знаходження суми від’ємних елементів
    public static int sumOfNegatives(int[] arr) {
        if (arr == null)
            throw new NullPointerException("Array is null");

        int sum = 0;
        for (int num : arr) { // цикл for-each
            if (num < 0)
                sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] a1 = {1, -2, 3, -4, 5};
        int[] a2 = {-10, -20, -30};
        int[] a3 = {0, 2, 4, 6};
        int[] a4 = null; // помилка

        System.out.println(sumOfNegatives(a1)); // -6
        System.out.println(sumOfNegatives(a2)); // -60
        System.out.println(sumOfNegatives(a3)); // 0

        try {
            System.out.println(sumOfNegatives(a4));
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}

// 2. Сума елементів з індексами [5;10] 
class SumInRange {

    // Метод для знаходження суми елементів з індексами [5;10]
    public static int sumInRange(int[] arr) {
        if (arr == null)
            throw new NullPointerException("Array is null");
        if (arr.length <= 5)
            throw new IndexOutOfBoundsException("Array too short for index range [5;10]");

        int sum = 0;
        for (int i = 5; i <= 10 && i < arr.length; i++) { // цикл for
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] a1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int[] a2 = {1, 2, 3, 4, 5, 6, 7};
        int[] a3 = {9, 8, 7, 6, 5}; // занадто короткий → помилка

        System.out.println(sumInRange(a1)); // 5+6+7+8+9+10 = 45
        System.out.println(sumInRange(a2)); // 6+7 = 13

        try {
            System.out.println(sumInRange(a3));
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}

// 3. Реверс масиву 
class ReverseArray {

    // Метод для реверсу масиву
    public static int[] reverse(int[] arr) {
        if (arr == null)
            throw new NullPointerException("Array is null");

        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) { // цикл for
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }

    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2 = {10};
        int[] a3 = {};
        int[] a4 = null; // для помилки

        System.out.println(Arrays.toString(reverse(a1))); // [5,4,3,2,1]
        System.out.println(Arrays.toString(reverse(a2))); // [10]
        System.out.println(Arrays.toString(reverse(a3))); // []
        try {
            System.out.println(Arrays.toString(reverse(a4)));
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
