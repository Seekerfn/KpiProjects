public class Sorting {

    // Сортування вибором за зростанням 
    public static void selectionSort(double[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Міняємо місцями поточний і мінімальний елементи
            double temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    //  Сортування вставкою за зростанням 
    public static void insertionSort(double[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            double key = arr[i]; 
            int j = i - 1;

            // Зсуваємо всі більші елементи вправо
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key; // вставляємо елемент на правильну позицію
        }
    }

    // ===== Допоміжний метод для виведення масиву =====
    public static void printArray(double[] arr) {
        for (double num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // ===== Тестування обох алгоритмів =====
    public static void main(String[] args) {
        double[] numbers1 = {64.5, 25.1, 12.9, 22.4, 11.0};
        double[] numbers2 = {29.2, 10.5, 14.8, 37.6, 13.3};

        System.out.println("Original array (Selection Sort):");
        printArray(numbers1);

        selectionSort(numbers1);

        System.out.println("Sorted (Selection Sort):");
        printArray(numbers1);

        System.out.println("\nOriginal array (Insertion Sort):");
        printArray(numbers2);

        insertionSort(numbers2);

        System.out.println("Sorted (Insertion Sort):");
        printArray(numbers2);
        
    }
}