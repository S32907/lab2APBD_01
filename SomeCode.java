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

        System.out.println("This is a huge conflict !")
        System.out.println("This is a conflict !");
        System.out.println("And this is a solution!")
    }
    
    public double CalculateAverage(int[] values) {
    int sum = 0;
        for (int i = 0; i < values.length ; i++) {
            sum += values[i];
        }
    return (double) sum/values.length;    
    }
    
    public int CalculateMax(int[] values) {
        int max = values[0];
        for (int i = 0; i < values.length; i++) {
            if (values[i] > max) {
                max = values[i];
            }
        }
        return max;
    }
    
    public int CalculateMin(int[] values) {
        int min = values[0];
               for (int i = 1; i < values.length; i++) {
                   if (values[i] < min) {
                       min = values[i];
                   }
               }
               return min;
    }
    
}