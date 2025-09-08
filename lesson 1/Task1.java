public class Task1 {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        double a = -2.8;
        double b = 1.62;
        double c = 10.874;
        double d = -2.91;

        double y = (Math.log(Math.abs(2 * a)) / (3 * Math.tan(b)))
                - Math.sqrt(c / Math.sqrt(Math.abs(d)));

        System.out.println("y = " + y);
    }
}