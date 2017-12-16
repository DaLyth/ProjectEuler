package projecteuler;

import java.util.ArrayList;
import static projecteuler.Project003.isPrime;

public class Project049 {

    public static ArrayList<String> getPermutations(String s) {
        ArrayList<String> permutations = new ArrayList<String>();
        if (s == null) { // error case
            return null;
        } else if (s.length() == 0) { // base case
            permutations.add("");
            return permutations;
        }
        char first = s.charAt(0); // get the first character
        String remainder = s.substring(1); // remove the first character
        ArrayList<String> words = getPermutations(remainder);
        for (String word : words) {
            for (int j = 0; j <= word.length(); j++) {
                permutations.add(insertCharAt(word, first, j));
            }
        }
        return permutations;
    }

    public static String insertCharAt(String word, char c, int i) {
        String start = word.substring(0, i);
        String end = word.substring(i);
        return start + c + end;
    }

    public static void main(String[] args) {
        System.out.println("This program takes 0 input.");
        System.out.println("It calculates concatenation of the arithmetic sequence of 4-digit primes that are permutations of each other.");
        outer:
        for (int i = 1001; i < 10000; i += 2) {
            if (i == 1487) {
                continue;
            }
            if (isPrime(i) && !(i + "").matches("^\\d*0\\d*$")) {
                ArrayList<String> permutations = getPermutations(i+"");
                for(String s: permutations) {
                    int temp = Integer.parseInt(s);
                    if(temp > i && isPrime(temp)) {
                        int temp2 = (2*temp - i);
                        if(permutations.contains(temp2+"") && isPrime(temp2)) {
                            System.out.println("Result: " + i + "" + temp + "" + (2*temp - i));
                            break outer;
                        }
                    }
                }
            }
        }
    }

}
