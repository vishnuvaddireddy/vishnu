 //PROBLEM_2
import java.util.Scanner;
public class program2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number (a): ");
        int a = scanner.nextInt();
        
        generateOddSeries(a);
        
        scanner.close();
    }
    
    public static void generateOddSeries(int a) {
        System.out.print("Output: ");
        for (int i = 1; i <= a; i++) {
            System.out.print(2 * i - 1);
            if (i < a) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}

