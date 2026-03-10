import java.util.*;
public SomeCode {
    public static void main(String[] args) {

        System.out.println("Hello world");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = input.nextInt();
        System.out.print("Enter a second number: ");
        int b = input.nextInt();
        System.out.print("Sum: " + (a + b));
        System.out.println("Diff: " + (a - b));
        System.out.println("Product: " + (a * b));
        System.out.println("Result of devision: " + (a / b));
    }
}