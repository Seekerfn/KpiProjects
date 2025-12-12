public class NewClass{
    public static void main(String[] args) {
        double[] array = {5.6, 4.2, 10.2,4.5};

        Sorting.selectionSort(array);

        System.out.println("Sorting:");
        for(double num : array){
            System.out.print(num + " ");
        }
    }
}