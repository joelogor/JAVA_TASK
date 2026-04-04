import java.util.Scanner;

public class TaskEleven {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is the half of:");

        int halfInput = input.nextInt();
        

        int halfOutput = halfInput / 2 ;

        System.out.println("The double of " + halfInput + " is " + halfOutput );
    }
}