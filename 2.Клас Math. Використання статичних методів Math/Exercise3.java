public class Exercise3 {


    public static void main(String[] args) {
        // Тести з різними значеннями ε
        printResult(1e-2);
        printResult(1e-4);
        printResult(1e-6);
        printResult(1e-10);

        // Перевірка на некоректний параметр
        printResult(0);
        printResult(-0.001);
    }

    /**
     * Обчислює нескінченну суму
     * S = Σ (-1)^(i+1) / (i*(i+1)*(i+2))
     * доки доданок за модулем не стане менший за epsilon.
     *
     * @param epsilon точність обчислення (має бути > 0)
     * @return обчислене значення суми
     * @throws IllegalArgumentException якщо epsilon <= 0
     */
    public static double infiniteSum(double epsilon) {
        if (epsilon <= 0) {
            throw new IllegalArgumentException("epsilon must be > 0, got: " + epsilon);
        }

        double sum = 0.0;
        int i = 1;

        while (true) {
            double term = Math.pow(-1, i + 1) / (i * (i + 1.0) * (i + 2.0));
            if (Math.abs(term) < epsilon) {
                break;
            }
            sum += term;
            i++;
        }
        return sum;
    }

    /**
     * Допоміжний метод для виводу результату.
     */
    private static void printResult(double epsilon) {
        System.out.print("epsilon = " + epsilon + " => ");
        try {
            double result = infiniteSum(epsilon);
            System.out.println("sum = " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}
