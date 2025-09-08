public class Task2 {
    public static void main (String[] args){
        System.out.println("Hello, World!");
        double a = 1.54;
        double b = 0.49;
        double c = 24.1;
        double d = 0.87;

        double y =  2 * Math.sqrt((Math.sin(a) / Math.abs(Math.tan(b - a))) + (Math.log(c) / d));

        System.out.println("y = "+ y);

    }
}