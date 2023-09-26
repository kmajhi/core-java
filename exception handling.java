import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            int[] a = new int[4];
            a[4] = 10;
        } catch (ArithmeticException e2) {
            System.out.println("Result: " + e2);
        } catch (Exception e1) {
            System.out.println("Result: " + e1);
        } finally {
            System.out.println("Last line of the program");
        }
    }
}
