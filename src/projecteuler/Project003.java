package projecteuler;

import static projecteuler.ProjectEuler.input;

public class Project003 {
    
    public static boolean isPrime(int x) {
        if(x <= 1) {
            return false;
        }
        int root = (int) Math.sqrt(x);
        int divisor = 3;
        if (x == 2) {
            return true;
        } else if (x % 2 == 0) {
            return false;
        } else {
            while (divisor <= root) {
                if (x % divisor == 0) {
                    return false;
                } else {
                    divisor += 2;
                }
            }
        }
        return true;
    }
    
    public static boolean isPrime(long x) {
        if(x <= 1) {
            return false;
        }
        long root = (long) Math.sqrt(x);
        long divisor = 3;
        if (x == 2) {
            return true;
        } else if (x % 2 == 0) {
            return false;
        } else {
            while (divisor <= root) {
                if (x % divisor == 0) {
                    return false;
                } else {
                    divisor += 2;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        long max;
        System.out.println("This program takes 1 input, a positive integer n.");
        System.out.println("It calculates the largest prime factor of n.");
        System.out.print("Please input the upper limit (Project Euler uses 600851475143): ");
        while(!input.hasNextLong()) {
            System.out.print("Please input the upper limit (Project Euler uses 600851475143): ");
            input.nextLine();
        }
        max = input.nextLong();
        input.nextLine();
        //long x = 600851475143L;
        int divisor = 3;
        int result = 0;
        while (max != 1) {
            if (isPrime(divisor)) {
                if (max % divisor == 0) {
                    max /= divisor;
                    result = divisor;
                }
            }
            divisor += 2;
        }
        System.out.println("Result: " + result);
    }
}
