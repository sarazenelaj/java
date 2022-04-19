package Assignment3;

import java.util.Scanner;

public class Ush3 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String s1,s2;
        System.out.println("Please enter the first number");
        s1=in.next();
        System.out.println("Please enter the second number");
        s2=in.next();
        try {
            int n1, n2;
            int sum;
            n1 = Integer.parseInt(s1);
            n2 = Integer.parseInt(s2);
            sum = n1 + n2;   // (If an exception occurs, we don't get to this point.)
            System.out.println("The sum is " + sum);
        }
        catch ( NumberFormatException e ) {
            System.out.println("The operation cannot be completed because you didn’t enter a number.");
        }
    }


}
