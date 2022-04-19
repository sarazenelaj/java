/**Write a program that helps the ATM count its money in
 the best way possible. The program should ask how many LEK the
 user needs, then it counts how many 5000, 1000, 500, 200, 100,
 50, 20, 10, 5 and 1 lek it should let through the terminal.*/
package Assignment2;
import java.util.Scanner;
public class Ush2 {
    public static void main(String[] args) {
        int[] tmp={5000,1000,500,200,100,50,20,10,5,1};
        Scanner in =new Scanner(System.in);
        System.out.println("Please enter the amount of money you need.\n");
        int amount=in.nextInt();
            for (int i=0;i<tmp.length;i++) {
                int heresi=amount/tmp[i];
                int mbetja=amount%tmp[i];
                System.out.println(tmp[i]+"X"+heresi+"\n");
                amount=mbetja;
            }
    }
}
