package projecteuler;

public class Project613 {
    
    /*
    Using wolfram alpha:
    integrate (integrate (pi - arccos(30/50) - arcsin(30/50) + (arctan(x/(30-y)) + arctan(y/(40-x))))dy from y = 0 to y = 30-30x/40)dx from x = 0 to x = 40
    / 1200*pi
    
    Exact answer is 0.391672150408749387656482186513045429060972452294092008749
    I'll come back and write the code for integration later
    (There's probably some way to simplify the formula too)
    */
    
    public static void main(String[] args) {
        System.out.println("Result: " + 0.3916721504);
    }
    
}
