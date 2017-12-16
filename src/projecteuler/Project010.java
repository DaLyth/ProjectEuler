package projecteuler;

import static projecteuler.Project003.isPrime;
import static projecteuler.ProjectEuler.input;

public class Project010 {

    public static void main(String[] args) {
        System.out.println("This program takes 1 input, a positive integer n.");
        System.out.println("It calculates the sum of all prime numbers below n.");
        System.out.print("Please input the number (Project Euler uses 2000000): ");
        while (!input.hasNextInt()) {
            System.out.print("Please input the limit (Project Euler uses 2000000): ");
            input.nextLine();
        }
        int max = input.nextInt();
        input.nextLine();
        long toReturn = 2;
        for(int i = 3; i<max; i+=2) {
            if(isPrime(i)) {
                toReturn += i;
            }
        }
        System.out.println("Result: " + toReturn);
    }

}
