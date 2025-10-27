public class Exercise2 {
    public static void main(String[] args) {
        testFunc(-2, 5);   // t < 0
        testFunc(3, 4);    // t >= 0
        testFunc(0, 6);    // t = 0
        testFunc(2, -1);   // помилка
    }

    public static double computeFunction(double t, int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n must be > 0");
        }

        double sum = 0;
        if (t < 0) {
            for (int i = 1; i <= n; i++) {
                sum += (t * t) * i;
            }
        } else {
            for (int i = 1; i <= n; i++) {
                sum += Math.sqrt(t * i);
            }
        }
        return sum;
    }

    private static void testFunc(double t, int n) {
        try {
            System.out.println("t=" + t + ", n=" + n + " -> " + computeFunction(t, n));
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}

