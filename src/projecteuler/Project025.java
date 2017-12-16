package projecteuler;

import java.math.BigInteger;
import static projecteuler.ProjectEuler.input;

public class Project025 {
    
    public static void main(String[] args) {
        System.out.println("This program takes 1 input, a positive integer n.");
        System.out.println("It calculates the index of the first fibonnaci number of length n.");
        System.out.print("Please input the number (Project Euler uses 1000): ");
        while (!input.hasNextInt()) {
            System.out.print("Please input the limit (Project Euler uses 1000): ");
            input.nextLine();
        }
        int length = input.nextInt();
        input.nextLine();
        BigInteger fib1 = new BigInteger("1");
        BigInteger fib2 = new BigInteger("1");
        BigInteger temp = new BigInteger("0");
        long index = 2;
        while(temp.toString().length() < length) {
            index++;
            temp = fib1.add(fib2);
            fib1 = fib2;
            fib2 = temp;
        }
        System.out.println("Result: " + index);
    }
    
}
