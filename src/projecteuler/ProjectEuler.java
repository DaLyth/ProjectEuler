package projecteuler;

import java.util.Scanner;
import goodinput.GoodInput;

/**
 *
 * @author DaLyth
 */
public class ProjectEuler {
    
    //UPDATE WHEN A NEW PROJECT IS SOLVED
    public static final int[] SOLVED =
    {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
    12, 25, 35, 49, 63, 613};

    public static Scanner input = new Scanner(System.in);

    public static void showMenu() {
        System.out.print("Projects completed: ");
        for (int i = 0; i < SOLVED.length; i++) {
            if (i % 10 == 0 && i != 0) {
                System.out.println();
                System.out.print("                    ");
            }
            if (i == SOLVED.length - 1) {
                System.out.printf("%d.", SOLVED[i]);
            } else {
                System.out.printf("%d, ", SOLVED[i]);
            }
        }
        System.out.println();
    }

    public static boolean isSolved(int problem) {
        for (int i = 0; i < SOLVED.length; i++) {
            if (SOLVED[i] == problem) {
                return true;
            }
        }
        return false;
    }

    public static int getMenuChoice() {
        showMenu();
        System.out.print("Which problem solution do you want to see (or write -1 to escape)? ");
        int toReturn = GoodInput.inputInt(input);
        while (!isSolved(toReturn) && toReturn != -1) {
            System.out.print("Not a valid solution, please choose a solved problem: ");
            toReturn = GoodInput.inputInt(input);
        }
        return toReturn;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        menu:
        while (true) {
            int choice = getMenuChoice();
            switch (choice) {
                case 1: {
                    System.out.println();
                    System.out.println("Welcome to Project Euler: Problem 1.");
                    Project001.main(null);
                    break;
                }
                case 2: {
                    System.out.println();
                    System.out.println("Welcome to Project Euler: Problem 2.");
                    Project002.main(null);
                    break;
                }
                case 3: {
                    System.out.println();
                    System.out.println("Welcome to Project Euler: Problem 3.");
                    Project003.main(null);
                    break;
                }
                case 4: {
                    System.out.println();
                    System.out.println("Welcome to Project Euler: Problem 4.");
                    Project004.main(null);
                    break;
                }
                case 5: {
                    System.out.println();
                    System.out.println("Welcome to Project Euler: Problem 5.");
                    Project005.main(null);
                    break;
                }
                case 6: {
                    System.out.println();
                    System.out.println("Welcome to Project Euler: Problem 6.");
                    Project006.main(null);
                    break;
                }
                case 7: {
                    System.out.println();
                    System.out.println("Welcome to Project Euler: Problem 7.");
                    Project007.main(null);
                    break;
                }
                case 8: {
                    System.out.println();
                    System.out.println("Welcome to Project Euler: Problem 8.");
                    Project008.main(null);
                    break;
                }
                case 9: {
                    System.out.println();
                    System.out.println("Welcome to Project Euler: Problem 9.");
                    Project009.main(null);
                    break;
                }
                case 10: {
                    System.out.println();
                    System.out.println("Welcome to Project Euler: Problem 10.");
                    Project010.main(null);
                    break;
                }
                case 12: {
                    System.out.println();
                    System.out.println("Welcome to Project Euler: Problem 12.");
                    Project012.main(null);
                    break;
                }
                case 25: {
                    System.out.println();
                    System.out.println("Welcome to Project Euler: Problem 25.");
                    Project025.main(null);
                    break;
                }
                case 35: {
                    System.out.println();
                    System.out.println("Welcome to Project Euler: Problem 35.");
                    Project035.main(null);
                    break;
                }
                case 49: {
                    System.out.println();
                    System.out.println("Welcome to Project Euler: Problem 49.");
                    Project049.main(null);
                    break;
                }
                case 63: {
                    System.out.println();
                    System.out.println("Welcome to Project Euler: Problem 63.");
                    Project063.main(null);
                    break;
                }
                case 613: {
                    System.out.println();
                    System.out.println("Welcome to Project Euler: Problem 613.");
                    Project613.main(null);
                    break;
                }
                case -1: {
                    break menu;
                }
                default: {
                    throw new RuntimeException("Error in menu operations.");
                }
            }
        }
    }

}
