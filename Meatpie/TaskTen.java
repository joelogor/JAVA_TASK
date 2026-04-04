import java.util.Scanner;

public class TaskTen {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is the double of:");

        int doubleInput = input.nextInt();
        

        int doubleOutput = doubleInput * 2 ;

        System.out.println("The double of " + doubleInput + " is " + doubleOutput );
    }
}