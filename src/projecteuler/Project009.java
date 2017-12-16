package projecteuler;

import java.util.Arrays;
import static projecteuler.ProjectEuler.input;

public class Project009 {

    public static boolean isPythagorean(int a, int b, int c) {
        int[] ordered = new int[3];
        ordered[0] = a;
        ordered[1] = b;
        ordered[2] = c;
        Arrays.sort(ordered); //In case not already sorted
        return (Math.pow(ordered[0], 2) + Math.pow(ordered[1], 2) == Math.pow(ordered[2], 2));
    }

    public static void main(String[] args) {
        System.out.println("This program takes 1 input, a positive integer n.");
        System.out.println("It calculates the product of the pythagorean triplet whose sum is n.");
        System.out.print("Please input a number (Project Euler uses 1000): ");
        while (!input.hasNextInt()) {
            System.out.print("Please input the limit (Project Euler uses 1000): ");
            input.nextLine();
        }
        int sum = input.nextInt();
        input.nextLine();
        boolean found = false;
        outer:
        for (int a = 1; a < sum; a++) {
            for (int b = a + 1; b <= sum - a; b++) {
                int c = sum - a - b;
                if (isPythagorean(a, b, c)) {
                    System.out.println("Result: " + a * b * c);
                    found = true;
                    break outer;
                }
            }
        }
        if (!found) {
            System.out.println("Result: no solution found with the sum " + sum + ".");
        }
    }

}
