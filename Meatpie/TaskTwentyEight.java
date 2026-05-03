import java.util.Scanner;

public class TaskTwentySeven {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is the number");

        int  theNumber  = input.nextInt();

        double theOutput = theNumber/3;

       System.out.println("The number divide by 3 equal to " + theOutput);
    }
}