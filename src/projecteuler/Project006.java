package projecteuler;

import static projecteuler.ProjectEuler.input;

public class Project006 {
    
    public static void main(String[] args) {
        System.out.println("This program takes 1 input, a positive integer n.");
        System.out.println("It calculates the difference between the square of the sum and the sum of the squares of the first n natural numbers.");
        System.out.print("Please input limit (Project Euler uses 100): ");
        while (!input.hasNextInt()) {
            System.out.print("Please input the limit (Project Euler uses 100): ");
            input.nextLine();
        }
        int size = input.nextInt();
        input.nextLine();
        int sumof = 0;
        int squareof = 0;
        int[] nums = new int[size];
        int[] numsquared = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = i + 1;
            numsquared[i] = (i + 1) * (i + 1);
        };
        for (int i = 0; i < size; i++) {
            sumof += numsquared[i];
            squareof += nums[i];
        };
        squareof *= squareof;
        int difference = squareof - sumof;
        System.out.println("Result: " + difference);
    }

}
