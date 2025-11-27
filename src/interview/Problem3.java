package interview;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter integer a: ");
        int a = scanner.nextInt();

        if (a % 2 == 0) {
            a = a - 1;
        }

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
