public class NewClass{
   
 public static void main(String[] args) {

    double epsilon = 1e-6;
    double seconepsilon = 1e-3;
    System.out.print(infiniteSum(epsilon));
    System.out.print(infiniteSum(seconepsilon));
 }

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
}