package projecteuler;

import static projecteuler.ProjectEuler.input;

public class Project004 {
    
    public static boolean isPalindrome(int x) {

        String aString = (x + " ").trim();
        int length = aString.length();
        String reversedString = "";
        for (int i = 1; i <= length; i++) {
            reversedString += aString.charAt(length - i);
        }
        if ((reversedString.trim()).equals(aString.trim())) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        System.out.println("This program takes 1 input, a number between 1 and 4.");
        System.out.println("It calculates the largest palindrome made from multiplying two numbers of the input length.");
        System.out.print("Please input the size (Project Euler uses 3): ");
        while (!input.hasNextInt()) {
            System.out.print("Please input the size (Project Euler uses 3): ");
            input.nextLine();
        }
        int size = input.nextInt();
        input.nextLine();
        int x1 = (int)Math.pow(10, size-1) + 1;
        int x2 = x1;
        int result = 0;
        while (x2 < (int)Math.pow(10, size)) {
            if (isPalindrome(x1 * x2) && result < x1 * x2) {
                result = x1 * x2;
            }
            if (x1 == (int)Math.pow(10, size)-1) {
                x1 = (int)Math.pow(10, size-1) + 1;
                x2++;
            } else {
                x1++;
            }
        }
        System.out.println("Result: " + result);
    }

}
