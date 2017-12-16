package projecteuler;

import static projecteuler.ProjectEuler.input;
import static projecteuler.Project003.isPrime;

public class Project007 {

    public static void main(String[] args) {
        System.out.println("This program takes 1 input, a positive integer n.");
        System.out.println("It calculates the nth prime number.");
        System.out.print("Please input limit (Project Euler uses 10001): ");
        while (!input.hasNextInt()) {
            System.out.print("Please input the limit (Project Euler uses 10001): ");
            input.nextLine();
        }
        int size = input.nextInt();
        input.nextLine();
        int count = 2;
        int prime = 3;
        while (count <= size) {
            if (isPrime(prime)) {
                count++;
            }
            if(count != size+1) {
                prime += 2;
            }
        }
        System.out.println("Result: " + prime);
    }

}
