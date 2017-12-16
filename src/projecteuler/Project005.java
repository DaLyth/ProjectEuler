package projecteuler;

import static projecteuler.ProjectEuler.input;

public class Project005 {

    public static void main(String[] args) {
        System.out.println("This program takes 1 input, a small positive integer n.");
        System.out.println("It calculates the smallest number divisible by all positive integers up to n.");
        System.out.print("Please input the size (Project Euler uses 20): ");
        while (!input.hasNextInt()) {
            System.out.print("Please input the size (Project Euler uses 20): ");
            input.nextLine();
        }
        int size = input.nextInt();
        input.nextLine();
        int[] numbers = new int[size];
        int result = 1;
        for (int i = 1; i <= size; i++) {
            numbers[i - 1] = i;
        }
        for (int i = 0; i < size; i++) {
            int check = numbers[i];
            for (int k = i + 1; k < size; k++) {
                if (numbers[k] % check == 0) {
                    numbers[k] /= check;
                }
            }
            result *= check;
        }
        System.out.println("Result: " + result);
    }

}