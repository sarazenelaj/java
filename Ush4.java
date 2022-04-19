package Assignment3;

import java.util.Scanner;

/**The user has to give the number of rows and the figure is created automatically
 *  with that number of rows:*/

public class Ush4
{

    public static void printTriagle(int n)
    {
        for (int i=0; i<n; i++)
        {
            for (int j=n-i; j>1; j--)
            {
                System.out.print(" ");
            }
            for (int j=0; j<=i; j++ )
            {

                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void main(String args[])
    {
        Scanner in =new Scanner(System.in);
        System.out.println("Give the number of rows");
        int n = in.nextInt();
        printTriagle(n);
    }
}

