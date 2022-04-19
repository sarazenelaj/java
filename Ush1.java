package Assignment3;
/**How many times do you have to roll a pair of dice before they come up both ones?
 * You could do the experiment by rolling the dice by hand. Write a computer program that simulates
 * the experiment.
 * The program should report the number of rolls that it makes before the dice come up both ones.*/
public class Ush1 {
    public static void main(String[] args) {
        int z1,z2;
        int max=6;
        int min=1;
        int sum=0;int count=1;
        System.out.println("Now we are throwin the dice!");
        do {

            sum=0;
            z1=(int)Math.floor(Math.random()*(max-min+1)+min);
            z2=(int)Math.floor(Math.random()*(max-min+1)+min);
            System.out.println(count+".First dice "+z1+" ,second dice "+z2);
            sum=z1+z2;
            count++;
        }
        while (sum!=2);
        System.out.println(count+".Finally both dices are one. Program is exiting.");

    }
}
