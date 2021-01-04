public class PrintMathResult {
    public static void main(String args[]) {
        Math.sqrt(121.0); //no output
        System.out.println("Square root: " + Math.sqrt(121.0));
        double result = Math.min(3, 7) + Math.abs(-50);
        System.out.println("Result is " + result);
    }
}