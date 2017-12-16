package projecteuler;

import static projecteuler.ProjectEuler.input;

public class Project012 {
    
    public static int numberOfDivisors(int number) {
        int toReturn = 2;
        int root = (int) Math.sqrt(number);
        if(root*root == number) {
            toReturn++;
        }
        for(int i = 2; i<root; i++) {
            if(number%i == 0) {
                toReturn += 2;
            }
        }
        return toReturn;
    }
    
    public static void main(String[] args) {
        System.out.println("This program takes 1 input, a positive integer n.");
        System.out.println("It calculates the first triangle number with more than n divisors.");
        System.out.print("Please input the number (Project Euler uses 500): ");
        while (!input.hasNextInt()) {
            System.out.print("Please input the limit (Project Euler uses 500): ");
            input.nextLine();
        }
        int max = input.nextInt();
        input.nextLine();
        int triangular = 1;
        int temp = 2;
        int divisorCount = 1;
        while(divisorCount <= max) {
            triangular += temp;
            temp++;
            divisorCount = Math.max(divisorCount, numberOfDivisors(triangular));
        }
        System.out.println("Result: " + triangular);
        
    }
    
}
