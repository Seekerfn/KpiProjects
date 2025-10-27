public class Task3 {
    public static void main (String[] args) {
        System.out.println("Hello, World!");
        double a = 1.25;
        double b = 3.09;
        double c = 4.25;
        double d = 0.56;

        double y = 2 * Math.sqrt(Math.tan(a) / Math.abs(Math.acos(b))) - 3 * Math.cbrt(Math.exp(c - a) * Math.sinh(d));

        System.out.println("y = " + y);
    }
}