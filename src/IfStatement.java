import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        System.out.println("If Statement is working ");
        int a, b;
        a = 45;
        b = 35;
        System.out.println("Enter two number: ");
        if (a > b) {
            System.out.printf("\n%d is greater than %d\n", a, b);
        }
        if (a < b) {
            System.out.printf("\n%d is greater than %d\n", b, a);
        }
    }
}