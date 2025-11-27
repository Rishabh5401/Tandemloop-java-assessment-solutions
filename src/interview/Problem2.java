package interview;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter integer a: ");
        int a = scanner.nextInt();

        System.out.print("Output: ");
        for (int i = 0; i < a; i++) {
            
            int number = 1 + (2 * i);
            
            System.out.print(number);
            
            
            if (i < a - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        scanner.close();
    }
}