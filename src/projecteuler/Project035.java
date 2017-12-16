/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler;

import static projecteuler.ProjectEuler.input;

/**
 *
 * @author Dany Lyth
 */
public class Project035 {
    
    public static char[] rotate(char[] original) {
        char[] toReturn = new char[original.length];
        for(int i = 0; i<original.length-1; i++) {
            toReturn[i] = original[i+1];
        }
        toReturn[original.length-1] = original[0];
        return toReturn;
    }
    
    public static void main(String[] args) {
        System.out.println("This program takes 1 input, a positive integer n.");
        System.out.println("It calculates the number of circular primes below n.");
        System.out.print("Please input the number (Project Euler uses 1000000): ");
        while (!input.hasNextInt()) {
            System.out.print("Please input the limit (Project Euler uses 1000000): ");
            input.nextLine();
        }
        int length = input.nextInt();
        input.nextLine();
        int toReturn = 1;
        outer:
        for(int i = 3; i<length; i+=2) {
            if(Project003.isPrime(i) && !(i+"").matches("^\\d*0\\d*$")) {
                char[] temp = (i+"").toCharArray();
                for(int j = 0; j<((i+"").length());j++) {
                    temp = rotate(temp);
                    int newNumber = Integer.parseInt(new String(temp));
                    if(!Project003.isPrime(newNumber)) {
                        continue outer;
                    }
                }
                toReturn++;
            }
        }
        System.out.println(toReturn);
    }
    
}
