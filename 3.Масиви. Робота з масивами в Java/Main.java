import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Task 1: Sum of negative elements ===");
        int[] a1 = {1, -2, 3, -4, 5};
        int[] a2 = {-10, -20, -30};
        int[] a3 = {0, 2, 4, 6};
        int[] a4 = null;

        System.out.println(SumOfNegatives.sumOfNegatives(a1)); 
        System.out.println(SumOfNegatives.sumOfNegatives(a2)); 
        System.out.println(SumOfNegatives.sumOfNegatives(a3)); 

        try {
            System.out.println(SumOfNegatives.sumOfNegatives(a4));
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }


        System.out.println("\n=== Task 2: Sum in range [5;10] ===");
        int[] b1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int[] b2 = {1, 2, 3, 4, 5, 6, 7};
        int[] b3 = {9, 8, 7, 6, 5};

        System.out.println(SumInRange.sumInRange(b1)); 
        System.out.println(SumInRange.sumInRange(b2)); 

        try {
            System.out.println(SumInRange.sumInRange(b3));
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }


        System.out.println("\n=== Task 3: Reverse array ===");
        int[] c1 = {1, 2, 3, 4, 5};
        int[] c2 = {10};
        int[] c3 = {};
        int[] c4 = null;

        System.out.println(Arrays.toString(ReverseArray.reverse(c1)));
        System.out.println(Arrays.toString(ReverseArray.reverse(c2)));
        System.out.println(Arrays.toString(ReverseArray.reverse(c3)));

        try {
            System.out.println(Arrays.toString(ReverseArray.reverse(c4)));
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}


// 1. Сума від’ємних елементів 
class SumOfNegatives {

    public static int sumOfNegatives(int[] arr) {
        if (arr == null)
            throw new NullPointerException("Array is null");

        int sum = 0;
        for (int num : arr) {
            if (num < 0)
                sum += num;
        }
        return sum;
    }
}


// 2. Сума елементів з індексами [5;10] 
class SumInRange {

    public static int sumInRange(int[] arr) {
        if (arr == null)
            throw new NullPointerException("Array is null");
        if (arr.length <= 5)
            throw new IndexOutOfBoundsException("Array too short for index range [5;10]");

        int sum = 0;
        for (int i = 5; i <= 10 && i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}


// 3. Реверс масиву 
class ReverseArray {

    public static int[] reverse(int[] arr) {
        if (arr == null)
            throw new NullPointerException("Array is null");

        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }
}