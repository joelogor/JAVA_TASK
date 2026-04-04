import java.util.Scanner;

public class TaskSeven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the square of:");

        int squareInput = input.nextInt();
        

        int squareOutput = squareInput * squareInput;

        System.out.println("The square of " + squareInput + " is " + squareOutput );
    }
}