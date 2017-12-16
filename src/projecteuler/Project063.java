package projecteuler;

public class Project063 {

    /*
    This problem isn't really generalizable, and it's actually easier to find
    the values by hand, as shown below.
    1,2,3,4,5,6,7,8,9 =9
    16,25,36,49,64,81 = 6
    125,216,343,512,729 = 5
    6^4,7^4,8^4,9^4 = 4
    7^5,8^5,9^5 = 3
    7^6,8^6,9^6 = 3
    8^7,9^7 = 2
    8^8,9^8 = 2
    8^9,9^9 = 2
    8^10,9^10 = 2
    9^11,9^12...9^21 = 11
    Total = 9+6+5+4+3+3+2+2+2+2+11
    Total = 49
     */
    public static void main(String[] args) {
        int answer = 9 + 6 + 5 + 4 + 3 + 3 + 2 + 2 + 2 + 2 + 11;
        System.out.println(answer);
    }

}
