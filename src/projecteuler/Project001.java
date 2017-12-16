package projecteuler;

import java.util.InputMismatchException;
import java.util.Scanner;
import static projecteuler.ProjectEuler.input;

public class Project001 {
    
	public static void main(String[] args) {
            System.out.println("This program takes 3 input, two positive integers (divisors) and 1 upper limit (non-inclusive).");
            System.out.println("It calculates the sum of all numbers divisible by either divisors up until the upper limit.");
            while(true) {
                try {
                    System.out.print("Please input the three numbers separated by commas divisor1, divisor2, limit (Project Euler uses 3, 5, 1000): ");
                    String numbers = input.nextLine().trim().replaceAll(" +", " ").replaceAll(",", "");
                    Scanner parse = new Scanner(numbers);
                    int x1 = parse.nextInt();
                    int x2 = parse.nextInt();
                    int max = parse.nextInt();
                    int total = 0;
		for(int i = 1; i < max; i++) {
			if(i%x1 == 0 || i%x2 == 0) {
				total += i;
			}
		}
		System.out.println("Result: " + total);
                    break;
                } catch (InputMismatchException e) {
                    
                }
            }
	}

}
