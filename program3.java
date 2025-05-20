//PROBLEM_3
import java.util.Scanner;

public class program3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number (a): ");
        int a = scanner.nextInt();
        
        generateAlternateOddSeries(a);
        
        scanner.close();
    }
    
    public static void generateAlternateOddSeries(int a) {
        System.out.print("Output: ");
        int maxOdd = (a % 2 == 1) ? (2 * a - 1) : (2 * (a - 1) - 1);
        for (int i = 1; i <= maxOdd; i += 2) {
            System.out.print(i);
            if (i < maxOdd - 1) { 
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}