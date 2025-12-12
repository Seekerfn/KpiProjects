    public class NewClass{
    public static void main(String[] args) {
    
    int[] array = {2,-5,-5,-3};
    NewClass obj = new NewClass();
    System.out.print(obj.sumOfNegatives(array));

    }
    
        public int sumOfNegatives(int[] arr) {
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