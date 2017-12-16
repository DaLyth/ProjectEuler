package projecteuler;

import static projecteuler.ProjectEuler.input;

public class Project002 {

    public static void main(String[] args) {
        int max;
        
        System.out.println("This program takes 1 input, a positive integer n.");
        System.out.println("It calculates the sum of all fibonacci numbers up until n (inclusive).");
        System.out.print("Please input the upper limit (Project Euler uses 4000000): ");
        while (!input.hasNextInt()) {
            System.out.print("Please input the upper limit (Project Euler uses 4000000): ");
            input.nextLine();
        }
        max = input.nextInt();
        input.nextLine();
        int x1 = 1;
        int x2 = 1;
        int x3;
        int temp;
        int result = 0;
        while (x1 <= max) {
            if (x1 % 2 == 0) {
                result += x1;
            }
            x3 = x1 + x2;
            x1 = x2;
            x2 = x3;
        }
        System.out.println("Result: " + result);
    }
}
