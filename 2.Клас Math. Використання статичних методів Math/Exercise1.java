public class Exercise1 {
    public static void main(String[] args) {
        testSeries(5, 10);   // правильний випадок
        testSeries(34, 2);   // межа
        testSeries(40, 5);   // помилка (k >= 35)
        testSeries(10, -1);  // помилка (s <= 0)
    }

    public static double sumSeries(int k, double s) {
        if (k <= 0 || k >= 35) {
            throw new IllegalArgumentException("k must be >0 and <35");
        }
        if (s <= 0) {
            throw new IllegalArgumentException("s must be >0");
        }

        double sum = 0;
        for (int i = 1; i <= k; i++) {
            double value = Math.sqrt(s * 1.0 / (i * i));
            sum += Math.log10(value);
        }
        return sum;
    }

    private static void testSeries(int k, double s) {
        try {
            System.out.println("k=" + k + ", s=" + s + " -> " + sumSeries(k, s));
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}
